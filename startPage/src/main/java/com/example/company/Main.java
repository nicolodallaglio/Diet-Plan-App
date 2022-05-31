package com.example.company;
import com.example.model.Alimenti;
import com.example.model.Datasource;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Non riesco ad aprire datasource");
            return;
        }
        List<com.example.model.Alimenti> alimenti = datasource.queryAlimenti();
        if (alimenti == null) {
            System.out.println("Nessun alimento");
            return;
        }
        System.out.println("Benvenuto");

        int age=-1;

            try {
                System.out.println("ciaone.");
            } catch (InputMismatchException e) {
                System.out.println("Input errato. Inserire i dati richiesti.");
            } catch (RuntimeException e) {
                System.out.println(("Qualcosa è andato storto"));
                e.printStackTrace();
            }

    }
}
