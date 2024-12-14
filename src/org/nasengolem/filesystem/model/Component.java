package org.nasengolem.filesystem.model;

public abstract class Component {
    protected String name;

    /*
     * Es wäre vermutlich besser, die size nicht abzuspeichern, sondern bei jeder Anfrage neu zu berechnen,
     * da Textdateien veränderlich sind und die size eines Ordners mit der aktuellen Implementierung nicht
     * immer richtig ist.
     */
    protected int size;

    public Component(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void rename(String newName) {
        this.name = newName;
    }

    public int getSize() {
        return size;
    }

    // default
    @Override
    public String toString() {
        return name;
    }
}
