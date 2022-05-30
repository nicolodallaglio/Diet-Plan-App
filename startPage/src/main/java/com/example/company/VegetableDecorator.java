package com.example.company;

import com.example.model.Alimenti;
import com.example.model.Datasource;

import java.util.List;

public class VegetableDecorator extends MealDecorator{
    public VegetableDecorator(String nameDecorator) {
        super(nameDecorator);
    }

    public StringBuilder chooseFood(){
        Datasource datasource = new Datasource();
        if(!datasource.open()){
            System.out.println("Non riesco ad aprire datasource");
            return null;
        }

        List<Alimenti> verdure = datasource.queryVerdure();
        if(verdure == null){
            System.out.println("Nessuna verdura");
            return null;
        }

        StringBuilder sb = new StringBuilder();

        int n = (int) (Math.random() * 5);
        int i = 0;
        for(Alimenti alimento : verdure) {
            i++;
            if (i == n) {
                sb.append(alimento.getName());
            }
        }
        datasource.close();
        return sb;
    }

    public StringBuilder showVegetable(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nVerdura: ").append(chooseFood());
        return sb;
    }
}
