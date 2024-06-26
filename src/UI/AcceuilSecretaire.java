package UI;

import CommunicationSQL.GestionnaireCommunicationSQL;
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
 * Classe représentant l'interface principale pour le secrétaire.
 */
public class AcceuilSecretaire extends javax.swing.JFrame {

    Connection conn;

    private DefaultTableModel model;

    /**
     * Constructeur par défaut de la classe AcceuilSecretaire. Initialise les
     * composants graphiques de l'interface et récupère les données depuis la
     * base de données.
     */
    public AcceuilSecretaire() {
        initComponents();// Initialisation des composants graphiques
        model = new DefaultTableModel(new Object[]{"ID", "Nom", "Prénom", "Date Naissance", "Adresse"}, 0);
        jTableDMR.setModel(model); // Appliquer le modèle au jTableDMR
        jTableDMR.setDefaultEditor(Object.class, null); // Rendre toutes les cellules non éditables

        conn = GestionnaireCommunicationSQL.obtenirConnexion(); // Obtenir la connexion à la base de données

        recuperation_donnees(); // Récupérer les données de la base de données

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDMR = new javax.swing.JTable();
        jButtonDeconnexion = new javax.swing.JButton();
        jTextFieldRecherche = new javax.swing.JTextField();
        jButtonAjoutPatient = new javax.swing.JButton();
        jButtonRecherche = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(173, 200, 213));
        jPanel1.setPreferredSize(new java.awt.Dimension(468, 465));

        jTableDMR.setFont(new java.awt.Font("Galvji", 0, 13)); // NOI18N
        jTableDMR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableDMR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDMRMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDMR);

        jButtonDeconnexion.setBackground(new java.awt.Color(255, 153, 153));
        jButtonDeconnexion.setFont(new java.awt.Font("Galvji", 0, 13)); // NOI18N
        jButtonDeconnexion.setText("Déconnexion");
        jButtonDeconnexion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDeconnexion.setBorderPainted(false);
        jButtonDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeconnexionActionPerformed(evt);
            }
        });

        jTextFieldRecherche.setFont(new java.awt.Font("Galvji", 0, 13)); // NOI18N

        jButtonAjoutPatient.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAjoutPatient.setFont(new java.awt.Font("Galvji", 0, 13)); // NOI18N
        jButtonAjoutPatient.setText("Ajouter");
        jButtonAjoutPatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAjoutPatient.setBorderPainted(false);
        jButtonAjoutPatient.setMaximumSize(new java.awt.Dimension(89, 22));
        jButtonAjoutPatient.setMinimumSize(new java.awt.Dimension(89, 22));
        jButtonAjoutPatient.setPreferredSize(new java.awt.Dimension(89, 22));
        jButtonAjoutPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjoutPatientActionPerformed(evt);
            }
        });

        jButtonRecherche.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRecherche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/loupe.png"))); // NOI18N
        jButtonRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRecherche)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAjoutPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                        .addGap(21, 21, 21))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRecherche, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldRecherche, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAjoutPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButtonDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/RadioTech Petite.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Galvji", 3, 18)); // NOI18N
        jLabel2.setText("Bienvenue dans votre espace");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } else if (choix == JOptionPane.CANCEL_OPTION || choix == JOptionPane.CLOSED_OPTION) {
            // Action si l'utilisateur clique sur "Annuler" ou ferme la boîte de dialogue
            JOptionPane.getRootFrame().dispose();
        }
    }//GEN-LAST:event_jButtonDeconnexionActionPerformed

    private void jTableDMRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDMRMouseClicked
        if (evt.getClickCount() == 2) { // Double clic sur une ligne

            int ligneSelectionnee = jTableDMR.getSelectedRow();// récuperation information de la ligne sélectionnée

            //information de la ligne sélectionnée
            int idpatient = Integer.parseInt(jTableDMR.getValueAt(ligneSelectionnee, 0).toString());
            String nom = jTableDMR.getValueAt(ligneSelectionnee, 1).toString();
            String prenom = jTableDMR.getValueAt(ligneSelectionnee, 2).toString();
            Date datenaissance = Date.valueOf(jTableDMR.getValueAt(ligneSelectionnee, 3).toString());
            String adresse = jTableDMR.getValueAt(ligneSelectionnee, 4).toString();
            //ouvrir la fiche patient avec les informations sélectionnées
            SecretaireDMR nouveauJFrame = new SecretaireDMR(idpatient, nom, prenom, datenaissance, adresse);
            this.setVisible(false);
            nouveauJFrame.setVisible(true);
            nouveauJFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            dispose();
        }
    }//GEN-LAST:event_jTableDMRMouseClicked

    private void jButtonAjoutPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutPatientActionPerformed
        AjoutPatient nouveauJFrame = new AjoutPatient();
        nouveauJFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAjoutPatientActionPerformed

    private void jButtonRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercheActionPerformed
        String rech = jTextFieldRecherche.getText();
        System.out.println(rech);

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTableDMR.setRowSorter(sorter);
        if (rech.length() == 0) {
            sorter.setRowFilter(null);
            JOptionPane.showMessageDialog(this,
                    "Aucun Patient n'a été recherché",
                    "Erreur de recherche", JOptionPane.ERROR_MESSAGE);
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

        }

    }//GEN-LAST:event_jButtonRechercheActionPerformed
    /**
     * Méthode pour récupérer les données des patients depuis la base de données
     * et les afficher dans le tableau.
     */
    private void recuperation_donnees() {

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PATIENT");
            // Ajouter les données récupérées dans le modèle de la table
            while (rs.next()) {
                Object[] row = new Object[]{rs.getInt("IDPATIENT"), rs.getString("NOM"), rs.getString("PRENOM"), rs.getDate("DATENAISSANCE"), rs.getString("ADRESSE")};
                model.addRow(row);// Ajouter la ligne au modèle de la table

            }

            jTableDMR.setModel(model);// Appliquer le modèle de table avec les données au jTableDMR

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Méthode pour mettre en majuscule la première lettre d'une chaîne de
     * caractères.
     *
     * @param input Chaîne de caractères à traiter
     * @return Chaîne de caractères avec la première lettre en majuscule
     */
    private String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Si l'entrée est vide ou nulle, retourne la même chaîne
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1); // Met la première lettre en majuscule et concatène le reste de la chaîne
    }

    /**
     * Méthode principale pour démarrer l'interface AcceuilSecretaire.
     *
     * @param args les arguments de la ligne de commande (non utilisés dans
     * cette application)
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
            java.util.logging.Logger.getLogger(AcceuilSecretaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcceuilSecretaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcceuilSecretaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcceuilSecretaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcceuilSecretaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjoutPatient;
    private javax.swing.JButton jButtonDeconnexion;
    private javax.swing.JButton jButtonRecherche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDMR;
    private javax.swing.JTextField jTextFieldRecherche;
    // End of variables declaration//GEN-END:variables
}
