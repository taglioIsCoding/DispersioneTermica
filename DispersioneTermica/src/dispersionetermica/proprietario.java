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
public class proprietario {
    
    //dichiarazione metodi
    private String nome;
    private String cognome;
    private String cF;
    private int nApp;
    appartamento appartamenti[] = new appartamento[5];
    
     //metodo costruttore e metodi setter e getter dei vari attributi
    public proprietario(String nome, String cognome, String cF, int nApp)
    {
        this.nome=nome;
        this.cognome=cognome;
        this.cF=cF;
        this.nApp=nApp;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setcF(String cF) {
        this.cF = cF;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getcF() {
        return cF;
    }
}
