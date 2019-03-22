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
public class DispersioneTermica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creazione appartamenti
      
        
        String[] vA={"n","s","s","s","s","n"};
        String[] vB={"s","s","s","n","n","s"};
        String vC[]={"s","s","n","n","n","n"};
        String vD[]={"s","n","s","s","s","n"};
        String vE[]={"n","s","n","s","s","n"};
        String vF[]={"s","n","s","s","n","s"};
        
        
        appartamento rossi = new appartamento (1, 3, 3);
        appartamento rossi1 = new appartamento (1, 3, 4);
        appartamento bianchi = new appartamento(2, 2, 3);
        appartamento bianchi1 = new appartamento (2, 4, 4);
        appartamento verdi = new appartamento (3, 3, 2);
        appartamento verdi1 = new appartamento (3, 7, 2);
                
                
                
        //creazione delle varie stanze
        stanza A = new stanza("A", 5.50, 4.00, 2.70, 5.50, 0);
        stanza B = new stanza("B", 6.00, 3.50, 2.70, 6.50, 0);
        stanza C = new stanza("C", 3.50, 3.00, 2.70, 1.50, 0);
        stanza D = new stanza("D", 4.50, 4.00, 2.70, 2.80, 0);
        stanza E = new stanza("E", 4.00, 4.00, 2.70, 2.00, 0);
        stanza F = new stanza("F", 4.60, 3.40, 2.70, 3.50, 0);
        
        //affittuario
        Affittuario Mario = new Affittuario("Mario", 213543);
        
        
        
        
        //aggiunta delle varie stanze nei rispettivi appartamenti
        rossi.addStanza(A,vA);
        rossi.addStanza(C, vC);
        rossi.addStanza(D, vD);
        rossi1.addStanza(B, vB);
        rossi1.addStanza(D, vD);
        rossi1.addStanza(E, vE);
        rossi1.addStanza(F, vF);
        
        bianchi.addStanza(A, vA);
        bianchi.addStanza(E, vE);
        bianchi.addStanza(F, vF);
        bianchi1.addStanza(A, vA);
        bianchi1.addStanza(C, vC);
        bianchi1.addStanza(E, vE);
        bianchi1.addStanza(F, vF);
        
        verdi.addStanza(E, vE);
        verdi.addStanza(F, vF);
        verdi1.addStanza(B, vB);
        verdi1.addStanza(D, vD);
        
        
        A.toStringg();
        B.toStringg();
        C.toStringg();
        D.toStringg();
        E.toStringg();
        F.toStringg();
        //applicazione del metodo per il calcolo della dispersione
        rossi.dispersioneApp();
        rossi1.dispersioneApp();
        bianchi.dispersioneApp();
        bianchi1.dispersioneApp();
        verdi.dispersioneApp();
        verdi1.dispersioneApp();
        
        Mario.costi(rossi, 12);

        
    }
    
}
