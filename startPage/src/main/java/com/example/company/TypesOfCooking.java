package com.example.company;

public class TypesOfCooking {
    public String TypesOfCookingFunction(){
        int n = (int) (Math.random() * 3);
        if (n == 0){
            return("al vapore");
        }else if(n == 1){
            return("Bollitura.");
        }else if(n == 2){
            return("Cottura in padella");
        }else if(n == 3){
            return("Cottura a bagnomaria");
        }else if(n == 4){
            return("Cottura al forno");
        }
        return null;
    }
}
