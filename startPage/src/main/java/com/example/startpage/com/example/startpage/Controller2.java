package com.example.startpage;

import com.example.company.MenPerson;
import com.example.company.SportyMen;
import com.example.company.SportyWomen;
import com.example.company.WomenPerson;
import com.example.model.Alimenti;
import com.example.model.Datasource;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

import static com.example.startpage.Controller.*;

public class Controller2 implements Initializable {

    @FXML
    private Text mainMenuText;
    @FXML
    private PieChart pieChart;
    @FXML
    private Label bodyPer;
    @FXML
    private MenuBar showMenuBar;
    @FXML
    private Button indietro2;
    @FXML
    private Button indietro4;
    @FXML
    private Button indietro5;
    @FXML
    private Button indietro6;
    @FXML
    private Button indietro7;
    @FXML
    private Button indietro8;
    @FXML
    private Button indietro9;
    @FXML
    private Button indietro1;
    @FXML
    private Button getAvanti1;
    @FXML
    private Button getAvanti2;
    @FXML
    private Button getAvanti3;
    @FXML
    private Button getAvanti4;
    @FXML
    private Button getAvanti5;
    @FXML
    private Button getAvanti6;
    @FXML
    private Button getAvanti7;
    @FXML
    private Button anchorPane3;


    public void showBodyFat(String nome, int peso, float altezza, int eta, String sesso, String attivita)  {
        mainMenuText.setText("Eccoci nel menu principale, " + nome + "!\n"+ "Troverai i pasti per tutta la settimana"+ "\n" + "e ulteriori informazioni utili.");
        StringBuilder sb = new StringBuilder();
        double bmi;

        //PIE_CHART
        if(pieChart.getData().isEmpty()) {
            ObservableList<PieChart.Data> pieChartData =
                    FXCollections.observableArrayList(
                            new PieChart.Data("Massa muscolare", Math.ceil((1.10*peso)-128*( (peso*peso) / ((100 * altezza)*(100 * altezza))))),
                            new PieChart.Data("Massa grassa",Math.ceil(peso-((1.10*peso)-128*( (peso*peso) / ((100 * altezza)*(100 * altezza)))))));
            pieChartData.forEach(data ->
                    data.nameProperty().bind(
                            Bindings.concat(
                                    data.getName(), ": ", data.pieValueProperty()
                            )
                    ));
            pieChart.getData().addAll(pieChartData);
        }

        if(attivita.equals("Sì") && sesso.equals("uomo")){
            SportyMen sportyMen = new SportyMen(nome, peso, altezza, eta, true);
            bmi = Math.round((sportyMen.BmiCalculated()));
            bodyPer.setText(sb.append("Il tuo indice di massa corporea: ").append(bmi).append("\n").append("ovvero: ").append(sportyMen.bodyFatSituation((int)bmi)).toString());
        }
        else if (attivita.equals("Sì") && sesso.equals("donna"))
        {
            SportyWomen sportyWomen = new SportyWomen(nome, peso, altezza, eta);
            bmi = Math.round((sportyWomen.BmiCalculated()));
            bodyPer.setText(sb.append("Il tuo indice di massa corporea: ").append(bmi).append("\n").append("ovvero: ").append(sportyWomen.bodyFatSituation((int)bmi)).toString());
        }
        else if (attivita.equals("No") && sesso.equals("uomo"))
        {
            MenPerson menPerson = new MenPerson(nome, peso, altezza, eta);
            bmi = Math.round((menPerson.BmiCalculated()));
            bodyPer.setText(sb.append("Il tuo indice di massa corporea: ").append(bmi).append("\n").append("ovvero: ").append(menPerson.bodyFatSituation((int)bmi)).toString());
        }
        else
        {
            WomenPerson womenPerson = new WomenPerson(nome, peso, altezza, eta);
            bmi = Math.round((womenPerson.BmiCalculated()));
            bodyPer.setText(sb.append("Il tuo indice di massa corporea: ").append(bmi).append("\n").append("ovvero: ").append(womenPerson.bodyFatSituation((int)bmi)).toString());
        }
    }

    public void closeMenu(ActionEvent actionEvent) throws IOException {
        System.exit(0);
    }

    public void back1(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) indietro1.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }

    public void mostraAlimenti(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("showAlimenti.fxml"));
        Parent root = loader.load();

        Controller3 scene4Controller = loader.getController();
        scene4Controller.mostraData();

        //root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        Stage stage = (Stage) mainMenuText.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void next1(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("day-1.fxml"));
        Parent root = loader.load();

        Controller1 scene2Controller = loader.getController();
        scene2Controller.method1(nome,peso,altezza,eta,sesso,attivita);

        //root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
