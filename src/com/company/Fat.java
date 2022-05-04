package com.company;

public class Fat extends BaseMeal{
    public Fat(String nameFood) {
        super(nameFood);
    }
    public float calculatePortion(Person person){
        System.out.println("grassi del giorno :");
        chooseFood();
        float portion = (float) (person.getWeight()*0.00005*1000);
        System.out.println("grammi da mangiare durante la giornata " + portion);
        return portion;
    }
    public void chooseFood(){
        int n = (int) (Math.random() * 2);
        if (n == 0){
            System.out.println("olio");
        }else{
            System.out.println("salsa di soia");
        }
    }
}
