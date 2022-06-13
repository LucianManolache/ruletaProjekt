package hrac;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hrac {

    private String jmeno;
    private int zetony;
    private int pocetVsazenychZetonu;

    /* Konstruktor */
    public Hrac(String jmeno, int zetony){
        this.jmeno = jmeno;
        this.zetony = zetony;
    }


    public int getZetony(){
        return zetony;
    }

    /*Method for adding win to bank*/
    public void vyhraneZetony(int vyhraneZetony){
        this.zetony += vyhraneZetony;
    }

    public void setPocetVsazenychZetonu(int cislo){
        pocetVsazenychZetonu += cislo;
    }
    public int getPocetVsazenychZetonu(){
        return pocetVsazenychZetonu;
    }

    /*method for remove your zetony from bank when you put to the roulette*/
    public void vsazeneZetony(int vsazeneZetony){
        this.zetony -= vsazeneZetony;
    }

    public String getInfo(){
        return "jmeno: "+jmeno+",pocet zetonu v bance: "+zetony;
    }






}
