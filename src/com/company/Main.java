package com.company;
import Model.*;
import com.sun.jdi.ClassNotLoadedException;


import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    try {

        Datasource datasource = new Datasource();
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
        for (Alimenti alimento : alimenti) {
            System.out.println("ID= " + alimento.getId() + ", Nome= " + alimento.getName() + ", Tipo= " + alimento.getTipo() + ", Calorie= " + alimento.getCalorie() + ", Carboidrati= " + alimento.getCho() + ", Proteine= " + alimento.getProte() + ", Grassi= " + alimento.getGrassi());
        }
        boolean man;
        boolean sporty;
        Scanner sc = new Scanner(System.in);
        System.out.println("uomo ? true | donna ? false");
        man = sc.nextBoolean();
        System.out.println("sportivo ?  true | else false ");
        sporty = sc.nextBoolean();
        String name;
        int weight;
        float heigh;
        int age;
        if (sporty && man) {
            System.out.println("inserire i propri dati, nome, peso, altezza ( in metri ) , eta'");
            name = sc.next();
            weight = sc.nextInt();
            heigh = sc.nextFloat();
            age = sc.nextInt();
            // todo di base tutti gli sportivi usano proteine
            SportyMen sportyMen = new SportyMen(name, weight, heigh, age, true);
            sportyMen.showData();
            float bmi;
            bmi = sportyMen.BmiCalculated();
            sportyMen.bodyFatSituation((int) bmi);
            Fat fat = new Fat(null);
            carbohydrates carbohydrates = new carbohydrates(null);
            Protein protein = new Protein(null);
            sportyMen.showShortMenu(fat, carbohydrates, protein);
        } else if (man && !sporty) {
            System.out.println("inserire i propri dati, nome, peso, altezza, eta'");
            name = sc.next();
            weight = sc.nextInt();
            heigh = sc.nextFloat();
            age = sc.nextInt();
            MenPerson menPerson = new MenPerson(name, weight, heigh, age);
            menPerson.showData();
            float bmi;
            bmi = menPerson.BmiCalculated();
            menPerson.bodyFatSituation((int) bmi);
            Fat fat = new Fat(null);
            carbohydrates carbohydrates = new carbohydrates(null);
            Protein protein = new Protein(null);
            menPerson.showShortMenu(fat, carbohydrates, protein);
        } else if (!man && !sporty) {
            System.out.println("inserire i propri dati, nome, peso, altezza, eta'");
            name = sc.next();
            weight = sc.nextInt();
            heigh = sc.nextFloat();
            age = sc.nextInt();
            WomenPerson womenPerson = new WomenPerson(name, weight, heigh, age);
            womenPerson.showData();
            float bmi;
            bmi = womenPerson.BmiCalculated();
            womenPerson.bodyFatSituation((int) bmi);
            Fat fat = new Fat(null);
            carbohydrates carbohydrates = new carbohydrates(null);
            Protein protein = new Protein(null);
            womenPerson.showShortMenu(fat, carbohydrates, protein);
        } else {
            System.out.println("inserire i propri dati, nome, peso, altezza, eta'");
            name = sc.next();
            weight = sc.nextInt();
            heigh = sc.nextFloat();
            age = sc.nextInt();
            SportyWomen person = new SportyWomen(name, weight, heigh, age);
            person.showData();
            float bmi;
            bmi = person.BmiCalculated();
            person.bodyFatSituation((int) bmi);
            Fat fat = new Fat(null);
            carbohydrates carbohydrates = new carbohydrates(null);
            Protein protein = new Protein(null);
            person.showShortMenu(fat, carbohydrates, protein);
        }

        datasource.close();
    } catch (RuntimeException e) {
        e.printStackTrace();
        }
    }
}
