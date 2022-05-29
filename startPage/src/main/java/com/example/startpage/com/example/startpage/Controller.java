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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button bottFirst;
    @FXML
    private Label labelFirst;
    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private TextField age;
    @FXML
    private TextField height;
    @FXML
    private TextField weight;
    @FXML
    private SplitMenuButton sex;
    @FXML
    private SplitMenuButton sporty;
    @FXML
    private Button analizeData;
    @FXML
    private TextArea textMenu;
    @FXML
    private MenuItem woman;
    @FXML
    private MenuItem men;
    @FXML
    private MenuItem yesSporty;
    @FXML
    private MenuItem noSporty;
    @FXML
    private Label bodyPer;
    @FXML
    private Button avanti1;
    @FXML
    private Button indietro1;


    private String nome = "";

    private String cognome= "";

    private String altezza= "";

    private String peso= "";

    private String eta= "";


    public void premiperproseguire(ActionEvent actionEvent) throws IOException {
           Stage stage = (Stage) bottFirst.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }

    public void getInput(ActionEvent actionEvent){

        nome=name.getText();
        cognome=surname.getText();
        peso=weight.getText();
        altezza=height.getText();
        eta=age.getText();

        System.out.println(nome);
        System.out.println(cognome);
        System.out.println(peso);
        System.out.println(altezza);
        System.out.println(eta);
    }

    public void analizzaAction(MouseEvent mouseEvent ) throws IOException {

        Stage stage = (Stage) analizeData.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("showMenu.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }

    public void initialize(URL location, ResourceBundle resources) {
    }

    public void donnaAction(ActionEvent actionEvent) throws IOException {
        sex.setText("donna");
    }

    public void maschioAction(ActionEvent actionEvent) throws IOException {
        sex.setText("uomo");
    }

    public void sportyAction(ActionEvent actionEvent) throws IOException {
        sporty.setText("Sì");
    }

    public void noSportyAction(ActionEvent actionEvent) throws IOException {
        sporty.setText("No");
    }

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
            bodyPer.setText("Nessun alimento");
            return;
        }

        StringBuilder sb= new StringBuilder();
        sb.append("Questi sono gli elementi presenti nel sistema: \n");
        for (Alimenti alimento : alimenti) {
            sb.append(alimento.getName()).append(", Calorie= ").append(alimento.getCalorie()).append(", Carboidrati= ").append(alimento.getCho()).append(", Proteine= ").append(alimento.getProte()).append(", Grassi= ").append(alimento.getGrassi());
            sb.append("\n");
        }
        bodyPer.setText(sb.toString());
    }


    public void showBodyFat(ActionEvent actionEvent) throws IOException {
        SportyMen sportyMen = new SportyMen(name.getText(), Integer.parseInt(weight.getText()), Float.parseFloat(height.getText()), Integer.parseInt(age.getText()), true);
        StringBuilder sb = new StringBuilder();
        sb = sportyMen.showData();

    }

    public void next1(ActionEvent actionEvent) throws IOException {}
    public void next2(ActionEvent actionEvent) throws IOException {}
    public void next3(ActionEvent actionEvent) throws IOException {}
}