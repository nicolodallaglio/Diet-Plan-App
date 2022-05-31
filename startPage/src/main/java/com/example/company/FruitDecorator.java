package com.example.company;

import com.example.model.Alimenti;
import com.example.model.Datasource;

import java.util.List;

public class FruitDecorator extends MealDecorator{
    public FruitDecorator(String nameDecorator) {
        super(nameDecorator);
    }

    public StringBuilder chooseFood(){
        Datasource datasource = new Datasource();
        if(!datasource.open()){
            System.out.println("Non riesco ad aprire datasource");
            return null;
        }

        List<Alimenti> frutta = datasource.queryFrutta();
        if(frutta == null){
            System.out.println("Nessun frutto");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int n = (int) (Math.random() * frutta.size());
        sb.append(frutta.get(n).getName());
        datasource.close();
        return sb;
    }

    public StringBuilder showFruit(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n Spuntino: ").append(chooseFood());
        return sb;
    }
}
