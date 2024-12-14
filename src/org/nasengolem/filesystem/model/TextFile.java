package org.nasengolem.filesystem.model;

/*
 * - Ihre Größe entspricht der Länge des Inhalts
 * - Der Inhalt kann bearbeitet werden
 */
public class TextFile extends File {
    public static final String EXTENSION = "txt";
    private String content;

    public TextFile(String name, String author, String content) {
        super(name, EXTENSION, author, content.length());
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        size = content.length();
    }

    @Override
    public void click() {
        System.out.println(content);
    }
}
