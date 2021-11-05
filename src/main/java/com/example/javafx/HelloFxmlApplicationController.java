package com.example.javafx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class HelloFxmlApplicationController {

    @FXML
    private Label welcomeText;
    @FXML
    public BorderPane borderPane; //wird über das Property fx:id aus dem SceneBuilder referenziert

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onClose(ActionEvent actionEvent) {
        Platform.exit();
    }

    @FXML
    public void onNew(ActionEvent actionEvent) {
        TextArea text = new TextArea("");
        borderPane.setCenter(text);
    }
    @FXML
    public void onDialog(ActionEvent actionEvent) {
        DialogLayout dialogLayout = new DialogLayout();
        borderPane.setCenter(dialogLayout.createInputPane());
    }
    @FXML
    public void onAbout(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("Look, an Information Dialog");
        alert.setContentText("I have a great message for you!");

        alert.showAndWait();
    }
}
