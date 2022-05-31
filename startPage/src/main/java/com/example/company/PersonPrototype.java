package com.example.company;
// todo fare l'interfaccia di persone
public class PersonPrototype {
    private String name;
    private int weight;
    private float height;
    private int age;
    private boolean vegan;
    private boolean vegeterian;
    // todo private List<> allergie ;


    public PersonPrototype(String name, int weight, float height, int age) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StringBuilder showData(){
        StringBuilder sb = new StringBuilder();
        return sb.append("nome ").append(this.name).append("età ").append(this.age).append("peso ").append(this.weight).append(" e altezza ").append(this.height).append("il bmi è ").append(BmiCalculated());
    }
    public float BmiCalculated(){
        float bmi;
        bmi = weight / ( height * height);
        return bmi;
    }
    public String bodyFatSituation(int bmi){
        if (bmi > 30.01){
            return ("obesità di prima classe.");
        }else if ((bmi >= 25.01) && (bmi < 30)){
            return("sovrappeso.");
        }else if ((bmi >= 18.51) && (bmi < 25)){
            return("regolare.");
        }else if ((bmi >= 17.51) && (bmi < 18.50)){
            return("leggermente sottopeso.");
        }else if ((bmi >= 16.01) && (bmi < 17.50)) {
            return("sottopeso.");
        }else{
            return("Bodyfat non calcolabile");
        }
    }

   public StringBuilder showShortMenu(Fat fat, carbohydrates carbohydrates, Protein protein) {
        StringBuilder sb = new StringBuilder();
       FruitDecorator fruitDecorator = new FruitDecorator(null);
       MealRecipe mealRecipe = new MealRecipe(protein, carbohydrates, fat);
       VegetableDecorator vegetableDecorator = new VegetableDecorator(null);
           sb.append(fruitDecorator.showFruit());
           sb.append(mealRecipe.PricipleMeal(this));
           sb.append(vegetableDecorator.showVegetable());
           sb.append(fruitDecorator.showFruit());
           sb.append(mealRecipe.PricipleMeal(this));
           sb.append(vegetableDecorator.showVegetable());

       return sb;
   }
}

