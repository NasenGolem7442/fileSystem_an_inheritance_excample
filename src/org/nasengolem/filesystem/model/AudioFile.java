package org.nasengolem.filesystem.model;

/*
 * - Bei Audiodateien gilt in der Regel nicht: transcription.length() = size
 * - Audiodateien können nicht verändert werden. Dh. ihre Größe und Transkription sind final
 */
public class AudioFile extends File {
    public static final String EXTENSION = "mp3";
    private static final String PLAY_FORMAT = "*%s*%n";

    private final String transcription;

    public AudioFile(String name, String author, String transcription, int size) {
        super(name, EXTENSION, author, size);
        this.transcription = transcription;
    }

    @Override
    public void click() {
        System.out.printf(PLAY_FORMAT, transcription);
    }
}
