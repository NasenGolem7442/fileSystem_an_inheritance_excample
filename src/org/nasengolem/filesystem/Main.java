package org.nasengolem.inheritance;

import org.nasengolem.inheritance.model.AudioFile;
import org.nasengolem.inheritance.model.File;
import org.nasengolem.inheritance.model.Folder;
import org.nasengolem.inheritance.model.TextFile;

public class Main {
    private static final String GERMAN_POEM_CONTENT = "Manchmal ein bisschen träumen%n"
            + "Und immer ein bisschen hoffen –%n"
            + "So blieb zu seligen Räumen%n"
            + "Mir allzeit ein Türlein offen.";

    public static void main(String[] args) {
        Folder root = generateModel();
        System.out.println(root.getSize());
    }

    private static Folder generateModel() {
        Folder root = new Folder("Hauptordner");

        Folder spass = new Folder("Spaß");

        File nggyu = new AudioFile("click_me", "Rick Astley", "We're no strangers to love...", 4375);
        Folder gedichte = new Folder("Gedichte");
        File germanPoem = new TextFile("Allzeit glücklich", "Ernst Groll", GERMAN_POEM_CONTENT);

        gedichte.add(germanPoem);
        spass.add(gedichte);
        spass.add(nggyu);

        Folder arbeit = new Folder("Arbeit");
        File projektPlan = new TextFile("Projektplan", "Max Mustermann", "Weniger SubwaySurfers, mehr Excel");
        File meetingNotizen = new TextFile("Meeting Notizen", "Max Mustermann", "Erfolgreiches Meeting: 10 neue Meetings wurden vereinbart");

        arbeit.add(projektPlan);
        arbeit.add(meetingNotizen);

        root.add(spass);
        root.add(arbeit);

        return root;
    }
}
