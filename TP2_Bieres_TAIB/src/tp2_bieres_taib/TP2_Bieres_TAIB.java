/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tp2_bieres_taib;

/**
 *
 * @author YOGA
 */
public class TP2_Bieres_TAIB {

    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson") ;
        uneBiere.lireEtiquette();
        System.out.println(uneBiere);
        
        BouteilleBiere uneBiere2 = new BouteilleBiere("Leffe", (double) 6.6, "Abbaye de Leffe") ;
        uneBiere2.lireEtiquette();
        uneBiere2.Décapsuler();
        uneBiere2.lireEtiquette();
        
        BouteilleBiere uneBiere3 = new BouteilleBiere("Biere 3", (double) 9.0, "Brasserie") ;
        uneBiere3.lireEtiquette();
        
        BouteilleBiere uneBiere4 = new BouteilleBiere("Biere 4", (double) 6.0, "Brasserie") ;
        uneBiere4.Décapsuler();
        System.out.println(uneBiere4);
        
        BouteilleBiere uneBiere5 = new BouteilleBiere("Biere 5", (double) 6.6, "Brasserie") ;
        uneBiere5.lireEtiquette();
    }
}
