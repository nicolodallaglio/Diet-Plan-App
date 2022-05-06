package com.company;

public class BaseMeal {
    private String nameFood;

    public BaseMeal(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public float calculatePortion(MealRecipe personPrototype){return 0;}
}
