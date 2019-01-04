
import java.awt.event.KeyEvent;
import java.sql.Time;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kira
 */
public class SupprimerUnProduit extends javax.swing.JFrame {

    /**
     * Creates new form EnregistrerUnClient
     */
    public SupprimerUnProduit() {
        initComponents();
        Actualiser(0);
    }
    
    void Actualiser(int j) {
        
        DB.SelectNumFournisseurDB();
        DB.SelectTauxTVADB();
        DB.SelectCodeFamilleDB();
        DB.SelectCodePortDB();
        DB.SelectRefProduitDB();
        
        for(int i=0; i<DB.fournisseurs.size(); i++) {
            NumFournisseur.addItem(DB.fournisseurs.get(i).getNum());
        }
        if(NumFournisseur.getItemCount() !=0) NumFournisseur.setSelectedItem(DB.fournisseurs.get(0).getNum());
        
        for(int i=0; i<DB.TVA.size(); i++) {
            TauxTVA.addItem(DB.TVA.get(i).toString());
        }
        if(TauxTVA.getItemCount() !=0) TauxTVA.setSelectedItem(DB.TVA.get(0).toString());
        
        for(int i=0; i<DB.CFs.size(); i++) {
            CodeFamille.addItem(DB.CFs.get(i));
        }
        if(CodeFamille.getItemCount() !=0) CodeFamille.setSelectedItem(DB.CFs.get(0));
        
        for(int i=0; i<DB.CPs.size(); i++) {
            CodePort.addItem(DB.CPs.get(i));
        }
        if(CodePort.getItemCount() !=0) CodePort.setSelectedItem(DB.CPs.get(0));
        
        
        
        Ref.removeAllItems();
        for(int i=0; i<DB.produits.size(); i++) {
            Ref.addItem(DB.produits.get(i).getRef());
        }
        if(Ref.getItemCount() !=0) {
            
        Ref.setSelectedItem(DB.produits.get(j).getRef());
        GenCode.setText(DB.produits.get(j).getGenCode());
        CodeBar.setText(DB.produits.get(j).getCodeBar());
        LibProd.setText(DB.produits.get(j).getLibProd());
        Description.setText(DB.produits.get(j).getDescription());
        PrixHT.setText(String.valueOf(DB.produits.get(j).getPrixHT()));
        TauxTVA.setSelectedItem(DB.produits.get(j).getTauxTVA());
        QteReappro.setText(String.valueOf(DB.produits.get(j).getQteReappro()));
        QteMini.setText(String.valueOf(DB.produits.get(j).getQteMini()));
        NumFournisseur.setSelectedItem(String.valueOf(DB.produits.get(j).getNumFournisseur()));
        PlusAuCatalogue.setText(String.valueOf(DB.produits.get(j).getPlusAuCatalogue()));
        CodeFamille.setSelectedItem(DB.produits.get(j).getCodeFamille());
        CodePort.setSelectedItem(DB.produits.get(j).getCodePort());
        SaisiPar.setText(DB.produits.get(j).getSaisiPar());
        SaisiLe.setText("2018-12-19");
            
        } else {
            GenCode.setText("");
            CodeBar.setText("");
            LibProd.setText("");
            Description.setText("");
            PrixHT.setText("");
            QteReappro.setText("");
            QteMini.setText("");
            PlusAuCatalogue.setText("");
            SaisiPar.setText("");
            SaisiLe.setText("");
            
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

        SaisiLeJ1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        Selectionner = new javax.swing.JButton();
        Selectionner1 = new javax.swing.JLabel();
        CodeBar1 = new javax.swing.JLabel();
        SaisiLe = new javax.swing.JTextField();
        LibProd1 = new javax.swing.JLabel();
        Ref = new javax.swing.JComboBox<>();
        NumFournisseur1 = new javax.swing.JLabel();
        TauxTVA1 = new javax.swing.JLabel();
        PrixHT1 = new javax.swing.JLabel();
        PlusAuCatalogue1 = new javax.swing.JLabel();
        PrixHT = new javax.swing.JTextField();
        PlusAuCatalogue = new javax.swing.JTextField();
        SaisiPar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        SaisiPar1 = new javax.swing.JLabel();
        LibProd = new javax.swing.JTextField();
        SaisiLe1 = new javax.swing.JLabel();
        TauxTVA = new javax.swing.JComboBox<>();
        CodePort1 = new javax.swing.JLabel();
        CodePort = new javax.swing.JComboBox<>();
        CodeFamille1 = new javax.swing.JLabel();
        NumFournisseur = new javax.swing.JComboBox<>();
        Description1 = new javax.swing.JLabel();
        CodeFamille = new javax.swing.JComboBox<>();
        SupprimerProduit = new javax.swing.JButton();
        QteMini1 = new javax.swing.JLabel();
        QteReappro2 = new javax.swing.JLabel();
        GenCode = new javax.swing.JTextField();
        QteMini = new javax.swing.JTextField();
        CodeBar = new javax.swing.JTextField();
        QteReappro = new javax.swing.JTextField();
        Ref1 = new javax.swing.JLabel();
        GenCode1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Retour1 = new javax.swing.JButton();

        SaisiLeJ1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Suppression");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        Selectionner.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Selectionner.setText("Selectionner");

        Selectionner1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Selectionner1.setText("Pas de photo selectionnée.");

        CodeBar1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        CodeBar1.setText("Code Bar :");

        SaisiLe.setEditable(false);
        SaisiLe.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        LibProd1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        LibProd1.setText("Libellé Produit :");

        Ref.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefActionPerformed(evt);
            }
        });

        NumFournisseur1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        NumFournisseur1.setText("N° Fournisseur :");

        TauxTVA1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        TauxTVA1.setText("Taux TVA :");

        PrixHT1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        PrixHT1.setText("Prix HT :");

        PlusAuCatalogue1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        PlusAuCatalogue1.setText("Plus Au Catalogue :");

        PrixHT.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        PrixHT.setText("0.00");

        PlusAuCatalogue.setEditable(false);
        PlusAuCatalogue.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        PlusAuCatalogue.setText("0");
        PlusAuCatalogue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PlusAuCatalogueKeyPressed(evt);
            }
        });

        SaisiPar.setEditable(false);
        SaisiPar.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        SaisiPar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SaisiParKeyPressed(evt);
            }
        });

        Description.setEditable(false);
        Description.setColumns(20);
        Description.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        Description.setRows(5);
        Description.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DescriptionKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(Description);

        SaisiPar1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        SaisiPar1.setText("Saisi Par :");

        LibProd.setEditable(false);
        LibProd.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        LibProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LibProdKeyPressed(evt);
            }
        });

        SaisiLe1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        SaisiLe1.setText("Saisi Le :");

        TauxTVA.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        TauxTVA.setEnabled(false);

        CodePort1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        CodePort1.setText("Code Port :");

        CodePort.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        CodePort.setEnabled(false);

        CodeFamille1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        CodeFamille1.setText("Code Famille :");

        NumFournisseur.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        NumFournisseur.setEnabled(false);

        Description1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Description1.setText("Description :");

        CodeFamille.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        CodeFamille.setEnabled(false);

        SupprimerProduit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        SupprimerProduit.setText("Supprimer");
        SupprimerProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerProduitActionPerformed(evt);
            }
        });

        QteMini1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        QteMini1.setText("Qte. Minimale :");

        QteReappro2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        QteReappro2.setText("Qte. Réappro :");

        GenCode.setEditable(false);
        GenCode.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        GenCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GenCodeKeyPressed(evt);
            }
        });

        QteMini.setEditable(false);
        QteMini.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        QteMini.setText("0");

        CodeBar.setEditable(false);
        CodeBar.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        CodeBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodeBarKeyPressed(evt);
            }
        });

        QteReappro.setEditable(false);
        QteReappro.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        QteReappro.setText("0");
        QteReappro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                QteReapproKeyPressed(evt);
            }
        });

        Ref1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Ref1.setText("Ref° Produit :");

        GenCode1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        GenCode1.setText("Code Généré :");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nouveau dossier/supp_produits.PNG"))); // NOI18N

        Retour1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Retour1.setText("Retour");
        Retour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Retour1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CodeBar1)
                                    .addComponent(LibProd1)
                                    .addComponent(PrixHT1)
                                    .addComponent(Description1)
                                    .addComponent(TauxTVA1)
                                    .addComponent(QteReappro2)
                                    .addComponent(QteMini1)
                                    .addComponent(NumFournisseur1))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(QteReappro, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PrixHT, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(CodeBar, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LibProd, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TauxTVA, 0, 140, Short.MAX_VALUE)
                                        .addComponent(QteMini))
                                    .addComponent(NumFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ref1)
                                    .addComponent(GenCode1))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(GenCode, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ref, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Selectionner1)
                                .addGap(68, 68, 68))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SaisiPar1)
                                            .addComponent(CodePort1)
                                            .addComponent(SaisiLe1)
                                            .addComponent(CodeFamille1)
                                            .addComponent(PlusAuCatalogue1))
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Selectionner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PlusAuCatalogue)
                                            .addComponent(SaisiPar)
                                            .addComponent(CodePort, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(CodeFamille, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(SaisiLe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel1)))
                                .addGap(23, 23, 23))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SupprimerProduit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Retour1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ref1)
                            .addComponent(Ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GenCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenCode1))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CodeBar1)
                            .addComponent(CodeBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LibProd1)
                    .addComponent(LibProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selectionner1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Description1)
                            .addComponent(Selectionner))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PlusAuCatalogue1)
                            .addComponent(PlusAuCatalogue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrixHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrixHT1))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TauxTVA1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TauxTVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CodeFamille1)
                        .addComponent(CodeFamille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QteReappro2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(QteReappro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CodePort1))
                    .addComponent(CodePort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QteMini1)
                    .addComponent(QteMini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaisiPar1)
                    .addComponent(SaisiPar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumFournisseur1)
                    .addComponent(NumFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaisiLe1)
                    .addComponent(SaisiLe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SupprimerProduit)
                    .addComponent(Retour1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SupprimerProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerProduitActionPerformed
        Produit produit = new Produit();
        
        produit.setRef(Ref.getSelectedItem().toString());
        produit.setGenCode(GenCode.getText());
        produit.setCodeBar(CodeBar.getText());
        produit.setLibProd(LibProd.getText());
        produit.setDescription(Description.getText());
        produit.setPrixHT(Double.parseDouble(PrixHT.getText()));
        produit.setTauxTVA(Double.parseDouble(TauxTVA.getSelectedItem().toString()));
        produit.setQteReappro(Integer.parseInt(QteReappro.getText()));
        produit.setQteMini(Integer.parseInt(QteMini.getText()));
        produit.setNumFournisseur(Integer.parseInt(NumFournisseur.getSelectedItem().toString()));
        produit.setPlusAuCatalogue(Integer.parseInt(PlusAuCatalogue.getText()));
        produit.setCodeFamille(CodeFamille.getSelectedItem().toString());
        produit.setCodePort(CodePort.getSelectedItem().toString());
        produit.setSaisiPar(SaisiPar.getText());
        produit.setSaisiLe("2018-12-19");
        
        DB.DeleteDB(produit);
        Actualiser(Ref.getSelectedIndex()-1);
        
         JOptionPane.showMessageDialog( null, "Succès!", 
					      "Produit Modifié", JOptionPane.INFORMATION_MESSAGE);
         
    }//GEN-LAST:event_SupprimerProduitActionPerformed

    private void GenCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GenCodeKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            {
              CodeBar.grabFocus();
            }
    }//GEN-LAST:event_GenCodeKeyPressed

    private void CodeBarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodeBarKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            {
              LibProd.grabFocus();
            }
    }//GEN-LAST:event_CodeBarKeyPressed

    private void DescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescriptionKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            {
              PrixHT.grabFocus();
            }
    }//GEN-LAST:event_DescriptionKeyPressed

    private void PlusAuCatalogueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlusAuCatalogueKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            {
              SaisiPar.grabFocus();
            }
    }//GEN-LAST:event_PlusAuCatalogueKeyPressed

    private void SaisiParKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SaisiParKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            {
              GenCode.grabFocus();
            }
    }//GEN-LAST:event_SaisiParKeyPressed

    private void QteReapproKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QteReapproKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            {
              QteMini.grabFocus();
            }
    }//GEN-LAST:event_QteReapproKeyPressed

    private void LibProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LibProdKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            {
              Description.grabFocus();
            }
    }//GEN-LAST:event_LibProdKeyPressed

    private void RefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefActionPerformed
        int i=0;
        if (Ref.getSelectedIndex()!= -1) {
            while (!DB.produits.get(i).getRef().equals(Ref.getSelectedItem().toString())) i++;
            
            GenCode.setText(DB.produits.get(i).getGenCode());
            CodeBar.setText(DB.produits.get(i).getCodeBar());
            LibProd.setText(DB.produits.get(i).getLibProd());
            Description.setText(DB.produits.get(i).getDescription());
            PrixHT.setText(String.valueOf(DB.produits.get(i).getPrixHT()));
            TauxTVA.setSelectedItem(DB.produits.get(i).getTauxTVA());
            QteReappro.setText(String.valueOf(DB.produits.get(i).getQteReappro()));
            QteMini.setText(String.valueOf(DB.produits.get(i).getQteMini()));
            NumFournisseur.setSelectedItem(DB.produits.get(i).getNumFournisseur());
            PlusAuCatalogue.setText(String.valueOf(DB.produits.get(i).getPlusAuCatalogue()));
            CodeFamille.setSelectedItem(DB.produits.get(i).getCodeFamille());
            CodePort.setSelectedItem(DB.produits.get(i).getCodePort());
            SaisiPar.setText(DB.produits.get(i).getSaisiPar());
            SaisiLe.setText(DB.produits.get(i).getSaisiLe());
        }
    }//GEN-LAST:event_RefActionPerformed

    private void Retour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Retour1ActionPerformed
       Jframe_Produit I = new Jframe_Produit();
        I.show();
        this.dispose();
    }//GEN-LAST:event_Retour1ActionPerformed

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
            java.util.logging.Logger.getLogger(EnregistrerUnClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnregistrerUnClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnregistrerUnClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnregistrerUnClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnregistrerUnClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodeBar;
    private javax.swing.JLabel CodeBar1;
    private javax.swing.JComboBox<String> CodeFamille;
    private javax.swing.JLabel CodeFamille1;
    private javax.swing.JComboBox<String> CodePort;
    private javax.swing.JLabel CodePort1;
    private javax.swing.JTextArea Description;
    private javax.swing.JLabel Description1;
    private javax.swing.JTextField GenCode;
    private javax.swing.JLabel GenCode1;
    private javax.swing.JTextField LibProd;
    private javax.swing.JLabel LibProd1;
    private javax.swing.JComboBox<String> NumFournisseur;
    private javax.swing.JLabel NumFournisseur1;
    private javax.swing.JTextField PlusAuCatalogue;
    private javax.swing.JLabel PlusAuCatalogue1;
    private javax.swing.JTextField PrixHT;
    private javax.swing.JLabel PrixHT1;
    private javax.swing.JTextField QteMini;
    private javax.swing.JLabel QteMini1;
    private javax.swing.JTextField QteReappro;
    private javax.swing.JLabel QteReappro2;
    private javax.swing.JComboBox<String> Ref;
    private javax.swing.JLabel Ref1;
    private javax.swing.JButton Retour1;
    private javax.swing.JTextField SaisiLe;
    private javax.swing.JLabel SaisiLe1;
    private javax.swing.JComboBox<String> SaisiLeJ1;
    private javax.swing.JTextField SaisiPar;
    private javax.swing.JLabel SaisiPar1;
    private javax.swing.JButton Selectionner;
    private javax.swing.JLabel Selectionner1;
    private javax.swing.JButton SupprimerProduit;
    private javax.swing.JComboBox<String> TauxTVA;
    private javax.swing.JLabel TauxTVA1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}