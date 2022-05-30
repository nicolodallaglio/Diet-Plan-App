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

    public String PricipleMeal(PersonPrototype personPrototype){
        String sb=("\nPasto principale: ");
        fat.calculatePortion(personPrototype);
        carbohydrates.calculatePortion(personPrototype);
        protein.calculatePortion(personPrototype);
        return sb;
    }

    public String PricipleMeal(WomenPerson personPrototype){
        String sb=("\nPasto principale per donna: ");
        fat.calculatePortion(personPrototype);
        carbohydrates.calculatePortion(personPrototype);
        protein.calculatePortion(personPrototype);
        return sb;
    }

    public String PricipleMeal(SportyWomen personPrototype){
        String sb=("\nPasto principale per donna sportiva: ");
        fat.calculatePortion(personPrototype);
        carbohydrates.calculatePortion(personPrototype);
        protein.calculatePortion(personPrototype);
        return sb;
    }

    public String PricipleMeal(MenPerson personPrototype){
        String sb=("\nPasto principale per uomo sportivo: ");
        fat.calculatePortion(personPrototype);
        carbohydrates.calculatePortion(personPrototype);
        protein.calculatePortion(personPrototype);
        return sb;
    }

    public String PricipleMeal(SportyMen personPrototype){
        String sb=("\nPasto principale per uomo sportivo:");
        fat.calculatePortion(personPrototype);
        carbohydrates.calculatePortion(personPrototype);
        protein.calculatePortion(personPrototype);
        return sb;
    }
}
