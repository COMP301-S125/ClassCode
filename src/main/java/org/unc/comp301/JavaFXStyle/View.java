package org.unc.comp301.JavaFXStyle;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class View implements FXComponent{
    @Override
    public Parent render() {
        // Create new Pane objects to hold the UI components
        Pane layout = new VBox();
        layout.getStyleClass().add("layout");

        ScoreboardView scoreboardView = new ScoreboardView();
        InstructionsView instructionsView = new InstructionsView();
        BoardView boardView = new BoardView();

        layout.getChildren().add(scoreboardView.render());
        layout.getChildren().add(instructionsView.render());
        layout.getChildren().add(boardView.render());
        return layout;

    }
}
