/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_taib_version_console;

/**
 *
 * @author YOGA
 */
public class LightOff_Taib_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Partie game = new Partie();
        game.choisirDifficulte();

        // Launch the game
        game.lancerPartie();
    }
    
}
