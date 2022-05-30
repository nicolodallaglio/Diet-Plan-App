package com.example.company;

public class MenPerson extends PersonPrototype implements IPerson{
    public MenPerson(String name, int weight, float height, int age) {
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
    public StringBuilder showShortMenu(Fat fat, carbohydrates carbohydrates, Protein protein) {
        FruitDecorator fruitDecorator = new FruitDecorator(null);
        MealRecipe mealRecipe = new MealRecipe(protein, carbohydrates, fat);
        VegetableDecorator vegetableDecorator = new VegetableDecorator(null);
        TypesOfCooking typesOfCooking = new TypesOfCooking();
        BreakfastRecipe breakfastRecipe = new BreakfastRecipe();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            sb.append("\ngiorno " + (i + 1) + " della dieta");
            sb.append("Colazione: ").append(breakfastRecipe.Breakfast());
            sb.append(fruitDecorator.showFruit());
            sb.append(mealRecipe.PricipleMeal(this));
            sb.append("\nTipo di cottura: ").append(typesOfCooking.TypesOfCookingFunction());
            sb.append(vegetableDecorator.showVegetable());
            sb.append(fruitDecorator.showFruit());
            sb.append(mealRecipe.PricipleMeal(this));
            sb.append("\nTipo di cottura: ").append(typesOfCooking.TypesOfCookingFunction());
            sb.append(vegetableDecorator.showVegetable());
        }
        return sb;
    }
}
