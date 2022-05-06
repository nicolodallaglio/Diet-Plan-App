package com.company;

public class Fat extends BaseMeal{
    public Fat(String nameFood) {
        super(nameFood);
    }

    public float calculatePortion(PersonPrototype personPrototype){
        System.out.println("grassi del giorno prototipo:");
        chooseFood();
        float portion = (float) (personPrototype.getWeight()*0.00005*1000);
        System.out.println("grammi da mangiare durante la giornata " + portion);
        return portion;
    }

    public float calculatePortion(WomenPerson personPrototype){
        System.out.println("grassi del giorno per una donna :");
        chooseFood();
        float portion = (float) (personPrototype.getWeight()*0.00005*1000);
        System.out.println("grammi da mangiare durante la giornata " + portion);
        return portion;
    }
    public float calculatePortion(SportyWomen personPrototype){
        System.out.println("grassi del giorno per una donna sportiva:");
        chooseFood();
        float portion = (float) (personPrototype.getWeight()*0.00005*1000);
        System.out.println("grammi da mangiare durante la giornata " + portion);
        return portion;
    }

    public float calculatePortion(MenPerson personPrototype){
        System.out.println("grassi del giorno per un uomo:");
        chooseFood();
        float portion = (float) (personPrototype.getWeight()*0.00005*1000);
        System.out.println("grammi da mangiare durante la giornata " + portion);
        return portion;
    }

    public float calculatePortion(SportyMen personPrototype){
        System.out.println("grassi del giorno per un uomo sportivo:");
        chooseFood();
        float portion = (float) (personPrototype.getWeight()*0.00005*1000);
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
