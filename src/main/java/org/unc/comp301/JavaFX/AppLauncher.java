package org.unc.comp301.JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLauncher extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        VBox layout = new VBox();
        layout.getStyleClass().add("layout");
        Label label = new Label("Hello, world");


        Pane pane = new HBox();
        Label title = new Label("Title!");
        Button button = new Button("start");
        pane.getChildren().add(title);
        pane.getChildren().add(button);

        layout.getChildren().add(label);
        layout.getChildren().add(pane);

        Scene scene = new Scene(layout, 500,500);
        scene.getStylesheets().add("main.css");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch(); //static method in abstract parent class
    }
}
