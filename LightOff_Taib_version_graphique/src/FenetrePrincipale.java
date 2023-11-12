
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import lightoff_taib_version_console.CelluleGraphique;
import lightoff_taib_version_console.GrilleDeCellules;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author YOGA
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form FenetrePrincipale
     */
    int u;
    int maxCoups = 10;
    int coups = 0;
    public FenetrePrincipale() {
        initComponents();
        int nbLignes = 10;
        int nbColonnes = 10;
        
        
        this.grille = new GrilleDeCellules(nbLignes, nbColonnes);
        initialiserPartie(10);
        PanneauBoutonsH.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonsH, new
        org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();
        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new
        org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 1 * 40, nbLignes * 40));
        this.pack();
        this.revalidate();
        
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60,
        nbColonnes*40, nbLignes*40));
        this.pack();
        this.revalidate();
        for (u = 0; u < nbLignes; u++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
            final int t = u;
            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerLigneDeCellules(t);
                grille.coups++;
                repaint();
                verifierP();

                }
                };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonsVerticaux.add(bouton_ligne);
        }
        for (u = 0; u < nbLignes; u++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
            final int f = u;
            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerColonneDeCellules(f);
                grille.coups++;
                repaint();
                verifierP();

                }
                };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonsH.add(bouton_ligne);
        }
        for (int i=0; i < nbLignes; i++) {
        for (int j=0; j < nbColonnes; j++ ) {
            CelluleGraphique bouton_cellule = new CelluleGraphique( grille.matriceCellules[i][j], 36,36);
            PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
        }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsH = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 360, 360));

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 80, 360));

        PanneauBoutonsH.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout PanneauBoutonsHLayout = new javax.swing.GroupLayout(PanneauBoutonsH);
        PanneauBoutonsH.setLayout(PanneauBoutonsHLayout);
        PanneauBoutonsHLayout.setHorizontalGroup(
            PanneauBoutonsHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauBoutonsHLayout.setVerticalGroup(
            PanneauBoutonsHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsH, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 360, 60));

        jButton1.setText("DiagD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 110, 40));

        jButton2.setText("DiagM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleDescendante();
        grille.coups++;
        verifierP();
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleMontante();
        grille.coups++;
        verifierP();
        repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }
    private void initialiserPartie(int max_coups) {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(max_coups);
    }
    GrilleDeCellules grille;
    int nbCoups;
    private void verifierP() {
        if(grille.cellulesToutesEteintes()){
            this.jButton1.setEnabled(false);
            this.jButton2.setEnabled(false);
            this.dispose();
            JOptionPane.showMessageDialog(this, "You Have Won", "Game Over", 0);
        } else if (grille.coups >= this.maxCoups){
            this.jButton1.setEnabled(false);
            this.jButton2.setEnabled(false);
            this.dispose();
            JOptionPane.showMessageDialog(this, "You Have Lost", "Game Over", 0);
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonsH;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}