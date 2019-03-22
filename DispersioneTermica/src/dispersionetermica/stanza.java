/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispersionetermica;

import java.util.Scanner;

/**
 *
 * @author 72873486
 */
public class stanza {
    //dichiarazione atttributi
    private String nome;
    private double lunghezza;
    private double altezza;
    private double larghezza;
    private double finestre;
    private double bocchette;
    private double volume;
    private double[] superfici;
    
    //creazone dell'oggetto scanner per richiedere input
    Scanner s = new Scanner(System.in);
    
     //metodo costruttore e metodi setter e getter degli attributi
    public stanza(String nome, double lunghezza, double larghezza, double altezza,double finestre, double bocchette)
    {
        this.nome=nome;
        this.altezza=altezza;
        this.larghezza=larghezza;
        this.lunghezza=lunghezza;
        this.finestre=finestre;
        this.bocchette=bocchette;
        superfici = new double[6];
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public void setFinestre(int finestre) {
        this.finestre = finestre;
    }

    public void setBocchette(int bocchette) {
        this.bocchette = bocchette;
    }
    
    public void setVolume(double volume)
    {
        this.volume=volume;
    }

    public String getNome() {
        return nome;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public double getFinestre() {
        return finestre;
    }

    public double getBocchette() {
        return bocchette;
    } 
    
    public double getVolume()
    {
        return volume;
    }
    
    //metodo che calcola l'area delle varie pareti della stanza e pone negative le pareti disperdenti 
    /*public void calcolaAree()
    {
        superfici[0] = this.getLarghezza()*this.getAltezza();
        superfici[2] = this.getLarghezza()*this.getAltezza();
        superfici[1] = this.getLunghezza()*this.getAltezza();
        superfici[3] = this.getLunghezza()*this.getAltezza();
        superfici[4] = this.getLarghezza()*this.getLunghezza();
        superfici[5] = this.getLarghezza()*this.getLunghezza();
        
        
        volume = this.getLunghezza() * this.getLarghezza() * this.getAltezza();
        
        for (int i = 0; i<6 ; i++)
        {
            System.out.println("la superficie "+ (i+1)+ " e' disperdente[s/n]");
            String v = s.next();
            if (v.equalsIgnoreCase("s"))
                superfici[i]= -1*superfici[i];    
        }*/
    
    public void calcolaAree(String v[])
    {
        superfici[1] = this.getLarghezza()*this.getAltezza();//larg1
        superfici[3] = this.getLarghezza()*this.getAltezza();//
        superfici[0] = this.getLunghezza()*this.getAltezza();
        superfici[2] = this.getLunghezza()*this.getAltezza();
        superfici[4] = this.getLarghezza()*this.getLunghezza();//bottom
        superfici[5] = this.getLarghezza()*this.getLunghezza();//up
        
        
        volume = this.getLunghezza() * this.getLarghezza() * this.getAltezza();
        
        for (int i = 0; i<6 ; i++)
        {
            //System.out.println("la superficie "+ (i+1)+ " e' disperdente[s/n]");
            if (v[i].equalsIgnoreCase("s"))
                superfici[i]= -1*superfici[i];    
        }
    }
     
    
    //metodo per il calcolo delle superfici disperdenti 
    public double toTest()
    {
        double dispersioneL=0;
        //System.out.println(this.getNome());
        //System.out.println(this.getLunghezza());
        //System.out.println("la superficie e' "+(Math.abs(this.superfici[0])+Math.abs(this.superfici[1])+Math.abs(this.superfici[2])+Math.abs(this.superfici[3])+Math.abs(this.superfici[4])+Math.abs(this.superfici[5])));
        for (int j=0; j<6; j++)
        {
            // System.out.println(superfici[j]);
            if (superfici[j]<0)
            {
                dispersioneL += superfici[j];
            }
        }
        //System.out.println("la superficie disperdente netta e' "+Math.abs(dispersioneL));
        //System.out.println("la superficie disperdente lorda e' "+Math.abs(dispersioneL+this.finestre));
        return dispersioneL;
    }
    
    public void toStringg()
    {
        double dispersioneL=0;
        for (int j=0; j<6; j++)
        {
            
            if (superfici[j]<0)
            {
                System.out.println(superfici[j]);
                dispersioneL += superfici[j];
            }
        }
        System.out.println("La disperzione totale e'"+dispersioneL);
    }

}
