package com.example.company;

public class WomenPerson extends PersonPrototype implements IPerson{
    public WomenPerson(String name, int weight, float height, int age) {
        super(name, weight, height, age);
    }

    @Override
    public void setHeight(float height) {
        super.setHeight(height);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public float getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public StringBuilder showData() {
       return super.showData();
    }
    @Override
    public String bodyFatSituation(int bmi) {
        return super.bodyFatSituation(bmi);
    }
    @Override
    public void showShortMenu(Fat fat, carbohydrates carbohydrates, Protein protein) {
        //super.showShortMenu(fat, carbohydrates, protein);
        FruitDecorator fruitDecorator = new FruitDecorator(null);
        MealRecipe mealRecipe = new MealRecipe(protein, carbohydrates, fat);
        VegetableDecorator vegetableDecorator = new VegetableDecorator(null);
        TypesOfCooking typesOfCooking = new TypesOfCooking();
        BreakfastRecipe breakfastRecipe = new BreakfastRecipe();
        for (int i = 0; i < 7; i++) {
            System.out.println("\ngiorno " + (i + 1) + " della dieta");
            breakfastRecipe.Breakfast();
            fruitDecorator.showFruit();
            mealRecipe.PricipleMeal(this);
            vegetableDecorator.showVegetable();
            typesOfCooking.TypesOfCookingFunction();
            fruitDecorator.showFruit();
            mealRecipe.PricipleMeal(this);
            vegetableDecorator.showVegetable();
            typesOfCooking.TypesOfCookingFunction();
        }
    }
}
