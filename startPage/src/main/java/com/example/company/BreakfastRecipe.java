package com.example.company;


public class BreakfastRecipe implements IBreakfast {
    public void Breakfast(){
        System.out.println("colazione");
        int n = (int) (Math.random() * 8);
        if (n == 0){
            System.out.println("Pancakes di avena preparati con fiocchi d’avena, albumi e banana con aggiunta di frutta fresca");
        }else if(n == 1){
            System.out.println("Due fette di pane integrale o pane di segale con un filo di miele o burro di arachidi, con frutta fresca e frutta secca");
        }else if(n == 2){
            System.out.println("Yogurt greco con granola vegan senza zucchero e fragole fresche");
        }else if(n == 3){
            System.out.println("Banana bread con noci");
        }else if(n == 4){
            System.out.println("Frullato di frutta fresca con cereali e super foods (come spirulina, bacche di goji, semi di canapa..,)");
        }else if(n == 5){
            System.out.println("Omelette preparata con 1 uovo intero e 1 albume, spinaci e due fette di pane ai 5 cereali + un frutto a piacere");
        }else if(n == 6){
            System.out.println("Toast integrale o ai 5 cereali con prosciutto crudo DOP + un frutto a piacere + una manciata di frutta secca");
        }else if(n == 7){
            System.out.println("cappucino e brioche");
        }
    }

    public void SportyBreakfast(){
        System.out.println("colazione per sportivi");
        int n = (int) (Math.random() * 7);
        if (n == 0){
            System.out.println("Pancakes di avena preparati con fiocchi d’avena, albumi e banana con aggiunta di frutta fresca + proteine");
        }else if(n == 1){
            System.out.println("Due fette di pane integrale o pane di segale con un filo di miele o burro di arachidi, con frutta fresca e frutta secca");
        }else if(n == 2){
            System.out.println("Yogurt greco con granola vegan senza zucchero e fragole fresche");
        }else if(n == 3){
            System.out.println("Due fette di pane ai 5 cereali con salmone affumicato + un frutto a piacere");
        }else if(n == 4){
            System.out.println("Porridge di avena e quinoa al cocco con mirtilli");
        }else if(n == 5){
            System.out.println("Omelette preparata con 1 uovo intero e 1 albume, spinaci e due fette di pane ai 5 cereali + proteine");
        }else if(n == 6){
            System.out.println("Toast integrale o ai 5 cereali con prosciutto crudo DOP + un frutto a piacere + una manciata di frutta secca + proteine");
        }
    }

}
