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
    public StringBuilder showShortMenu(Fat fat, carbohydrates carbohydrates, Protein protein) {
        //super.showShortMenu(fat, carbohydrates, protein);
        FruitDecorator fruitDecorator = new FruitDecorator(null);
        MealRecipe mealRecipe = new MealRecipe(protein, carbohydrates, fat);
        VegetableDecorator vegetableDecorator = new VegetableDecorator(null);
        TypesOfCooking typesOfCooking = new TypesOfCooking();
        BreakfastRecipe breakfastRecipe = new BreakfastRecipe();
        StringBuilder sb = new StringBuilder();
        sb.append("MENU' DEL GIORNO\n");
        sb.append("\n1) Colazione: ").append(breakfastRecipe.Breakfast());
        sb.append(fruitDecorator.showFruit());
        sb.append("\n2) Pranzo:\n").append(mealRecipe.PricipleMeal(this));
        sb.append("\nTipo di cottura: ").append(typesOfCooking.TypesOfCookingFunction());
        sb.append(vegetableDecorator.showVegetable());
        sb.append(fruitDecorator.showFruit());
        sb.append("\n3) Cena:\n ").append(mealRecipe.PricipleMeal(this));
        sb.append("\nTipo di cottura: ").append(typesOfCooking.TypesOfCookingFunction());
        sb.append(vegetableDecorator.showVegetable());
        return sb;
    }
}
