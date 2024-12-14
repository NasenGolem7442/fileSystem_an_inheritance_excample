package org.nasengolem.filesystem.model;

public abstract class File extends Component {
    private static final String FILE_FORMAT = "%s.%s";
    private final String author;
    private final String extension;

    public File(String name, String extension, String author, int size) {
        super(name, size);
        this.author = author;
        this.extension = extension;
    }

    public abstract void click();

    public String getAuthor() {
        return author;
    }

    // Dateien werden durch name.dateiendung repräsentiert
    @Override
    public String toString() {
        return FILE_FORMAT.formatted(name, extension);
    }
}
