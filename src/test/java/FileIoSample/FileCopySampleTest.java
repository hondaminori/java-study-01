package FileIoSample;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FileCopySampleTest {
    @Test
    @Order(1)
    @DisplayName("FileCopySampleクラスのテスト（正常系）")
    void FileCopySampleTest_shouldCopyFile() {
        Path path_source = Paths.get("src/test/resources/sample01.txt");
        Path path_target = Paths.get("src/test/resources/sample01_copy.txt");
        FileCopySample fileCopySample = new FileCopySample();
        
        assertDoesNotThrow(() -> fileCopySample.FileCopy(path_source, path_target));
        System.out.println(path_target.getFileName().toString() + "としてコピー成功！");
    }

    @Test
    @Order(2)    
    @DisplayName("FileCopySampleクラスのテスト（異常系）")
    void FileCopySampleTest_shouldNotCopyFile() {
        Path path_source = Paths.get("notexist");
        Path path_target = Paths.get("src/test/resources/sample01_copy.txt");
        FileCopySample fileCopySample = new FileCopySample();
        
        assertThrows(IOException.class,
            () -> fileCopySample.FileCopy(path_source, path_target));
        System.out.println("コピー元に存在しないパスを与えてエラー発生! テストOK");
    }
}
