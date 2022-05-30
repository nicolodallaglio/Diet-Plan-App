package com.example.company;

public class SportyFood {
    // todo prodotti sportivi per chi fa sport

    public String chooseFoodPreWorkout(){
        int n = (int) (Math.random() * 4);
        if (n == 0){
            return("una banana");
        }else if(n == 1){
            return("barretta proteica");
        }else if(n == 2){
            return("due fette biscottate con marmellata");
        }else if(n == 3){
            return("mini toast con una fetta di pane e prosciutto cotto");
        }
        return null;
    }

    public String chooseFoodPostWorkout(){
        int n = (int) (Math.random() * 4);
        if (n == 0){
            return("2 pezzi di cioccolata e 6 mandorle");
        }else if(n == 1){
            return("Tazza di latte scremato con cereali e frutta");
        }else if(n == 2){
            return("Yogurt greco e frutta");
        }else if(n == 3){
            return("Tazza di fiocchi di avena con banana mandorle e proteine del latte in polvere");
        }
        return null;
    }

    public String proteinPreAndPost(){
        return("Proteine in polvere da miscelare con lo shaker");
    }
}
