/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispersionetermica;

/**
 *
 * @author 72873486
 */
public class appartamento {
    //dichiarazione atttributi
    private int piano;
    private int appartamento;
    private int nStanze;
    private int nStanzetot;
    String v[];
    stanza stanze[];
    
    //metodo costruttore e metodi setter e getter dei vari attributi
    public appartamento (int piano, int appartamento, int nStanzetot)
    {
        this.appartamento=appartamento;
        this.piano=piano;
        this.nStanzetot=nStanzetot; 
        stanze = new stanza[nStanzetot];
   
    }

    public int getNstanze() {
        return nStanze;
    }

    public void setNstanze(int nStanze) {
        this.nStanze = nStanze;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public void setAppartamento(int appartamento) {
        this.appartamento = appartamento;
    }

    public int getPiano() {
        return piano;
    }

    public int getAppartamento() {
        return appartamento;
    }
    
    
    
   //metodo per l'aggiunta di una stanza all'appartamento 
    public void addStanza(stanza a, String v[])
    {
         for (int i = 0; i < stanze.length; i++ )
         {
             //System.out.println(stanze[0]);
             if (stanze[i]==null)
             {
               stanze[i]= a;  
               System.out.println("fatto");
               stanze[i].calcolaAree(v);
               System.out.println(stanze[i].getNome());
               break;
             }
             else
             {
              //System.out.println("non puoi aggiungere altre stanze");   
             }
                 
         }
    }
    
    //metodo per il calcolo della dipsersione dell'appartamento
    public double dispersioneApp()
    {
        double dispersioneL = 0;
        double dispersioneN = 0;
        double finestre = 0;
        double Vtot = 0;
        for (int i = 0 ; i < stanze.length; i++)
        {
       
            //stanze[i].toTest();
            dispersioneN += stanze[i].toTest() + stanze[i].getFinestre();
            dispersioneL += stanze[i].toTest();
            finestre += stanze[i].getFinestre();
            Vtot += stanze[i].getVolume();
        }
        System.out.println(Math.abs(dispersioneN));
        System.out.println(Math.abs(dispersioneL));
        System.out.println(finestre);
        System.out.println("il volume totale e' "+Vtot);
       
        return dispersioneL;
    }
    
    public double getFinestreApp()
    {
       double finestre=0;
       for (int i = 0 ; i < stanze.length; i++)
       { 
            finestre += stanze[i].getFinestre();
            
       } 
       return finestre;
    }
}
