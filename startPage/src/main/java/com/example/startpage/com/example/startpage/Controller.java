package com.example.startpage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
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
    private Button avanti1;

    @FXML
    private MenuItem showData;
    @FXML
    private Button nuovoAlimento;
    @FXML
    private Label errorLabel;
    @FXML
    private AnchorPane ancorpane;

    public static String nome = "";
    public static float altezza;
    public static int peso;
    public static int eta = 0;
    public static String sesso= "";
    public static String attivita = "";

    public void initialize(URL location, ResourceBundle resources) {

    }

    public void premiperproseguire(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) bottFirst.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }

    public void getInput(ActionEvent actionEvent) {
        try {
            nome = name.getText();
            String cognome = surname.getText();
            peso = Integer.parseInt(weight.getText());
            altezza = Float.parseFloat(height.getText());
            if(altezza<1.5 || peso<40){
                throw new Exception();
            }
            eta = Integer.parseInt(age.getText());
            if(!sex.getText().equals("uomo") && !sex.getText().equals("donna")){
                throw new Exception();
            }
            if(!sporty.getText().equals("Sì") && !sporty.getText().equals("No")){
                throw new Exception();
            }
        } catch (Exception e) {
            errorLabel.setText("ERROR:" + "inserire correttamente i dati");
            getInput(actionEvent);
        }
        errorLabel.setText("");

    }

    public void analizzaAction(MouseEvent mouseEvent ) throws IOException {
        if(errorLabel.getText().equals("ERROR:\n" + "inserire correttamente i dati")){
            //attendo i dati corretti
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("showMenu.fxml"));
            Parent root = loader.load();

            Controller2 scene3Controller = loader.getController();
            scene3Controller.showBodyFat(nome,peso,altezza,eta,sesso,attivita);

            //root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
            Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    public void donnaAction(ActionEvent actionEvent) throws IOException {
        sex.setText("donna");
        sesso=sex.getText();
    }

    public void maschioAction(ActionEvent actionEvent) throws IOException {
        sex.setText("uomo");
        sesso=sex.getText();
    }

    public void sportyAction(ActionEvent actionEvent) throws IOException {
        sporty.setText("Sì");
        attivita=sporty.getText();
    }

    public void noSportyAction(ActionEvent actionEvent) throws IOException {
        sporty.setText("No");
        attivita=sporty.getText();
    }

}