package de.jay8012.models;

import de.jay8012.enums.FileType;
import de.jay8012.exceptions.UserInputException;

import java.nio.file.Path;

public class Args {
    private Path path;
    private boolean isFolder;
    private String fileNameFormat;
    private FileType fileType;

    public Args(String[] args) throws UserInputException {
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-p":
                    path = Path.of(args[i + 1]);
                    break;
                case "-m":
                    fileType = FileType.MOVIE;
                    break;
                case "-tv":
                    if (fileType == FileType.MOVIE) {
                        throw new UserInputException("-tv und -p sind nicht parallel nutzbar");
                    }
                    fileType = FileType.TV_SHOW;
                    break;
            }
        }
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public boolean isFolder() {
        return isFolder;
    }

    public void setFolder(boolean folder) {
        isFolder = folder;
    }

    public String getFileNameFormat() {
        return fileNameFormat;
    }

    public void setFileNameFormat(String fileNameFormat) {
        this.fileNameFormat = fileNameFormat;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    @Override
    public String toString() {
        return "Args{" +
               "path=" + path +
               ", isFolder=" + isFolder +
               ", fileNameFormat='" + fileNameFormat + '\'' +
               ", fileType=" + fileType +
               '}';
    }
}
