package com.example.company;

import com.example.model.Alimenti;
import com.example.model.Datasource;

import java.util.List;

public class Fat extends BaseMeal{
    public Fat(String nameFood) {
        super(nameFood);
    }

    public StringBuilder calculatePortion(PersonPrototype personPrototype){
        StringBuilder sb= new StringBuilder();
        sb.append("grassi del giorno prototipo:").append(chooseFood());
        float portion = (float) (personPrototype.getWeight()*0.00005*1000);
        sb.append(" ,grammi da mangiare ").append(Math.ceil(portion/2));
        return sb;
    }

    public StringBuilder calculatePortion(WomenPerson personPrototype){
        StringBuilder sb= new StringBuilder();
        sb.append("-fonte di grassi: ").append(chooseFood());
        float portion = (float) (personPrototype.getWeight()*0.00005*1000);
        sb.append(" ,grammi da mangiare ").append(Math.ceil(portion/2));
        return sb;
    }
    public StringBuilder calculatePortion(SportyWomen personPrototype){
        StringBuilder sb= new StringBuilder();
        sb.append("-fonte di grassi: ").append(chooseFood());
        float portion = (float) (personPrototype.getWeight()*0.00005*1000);
        sb.append(" ,grammi da mangiare ").append(Math.ceil(portion/2));
        return sb;
    }

    public StringBuilder calculatePortion(MenPerson personPrototype){
        StringBuilder sb= new StringBuilder();
        sb.append("-fonte di grassi: ").append(chooseFood());
        float portion = (float) (personPrototype.getWeight()*0.00005*1000);
        sb.append(" ,grammi da mangiare ").append(Math.ceil(portion/2));
        return sb;
    }

    public StringBuilder calculatePortion(SportyMen personPrototype){
        StringBuilder sb= new StringBuilder();
        sb.append("-fonte di grassi: ").append(chooseFood());
        float portion = (float) (personPrototype.getWeight()*0.00005*1000);
        sb.append(" ,grammi da mangiare ").append(Math.ceil(portion/2));
        return sb;
    }

    public StringBuilder chooseFood(){
        Datasource datasource = new Datasource();
        if(!datasource.open()){
            System.out.println("Non riesco ad aprire datasource");
            return null;
        }

        List<Alimenti> grassi = datasource.queryGrassi();
        if(grassi == null){
            System.out.println("Nessun grasso");
            return null;
        }

        StringBuilder sb = new StringBuilder();
        int n = (int) (Math.random() * grassi.size());
        sb.append(grassi.get(n).getName());
        datasource.close();
        return sb;
    }

    public StringBuilder chooseFood(SportyMen sportyMen){
        Datasource datasource = new Datasource();
        if(!datasource.open()){
            System.out.println("Non riesco ad aprire datasource");
            return null;
        }

        List<Alimenti> grassi = datasource.queryGrassi();
        if(grassi == null){
            System.out.println("Nessun grasso");
            return null;
        }

        StringBuilder sb=new StringBuilder();

        int n = (int) (Math.random() * 8);
        int i = 1;
        for(Alimenti alimento : grassi) {
            i++;
            if (i == n) {
                if (alimento.getName().equalsIgnoreCase("burro")){
                    sb.append("olio di oliva");
                }else{
                    sb.append(alimento.getName());
                }
            }
        }
        datasource.close();
        return sb;
    }

    public StringBuilder chooseFood(WomenPerson womenPerson){
        Datasource datasource = new Datasource();
        if(!datasource.open()){
            System.out.println("Non riesco ad aprire datasource");
            return null;
        }

        List<Alimenti> grassi = datasource.queryGrassi();
        if(grassi == null){
            System.out.println("Nessun grasso");
            return null;
        }

        StringBuilder sb= new StringBuilder();
        int n = (int) (Math.random() * grassi.size()-1);
        sb.append(grassi.get(n).getName()).append( " oppure ").append(grassi.get(n+1).getName());

        datasource.close();
        return sb;
    }
}
