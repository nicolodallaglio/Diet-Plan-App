package com.company;

import Model.Alimenti;
import Model.Datasource;

import java.util.List;

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
        Datasource datasource = new Datasource();
        if(!datasource.open()){
            System.out.println("Non riesco ad aprire datasource");
            return;
        }

        List<Alimenti> grassi = datasource.queryGrassi();
        if(grassi == null){
            System.out.println("Nessun grasso");
            return;
        }

        int n = (int) (Math.random() * 8);
        int i = 0;
        for(Alimenti alimento : grassi) {
            i++;
            if (i == n) {
                System.out.println(alimento.getName());
            }
        }

        datasource.close();
    }
}
