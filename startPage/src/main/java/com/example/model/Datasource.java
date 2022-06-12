package com.example.model;

import com.example.model.Alimenti;

import java.net.SocketOption;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Datasource {
    public static final String DB_NAME = "databaseOOP.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\databases\\" + DB_NAME;
    public static final String TABLE_ALIMENTI = "alimenti";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_TIPO = "tipo";
    public static final String COLUMN_CALORIE = "calorie"; //per 100gr
    public static final String COLUMN_PROTE = "prote"; //quanti grammi di prote nell'alimento per 100gr
    public static final String COLUMN_FATS = "fats";
    public static final String COLUMN_CHO = "cho";

    private Connection conn;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);

            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_ALIMENTI);

            //tabella ALIMENTI   colonne: ID+NAME+TIPO+CALORIE+CHO+PROTE+FATS
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_ALIMENTI + " (" + COLUMN_ID + " integer, " + COLUMN_NAME + " text," + COLUMN_TIPO + " text," + COLUMN_CALORIE + " integer," + COLUMN_CHO + " float," + COLUMN_PROTE + " integer," + COLUMN_FATS + " integer" + ")");
            //inserimento elementi (tipi: carboidrato - proteine - grassi - verdura - frutta)
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('1','pollo','proteina','125','0','24','1')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('2','tonno al naturale','proteina','100','0','30','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('3','carne di manzo macinata','proteina','241','0','24','15')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('4','vitello','proteina','228','0','24','13')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('5','lonza di maiale','proteina','242','0','28','15')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','bresaola','proteina','153','2','31','2')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('6','salmone','proteina','179','0','20','10.5')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('7','fesa di tacchino','proteina','100','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('8','carne secca','proteina','100','0','51','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('9','gamberetti','proteina','','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('10','merluzzo','proteina','','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('11','nasello','proteina','','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('12','fiocchi di latte','proteina','100','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('13','yogurt greco magro','proteina','100','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('14','albume','proteina','100','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('15','uova','proteina','155','1','12.5','10.6')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('16','proteine in polvere','frutta','120','0','26','1')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('17','persico','proteina','117','0','25','1')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('18','polipo','proteina','100','0','28','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('20','lenticchie','proteina','353','60','25','1')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('12','piselli','proteina','52','12.5','76','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','olio evo','grassi','884','0','0','100')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','parmigiano grattugiato','grassi','431','4','38','28')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','avocado','grassi','100','8.5','2','14')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','olive','grassi','145','4','1','15')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','frutta secca','grassi','600','17','14','60')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','burro di arachidi','grassi','589','21','24','49')");
            //carbo [ID+NAME+TIPO+CALORIE+CHO+PROTE+FATS]
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','pane di segale','carboidrato','258','48','8.5','3.3')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','pane integrale','carboidrato','224','48.5','7.5','1.3')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','pane','carboidrato','271','50','8.8','3.5')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','pasta','carboidrato','353','80','11','1.4')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','patate','carboidrato','85','18','2','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','riso','carboidrato','332','80','6.7','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','burro','grassi','710','0','0','80')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','fagioli','carboidrato','337','60','22','1.5')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','fiocchi di avena','carboidrato','389','66','16','6.8')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','quinoa','carboidrato','368','64','14','80')");
            //verdura
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('null','lattuga','verdura','17','4','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('null','zucchine','verdura','21','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('null','funghi','verdura','22','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('null','spinaci','verdura','23','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('null','cavolfiore','verdura','25','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('null','melanzane','verdura','24','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('null','rucola','verdura','25','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('null','peperoni','verdura','27','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('null','cipolline','verdura','27','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('null','cavolo verza','verdura','27','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('null','broccoli','verdura','28','0','0','0')");
            //frutta
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('null','mela','frutta','100','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('null','succo di arancia','frutta','137','8.2','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','marmellata di frutta fresca','frutta','278','60','','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','pera','frutta','57','15','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','arancia','frutta','45','0','0','0')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','fragole','frutta','32','7','0','1')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','kiwi','frutta','61','14','23','1')");
            statement.execute("INSERT INTO " + TABLE_ALIMENTI + " (" + COLUMN_ID + "," + COLUMN_NAME + "," + COLUMN_TIPO + "," + COLUMN_CALORIE + "," + COLUMN_CHO + "," + COLUMN_PROTE + "," + COLUMN_FATS + ")" + "VALUES ('NULL','pesca','frutta','9','0','0','39')");

            return true;

        } catch (SQLException e) {
            System.out.println("Non riesco a connettermi al database: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }



    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Non riesco a chiudere la connessione al database: " + e.getMessage());
            e.printStackTrace();
        }
    }


    public List<Alimenti> inserimentoAlimento(String nomeA, String tipoA, String calorieA) throws SQLException {
        open();
        List<Alimenti> nuova = new ArrayList<>();
        nuova.addAll(queryAlimenti());
        Alimenti alimento = new Alimenti();
        alimento.setName(nomeA);
        alimento.setTipo(tipoA);
        alimento.setCalorie(Integer.parseInt(calorieA));
        nuova.add(alimento);
        return nuova;
    }

    //metodo che restituisce la lista degli ingredienti
    public List<com.example.model.Alimenti> queryAlimenti() {

        List<com.example.model.Alimenti> alimenti = new ArrayList<>();
        try(Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_ALIMENTI) ) {

            // List<Ingredienti> ingredienti = new ArrayList<>();
            while (results.next()) {
                com.example.model.Alimenti alimento = new com.example.model.Alimenti();
                alimento.setId(results.getInt(COLUMN_ID));
                alimento.setName(results.getString(COLUMN_NAME));
                alimento.setTipo(results.getString(COLUMN_TIPO));
                alimento.setCalorie(results.getInt(COLUMN_CALORIE));
                alimento.setCho(results.getInt(COLUMN_CHO));
                alimento.setProte(results.getInt(COLUMN_PROTE));
                alimento.setGrassi(results.getInt(COLUMN_FATS));

                alimenti.add(alimento);
            }
            return alimenti;
        } catch (SQLException e) {
            System.out.println("query di lista ingredienti fallita" + e.getMessage());
            e.printStackTrace();
        }
        return alimenti;
    }

    public List<com.example.model.Alimenti> queryCarboidrati() {

        List<com.example.model.Alimenti> carboidrati = new ArrayList<>();
        try(Statement statement = conn.createStatement();
            ResultSet results =
                    statement.executeQuery("SELECT * FROM " + TABLE_ALIMENTI + " WHERE tipo='carboidrato'") ) {

            // List<Ingredienti> ingredienti = new ArrayList<>();
            while (results.next()) {
                com.example.model.Alimenti carboidrato = new com.example.model.Alimenti();
                carboidrato.setId(results.getInt(COLUMN_ID));
                carboidrato.setName(results.getString(COLUMN_NAME));
                carboidrato.setTipo(results.getString(COLUMN_TIPO));
                carboidrato.setCalorie(results.getInt(COLUMN_CALORIE));
                carboidrato.setCho(results.getInt(COLUMN_CHO));
                carboidrato.setProte(results.getInt(COLUMN_PROTE));
                carboidrato.setGrassi(results.getInt(COLUMN_FATS));

                carboidrati.add(carboidrato);
            }
            return carboidrati;
        } catch (SQLException e) {
            System.out.println("query di lista carboidrati fallita" + e.getMessage());
            e.printStackTrace();
        }
        return carboidrati;
    }

    public List<com.example.model.Alimenti> queryGrassi() {

        List<com.example.model.Alimenti> grassi = new ArrayList<>();
        try(Statement statement = conn.createStatement();
            ResultSet results =
                    statement.executeQuery("SELECT * FROM " + TABLE_ALIMENTI + " WHERE tipo='grassi'") ) {

            // List<Ingredienti> ingredienti = new ArrayList<>();
            while (results.next()) {
                com.example.model.Alimenti grasso = new com.example.model.Alimenti();
                grasso.setId(results.getInt(COLUMN_ID));
                grasso.setName(results.getString(COLUMN_NAME));
                grasso.setTipo(results.getString(COLUMN_TIPO));
                grasso.setCalorie(results.getInt(COLUMN_CALORIE));
                grasso.setCho(results.getInt(COLUMN_CHO));
                grasso.setProte(results.getInt(COLUMN_PROTE));
                grasso.setGrassi(results.getInt(COLUMN_FATS));

                grassi.add(grasso);
            }
            return grassi;
        } catch (SQLException e) {
            System.out.println("query di lista carboidrati fallita" + e.getMessage());
            e.printStackTrace();
        }
        return grassi;
    }

    public List<com.example.model.Alimenti> queryProteine() {

        List<com.example.model.Alimenti> proteine = new ArrayList<>();
        try(Statement statement = conn.createStatement();
            ResultSet results =
                    statement.executeQuery("SELECT * FROM " + TABLE_ALIMENTI + " WHERE tipo='proteina'") ) {

            // List<Ingredienti> ingredienti = new ArrayList<>();
            while (results.next()) {
                com.example.model.Alimenti proteina = new com.example.model.Alimenti();
                proteina.setId(results.getInt(COLUMN_ID));
                proteina.setName(results.getString(COLUMN_NAME));
                proteina.setTipo(results.getString(COLUMN_TIPO));
                proteina.setCalorie(results.getInt(COLUMN_CALORIE));
                proteina.setCho(results.getInt(COLUMN_CHO));
                proteina.setProte(results.getInt(COLUMN_PROTE));
                proteina.setGrassi(results.getInt(COLUMN_FATS));

                proteine.add(proteina);
            }
            return proteine;
        } catch (SQLException e) {
            System.out.println("query di lista carboidrati fallita" + e.getMessage());
            e.printStackTrace();
        }
        return proteine;
    }

    public List<com.example.model.Alimenti> queryFrutta() {

        List<com.example.model.Alimenti> frutta = new ArrayList<>();
        try(Statement statement = conn.createStatement();
            ResultSet results =
                    statement.executeQuery("SELECT * FROM " + TABLE_ALIMENTI + " WHERE tipo='frutta'") ) {

            // List<Ingredienti> ingredienti = new ArrayList<>();
            while (results.next()) {
                com.example.model.Alimenti frutto = new com.example.model.Alimenti();
                frutto.setId(results.getInt(COLUMN_ID));
                frutto.setName(results.getString(COLUMN_NAME));
                frutto.setTipo(results.getString(COLUMN_TIPO));
                frutto.setCalorie(results.getInt(COLUMN_CALORIE));
                frutto.setCho(results.getInt(COLUMN_CHO));
                frutto.setProte(results.getInt(COLUMN_PROTE));
                frutto.setGrassi(results.getInt(COLUMN_FATS));

                frutta.add(frutto);
            }
            return frutta;
        } catch (SQLException e) {
            System.out.println("query di lista carboidrati fallita" + e.getMessage());
            e.printStackTrace();
        }
        return frutta;
    }

    public List<com.example.model.Alimenti> queryVerdure() {

        List<com.example.model.Alimenti> verdure = new ArrayList<>();
        try(Statement statement = conn.createStatement();
            ResultSet results =
                    statement.executeQuery("SELECT * FROM " + TABLE_ALIMENTI + " WHERE tipo='verdura'") ) {

            // List<Ingredienti> ingredienti = new ArrayList<>();
            while (results.next()) {
                com.example.model.Alimenti verdura = new Alimenti();
                verdura.setId(results.getInt(COLUMN_ID));
                verdura.setName(results.getString(COLUMN_NAME));
                verdura.setTipo(results.getString(COLUMN_TIPO));
                verdura.setCalorie(results.getInt(COLUMN_CALORIE));
                verdura.setCho(results.getInt(COLUMN_CHO));
                verdura.setProte(results.getInt(COLUMN_PROTE));
                verdura.setGrassi(results.getInt(COLUMN_FATS));

                verdure.add(verdura);
            }
            return verdure;
        } catch (SQLException e) {
            System.out.println("query di lista carboidrati fallita" + e.getMessage());
            e.printStackTrace();
        }
        return verdure;
    }
}

