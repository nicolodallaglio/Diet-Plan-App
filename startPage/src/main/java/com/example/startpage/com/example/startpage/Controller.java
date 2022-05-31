package com.example.startpage;

import com.example.company.*;
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
import javafx.scene.layout.AnchorPane;
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
    private Button nuovoAlimento;
    @FXML
    private Text textAlim;
    @FXML
    private Label errorLabel;
    @FXML
    private Text mainMenuText;
    @FXML
    private AnchorPane ancorpane;

    private static String nome = "";
    private static float altezza;
    private static int peso;
    private static int eta = 0;
    private static String sesso= "";
    private static String attivita = "";

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
                };
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

    @FXML
    private PieChart pieChart;

    public void showBodyFat(MouseEvent mouseEvent) throws IOException {
        mainMenuText.setText("Eccoci nel menu principale, " + nome + "!\n"+ "Troverai i pasti per tutta la settimana e ulteriori informazioni utili.");
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

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void next1(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("day-1.fxml"));
        root = loader.load();

        Controller1 scene2Controller = loader.getController();
        scene2Controller.method1(nome,peso,altezza,eta,sesso,attivita);

        //root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void next2(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) avanti1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("day-2.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }

    public void back4(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) indietro4.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("showMenu.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }
    public void next3(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) avanti1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("day-3.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }
    public void back5(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) indietro5.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("showMenu.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }
    public void next4(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) avanti1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("day-4.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }
    public void back6(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) indietro6.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("showMenu.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }
    public void next5(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) avanti1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("day-5.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }
    public void back7(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) indietro7.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("showMenu.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }
    public void next6(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) avanti1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("day-6.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }
    public void back8(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) indietro8.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("showMenu.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }
    public void next7(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) avanti1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("day-7.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }
    public void back9(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) indietro9.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("showMenu.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root));
    }
}