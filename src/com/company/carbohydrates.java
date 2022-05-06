package com.company;

public class carbohydrates extends BaseMeal{
    public carbohydrates(String nameFood) {
        super(nameFood);
    }

    public float calculatePortion(PersonPrototype personPrototype){
        float bmi = personPrototype.BmiCalculated();
        System.out.printf("carboidrati del giorno prototipo persona:%n");
        chooseFood();
        float portion = 0;
        if (bmi > 30.01){
            portion =  (float) (personPrototype.getWeight()*0.0008*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion);
        }else if ((bmi >= 25.01) && (bmi < 30)){
            portion =  (float) (personPrototype.getWeight()*0.0009*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion);
        }else if ((bmi >= 18.51) && (bmi < 25)){
            portion =  (float) (personPrototype.getWeight()*0.001*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion);

        }else if ((bmi >= 17.51) && (bmi < 18.50)){
            portion =  (float) (personPrototype.getWeight()*0.0014*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion);

        }else if ((bmi >= 16.01)&& (bmi < 17.50)) {
            portion =  (float) (personPrototype.getWeight()*0.0018*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion );
        }
        return portion;
    }
    public float calculatePortion(MenPerson menPerson){
        float bmi = menPerson.BmiCalculated();
        System.out.printf("carboidrati del giorno per un uomo :%n");
        chooseFood();
        float portion = 0;
            if (bmi > 30.01){
                portion =  (float) (menPerson.getWeight()*0.0008*1000/2);
                System.out.println("grammi da mangiare durante la giornata " + portion);
            }else if ((bmi >= 25.01) && (bmi < 30)){
                portion =  (float) (menPerson.getWeight()*0.0009*1000/2);
                System.out.println("grammi da mangiare durante la giornata " + portion);
            }else if ((bmi >= 18.51) && (bmi < 25)){
                portion =  (float) (menPerson.getWeight()*0.001*1000/2);
                System.out.println("grammi da mangiare durante la giornata " + portion);

            }else if ((bmi >= 17.51) &&(bmi < 18.50)){
                portion =  (float) (menPerson.getWeight()*0.0014*1000/2);
                System.out.println("grammi da mangiare durante la giornata " + portion);

            }else if ((bmi >= 16.01) && (bmi < 17.50)) {
                portion =  (float) (menPerson.getWeight()*0.0018*1000/2);
                System.out.println("grammi da mangiare durante la giornata " + portion );
            }
        return portion;
        }
    public float calculatePortion(SportyMen sportyMen){
        float bmi = sportyMen.BmiCalculated();
        System.out.printf("carboidrati del giorno per un uomo :%n");
        chooseFood();
        float portion = 0;
        if (bmi > 30.01){
            portion =  (float) (sportyMen.getWeight()*0.0008*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion);
        }else if ((bmi >= 25.01) && (bmi < 30)){
            portion =  (float) (sportyMen.getWeight()*0.0009*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion);
        }else if ((bmi >= 18.51) && (bmi < 25)){
            portion =  (float) (sportyMen.getWeight()*0.001*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion);

        }else if ((bmi >= 17.51) &&(bmi < 18.50)){
            portion =  (float) (sportyMen.getWeight()*0.0014*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion);

        }else if ((bmi >= 16.01) && (bmi < 17.50)) {
            portion =  (float) (sportyMen.getWeight()*0.0018*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion );
        }
        return portion;
    }

    public float calculatePortion(WomenPerson womenPerson){
        float bmi = womenPerson.BmiCalculated();
        System.out.printf("carboidrati del giorno per una donna:%n");
        chooseFood();
        float portion = 0;
        if (bmi > 30.01){
            portion =  (float) (womenPerson.getWeight()*0.0008*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion);
        }else if ((bmi >= 25.01) && (bmi < 30)){
            portion =  (float) (womenPerson.getWeight()*0.0009*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion);
        }else if ((bmi >= 18.51) &&(bmi < 25)){
            portion =  (float) (womenPerson.getWeight()*0.001*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion);

        }else if ((bmi >= 17.51) &&(bmi < 18.50)){
            portion =  (float) (womenPerson.getWeight()*0.0014*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion);

        }else if ((bmi >= 16.01)&& (bmi < 17.50)) {
            portion =  (float) (womenPerson.getWeight()*0.0018*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion );
        }
        return portion;
    }

    public float calculatePortion(SportyWomen sportyWomen){
        float bmi = sportyWomen.BmiCalculated();
        System.out.printf("carboidrati del giorno per una donna SPORTIVA:%n");
        chooseFood();
        float portion = 0;
        if (bmi > 30.01){
            portion =  (float) (sportyWomen.getWeight()*0.0008*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion);
        }else if ((bmi >= 25.01) && (bmi < 30)){
            portion =  (float) (sportyWomen.getWeight()*0.0009*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion);
        }else if ((bmi >= 18.51) && (bmi < 25)){
            portion =  (float) (sportyWomen.getWeight()*0.001*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion);

        }else if ((bmi >= 17.51) && (bmi < 18.50)){
            portion =  (float) (sportyWomen.getWeight()*0.0014*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion);

        }else if ((bmi >= 16.01) && (bmi < 17.50)) {
            portion =  (float) (sportyWomen.getWeight()*0.0018*1000/2);
            System.out.println("grammi da mangiare durante la giornata " + portion );
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
