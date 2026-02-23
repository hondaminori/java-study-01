package FileIoSample;

import java.nio.file.Path;
import java.nio.file.attribute.FileTime;

public record FileInfo(
    Path path,
    boolean isDirectory,
    long length,
    FileTime lastModified,
    String ownerName
) { }