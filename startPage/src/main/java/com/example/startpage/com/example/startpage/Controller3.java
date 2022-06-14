package com.example.startpage;

import com.example.model.Alimenti;
import com.example.model.Datasource;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import static com.example.startpage.Controller.*;
import static com.example.startpage.Controller.attivita;

public class Controller3 implements Initializable {
    @FXML
    private ScrollPane scrollAlim;
    @FXML
    private Text textAlim;

    StringBuilder sbA= new StringBuilder();

    public void mostraData() {

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

        for (Alimenti alimento : alimenti) {
            sbA.append(alimento.getName().toUpperCase()).append(", calorie= ").append(alimento.getCalorie());
            sbA.append("\n");
        }

        scrollAlim.setContent(textAlim);
        textAlim.setText(sbA.toString());
    }

    @FXML
    private TextField nomeNewAlim;
    @FXML
    private TextField tipoNewAlim;
    @FXML
    private TextField calNewAlim;
    @FXML
    private Label errorLabelA;

    public void addAlimento(ActionEvent actionEvent) throws IOException {
        String nomeA = "";
        String tipoA = "";
        String calorieA = "";
        try {
            nomeA = nomeNewAlim.getText();
            tipoA = tipoNewAlim.getText();
            calorieA = calNewAlim.getText();
            errorLabelA.setText("");
            switch (tipoA) {
                case "cho":
                    tipoA = "carboidrato";
                    break;
                case "pro":
                    tipoA = "proteina";
                    break;
                case "fat":
                    tipoA = "grassi";
                    break;
            }

            Datasource datasource = new Datasource();

            datasource.open();
            datasource.inserimentoAlimento(nomeA,tipoA,calorieA);
            mostraData();
        } catch (Exception e) {
            errorLabelA.setText("ERROR");
            e.printStackTrace();

        }

    }

    public void deleteAlimento(ActionEvent actionEvent) throws IOException {
        String nome = "";
        try {
            nome = nomeNewAlim.getText();
            errorLabelA.setText("");

            Datasource datasource = new Datasource();
            datasource.open();
            datasource.eliminaAlimento(nome.toUpperCase());
            mostraData();

        } catch (Exception e) {
            errorLabelA.setText("ERROR");
            e.printStackTrace();
        }

    }



    public void back2(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("showMenu.fxml"));
        Parent root = loader.load();

        Controller2 scene3Controller = loader.getController();
        scene3Controller.showBodyFat(nome,peso,altezza,eta,sesso,attivita);

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
