package com.example.startpage;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
public class Controller {
    @FXML
    private Button bottFirst;
    @FXML
    private Label labelFirst;
    public void premiperproseguire(ActionEvent actionEvent){
        bottFirst.setOpacity(0);
        labelFirst.setOpacity(0);
    }
    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private TextField age;
    @FXML
    private SplitMenuButton sex;
    @FXML
    private SplitMenuButton sporty;

}