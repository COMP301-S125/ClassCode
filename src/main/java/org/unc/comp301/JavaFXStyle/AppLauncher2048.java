package org.unc.comp301.JavaFXStyle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLauncher2048 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        // Show the Stage on the screen
        stage.show();
    }

    public static void main(String[] args){
        Application.launch(AppLauncher2048.class);
    }
}
