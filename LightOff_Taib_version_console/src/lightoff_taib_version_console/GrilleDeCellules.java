/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_taib_version_console;

/**
 *
 * @author YOGA
 */



import java.util.Random;

public class GrilleDeCellules {
    private CelluleLumineuse[][] matriceCellules;

    /**
     * Constructeur de la classe GrilleDeCellules.
     * 
     * @param lignes   Le nombre de lignes dans la grille.
     * @param colonnes Le nombre de colonnes dans la grille.
     */
    public GrilleDeCellules(int lignes, int colonnes) {
        matriceCellules = new CelluleLumineuse[lignes][colonnes];

        // Initialise chaque cellule dans la matrice
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    /**
     * Méthode pour afficher la grille sous forme de chaîne de caractères.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (CelluleLumineuse[] ligne : matriceCellules) {
            for (CelluleLumineuse cellule : ligne) {
                result.append(cellule.isAllumee() ? "X" : "O").append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }

    /**
     * Active toutes les cellules dans la ligne spécifiée.
     * 
     * @param idLigne L'indice de la ligne à activer.
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < matriceCellules[idLigne].length; j++) {
            matriceCellules[idLigne][j].allumer();
        }
    }

    /**
     * Active toutes les cellules dans la colonne spécifiée.
     * 
     * @param idColonne L'indice de la colonne à activer.
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < matriceCellules.length; i++) {
            matriceCellules[i][idColonne].allumer();
        }
    }

    /**
     * Active la diagonale descendante de la grille.
     */
    public void activerDiagonaleDescendante() {
        int min = Math.min(matriceCellules.length, matriceCellules[0].length);
        for (int i = 0; i < min; i++) {
            matriceCellules[i][i].allumer();
        }
    }

    /**
     * Active la diagonale montante de la grille.
     */
    public void activerDiagonaleMontante() {
        int min = Math.min(matriceCellules.length, matriceCellules[0].length);
        for (int i = 0; i < min; i++) {
            matriceCellules[i][matriceCellules[0].length - 1 - i].allumer();
        }
    }

    /**
     * Active une ligne, une colonne ou une diagonale de manière aléatoire.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(3);

        switch (choix) {
            case 0:
                int ligneAleatoire = random.nextInt(matriceCellules.length);
                activerLigneDeCellules(ligneAleatoire);
                break;
            case 1:
                int colonneAleatoire = random.nextInt(matriceCellules[0].length);
                activerColonneDeCellules(colonneAleatoire);
                break;
            case 2:
                if (random.nextBoolean()) {
                    activerDiagonaleDescendante();
                } else {
                    activerDiagonaleMontante();
                }
                break;
            default:
                // Ne devrait jamais arriver
        }
    }

    /**
     * Mélange la grille de manière aléatoire en effectuant un certain nombre de
     * tours.
     * 
     * @param nbTours Le nombre de tours de mélange.
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        Random random = new Random();

        for (int tour = 0; tour < nbTours; tour++) {
            int i1 = random.nextInt(matriceCellules.length);
            int j1 = random.nextInt(matriceCellules[0].length);

            int i2 = random.nextInt(matriceCellules.length);
            int j2 = random.nextInt(matriceCellules[0].length);

            // Échanger les cellules
            CelluleLumineuse temp = matriceCellules[i1][j1];
            matriceCellules[i1][j1] = matriceCellules[i2][j2];
            matriceCellules[i2][j2] = temp;
        }
    }

    // Ajoutez les autres méthodes conformément au descriptif

    // ...

    /**
     * Méthode principale pour tester la classe GrilleDeCellules.
     * 
     * @param args Les arguments de la ligne de commande (non utilisés).
     */
    public static void main(String[] args) {
        // Testez votre affichage ici
        GrilleDeCellules grille = new GrilleDeCellules(4, 4);
        System.out.println("Initial Grid State:");
        System.out.println(grille);

        // Testez chacune des méthodes dans le main pour vérifier qu'elle fonctionne bien
        grille.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println("Grid State After Random Activation:");
        System.out.println(grille);

        grille.melangerMatriceAleatoirement(5);
        System.out.println("Grid State After Random Shuffling:");
        System.out.println(grille);
    }
}


