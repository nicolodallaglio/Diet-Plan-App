package com.company;

public class carbohydrates extends BaseMeal{
    public carbohydrates(String nameFood) {
        super(nameFood);
    }

    public float calculatePortion(Person person, int bmi){
        System.out.printf("carboidrati del giorno :%n");
        chooseFood();
        float portion = 0;
        if (person.isMale()) {
            if (person.isSporty()) {
                if (bmi > 30.01) {
                    portion = (float) (person.getWeight() * 0.00088 * 1000 / 2);
                    System.out.println("grammi da mangiare durante la giornata " + portion);
                } else if ((bmi >= 25.01) || (bmi < 30)) {
                    portion = (float) (person.getWeight() * 0.00099 * 1000 / 2);
                    System.out.println("grammi da mangiare durante la giornata " + portion);
                } else if ((bmi >= 18.51) || (bmi < 25)) {
                    portion = (float) (person.getWeight() * 0.0011 * 1000 / 2);
                    System.out.println("grammi da mangiare durante la giornata " + portion);

                } else if ((bmi >= 17.51) || (bmi < 18.50)) {
                    portion = (float) (person.getWeight() * 0.0015 * 1000 / 2);
                    System.out.println("grammi da mangiare durante la giornata " + portion);

                } else if ((bmi >= 16.01) || (bmi < 17.50)) {
                    portion = (float) (person.getWeight() * 0.0019 * 1000 / 2);
                    System.out.println("grammi da mangiare durante la giornata " + portion);
                }
            }
            else {if (bmi > 30.01){
                portion =  (float) (person.getWeight()*0.0008*1000/2);
                System.out.println("grammi da mangiare durante la giornata " + portion);
            }else if ((bmi >= 25.01) || (bmi < 30)){
                portion =  (float) (person.getWeight()*0.0009*1000/2);
                System.out.println("grammi da mangiare durante la giornata " + portion);
            }else if ((bmi >= 18.51) || (bmi < 25)){
                portion =  (float) (person.getWeight()*0.001*1000/2);
                System.out.println("grammi da mangiare durante la giornata " + portion);

            }else if ((bmi >= 17.51) || (bmi < 18.50)){
                portion =  (float) (person.getWeight()*0.0014*1000/2);
                System.out.println("grammi da mangiare durante la giornata " + portion);

            }else if ((bmi >= 16.01) || (bmi < 17.50)) {
                portion =  (float) (person.getWeight()*0.0018*1000/2);
                System.out.println("grammi da mangiare durante la giornata " + portion );
            }}
        }
            else{
                if(person.isSporty()){
                    if (bmi > 30.01){
                        portion =  (float) (person.getWeight()*0.0008*1000/2);
                        System.out.println("grammi da mangiare durante la giornata " + portion);
                    }else if ((bmi >= 25.01) || (bmi < 30)){
                        portion =  (float) (person.getWeight()*0.0009*1000/2);
                        System.out.println("grammi da mangiare durante la giornata " + portion);
                    }else if ((bmi >= 18.51) || (bmi < 25)){
                        portion =  (float) (person.getWeight()*0.0097*1000/2);
                        System.out.println("grammi da mangiare durante la giornata " + portion);

                    }else if ((bmi >= 17.51) || (bmi < 18.50)){
                        portion =  (float) (person.getWeight()*0.0016*1000/2);
                        System.out.println("grammi da mangiare durante la giornata " + portion);

                    }else if ((bmi >= 16.01) || (bmi < 17.50)) {
                        portion =  (float) (person.getWeight()*0.0018*1000/2);
                        System.out.println("grammi da mangiare durante la giornata " + portion );
                    }
                }else{

                    if (bmi > 30.01){
                        portion =  (float) (person.getWeight()*0.0007*1000/2);
                        System.out.println("grammi da mangiare durante la giornata " + portion);
                    }else if ((bmi >= 25.01) || (bmi < 30)){
                        portion =  (float) (person.getWeight()*0.0008*1000/2);
                        System.out.println("grammi da mangiare durante la giornata " + portion);
                    }else if ((bmi >= 18.51) || (bmi < 25)){
                        portion =  (float) (person.getWeight()*0.009*1000/2);
                        System.out.println("grammi da mangiare durante la giornata " + portion);

                    }else if ((bmi >= 17.51) || (bmi < 18.50)){
                        portion =  (float) (person.getWeight()*0.0013*1000/2);
                        System.out.println("grammi da mangiare durante la giornata " + portion);

                    }else if ((bmi >= 16.01) || (bmi < 17.50)) {
                        portion =  (float) (person.getWeight()*0.0017*1000/2);
                        System.out.println("grammi da mangiare durante la giornata " + portion );
                    }
                }
            }
        return portion;
        }

    public void chooseFood(){
        int n = (int) (Math.random() * 3);
        if (n == 0){
            System.out.println("pasta");
        }else if(n == 1){
            System.out.println("riso");
        }else if(n == 2){
            System.out.println("farro");
        }
    }
}
