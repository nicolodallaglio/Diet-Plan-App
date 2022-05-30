package com.example.company;

public interface IPerson {
    public StringBuilder showData();
    public String bodyFatSituation(int bmi);
    public StringBuilder showShortMenu(Fat fat, carbohydrates carbohydrates, Protein protein);
}
