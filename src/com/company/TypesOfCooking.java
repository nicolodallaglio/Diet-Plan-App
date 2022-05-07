package com.company;

public class TypesOfCooking {
    public void TypesOfCookingFunction(){
        int n = (int) (Math.random() * 3);
        System.out.println("Tipi di cottura ");
        if (n == 0){
            System.out.println("al vapore");
        }else if(n == 1){
            System.out.println("Bollitura.");
        }else if(n == 2){
            System.out.println("Cottura in padella");
        }else if(n == 3){
            System.out.println("Cottura a bagnomaria");
        }else if(n == 4){
            System.out.println("Cottura al forno");
        }
    }
}
