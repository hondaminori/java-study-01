package FileIoSample;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class GetFileProperty {
    public FileInfo getFileInfo(Path path) throws IOException{        
        return new FileInfo(
            path,
            Files.isDirectory(path),
            Files.size(path),
            Files.getLastModifiedTime(path),
            Files.getOwner(path).getName()
        );
    }
}