package com.company;

public class MealRecipe extends Person{
    private Protein protein;
    private Fat fat;
    private carbohydrates carbohydrates;

    public MealRecipe(String name, int weight, float height, int age, boolean male, boolean sporty, Protein protein, Fat fat, com.company.carbohydrates carbohydrates) {
        super(name, weight, height, age, male, sporty);
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
    }

    public Protein getProtein() {
        return protein;
    }

    public com.company.carbohydrates getCarbohydrates() {
        return carbohydrates;
    }

    public Fat getFat() {
        return fat;
    }

    public void showPricipleMeal(){
        System.out.println("\npasto principale:");
        fat.calculatePortion(this);
        carbohydrates.calculatePortion(this, (int) this.BmiCalculated());
        protein.calculatePortion(this, (int) this.BmiCalculated());
    }
}
