package UI;

import CommunicationSQL.GestionnaireCommunicationSQL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * Cette classe représente l'interface graphique pour consulter le dossier
 * médical de radiologie d'un patient.
 */
public class DossierMedicalRadiologie extends javax.swing.JFrame {

    private Connection conn; // Objet de connexion à la base de données
    private int idPatient; // Identifiant du patient
    private String nom; // Nom du patient
    private String prenom; // Prénom du patient
    private Date datenaissance; // Date de naissance du patient
    private String adresse; // Adresse du patient
    private int idActe; // Identifiant de l'acte sélectionné

    private DefaultTableModel model; // Modèle de tableau pour afficher les données

    /**
     * Constructeur de la classe DossierMedicalRadiologie.
     *
     * @param idpatient Identifiant du patient
     * @param nom Nom du patient
     * @param prenom Prénom du patient
     * @param datenaissance Date de naissance du patient
     * @param adresse Adresse du patient
     */
    public DossierMedicalRadiologie(int idpatient, String nom, String prenom, Date datenaissance, String adresse) {
        initComponents(); // Initialisation des composants de l'interface

        // Initialisation du modèle de tableau avec des colonnes spécifiques
        model = new DefaultTableModel(new Object[]{"IDACTE", "CODE ACTE", "TARIFICATION", "Date Acte", "PRATICIEN", "Signification du Code"}, 0);
        jTableDMR.setModel(model); // Appliquer le modèle au jTableDMR
        jTableDMR.setDefaultEditor(Object.class, null); // Rendre toutes les cellules non éditables
        conn = GestionnaireCommunicationSQL.obtenirConnexion(); // Obtenir la connexion à la base de données

        // Initialisation des informations du patient
        this.idPatient = idpatient;
        this.datenaissance = datenaissance;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;

        // Affichage des informations du patient sur l'interface
        infoID.setText(String.valueOf(this.idPatient));
        infoNom.setText(this.nom);
        infoPrenom.setText(this.prenom);
        infoDate.setText(this.datenaissance.toString());
        infoAdresse.setText(this.adresse);

        // Récupération des données des actes radiologiques du patient
        recuperation_donnees();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        infoID = new javax.swing.JLabel();
        infoNom = new javax.swing.JLabel();
        infoPrenom = new javax.swing.JLabel();
        infoDate = new javax.swing.JLabel();
        infoAdresse = new javax.swing.JLabel();
        jButtonRetour = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableDMR = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButtonRecherche = new javax.swing.JButton();
        jTextFieldRecherche = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dossier médical de radiologie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 18)))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(173, 200, 213));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informations patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 13)))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabel1.setText("Numéro d'identification Patient :");

        jLabel2.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabel2.setText("Nom : ");

        jLabel3.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabel3.setText("Prénom : ");

        jLabel4.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabel4.setText("Date de naissance :");

        jLabel5.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabel5.setText("Adresse : ");

        infoID.setText("infoID");

        infoNom.setText("infoNom");

        infoPrenom.setText("infoPrenom");

        infoDate.setText("infoDate");

        infoAdresse.setText("infoAdresse");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoID))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoNom))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoPrenom))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoDate))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoAdresse)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(infoID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(infoNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(infoPrenom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(infoDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(infoAdresse))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonRetour.setBackground(new java.awt.Color(76, 133, 160));
        jButtonRetour.setFont(new java.awt.Font("Galvji", 0, 13)); // NOI18N
        jButtonRetour.setText("Retour");
        jButtonRetour.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRetour.setBorderPainted(false);
        jButtonRetour.setMaximumSize(new java.awt.Dimension(57, 23));
        jButtonRetour.setMinimumSize(new java.awt.Dimension(57, 23));
        jButtonRetour.setPreferredSize(new java.awt.Dimension(57, 23));
        jButtonRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetourActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(173, 200, 213));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des examens", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 13)))); // NOI18N

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
        jScrollPane4.setViewportView(jTableDMR);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Galvji", 0, 13)); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(57, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(57, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(57, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonRecherche.setBackground(new java.awt.Color(255, 255, 255));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRecherche)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRecherche)
                    .addComponent(jTextFieldRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 197, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtonRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetourActionPerformed
        AccueilPH nouveauJFrame = new AccueilPH();
        nouveauJFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRetourActionPerformed

    private void jTableDMRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDMRMouseClicked

        if (evt.getClickCount() == 2) { // Double clic sur une ligne

            int ligneSelectionnee = jTableDMR.getSelectedRow();// récuperation information de la ligne sélectionnée

            //information de la ligne sélectionnée
            int idActe = Integer.parseInt(jTableDMR.getValueAt(ligneSelectionnee, 0).toString());
            String codeActe = jTableDMR.getValueAt(ligneSelectionnee, 1).toString();
            String nomPracticien = jTableDMR.getValueAt(ligneSelectionnee, 4).toString();
            Date dateActe = Date.valueOf(jTableDMR.getValueAt(ligneSelectionnee, 3).toString());
            double tarification = (double) jTableDMR.getValueAt(ligneSelectionnee, 2);
            String acte = jTableDMR.getValueAt(ligneSelectionnee, 5).toString();

            // Récupération de l'image correspondant à l'acte depuis la base de données
            byte[] imageData = getImageFromDatabase(getIdActe());

            // Création de la JFrame pour afficher les détails de l'acte
            Acte nouveauJFrame = new Acte(this, idActe, codeActe, nomPracticien, dateActe, tarification, acte, imageData);

            // Obtenez le JLabel depuis la classe Acte
            JLabel ImageBrain = nouveauJFrame.getImageBrain();

            if (imageData != null) {
                // Convertir les données de l'image en ImageIcon
                ImageIcon imageIcon = new ImageIcon(imageData);
                // Mettre à jour le JLabel pour afficher l'image
                ImageBrain.setIcon(imageIcon);
            } else {
                // Si aucune image n'est disponible, définir l'icône du JLabel sur null
                ImageBrain.setIcon(null);
            }

            this.setVisible(false);
            nouveauJFrame.setVisible(true);
            nouveauJFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jTableDMRMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AjoutActe nouveauJFrame = new AjoutActe(this);
        this.setVisible(false);
        nouveauJFrame.setVisible(true);
        nouveauJFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercheActionPerformed

        String recherche = jTextFieldRecherche.getText();
        String rech = capitalizeFirstLetter(recherche);

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
        // Vérifie si aucun DMR ne correspond à la recherche
        if (jTableDMR.getRowCount() == 0) {
            // Afficher une fenêtre de message d'erreur
            JOptionPane.showMessageDialog(this, "Aucun acte ne correspond à votre recherche.", "Erreur de Recherche", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonRechercheActionPerformed

    private String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Si l'entrée est vide ou nulle, retourne la même chaîne
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1); // Met la première lettre en majuscule et concatène le reste de la chaîne
    }

    private byte[] getImageFromDatabase(int idActe) {
        byte[] imageData = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // Établir une connexion à la base de données
            connection = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99");
            // Requête SQL pour récupérer les données de l'image en fonction de l'ID de l'acte
            String sql = "SELECT image FROM Imagees WHERE IDACTE = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idActe);
            resultSet = statement.executeQuery();
            // Si une ligne est trouvée, récupérer les données de l'image
            if (resultSet.next()) {
                imageData = resultSet.getBytes("image");
                System.out.println("Taille des données d'image récupérées : " + imageData.length);
                System.out.println("Image affichée");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gérer les exceptions selon votre cas d'utilisation
        } finally {
            // Fermer les ressources JDBC
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return imageData;
    }

    /**
     * Méthode pour récupérer les données des actes radiologiques du patient
     * depuis la base de données.
     */
    private void recuperation_donnees() {
        try {
            Statement stmt = conn.createStatement();
            // Exécution de la requête SQL pour récupérer les actes radiologiques du patient
            ResultSet rs = stmt.executeQuery("SELECT * FROM ACTERADIO WHERE IDPATIENT = " + getIdPatient());
            // Ajout des résultats dans le modèle de tableau
            while (rs.next()) {
                Object[] row = new Object[]{rs.getInt("IDACTE"), rs.getString("CODEACTE"), rs.getDouble("TARIFICATION"), rs.getDate("DATEACTE"), rs.getString("PRATICIEN"), rs.getString("SIGNIFICATIONCODE")};
                model.addRow(row);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Affichage de l'erreur SQL
        }
    }

    /**
     * Méthode principale pour démarrer l'application.
     *
     * @param args Arguments de la ligne de commande
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
            java.util.logging.Logger.getLogger(DossierMedicalRadiologie.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DossierMedicalRadiologie.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DossierMedicalRadiologie.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DossierMedicalRadiologie.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new DMR().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel infoAdresse;
    private javax.swing.JLabel infoDate;
    private javax.swing.JLabel infoID;
    private javax.swing.JLabel infoNom;
    private javax.swing.JLabel infoPrenom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRecherche;
    private javax.swing.JButton jButtonRetour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableDMR;
    private javax.swing.JTextField jTextFieldRecherche;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the idPatient
     */
    public int getIdActe() {
        // Récupérer l'indice de la ligne sélectionnée dans le tableau
        int ligneSelectionnee = jTableDMR.getSelectedRow();

        // Si aucune ligne n'est sélectionnée, retourner une valeur par défaut
        if (ligneSelectionnee == -1) {
            return -1; // Ou une autre valeur par défaut selon votre logique
        }

        // Récupérer l'ID de l'acte dans la colonne IDACTE (colonne 0) de la ligne sélectionnée
        int idActe = Integer.parseInt(jTableDMR.getValueAt(ligneSelectionnee, 0).toString());

        return idActe;
    }

    public int getIdPatient() {
        return this.idPatient;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @return the datenaissance
     */
    public Date getDatenaissance() {
        return datenaissance;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }
}
