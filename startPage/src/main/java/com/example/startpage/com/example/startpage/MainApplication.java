package com.example.startpage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MainApplication extends Application {

    public void start(Stage primarystage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("first-view.fxml"));
        primarystage.setTitle("");
        primarystage.setScene(new Scene(root));
        primarystage.show();
        primarystage.setResizable(false);
        primarystage.getIcons().add(
                new Image(
                        getClass().getResourceAsStream( "Mela.png" ))
        );
    }

    public static void main(String[] args) {
        launch();
    }
}