/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO-G50
 */
public class Jframe_Produit extends javax.swing.JFrame {

    /**
     * Creates new form Jframe_Produit
     */
    public Jframe_Produit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ConsulterProduits = new javax.swing.JButton();
        SupprimerProduit = new javax.swing.JButton();
        ModifierProduit = new javax.swing.JButton();
        EnregistrerProduit = new javax.swing.JButton();
        Produits = new javax.swing.JLabel();
        SeDeconnecter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        ConsulterProduits.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        ConsulterProduits.setText("Consulter La Liste Des Produits");
        ConsulterProduits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsulterProduitsActionPerformed(evt);
            }
        });

        SupprimerProduit.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        SupprimerProduit.setText("Supprimer Un Produit");
        SupprimerProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerProduitActionPerformed(evt);
            }
        });

        ModifierProduit.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        ModifierProduit.setText("Modifier Un Produit");
        ModifierProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierProduitActionPerformed(evt);
            }
        });

        EnregistrerProduit.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        EnregistrerProduit.setText("Ajouter Un Produit");
        EnregistrerProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnregistrerProduitActionPerformed(evt);
            }
        });

        Produits.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Produits.setText("Produits :");

        SeDeconnecter.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        SeDeconnecter.setText("Se Déconnecter");
        SeDeconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeDeconnecterActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nouveau dossier/produits.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(Produits))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(EnregistrerProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModifierProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SupprimerProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ConsulterProduits, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(SeDeconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Produits)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(EnregistrerProduit)
                .addGap(18, 18, 18)
                .addComponent(ModifierProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SupprimerProduit)
                .addGap(18, 18, 18)
                .addComponent(ConsulterProduits)
                .addGap(75, 75, 75)
                .addComponent(SeDeconnecter)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsulterProduitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsulterProduitsActionPerformed
        ConsulterListeProduits I = new ConsulterListeProduits();
        I.show();
        this.dispose();
    }//GEN-LAST:event_ConsulterProduitsActionPerformed

    private void SupprimerProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerProduitActionPerformed
        SupprimerUnProduit I = new SupprimerUnProduit();
        I.show();
        this.dispose();
    }//GEN-LAST:event_SupprimerProduitActionPerformed

    private void ModifierProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierProduitActionPerformed
        ModifierUnProduit I = new ModifierUnProduit();
        I.show();
        this.dispose();
    }//GEN-LAST:event_ModifierProduitActionPerformed

    private void EnregistrerProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnregistrerProduitActionPerformed
        EnregistrerUnProduit I = new EnregistrerUnProduit();
        I.show();
        this.dispose();
    }//GEN-LAST:event_EnregistrerProduitActionPerformed

    private void SeDeconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeDeconnecterActionPerformed
        DB.CloseDB();
        BienVenu I = new  BienVenu ();
        I.show();
        this.dispose();
    }//GEN-LAST:event_SeDeconnecterActionPerformed

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
            java.util.logging.Logger.getLogger(Jframe_Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe_Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe_Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe_Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe_Produit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsulterProduits;
    private javax.swing.JButton EnregistrerProduit;
    private javax.swing.JButton ModifierProduit;
    private javax.swing.JLabel Produits;
    private javax.swing.JButton SeDeconnecter;
    private javax.swing.JButton SupprimerProduit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
