package com.company;

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

    public com.company.carbohydrates getCarbohydrates() {
        return carbohydrates;
    }

    public Fat getFat() {
        return fat;
    }

    public void PricipleMeal(PersonPrototype personPrototype){
        System.out.println("\npasto principale:");
        fat.calculatePortion(personPrototype);
        carbohydrates.calculatePortion(personPrototype);
        protein.calculatePortion(personPrototype);
    }

    public void PricipleMeal(WomenPerson personPrototype){
        System.out.println("\npasto principale per woman:");
        fat.calculatePortion(personPrototype);
        carbohydrates.calculatePortion(personPrototype);
        protein.calculatePortion(personPrototype);
    }

    public void PricipleMeal(SportyWomen personPrototype){
        System.out.println("\npasto principale per sporty woman:");
        fat.calculatePortion(personPrototype);
        carbohydrates.calculatePortion(personPrototype);
        protein.calculatePortion(personPrototype);
    }

    public void PricipleMeal(MenPerson personPrototype){
        System.out.println("\npasto principale per men:");
        fat.calculatePortion(personPrototype);
        carbohydrates.calculatePortion(personPrototype);
        protein.calculatePortion(personPrototype);
    }

    public void PricipleMeal(SportyMen personPrototype){
        System.out.println("\npasto principale per sporty men:");
        fat.calculatePortion(personPrototype);
        carbohydrates.calculatePortion(personPrototype);
        protein.calculatePortion(personPrototype);
    }
}
