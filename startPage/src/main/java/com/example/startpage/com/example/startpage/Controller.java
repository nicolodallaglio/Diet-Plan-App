package com.example.startpage;


import com.company.Fat;
import com.company.Protein;
import com.company.SportyMen;
import com.company.carbohydrates;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Button bottFirst;
    @FXML
    private Label labelFirst;

    public void premiperproseguire(ActionEvent actionEvent) throws IOException {
           Stage stage = (Stage) bottFirst.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }

    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private TextField age;
    @FXML
    private TextField height;
    @FXML
    private SplitMenuButton sex;
    @FXML
    private SplitMenuButton sporty;
    @FXML
    private Button analizeData;
    @FXML
    private TextArea textMenu;

    public void analizzaAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) analizeData.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("showMenu.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));

    }

    @FXML
    private MenuItem woman;
    public void donnaAction(ActionEvent actionEvent) throws IOException {
        sex.setText("donna");
    }
    @FXML
    private MenuItem men;
    public void maschioAction(ActionEvent actionEvent) throws IOException {
        sex.setText("uomo");
    }
    @FXML
    private MenuItem yesSporty;
    public void sportyAction(ActionEvent actionEvent) throws IOException {
        sporty.setText("Sì");

        if(sex.getText().equals("uomo")){
            SportyMen sportyMen = new SportyMen(name.getText(), 56, 17, 22, true);
            sportyMen.showData();
            float bmi;
            bmi = sportyMen.BmiCalculated();
            sportyMen.bodyFatSituation((int) bmi);
            Fat fat = new Fat(null);
            carbohydrates carbohydrates = new carbohydrates(null);
            Protein protein = new Protein(null);
            sportyMen.showShortMenu(fat, carbohydrates, protein);
        } else {

        }
    }
    @FXML
    private MenuItem noSporty;
    public void noSportyAction(ActionEvent actionEvent) throws IOException {
        sporty.setText("No");
    }





}