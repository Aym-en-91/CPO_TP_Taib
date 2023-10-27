package lightoff_taib_version_console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aymen
 */
import java.util.Scanner;

public class Partie {
    private final GrilleDeCellules grille;

    /**
     *Create a new grid for the game
     * @param lignes
     * @param colonnes
     */
    public Partie(int lignes, int colonnes) {
        
        this.grille = new GrilleDeCellules(lignes, colonnes);
    }

    /**
     *Add initialization logic as needed
     * For example, you might want to shuffle the grid
     */
    public void initialiserPartie() {
       
        grille.melangerMatriceAleatoirement(10); 
    }

    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);

        while (!partieTerminee()) {
            
            System.out.println("Current Grid State:");
            System.out.println(grille);

            
            System.out.print("Enter row and column (e.g., 1 2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            
            toggleCell(row, col);
        }

        scanner.close();
    }

    private void toggleCell(int row, int col) {
        
    }

    private boolean partieTerminee() {
        
        return false; 
    }
}
