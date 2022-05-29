package com.example.startpage;

import com.example.company.SportyMen;
import com.example.model.Alimenti;
import com.example.model.Datasource;
import javafx.css.Style;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
    @FXML
    private MenuItem showData;
    @FXML
    private MenuBar showMenuBar;
    @FXML
    private ScrollPane scrollAlim;
    @FXML
    private Button indietro2;
    @FXML
    private Button nuovoAlimento;
    @FXML
    private Text textAlim;
    @FXML
    private Label errorLabel;
    @FXML
    private Text mainMenuText;


    private static String nome = "";

    private static String cognome= "";

    private static float altezza;

    private static int peso;

    private static int eta = 0;

    public void initialize(URL location, ResourceBundle resources) {

    }

    public void premiperproseguire(ActionEvent actionEvent) throws IOException {
           Stage stage = (Stage) bottFirst.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }

    public void getInput(ActionEvent actionEvent) {
            try {
                nome = name.getText();
                cognome = surname.getText();
                peso = Integer.parseInt(weight.getText());
                altezza = Float.parseFloat(height.getText());
                eta = Integer.parseInt(age.getText());
            } catch (Exception e) {
                errorLabel.setText("ERRORE:\n" + "inserire correttamente i dati");
                getInput(actionEvent);
            }
        errorLabel.setText("");
    }

    public void analizzaAction(MouseEvent mouseEvent ) throws IOException {
        if(errorLabel.getText().equals("ERRORE:\n" + "inserire correttamente i dati")){
            //attendo i dati corretti
        } else {
            Stage stage = (Stage) analizeData.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("showMenu.fxml"));
            stage.setTitle("");
            stage.setScene(new Scene(root));
        }
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

    public void mostraAlimenti(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) showMenuBar.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("showAlimenti.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private AnchorPane ancorpane;
    public void mostraData(MouseEvent mouseEvent) throws IOException {

        scrollAlim.setPannable(true);
        com.example.model.Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Non riesco ad aprire datasource");
            return;
        }
        List<Alimenti> alimenti = datasource.queryAlimenti();
        if (alimenti == null) {
            textAlim.setText("Nessun alimento");
            return;
        }

        StringBuilder sb= new StringBuilder();
        for (Alimenti alimento : alimenti) {
            sb.append(alimento.getName().toUpperCase()).append(", calorie= ").append(alimento.getCalorie());
            sb.append("\n");
        }

        scrollAlim.setContent(textAlim);
        textAlim.setText(sb.toString());

    }

    public void addAlimento(ActionEvent actionEvent) throws IOException {

    }

    public void back2(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) indietro2.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("showMenu.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }

    public void showBodyFat(MouseEvent mouseEvent) throws IOException {
        mainMenuText.setText("Eccoci nel menu principale, " + nome + "!\n"+ "Troverai i pasti per tutta la settimana e ulteriori informazioni utili.");
        SportyMen sportyMen = new SportyMen(nome, peso, altezza, eta, true);
        StringBuilder sb = new StringBuilder();
        float bmi;
        bmi = sportyMen.BmiCalculated();
        bodyPer.setText(sb.append("Il tuo indice di massa corporea: ").append(bmi).append("\n").append("ovvero: ").append(sportyMen.bodyFatSituation((int)bmi)).toString());
    }

    public void next1(ActionEvent actionEvent) throws IOException {}
    public void next2(ActionEvent actionEvent) throws IOException {}
    public void next3(ActionEvent actionEvent) throws IOException {}
    public void next4(ActionEvent actionEvent) throws IOException {}
    public void next5(ActionEvent actionEvent) throws IOException {}
    public void next6(ActionEvent actionEvent) throws IOException {}
    public void next7(ActionEvent actionEvent) throws IOException {}
}