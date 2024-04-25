package de.jay8012.models;

import de.jay8012.enums.FileType;

import java.nio.file.Path;

public class File {
    private String fileName;
    private Path path;
    private FileType type;
    public File(String fileName, Path path) {}

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public FileType getType() {
        return type;
    }

    public void setType(FileType type) {
        this.type = type;
    }
}
