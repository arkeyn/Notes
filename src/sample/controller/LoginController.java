package sample.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LoginController {

    @FXML
    private JFXButton button;

    @FXML
    private Label label;


    @FXML
    void initialize(){

        button.setOnAction(event -> {
            label.setText("Testing!");
        });

    }


}