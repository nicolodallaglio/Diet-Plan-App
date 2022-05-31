package com.example.company;

public class MealRecipe{
    private Protein protein;
    private Fat fat;
    private carbohydrates carbohydrates;

    public MealRecipe(Protein protein, carbohydrates carbohydrates,Fat fat) {
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
    }

    public Protein getProtein() {
        return protein;
    }

    public com.example.company.carbohydrates getCarbohydrates() {
        return carbohydrates;
    }

    public Fat getFat() {
        return fat;
    }

    public StringBuilder PricipleMeal(PersonPrototype personPrototype){
        StringBuilder sb = new StringBuilder();
        sb.append("\nPasto principale: ");
        sb.append(fat.calculatePortion(personPrototype));
        sb.append(carbohydrates.calculatePortion(personPrototype));
        sb.append(protein.calculatePortion(personPrototype));
        return sb;
    }

    public StringBuilder PricipleMeal(WomenPerson personPrototype){
        StringBuilder sb = new StringBuilder();
        sb.append(fat.calculatePortion(personPrototype));
        sb.append(carbohydrates.calculatePortion(personPrototype));
        sb.append(protein.calculatePortion(personPrototype));
        return sb;
    }

    public StringBuilder PricipleMeal(SportyWomen personPrototype){
        StringBuilder sb = new StringBuilder();
        sb.append(fat.calculatePortion(personPrototype));
        sb.append(carbohydrates.calculatePortion(personPrototype));
        sb.append(protein.calculatePortion(personPrototype));
        return sb;
    }

    public StringBuilder PricipleMeal(MenPerson personPrototype){
        StringBuilder sb = new StringBuilder();
        sb.append(fat.calculatePortion(personPrototype));
        sb.append(carbohydrates.calculatePortion(personPrototype));
        sb.append(protein.calculatePortion(personPrototype));
        return sb;
    }

    public StringBuilder PricipleMeal(SportyMen personPrototype){
        StringBuilder sb = new StringBuilder();
        sb.append(fat.calculatePortion(personPrototype));
        sb.append(carbohydrates.calculatePortion(personPrototype));
        sb.append(protein.calculatePortion(personPrototype));
        return sb;
    }
}
