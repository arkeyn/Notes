package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class LoginController {

    @FXML
    private JFXTextField TypeField;

    @FXML
    private Button button;

    @FXML
    private JFXTextArea TextField;


    @FXML
    private Label label;

    @FXML
    void initialize(){

        label.setText("List To Do");

        TextField.setEditable(false);

    }


}