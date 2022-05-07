package com.company;

public class SportyMen extends PersonPrototype{
    private boolean useProtein;
    public SportyMen(String name, int weight, float height, int age, boolean useProtein) {
        super(name, weight, height, age);
        this.useProtein = useProtein;
    }

    public boolean isUseProtein() {
        return useProtein;
    }

    public void setUseProtein(boolean useProtein) {
        this.useProtein = useProtein;
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
    public void showData() {
        super.showData();
    }

    @Override
    public void bodyFatSituation(int bmi) {
        super.bodyFatSituation(bmi);
    }

    public void foodForGym(){
        SportyFood sportyFood = new SportyFood();
        if (useProtein){
            sportyFood.proteinPreAndPost();
        }else{
            sportyFood.chooseFoodPreWorkout();
            sportyFood.chooseFoodPostWorkout();
        }
    }

    @Override
    public void showShortMenu(Fat fat, carbohydrates carbohydrates, Protein protein) {
        FruitDecorator fruitDecorator = new FruitDecorator(null);
        MealRecipe mealRecipe = new MealRecipe(protein, carbohydrates, fat);
        VegetableDecorator vegetableDecorator = new VegetableDecorator(null);
        TypesOfCooking typesOfCooking = new TypesOfCooking();
        BreakfastRecipe breakfastRecipe = new BreakfastRecipe();
            System.out.println("\nMENU' DEL GIORNO CON INCLUSO ALLENAMENTO");
            breakfastRecipe.SportyBreakfast();
            fruitDecorator.showFruit();
            mealRecipe.PricipleMeal(this);
            vegetableDecorator.showVegetable();
            typesOfCooking.TypesOfCookingFunction();
            fruitDecorator.showFruit();
            foodForGym();
            mealRecipe.PricipleMeal(this);
            vegetableDecorator.showVegetable();
            typesOfCooking.TypesOfCookingFunction();
    }
}
