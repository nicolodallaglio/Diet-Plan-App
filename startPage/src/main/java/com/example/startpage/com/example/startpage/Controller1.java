package com.example.startpage;

import com.example.company.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.example.startpage.Controller.*;

public class Controller1 implements Initializable {

    @FXML
    private Label labelDay1;
    @FXML
    private Button indietro3;
    @FXML
    private MenuItem closeDay1;
    @FXML
    private MenuItem scaricaFile;
    @FXML
    private TextField downloadTextFIeld;

    public void method1(String nome, int peso, float altezza, int eta, String sesso, String attivita) throws IOException {
        StringBuilder sb = new StringBuilder();
        Fat fat = new Fat(null);
        carbohydrates carbohydrates = new carbohydrates(null);
        Protein protein = new Protein(null);
        if(attivita.equals("Sì") && sesso.equals("uomo")){
            SportyMen sportyMen = new SportyMen(nome, peso, altezza, eta, true);
            sb.append(sportyMen.showShortMenu(fat, carbohydrates, protein));
            labelDay1.setText(sb.toString());
        }
        else if (attivita.equals("Sì") && sesso.equals("donna")) {
            SportyWomen sportyWomen = new SportyWomen(nome, peso, altezza, eta);
            sb.append(sportyWomen.showShortMenu(fat, carbohydrates, protein));
            labelDay1.setText(sb.toString());
        } else if (attivita.equals("No") && sesso.equals("uomo")) {
            MenPerson menPerson = new MenPerson(nome, peso, altezza, eta);
            sb.append(menPerson.showShortMenu(fat, carbohydrates, protein));
            labelDay1.setText(sb.toString());
        }
        else {
            WomenPerson womenPerson = new WomenPerson(nome, peso, altezza, eta);
            sb.append(womenPerson.showShortMenu(fat, carbohydrates, protein));
            labelDay1.setText(sb.toString());
        }
    }


    private Stage stage;
    private Scene scene;
    private Parent root;
    public void back3(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("showMenu.fxml"));
        root = loader.load();

        Controller2 scene3Controller = loader.getController();
        scene3Controller.showBodyFat(nome,peso,altezza,eta,sesso,attivita);

        //root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        /*
        Stage stage = (Stage) indietro3.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("showMenu.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
         */
    }

    public void exitDay1(ActionEvent actionEvent) throws IOException {
        System.exit(0);
    }

    public void download(ActionEvent actionEvent) throws IOException {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("All Files", "*.txt"));
        //Adding action on the menu item
        File file = fileChooser.showSaveDialog(labelDay1.getScene().getWindow());
        if (file != null) {
            try {
                PrintWriter writer;
                writer = new PrintWriter(file);
                writer.println(labelDay1.getText());
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(Controller1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
