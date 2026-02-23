package FileIoSample;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GetFileInfoTest {
    @Test
    @DisplayName("GetFileInfoPropertyクラスのテスト")
    void GetFileInfoPropertyTest_shouldReturnFileInfo() throws IOException {
        GetFileProperty getFileProperty = new GetFileProperty();
        
        // テスト用のファイルやパスは以下と固定する。
        // これ以降のアサーションはこのファイルのプロパティに基づいて行う。
        Path path = Paths.get("src/test/resources/sample01.txt");

        FileInfo fileInfo = getFileProperty.getFileInfo(path);

        System.out.println("テスト対象インスタンス内のファイルパス: " + fileInfo.path());

        assertFalse(fileInfo.isDirectory());
        System.out.println("ディレクトリ？: " + fileInfo.isDirectory());
        assertNotEquals(0, fileInfo.length()); // テストはゼロで無ければ可
        System.out.println("ファイルサイズ: " + fileInfo.length());
        assertNotNull(fileInfo.lastModified());
        System.out.println("最終更新日時: " + fileInfo.lastModified());
        assertNotNull(fileInfo.ownerName());
        System.out.println("所有者名: " + fileInfo.ownerName());

        // ファイル無しまたはパスなしエラー
        Path path_notExistPath = Paths.get("notexists");
        assertThrows(IOException.class, () -> getFileProperty.getFileInfo(path_notExistPath));
    }
}