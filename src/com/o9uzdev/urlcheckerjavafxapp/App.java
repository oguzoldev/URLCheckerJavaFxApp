package com.o9uzdev.urlcheckerjavafxapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // TODO:
        // Add form
        // add label
        // add textfield
        // add button
        // add EventHandler for button
        // add alert dialog

        Label label = new Label("URL");
        TextField textField = new TextField();
        textField.setPrefWidth(400);
        Button button = new Button("Check");

        HBox hRoot = new HBox();
        hRoot.setPadding(new Insets(10, 10, 10, 10));
        hRoot.setSpacing(10);
        hRoot.setAlignment(Pos.CENTER_LEFT);

        hRoot.getChildren().addAll(label, textField, button);

        stage.setTitle("URL Checker JavaFX App");
        stage.setScene(new Scene(hRoot, 520, 70));
        stage.show();

    }
}
