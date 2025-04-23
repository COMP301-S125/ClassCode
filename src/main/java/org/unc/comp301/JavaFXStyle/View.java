package org.unc.comp301.JavaFXStyle;

import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class View implements FXComponent{
    @Override
    public Parent render() {
        // Create new Pane objects to hold the UI components
        Pane layout = new VBox();

        return layout;

    }
}
