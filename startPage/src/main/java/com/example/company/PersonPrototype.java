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

    public void showData(){
        System.out.println("nome " + this.name);
        System.out.println("età " + this.age);
        System.out.println("peso " + this.weight + " e altezza " + this.height);
        System.out.println("il bmi è " + BmiCalculated());
    }

    public float BmiCalculated(){
        float bmi;
        bmi = weight / ( height * height);
        return bmi;

    }




    public void bodyFatSituation(int bmi){
        if (bmi > 30.01){
            System.out.println("obesità di prima classe");
        }else if ((bmi >= 25.01) && (bmi < 30)){
            System.out.println("sovrappeso");
        }else if ((bmi >= 18.51) && (bmi < 25)){
            System.out.println("regolare");
        }else if ((bmi >= 17.51) && (bmi < 18.50)){
            System.out.println("leggermente sottopeso");
        }else if ((bmi >= 16.01) && (bmi < 17.50)) {
            System.out.println("sottopeso");
        }else{
            System.out.println("non ci sono dati che vanno bene");
        }
    }

   public void showShortMenu(Fat fat, carbohydrates carbohydrates, Protein protein) {
       FruitDecorator fruitDecorator = new FruitDecorator(null);
       MealRecipe mealRecipe = new MealRecipe(protein, carbohydrates, fat);
       VegetableDecorator vegetableDecorator = new VegetableDecorator(null);
       for (int i = 0; i < 7; i++) {
           System.out.println("\ngiorno " + (i + 1) + " della dieta");
           fruitDecorator.showFruit();
           mealRecipe.PricipleMeal(this);
           vegetableDecorator.showVegetable();
           fruitDecorator.showFruit();
           mealRecipe.PricipleMeal(this);
           vegetableDecorator.showVegetable();
       }
   }
}

