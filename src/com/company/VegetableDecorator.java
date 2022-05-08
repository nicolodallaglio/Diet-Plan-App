package com.company;

import Model.Alimenti;
import Model.Datasource;

import java.util.List;

public class VegetableDecorator extends MealDecorator{
    public VegetableDecorator(String nameDecorator) {
        super(nameDecorator);
    }

    public void chooseFood(){
        Datasource datasource = new Datasource();
        if(!datasource.open()){
            System.out.println("Non riesco ad aprire datasource");
            return;
        }

        List<Alimenti> verdure = datasource.queryFrutta();
        if(verdure == null){
            System.out.println("Nessuna verdura");
            return;
        }

        int n = (int) (Math.random() * 5);
        int i = 0;
        for(Alimenti alimento : verdure) {
            i++;
            if (i == n) {
                System.out.println(alimento.getName());
            }
        }

        datasource.close();
    }

    public void showVegetable(){
        System.out.println("verdura:");
        chooseFood();
    }
}
