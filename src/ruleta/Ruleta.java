package ruleta;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import hrac.Hrac;

public class Ruleta {
    Scanner sc = new Scanner(System.in);
    private Spin spin;
    private Hrac hrac;
    private int pocetVyher;

    public int getPocetVyherj(){
        return pocetVyher;
    }
    /* konstruktor */
    public Ruleta(Hrac hrac, Spin spin){
        this.spin = spin;
        this.hrac = hrac;
    }
    /* odd numbers method */
    public void licheCisla() {
        boolean stop = false;
        while (!stop) {
            try {
                System.out.println("Kolik chcete vsadit?");
                int vsazeneZetony = sc.nextInt();
                if (vsazeneZetony <= hrac.getZetony() || vsazeneZetony > 0) {
                    hrac.setPocetVsazenychZetonu(vsazeneZetony);
                    hrac.vsazeneZetony(vsazeneZetony);
                    spin.run();/* spin methon thread */
                    if (spin.getVyherniCislo() % 2 != 0) {
                        vsazeneZetony = vsazeneZetony * 2;
                        hrac.vyhraneZetony(vsazeneZetony);
                        System.out.println("Gratulace vyhral jste: " + vsazeneZetony);
                        pocetVyher++;
                        System.out.println(hrac.getInfo());
                        stop=true;
                    } else {
                        System.out.println("Prohral jste, vyherni cislo je: " + spin.getVyherniCislo());
                        System.out.println(hrac.getInfo());
                        stop=true;
                    }
                } else {
                    System.out.println("Nedostatek zetonu");
                }/* Exceptions */
            } catch (InputMismatchException e) {
                System.out.println("zadejte platny udaj");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        }
    }

    /* even method number */
    public void sudeCisla() {
        boolean stop = false;
        while (!stop) {
            try {
                System.out.println("Kolik chcete vsadit?");
                int vsazeneZetony = sc.nextInt();
                if (vsazeneZetony <= hrac.getZetony() || vsazeneZetony <= 0) {
                    hrac.setPocetVsazenychZetonu(vsazeneZetony);
                    hrac.vsazeneZetony(vsazeneZetony);
                    spin.run();
                    if (spin.getVyherniCislo() % 2 == 0) {
                        vsazeneZetony = vsazeneZetony * 2;
                        hrac.vyhraneZetony(vsazeneZetony);
                        System.out.println("Gratulace vyhral jste: " + vsazeneZetony);
                        pocetVyher++;
                        System.out.println(hrac.getInfo());
                        stop=true;
                    } else {
                        System.out.println("Prohral jste, vyherni cislo je: " + spin.getVyherniCislo());
                        System.out.println(hrac.getInfo());
                        stop=true;
                    }
                    stop = true;
                } else {
                    System.out.println("Nedostatek zetonu");
                }
                /* Exceptions */
            } catch (InputMismatchException e) {
                System.out.println("zadejte platny udaj");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        }
    }
    /* method for small numbers */
    public void maleCisla() {
        boolean stop = false;
        while (!stop) {
        try {
                System.out.println("Kolik chcete vsadit?");
                int vsazeneZetony = sc.nextInt();
                if (vsazeneZetony <= hrac.getZetony() || vsazeneZetony <= 0) {
                    hrac.setPocetVsazenychZetonu(vsazeneZetony);
                    hrac.vsazeneZetony(vsazeneZetony);
                    spin.run();
                    if (spin.getVyherniCislo() >= 1 && spin.getVyherniCislo() <= 18) {
                        vsazeneZetony = vsazeneZetony * 2;
                        hrac.vyhraneZetony(vsazeneZetony);
                        System.out.println("Gratulace vyhral jste: " + vsazeneZetony);
                        pocetVyher++;
                        System.out.println(hrac.getInfo());
                        stop=true;
                    } else {
                        System.out.println("Prohral jste, vyherni cislo je: " + spin.getVyherniCislo());
                        System.out.println(hrac.getInfo());
                        stop=true;
                    }
                    stop = true;
                } else {
                    System.out.println("Nedostatek zetonu");
                }/* Exceptions */
        } catch (InputMismatchException e) {
            System.out.println("zadejte platny udaj");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
    }
    /* method for high numbers */
    public void velkaCisla() {
        boolean stop = false;
        while (!stop) {
            try {
                System.out.println("Kolik chcete vsadit?");
                int vsazeneZetony = sc.nextInt();
                if (vsazeneZetony <= hrac.getZetony() || vsazeneZetony <= 0) {
                    hrac.setPocetVsazenychZetonu(vsazeneZetony);
                    hrac.vsazeneZetony(vsazeneZetony);
                    spin.run();
                    if (spin.getVyherniCislo() >= 19 && spin.getVyherniCislo() <= 36) {

                        vsazeneZetony = vsazeneZetony * 2;
                        hrac.vyhraneZetony(vsazeneZetony);
                        System.out.println("Gratulace vyhral jste: " + vsazeneZetony);
                        pocetVyher++;
                        System.out.println(hrac.getInfo());
                        stop=true;
                    } else {
                        System.out.println("Prohral jste, vyherni cislo je: " + spin.getVyherniCislo());
                        System.out.println(hrac.getInfo());
                        stop=true;
                    }
                    stop = true;
                } else {
                    System.out.println("Nedostatek zetonu");

                }/* Exceptions */
            } catch (InputMismatchException e) {
                System.out.println("zadejte platny udaj");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        }
    }
    /* method for numbers from 1 to 12 */
    public void tucet() {
        boolean stop = false;
        while (!stop) {
        try {
                System.out.println("Kolik chcete vsadit?");
                int vsazeneZetony = sc.nextInt();
                if (vsazeneZetony <= hrac.getZetony() || vsazeneZetony <= 0) {
                    hrac.setPocetVsazenychZetonu(vsazeneZetony);
                    hrac.vsazeneZetony(vsazeneZetony);
                    spin.run();
                    if (spin.getVyherniCislo() >= 1 && spin.getVyherniCislo() <= 12) {
                        vsazeneZetony = vsazeneZetony * 4;
                        hrac.vyhraneZetony(vsazeneZetony);
                        System.out.println("Gratulace vyhral jste: " + vsazeneZetony);
                        pocetVyher++;
                        System.out.println(hrac.getInfo());
                        stop=true;

                    } else {
                        System.out.println("Prohral jste, vyherni cislo je: " + spin.getVyherniCislo());
                        System.out.println(hrac.getInfo());
                        stop=true;
                    }
                    stop = true;
                } else {
                    System.out.println("Nedostatek zetonu");
                }/* Exceptions */
        } catch (InputMismatchException e) {
            System.out.println("zadejte platny udaj");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
    }
    /* method for numbers from 13 - 24 */
    public void druhe() {
        boolean stop = false;
        while (!stop) {
        try {

                System.out.println("Kolik chcete vsadit?");
                int vsazeneZetony = sc.nextInt();
                if (vsazeneZetony <= hrac.getZetony() || vsazeneZetony <= 0) {
                    hrac.setPocetVsazenychZetonu(vsazeneZetony);
                    hrac.vsazeneZetony(vsazeneZetony);
                    spin.run();
                    if (spin.getVyherniCislo() >= 13 && spin.getVyherniCislo() <= 24) {
                        vsazeneZetony = vsazeneZetony * 4;
                        hrac.vyhraneZetony(vsazeneZetony);
                        System.out.println("Gratulace vyhral jste: " + vsazeneZetony);
                        pocetVyher++;
                        System.out.println(hrac.getInfo());
                        stop=true;

                    } else {
                        System.out.println("Prohral jste, vyherni cislo je: " + spin.getVyherniCislo());
                        System.out.println(hrac.getInfo());
                        stop=true;
                    }
                    stop = true;
                } else {
                    System.out.println("Nedostatek zetonu");
                }/* Exceptions */
        } catch (InputMismatchException e) {
            System.out.println("zadejte platny udaj");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
    }
    /* method for numbers from 25 to 36 */
    public void treti() {
        boolean stop = false;
        while (!stop) {
            try {
                System.out.println("Kolik chcete vsadit?");
                int vsazeneZetony = sc.nextInt();
                if (vsazeneZetony <= hrac.getZetony() || vsazeneZetony <= 0) {
                    hrac.setPocetVsazenychZetonu(vsazeneZetony);
                    hrac.vsazeneZetony(vsazeneZetony);
                    spin.run();
                    if (spin.getVyherniCislo() >= 25 && spin.getVyherniCislo() <= 36) {
                        vsazeneZetony = vsazeneZetony * 4;
                        hrac.vyhraneZetony(vsazeneZetony);
                        System.out.println("Gratulace vyhral jste: " + vsazeneZetony);
                        pocetVyher++;
                        System.out.println(hrac.getInfo());
                        stop=true;
                    } else {
                        System.out.println("Prohral jste, vyherni cislo je: " + spin.getVyherniCislo());
                        System.out.println(hrac.getInfo());
                        stop=true;
                    }
                    stop = true;
                } else {
                    System.out.println("Nedostatek zetonu");
                }/* Exceptions */
            } catch (InputMismatchException e) {
                System.out.println("zadejte platny udaj");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("ERROR");
            }

        }
    }
    /* method for one special number */
    public void konkretniCislo() {
        boolean stop = false;
        while (!stop) {
            try {
                System.out.println("Na jake cislo chcete vsadit?");
                int specialNum = sc.nextInt();
                checkSpecialNumberIsCorrect(specialNum);
                System.out.println("Kolik chcete vsadit?");
                int vsazeneZetony = sc.nextInt();
                if (vsazeneZetony <= hrac.getZetony() || vsazeneZetony <= 0) {
                    hrac.setPocetVsazenychZetonu(vsazeneZetony);
                    hrac.vsazeneZetony(vsazeneZetony);
                    spin.run();
                    if (spin.getVyherniCislo() == specialNum) {
                        vsazeneZetony = vsazeneZetony * 36;
                        hrac.vyhraneZetony(vsazeneZetony);
                        System.out.println("Gratulace vyhral jste: " + vsazeneZetony);
                        pocetVyher++;
                        System.out.println(hrac.getInfo());
                        stop=true;
                    } else {
                        System.out.println("Prohral jste, vyherni cislo je: " + spin.getVyherniCislo());
                        System.out.println(hrac.getInfo());
                        stop=true;
                    }
                    stop = true;
                } else {
                    System.out.println("Nedostatek zetonu");
                }
                /* Exceptions */
        }catch(InputMismatchException e){
            System.out.println("zadejte platny udaj");
        }
        catch(Exception e){
            System.out.println("ERROR");
        }
    }
    }
    public void checkSpecialNumberIsCorrect(int cislo){
        boolean  stop = true;
        while(stop){
            if (cislo < 0 || cislo >36){
                System.out.println("Zadejte cislo v rozmezi 0 az 36");
                cislo = sc.nextInt();
            }
            else{
                stop = false;
                continue;
            }
        }
    }

}
