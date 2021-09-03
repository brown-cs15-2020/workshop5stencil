package workshop5stencil;

import javafx.scene.layout.Pane;

/**
 * Organizes GUI layout for workshop5.
 */
public class PaneOrganizer {
    private Pane root;

    public PaneOrganizer() {
        this.root = new Pane();
    }

    public Pane getRoot() {
        return this.root;
    }
}

