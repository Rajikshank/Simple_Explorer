package com.example.demo_javafx_chat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        String fxmlResource = "FileExplorer.fxml";
        Parent panel;
        panel = FXMLLoader.load(getClass().getResource(fxmlResource));
        Scene scene = new Scene(panel);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}