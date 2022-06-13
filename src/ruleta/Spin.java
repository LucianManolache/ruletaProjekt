package ruleta;

import java.util.Random;


public class Spin extends Thread{
    private int vyherniCislo;

    public void setVyherniCislo(int cislo){
        this.vyherniCislo = cislo;
    }


    /*method for generate number*/
    public void run(){
        Random random = new Random();
        int cislo = 0;
        int delkaSpinu = random.nextInt(12)+5;
        System.out.println("Ruleta se roztocila:");
        for (int i = 0 ; i < delkaSpinu; i++){
            int randomNum = random.nextInt(37);
            try{
                Thread.sleep(1000);
                System.out.println(randomNum);
                cislo = randomNum;
                setVyherniCislo(cislo);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Vyherni cislo je: "+cislo);

    }

    public int getVyherniCislo(){
        return vyherniCislo;
    }
}
