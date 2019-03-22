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
public class Affittuario {
    private String nomeA;
    private int iban;
    private final double costo1 = 0.50;
    private final double costo2 = 0.80;
    
    public Affittuario(String nomeA, int iban)
    {
        this.nomeA=nomeA;
        this.iban=iban;
    }

    public void setNomeA(String nomeA) {
        this.nomeA = nomeA;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public String getNomeA() {
        return nomeA;
    }

    public int getIban() {
        return iban;
    }
    
    public void costi(appartamento a, int g)
    {
        double dispersioneL=a.dispersioneApp();
        double finestre = a.getFinestreApp();
        double dispersioneN = dispersioneL + finestre;
        double costoN = Math.abs(dispersioneN * costo1);
        double costoF = Math.abs(finestre * costo2);
        double costoTot = (costoN+costoF)*g;
        System.out.println("AFFITTOOOOOOOOOOOOOOOOOOOOOO");
        //System.out.println(dispersioneN);
        System.out.println(dispersioneN);
        System.out.println(costoN);
        System.out.println(costoF);
        System.out.println(costoTot);
    }
    
    
}
