package com.example.company;

public class SportyFood {
    // todo prodotti sportivi per chi fa sport

    public void chooseFoodPreWorkout(){
        System.out.println("\npre workout");
        int n = (int) (Math.random() * 4);
        if (n == 0){
            System.out.println("una banana");
        }else if(n == 1){
            System.out.println("barretta proteica");
        }else if(n == 2){
            System.out.println("due fette biscottate con marmellata");
        }else if(n == 3){
            System.out.println("mini toast con una fetta di pane e prosciutto cotto");
        }
    }

    public void chooseFoodPostWorkout(){
        System.out.println("post workout");
        int n = (int) (Math.random() * 4);
        if (n == 0){
            System.out.println("2 pezzi di cioccolata e 6 mandorle");
        }else if(n == 1){
            System.out.println("Tazza di latte scremato con cereali e frutta");
        }else if(n == 2){
            System.out.println("Yogurt greco e frutta");
        }else if(n == 3){
            System.out.println("Tazza di fiocchi di avena con banana mandorle e proteine del latte in polvere");
        }
    }

    public void proteinPreAndPost(){
        System.out.println("proteine in polvere da miscelare con lo shaker");
    }
}
