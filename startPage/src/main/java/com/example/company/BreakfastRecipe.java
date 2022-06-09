package com.example.company;


public class BreakfastRecipe implements IBreakfast {
    public String Breakfast(){
        int n = (int) (Math.random() * 8);
        if (n == 0){
            return("Pancakes di avena preparati con fiocchi d’avena, albumi e banana con aggiunta di frutta fresca");
        }else if(n == 1){
            return ("Due fette di pane integrale o pane di segale con un filo di miele o burro di arachidi, con frutta fresca e frutta secca");
        }else if(n == 2){
            return("Yogurt greco con granola vegan senza zucchero e fragole fresche");
        }else if(n == 3){
            return("Banana bread con noci");
        }else if(n == 4){
            return("Frullato di frutta fresca con cereali e super foods (come spirulina, bacche di goji, semi di canapa..,)");
        }else if(n == 5){
            return("Omelette preparata con 1 uovo intero e 1 albume, spinaci e due fette di pane ai 5 cereali + un frutto a piacere");
        }else if(n == 6){
            return("Toast integrale o ai 5 cereali con prosciutto crudo DOP + un frutto a piacere + una manciata di frutta secca");
        }else if(n == 7){
            return("Cappuccino e brioche");
        }
        return null;
    }

    public String SportyBreakfast(){
        int n = (int) (Math.random() * 7);
        if (n == 0){
            return("Pancakes di avena preparati con fiocchi d’avena, albumi e banana con aggiunta di frutta fresca + proteine");
        }else if(n == 1){
            return("Due fette di pane integrale o pane di segale con un filo di miele o burro di arachidi, con frutta fresca e frutta secca");
        }else if(n == 2){
            return("Yogurt greco con granola vegan senza zucchero e fragole fresche");
        }else if(n == 3){
            return("Due fette di pane ai 5 cereali con salmone affumicato + un frutto a piacere");
        }else if(n == 4){
            return("Porridge di avena e quinoa al cocco con mirtilli");
        }else if(n == 5){
            return("Omelette preparata con 1 uovo intero e 1 albume, spinaci e due fette di pane ai 5 cereali + proteine");
        }else if(n == 6){
            return("Toast integrale o ai 5 cereali con prosciutto crudo DOP + un frutto a piacere + una manciata di frutta secca + proteine");
        }
        return null;
    }

}
