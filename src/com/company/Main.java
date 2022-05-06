package com.company;

public class Main {

    public static void main(String[] args) {
        SportyWomen person = new SportyWomen("mimma", 70, (float) 1.8, 60);
        person.showData();
        float bmi;
        bmi = person.BmiCalculated();
        person.bodyFatSituation((int) bmi);
        Fat fat = new Fat(null);
        carbohydrates carbohydrates = new carbohydrates(null);
        Protein protein = new Protein(null);
        person.showShortMenu(fat,carbohydrates,protein);
    }
}
