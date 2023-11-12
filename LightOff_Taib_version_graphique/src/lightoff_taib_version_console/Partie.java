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
    private int nbCoups;
    private int maxCoups; // Nouvel attribut pour stocker le nombre maximal de coups autorisés

    /**
     * Constructeur de la classe Partie.
     * Crée une nouvelle instance de la partie en initialisant la grille de cellules lumineuses et le compteur de coups.
     */
    public Partie() {
        nbCoups = 0;
        maxCoups = 0; // Initialise maxCoups à 0 par défaut (le joueur doit choisir la difficulté avant d'initialiser la partie)
    }

    

    /**
     * Permet au joueur de choisir la difficulté et initialise la partie en conséquence.
     */
    public void choisirDifficulte() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez la difficulté :");
        System.out.println("1. Facile");
        System.out.println("2. Moyen");
        System.out.println("3. Difficile");

        int choixDifficulte = scanner.nextInt();

       /* switch (choixDifficulte) {
            case 1:
                grille = new GrilleDeCellules(0);
                grille.melangerMatriceAleatoirement(5);
                maxCoups = 10; // Définir le nombre maximal de coups pour la difficulté Facile
                break;
            case 2:
                grille = new GrilleDeCellules(1);
                grille.melangerMatriceAleatoirement(10);
                maxCoups = 20; // Définir le nombre maximal de coups pour la difficulté Moyen
                break;
            case 3:
                grille = new GrilleDeCellules(2);
                grille.melangerMatriceAleatoirement(15);
                maxCoups = 30; // Définir le nombre maximal de coups pour la difficulté Difficile
                break;
            default:
                System.out.println("Difficulté non reconnue. La grille sera de taille moyenne.");
                grille = new GrilleDeCellules(1);
                maxCoups = 20; // Définir le nombre maximal de coups par défaut
                break;
        }*/
        System.out.println("Initialisation de la partie...");
        System.out.println("La grille de jeu est la suivante :");
        System.out.println(grille);
    }

    

    /**
     * Lance la partie en permettant au joueur de jouer au jeu LightOff.
     */
    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu LightOff !");
        System.out.println("Essayez d'éteindre toutes les cellules en utilisant le moins de coups possible.");
        System.out.println("Bonne chance !");

        while (!grille.cellulesToutesEteintes() && nbCoups < maxCoups) {
            System.out.println("État actuel de la grille :");
            System.out.println(grille);
            System.out.println("Menu :");
            System.out.println("1. Inverser une ligne");
            System.out.println("2. Inverser une colonne");
            System.out.println("3. Changer l'état d'une diagonale");
            System.out.println("Entrez le numéro de l'option :");

            int choixMenu = scanner.nextInt();

            switch (choixMenu) {
                case 1:
                    System.out.println("Entrez le numéro de la ligne à inverser :");
                    int ligne = scanner.nextInt();
                    grille.activerLigneDeCellules(ligne);
                    break;
                case 2:
                    System.out.println("Entrez le numéro de la colonne à inverser :");
                    int colonne = scanner.nextInt();
                    grille.activerColonneDeCellules(colonne);
                    break;
                case 3:
                    System.out.println("Choisissez une diagonale à changer (1. Diagonale descendante, 2. Diagonale montante) :");
                    int choixDiagonale = scanner.nextInt();
                switch (choixDiagonale) {
                    case 1:
                        grille.activerDiagonaleDescendante();
                        break;
                    case 2:
                        grille.activerDiagonaleMontante();
                        break;
                    default:
                        System.out.println("Option invalide. Aucune diagonale n'a été changée.");
                        break;
                }
                    break;

                default:
                    System.out.println("Option invalide. Aucune action n'a été effectuée.");
            }

            nbCoups++;

            System.out.println("Nombre de coups : " + nbCoups);
        }

        if (grille.cellulesToutesEteintes()) {
            System.out.println("Félicitations ! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");
        } else {
            System.out.println("Désolé, vous avez atteint le nombre maximal de coups autorisés. La partie est terminée.");
        }
    }

    
}