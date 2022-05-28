package com.example.company;

import com.example.model.Alimenti;
import com.example.model.Datasource;

import java.util.List;

public class FruitDecorator extends MealDecorator{
    public FruitDecorator(String nameDecorator) {
        super(nameDecorator);
    }

    public void chooseFood(){
        Datasource datasource = new Datasource();
        if(!datasource.open()){
            System.out.println("Non riesco ad aprire datasource");
            return;
        }

        List<Alimenti> frutta = datasource.queryFrutta();
        if(frutta == null){
            System.out.println("Nessun frutto");
            return;
        }

        int n = (int) (Math.random() * 5);
        int i = 0;
        for(Alimenti alimento : frutta) {
            i++;
            if (i == n) {
                System.out.println(alimento.getName());
            }
        }

        datasource.close();
    }
    public void showFruit(){
        System.out.println("\nspuntino ");
        chooseFood();
    }
}
