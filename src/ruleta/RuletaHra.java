package ruleta;

import hrac.Hrac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuletaHra {
    Scanner sc = new Scanner(System.in);
    private Ruleta r;
    private Hrac h;

    public RuletaHra(Ruleta r, Hrac h){
        this.r = r;
        this.h = h;
    }

    public void menu(){
        System.out.println("Vyberte na co chcete vsadit :");
        System.out.println("1)vsadit na licha cisla");
        System.out.println("2)vsadit na suda cisla");
        System.out.println("3)vsadit na mala cisla  (0-18) ");
        System.out.println("4)vsadit na velka cisla (19-36)");
        System.out.println("5)vsadit na tucet (0-12)");
        System.out.println("6)vsadit na 2/3 (13-24)");
        System.out.println("7)vsadit na 3/3 (25-36)");
        System.out.println("8)vsadit na konkretni cislo");
        System.out.println("9)Informace o tobe");
        System.out.println("10)Pole vyhernich cisel");
    }

    public void hrat(){
        boolean stop = false;
        while (!stop){
            try {
                volba();
            }catch (InputMismatchException e){
                System.out.println("Zadejte platny udaj");
                sc.nextLine();
            }
        }
    }
    public void volba() {
        boolean stop = false;
        while (!stop) {
            try {
                    menu();
                    int volba = sc.nextInt();
                    if (volba == 1) {
                        r.licheCisla();
                        stop= hratDale();
                        volba();
                    }
                    if (volba == 2) {
                        r.sudeCisla();
                        stop= hratDale();
                        volba();
                    }
                    if (volba == 3) {
                        r.maleCisla();
                        stop= hratDale();
                        volba();
                    }
                    if (volba == 4) {
                        r.velkaCisla();
                        stop= hratDale();
                        volba();
                    }
                    if (volba == 5) {
                        r.tucet();
                        stop= hratDale();
                        volba();
                    }
                    if (volba == 6) {
                        r.druhe();
                        stop= hratDale();
                        volba();
                    }
                    if (volba == 7) {
                        r.treti();
                        stop= hratDale();
                        volba();
                    }
                    if (volba == 8) {
                        r.konkretniCislo();
                        stop= hratDale();
                        volba();
                    }
                    if (volba == 9) {
                        System.out.println(h.getInfo() + ",pocet vyher:" + r.getPocetVyherj()+",pocet vsazenych zetonu:"+h.getPocetVsazenychZetonu());
                        volba();
                    }
                    if (volba == 10) {
                        System.out.println("Vyherní čísla: " + r.getPocetVyherj());
                        volba();
                    } else {
                        System.exit(0);
                        stop = true;
                    }
        }catch(InputMismatchException e){
            System.out.println("Zadejte sparvny udaj");
            sc.nextLine();
        }
        }
    }
    public boolean hratDale(){
        System.out.println("Chcete hrat dale?");
        String volba= sc.next();
        if (volba.equalsIgnoreCase("ano")){
            return true;
        }
        else {
            return false;
        }
    }
}

