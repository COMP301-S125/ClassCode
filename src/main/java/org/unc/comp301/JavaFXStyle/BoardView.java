package org.unc.comp301.JavaFXStyle;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class BoardView implements FXComponent{
    @Override
    public Parent render() {
        GridPane board = new GridPane();
        board.getStyleClass().add("board");

        board.add(makeTile(0),0,0);
        board.add(makeTile(2),1,0);
        board.add(makeTile(8),2,0);
        board.add(makeTile(4),3,0);
        board.add(makeTile(16),0,1);
        board.add(makeTile(64),1,1);
        board.add(makeTile(4),2,1);
        board.add(makeTile(2),3,1);
        board.add(makeTile(8),0,2);
        board.add(makeTile(4),1,2);
        board.add(makeTile(32),2,2);
        board.add(makeTile(4),3,2);
        board.add(makeTile(2),0,3);
        board.add(makeTile(256),1,3);
        board.add(makeTile(8),2,3);
        board.add(makeTile(2),3,3);
        return board;
    }

    private Label makeTile(int num){
        Label tile;
        if(num==0){
            tile = new Label();
        } else{
            tile = new Label("" + num);
        }
        tile.getStyleClass().add("tile");
        tile.getStyleClass().add("tile-"+ num);
        return tile;
    }
}
