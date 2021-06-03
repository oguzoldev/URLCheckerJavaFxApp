package com.o9uzdev.urlcheckerjavafxapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        Alert alert = new Alert(Alert.AlertType.NONE);

        Label label = new Label("URL");
        TextField textField = new TextField();
        textField.setPrefWidth(400);
        Button button = new Button("Check");

        // button EventHandler
        button.setOnAction(event -> {
            alert.setAlertType(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Alert");
            alert.setHeaderText("URL Checker JavaFX App");
            alert.setContentText("URL (true/false) :" + IsMatch(textField.getText(), regex));
            alert.showAndWait();
        });

        HBox hRoot = new HBox();
        hRoot.setPadding(new Insets(10, 10, 10, 10));
        hRoot.setSpacing(10);
        hRoot.setAlignment(Pos.CENTER_LEFT);

        hRoot.getChildren().addAll(label, textField, button);

        stage.setTitle("URL Checker JavaFX App");
        stage.setScene(new Scene(hRoot, 520, 70));
        stage.show();

    }

    private static boolean IsMatch(String s, String pattern) {
        try {
            Pattern pattern2 = Pattern.compile(pattern);
            Matcher matcher = pattern2.matcher(s);
            return matcher.matches();
        } catch (RuntimeException e) {
            return false;
        }

    }
}