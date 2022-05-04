package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("mimmo", 50, (float) 1.8, 60, true,true);
        person.showData();
        float bmi = person.BmiCalculated();
        person.bodyFatSituation((int) bmi);
        Fat fat = new Fat(null);
        carbohydrates carbohydrates = new carbohydrates(null);
        Protein protein = new Protein(null);
        person.showShortMenu(fat,carbohydrates,protein);
    }
}
