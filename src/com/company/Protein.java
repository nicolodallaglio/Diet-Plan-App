package com.company;

public class Protein extends BaseMeal{

    public Protein(String nameFood) {
        super(nameFood);
    }

    public float calculatePortion(Person person,int bmi){
        System.out.println("proteine del giorno :");
        chooseFood();
        float portion = 0;
        if (bmi > 30.01){
            portion =  (float) ((person.getWeight()*0.0008*1000)/2.2);
            System.out.println("grammi da mangiare durante la giornata " + portion);
        }else if ((bmi >= 25.01) || (bmi < 30)){
            portion =  (float) ((person.getWeight()*0.0009*1000)/2.2);
            System.out.println("grammi da mangiare durante la giornata " + portion);
        }else if ((bmi >= 18.51) || (bmi < 25)){
            portion =  (float) ((person.getWeight()*0.0012*1000)/2.2);
            System.out.println("grammi da mangiare durante la giornata " + portion);

        }else if ((bmi >= 17.51) || (bmi < 18.50)){
            portion =  (float) ((person.getWeight()*0.0015*1000)/2.2);
            System.out.println("grammi da mangiare durante la giornata " + portion);

        }else if ((bmi >= 16.01) || (bmi < 17.50)) {
            portion =  (float) ((person.getWeight()*0.002*1000)/2.2);
            System.out.println("grammi da mangiare durante la giornata " + portion );
        }
        return portion;
    }

    public void chooseFood(){
        int n = (int) (Math.random() * 2);
        if (n == 0){
            System.out.println("carne");
        }else{
            System.out.println("pesce");
        }
    }
}
