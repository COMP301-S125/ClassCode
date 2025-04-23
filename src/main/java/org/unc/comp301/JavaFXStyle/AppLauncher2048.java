package org.unc.comp301.JavaFXStyle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLauncher2048 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //title
        stage.setTitle("Play 2048!");
        View view = new View();

        Scene scene = new Scene(view.render(),350,450);
        scene.getStylesheets().add("main.css");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args){
        Application.launch(AppLauncher2048.class);
    }
}
