package com.example.startpage;

import com.example.company.Fat;
import com.example.company.Protein;
import com.example.company.SportyMen;
import com.example.company.carbohydrates;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller1 implements Initializable {

    @FXML
    private Label labelDay1;
    @FXML
    private Button indietro3;

    public void method1(String nome, int peso, float altezza, int eta) throws IOException {
        StringBuilder sb = new StringBuilder();
        Fat fat = new Fat(null);
        carbohydrates carbohydrates = new carbohydrates(null);
        Protein protein = new Protein(null);
        SportyMen sportyMen = new SportyMen(nome, peso, altezza, eta, true);
        sb.append(sportyMen.showShortMenu(fat, carbohydrates, protein));
        labelDay1.setText(sb.toString());
    }

    public void back3(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) indietro3.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("showMenu.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
