package com.example.startpage;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

public class Controller {
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

    public void chactData(){
        name.getText();

    }
}