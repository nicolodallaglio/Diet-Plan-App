package com.company;

public class FruitDecorator extends MealDecorator{
    public FruitDecorator(String nameDecorator) {
        super(nameDecorator);
    }
    public void chooseFood(){
        int n = (int) (Math.random() * 3);
        if (n == 0){
            System.out.println("avocado");
        }else if(n == 1){
            System.out.println("mela");
        }else if(n == 2){
            System.out.println("pera");
        }
    }
    public void showFruit(){
        System.out.println("\nspuntino ");
        chooseFood();
    }
}
