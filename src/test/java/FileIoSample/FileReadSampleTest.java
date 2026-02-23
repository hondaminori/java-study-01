package FileIoSample;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FileReadSampleTest {
    @Test
    @DisplayName("FileReadSampleクラスのテスト")
    public void fileReadSampleTest_shouldReadCSVFile() throws IOException{
        Path path = Paths.get("src/test/resources/sample01.csv");
        FileReadSample fileReadSample = new FileReadSample();

        List<String[]> contents = 
            fileReadSample.FileRead(path, StandardCharsets.UTF_8, ",");

        assertNotNull(contents);

        for(String[] content : contents) {
            for(String element : content){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
