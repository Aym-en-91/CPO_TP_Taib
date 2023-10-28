/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_taib_version_console;

/**
 *
 * @author YOGA
 */
import java.util.Scanner;

public class Partie {
    private GrilleDeCellules grille;

    public Partie(int lignes, int colonnes) {
        // Create a new grid for the game
        this.grille = new GrilleDeCellules(lignes, colonnes);
    }

    public void initialiserPartie() {
        // Add initialization logic as needed
        // For example, you might want to shuffle the grid
        grille.melangerMatriceAleatoirement(10); // adjust the number of turns as needed
    }

    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);

        while (!partieTerminee()) {
            // Display the current state of the grid
            System.out.println("Current Grid State:");
            System.out.println(grille);

            // Get user input for the cell to toggle
            System.out.print("Enter row and column (e.g., 1 2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Add logic to toggle the selected cell or perform other actions
            // For example, you might want to toggle the selected cell
            toggleCell(row, col);
        }

        scanner.close();
    }

    private void toggleCell(int row, int col) {
        // Add logic to toggle the state of the selected cell
        // For example, you might want to toggle the cell in the grid
        grille.toggleCellule(row, col);
    }

    private boolean partieTerminee() {
        // Add logic to determine whether the game is finished
        // For example, check if all cells are turned on or off based on your game rules
        return false; // Update with your game-over conditions
    }
}
