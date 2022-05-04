package com.company;

public class VegetableDecorator extends MealDecorator{
    public VegetableDecorator(String nameDecorator) {
        super(nameDecorator);
    }
    public void chooseFood(){
        int n = (int) (Math.random() * 3);
        if (n == 0){
            System.out.println("insalata");
        }else if(n == 1){
            System.out.println("pomodori");
        }else if(n == 2){
            System.out.println("asparagi");
        }
    }
    public void showVegetable(){
        System.out.println("verdura");
        chooseFood();
    }
}
