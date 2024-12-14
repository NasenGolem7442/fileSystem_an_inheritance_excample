package org.nasengolem.filesystem.model;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    private final List<Component> content;

    public Folder(String name) {
        super(name, 0);
        this.content = new ArrayList<>();
    }

    public void add(Component component) {
        content.add(component);
        size += component.size;
    }

    /*
     * Da sich die größe von Textdateien ändern kann, muss diese Methode nach dem Bearbeiten von
     * Textdateien aufgerufen werden.
     */
    public void updateSize() {
        size = 0;
        for (Component component : content) {
            size += component.size;
        }
    }

    // toSting wird von Component implementiert
}
