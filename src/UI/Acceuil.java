/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author alexiaidrac
 */
public class Acceuil extends javax.swing.JFrame {
Connection conn;
    /**
     * Creates new form Acceuil
     */
    private DefaultTableModel model;
    
    public Acceuil() {
        initComponents();
        model = new DefaultTableModel(new Object[]{"ID", "Name", "Prenom", "Date Naissance", "Adresse"}, 0);
        jTableDMR.setModel(model); // Appliquer le modèle au jTableDMR
        jTableDMR.setDefaultEditor(Object.class, null); // Rendre toutes les cellules non éditables
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99");
        } catch (SQLException ex) {
            Logger.getLogger(AjoutPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (conn != null) {
            System.out.println("Connexion établie");
            recuperation_donnees();
        } else {
            System.out.println("connexion impossible");

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

        jPanel1 = new javax.swing.JPanel();
        jLabelBienvenue = new javax.swing.JLabel();
        jLabelSession = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldRecherche = new javax.swing.JTextField();
        jButtonAjout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDMR = new javax.swing.JTable();
        jButtonDeconnexion = new javax.swing.JButton();
        jButtonRecherche = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelBienvenue.setFont(new java.awt.Font("Galvji", 3, 18)); // NOI18N
        jLabelBienvenue.setText("Bienvenue dans votre espace");

        jLabelSession.setFont(new java.awt.Font("Galvji", 1, 14)); // NOI18N
        jLabelSession.setText("Session :");

        jLabel3.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N
        jLabel3.setText("Pat BOLE");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/RadioTech Petite.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/utilisateur (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBienvenue)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabelSession)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addContainerGap(11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBienvenue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSession)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(182, 210, 219));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextFieldRecherche.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N
        jTextFieldRecherche.setText("Rechercher un patient...");
        jTextFieldRecherche.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextFieldRecherche.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldRechercheFocusGained(evt);
            }
        });
        jTextFieldRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRechercheActionPerformed(evt);
            }
        });

        jButtonAjout.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N
        jButtonAjout.setText("Ajouter");
        jButtonAjout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAjout.setBorderPainted(false);
        jButtonAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjoutActionPerformed(evt);
            }
        });

        jTableDMR.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N
        jTableDMR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Alexia", "IDRAC", "642142881", "13 rue saint joseph"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDMR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDMRMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDMR);

        jButtonDeconnexion.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N
        jButtonDeconnexion.setText("Deconnexion");
        jButtonDeconnexion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDeconnexion.setBorderPainted(false);
        jButtonDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeconnexionActionPerformed(evt);
            }
        });

        jButtonRecherche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/loupe.png"))); // NOI18N
        jButtonRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRecherche)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jButtonAjout, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                            .addComponent(jTextFieldRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonRecherche)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutActionPerformed
        AjoutPatient nouveauJFrame = new AjoutPatient();
        nouveauJFrame.setVisible(true);  
        dispose();
        
    }//GEN-LAST:event_jButtonAjoutActionPerformed

    private void jTextFieldRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRechercheActionPerformed

    private void jButtonDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeconnexionActionPerformed
         // Créer des boutons personnalisés
        Object[] options = {"Valider", "Annuler"};

        // Afficher la boîte de dialogue avec les boutons personnalisés
        int choix = JOptionPane.showOptionDialog(
                null, // Parent component
                "Vous allez être déconnecté. Êtes-vous sûr ?", // Message
                "Confirmation", // Titre
                JOptionPane.YES_NO_CANCEL_OPTION, // Type de boîte de dialogue
                JOptionPane.QUESTION_MESSAGE, // Type d'icône
                null, // Icône personnalisée (null pour utiliser l'icône par défaut)
                options, // Boutons personnalisés
                options[0]); // Bouton par défaut

        // Gérer la réponse de l'utilisateur
        if (choix == JOptionPane.YES_OPTION) {
            Connexion nouveauJFrame = new Connexion();
            nouveauJFrame.setVisible(true);     
            dispose();   
        }  else if (choix == JOptionPane.CANCEL_OPTION || choix == JOptionPane.CLOSED_OPTION) {
            // Action si l'utilisateur clique sur "Annuler" ou ferme la boîte de dialogue
            JOptionPane.getRootFrame().dispose();
        }
        
    }//GEN-LAST:event_jButtonDeconnexionActionPerformed

    private void jTableDMRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDMRMouseClicked
//        int ligne = jTableDMR.getSelectedRow(); //récuperation information ligne
//        int colonne = jTableDMR.getSelectedColumn(); // récuperation information colonne
        if (evt.getClickCount() == 2) { // Double clic sur une ligne
            
            int ligneSelectionnee = jTableDMR.getSelectedRow();// récuperation information de la ligne sélectionnée
            
                //information de la ligne sélectionnée
                int idpatient = Integer.parseInt(jTableDMR.getValueAt(ligneSelectionnee, 0).toString());
                String nom = jTableDMR.getValueAt(ligneSelectionnee, 1).toString();
                String prenom = jTableDMR.getValueAt(ligneSelectionnee, 2).toString();
                Date datenaissance = Date.valueOf(jTableDMR.getValueAt(ligneSelectionnee, 3).toString());
                String adresse = jTableDMR.getValueAt(ligneSelectionnee, 4).toString();
                
                
//                Object data = jTableDMR.getValueAt(ligne, colonne);
                
//                //ouvrir la fiche patient avec les informations sélectionnées

                testACTE nouveauJFrame = new testACTE(idpatient, nom, prenom, datenaissance, adresse);
                nouveauJFrame.setVisible(true);
                nouveauJFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
               
        }

    }//GEN-LAST:event_jTableDMRMouseClicked

    private void jButtonRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercheActionPerformed
        String rech = jTextFieldRecherche.getText();
        System.out.println(rech);
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>( model);
        jTableDMR.setRowSorter(sorter);
        if (rech.length() == 0) {
            sorter.setRowFilter(null);
            System.out.println("ça ne correspond à aucun patient");
        } else {
        // Vérifie si le texte est composé uniquement de chiffres
        boolean numero = rech.matches("\\d+");
        if (numero) {
            // Convertit la chaîne de chiffres en entier
            int num = Integer.parseInt(rech);
            // Crée un filtre pour trouver une correspondance avec le numéro exactement de l'identifiant
            sorter.setRowFilter(RowFilter.numberFilter(RowFilter.ComparisonType.EQUAL, num));
        } else {
            // Applique un filtre regex pour la recherche de texte
            sorter.setRowFilter(RowFilter.regexFilter(rech));
        }
        System.out.println("Patient trouvé.");
        }
           
    }//GEN-LAST:event_jButtonRechercheActionPerformed

    private void jTextFieldRechercheFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldRechercheFocusGained
        
    }//GEN-LAST:event_jTextFieldRechercheFocusGained

    private void recuperation_donnees() {
        
        //ajouter les colonnes à notre nouveau tableau
//        model.addColumn("ID");
//        model.addColumn("Name");
//        model.addColumn("Prenom");
//        model.addColumn("Date Naissance");
//        model.addColumn("Adresse");

        try {
          
            Statement stmt = conn.createStatement();
            //exécutation de la requête
            ResultSet rs = stmt.executeQuery("SELECT * FROM PATIENT");
            //on ajoute à la ligne les informations de la tableau
            while (rs.next()) {
                Object[] row = new Object[]{rs.getInt("IDPATIENT"), rs.getString("NOM"), rs.getString("PRENOM"),rs.getDate("DATENAISSANCE"), rs.getString("ADRESSE")};
                model.addRow(row);
            }
            // on applique le model du defaulttable au jTable de l'interface
            jTableDMR.setModel(model);

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Si l'entrée est vide ou nulle, retourne la même chaîne
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1); // Met la première lettre en majuscule et concatène le reste de la chaîne
    }//test

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
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjout;
    private javax.swing.JButton jButtonDeconnexion;
    private javax.swing.JButton jButtonRecherche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBienvenue;
    private javax.swing.JLabel jLabelSession;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDMR;
    private javax.swing.JTextField jTextFieldRecherche;
    // End of variables declaration//GEN-END:variables
}
