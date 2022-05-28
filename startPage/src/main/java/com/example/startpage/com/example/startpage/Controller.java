package com.example.startpage;

import com.example.company.SportyMen;
import com.example.company.*;
import com.example.model.Alimenti;
import com.example.model.Datasource;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.w3c.dom.events.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

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
    private Label weight;
    @FXML
    private SplitMenuButton sex;
    @FXML
    private SplitMenuButton sporty;
    @FXML
    private Button analizeData;
    @FXML
    private TextArea textMenu;

    public void initialize(URL location, ResourceBundle resources) {

    }


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
    }

    @FXML
    private MenuItem noSporty;
    public void noSportyAction(ActionEvent actionEvent) throws IOException {
        sporty.setText("No");
    }

    @FXML
    private Label bodyPer;
    @FXML
    private Button avanti1;
    @FXML
    private Button indietro1;

    public void back1(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) indietro1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));

    }

    public void closeMenu(ActionEvent actionEvent) throws IOException {
        System.exit(0);
    }

    public void mostraAlimenti(ActionEvent actionEvent) throws IOException{
        com.example.model.Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Non riesco ad aprire datasource");
            return;
        }
        List<Alimenti> alimenti = datasource.queryAlimenti();
        if (alimenti == null) {
            System.out.println("Nessun alimento");
            return;
        }
        System.out.println("Benvenuto, questi sono gli elementi presenti nel sistema");
        StringBuilder sb= new StringBuilder();
        for (Alimenti alimento : alimenti) {
            sb.append(alimento.getName() + ", Calorie= " + alimento.getCalorie() + ", Carboidrati= " + alimento.getCho() + ", Proteine= " + alimento.getProte() + ", Grassi= " + alimento.getGrassi());
            sb.append("\n");
        }

        bodyPer.setText(sb.toString());
    }

    @FXML
    public void showBodyFat(ActionEvent actionEvent) throws IOException {
        SportyMen sportyMen = new SportyMen(name.getText(), Integer.parseInt(weight.getText()), Float.parseFloat(height.getText()), Integer.parseInt(age.getText()), true);
        StringBuilder sb = new StringBuilder();
        sb = sportyMen.showData();
        float bmi;
        bmi = sportyMen.BmiCalculated();
        sb.append(sportyMen.bodyFatSituation((int) bmi));

        bodyPer.setText(sb.toString());

    }

    public void next1(ActionEvent actionEvent) throws IOException {


    }
    public void next2(ActionEvent actionEvent) throws IOException {

    }
    public void next3(ActionEvent actionEvent) throws IOException {

    }

}