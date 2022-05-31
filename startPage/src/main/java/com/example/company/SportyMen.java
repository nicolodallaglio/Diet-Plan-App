package com.example.company;

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
    public float BmiCalculated() {
        return super.BmiCalculated();
    }

    @Override
    public StringBuilder showData() {
        return super.showData();
    }

    @Override
    public String bodyFatSituation(int bmi) {
        return super.bodyFatSituation(bmi);
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
    public StringBuilder showShortMenu(Fat fat, carbohydrates carbohydrates, Protein protein) {
        FruitDecorator fruitDecorator = new FruitDecorator(null);
        MealRecipe mealRecipe = new MealRecipe(protein, carbohydrates, fat);
        VegetableDecorator vegetableDecorator = new VegetableDecorator(null);
        TypesOfCooking typesOfCooking = new TypesOfCooking();
        BreakfastRecipe breakfastRecipe = new BreakfastRecipe();
        StringBuilder sb= new StringBuilder();
        sb.append("MENU' DEL GIORNO CON INCLUSO ALLENAMENTO\n");
        sb.append("\n1) Colazione: ").append(breakfastRecipe.SportyBreakfast());
        sb.append(fruitDecorator.showFruit());
        sb.append("\n2) Pranzo:\n").append(mealRecipe.PricipleMeal(this));
        sb.append("\nTipo di cottura: ").append(typesOfCooking.TypesOfCookingFunction());
        sb.append(vegetableDecorator.showVegetable());
        sb.append(fruitDecorator.showFruit());
        sb.append("\n3) Cena:\n").append(mealRecipe.PricipleMeal(this));
        sb.append("\nTipo di cottura: ").append(typesOfCooking.TypesOfCookingFunction());
        sb.append(vegetableDecorator.showVegetable());
        return sb;
    }

}
