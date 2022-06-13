import hrac.Hrac;
import ruleta.Ruleta;
import ruleta.RuletaHra;
import ruleta.Spin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean stop = false;
        System.out.println("Ahoj vitam te v nasem casinu Casino Pablo");
        System.out.println("poprosim aby jste nize doplnily vase udaje");
        while(!stop){
            try {

                System.out.println("Zadejte jmeno a pocet zetonu do nasi banky: ");
                String jmeno= sc.next();
                int zetony = sc.nextInt();

                Hrac hrac = new Hrac(jmeno,zetony);
                Spin s = new Spin();
                Ruleta r =new Ruleta(hrac,s);
                RuletaHra rh = new RuletaHra(r,hrac);
                /* method for start the plat roulette  */
                rh.hrat();
            }catch (InputMismatchException e){
                System.out.println("Zadejte platny udaj");
                sc.nextLine();
            }
        }
    }
}
