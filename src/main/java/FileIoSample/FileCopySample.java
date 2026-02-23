package FileIoSample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCopySample {
    public void FileCopy(Path source, Path target ) throws IOException {
        Files.copy(source, target);
    }
}

/** 参考
https://github.com/KenyaSaitoh/learn_java_advanced/blob/main/05_file_io/src/main/java/pro/kensait/java/advanced/lsn_5_1_1/Main_Files_2.java
*/