package UI;

import CommunicationSQL.GestionnaireCommunicationSQL;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SecretaireDMR extends javax.swing.JFrame {

    Connection conn;
    private int idPatient;
    private String nom;
    private String prenom;
    private Date datenaissance;
    private String adresse;

    private DefaultTableModel model;

    public SecretaireDMR(int idpatient, String nom, String prenom, Date datenaissance, String adresse) {
        initComponents();
        String idPatient = String.valueOf(idpatient);
        String dateNaissance = datenaissance.toString();

        infoID.setText(idPatient);
        infoNom.setText(nom);
        infoPrenom.setText(prenom);
        infoDate.setText(dateNaissance);
        infoAdresse.setText(adresse);

        model = new DefaultTableModel(new Object[]{"IDACTE", "CODE ACTE", "TARIFICATION", "Date Acte", "PRATICIEN"}, 0);
        jTableListeActes.setModel(model); // Appliquer le modèle au jTableListeActes
        jTableListeActes.setDefaultEditor(Object.class, null); // Rendre toutes les cellules non éditables
        conn = GestionnaireCommunicationSQL.obtenirConnexion();

        this.idPatient = idpatient;
        this.datenaissance = datenaissance;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        infoID.setText(String.valueOf(this.idPatient));
        infoNom.setText(this.nom);
        infoPrenom.setText(this.prenom);
        infoDate.setText(this.datenaissance.toString());
        infoAdresse.setText(this.adresse);

        System.out.println("constr = " + idpatient);

        recuperation_donnees();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelNumIDD = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        infoID = new javax.swing.JLabel();
        infoNom = new javax.swing.JLabel();
        infoPrenom = new javax.swing.JLabel();
        infoDate = new javax.swing.JLabel();
        infoAdresse = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanelActes = new javax.swing.JPanel();
        jTextFieldRecherche = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListeActes = new javax.swing.JTable();
        jButtonRechercheActe = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dossier médical radiologique", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 18)))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(173, 200, 213));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informations patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 12)))); // NOI18N

        jLabelNumIDD.setFont(new java.awt.Font("Galvji", 2, 13)); // NOI18N
        jLabelNumIDD.setText("Numero d'identification :");

        jLabel2.setFont(new java.awt.Font("Galvji", 2, 13)); // NOI18N
        jLabel2.setText("Nom :");

        jLabel3.setFont(new java.awt.Font("Galvji", 2, 13)); // NOI18N
        jLabel3.setText("Prenom :");

        jLabel4.setFont(new java.awt.Font("Galvji", 2, 13)); // NOI18N
        jLabel4.setText("Date de naissance :");

        jLabel5.setFont(new java.awt.Font("Galvji", 2, 13)); // NOI18N
        jLabel5.setText("Adresse :");

        infoID.setText("jLabel6");

        infoNom.setText("jLabel7");

        infoPrenom.setText("jLabel8");

        infoDate.setText("jLabel9");

        infoAdresse.setText("jLabel10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelNumIDD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoID))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoNom))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoPrenom))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoDate))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoAdresse)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumIDD)
                    .addComponent(infoID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(infoNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(infoPrenom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(infoDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(infoAdresse))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Galvji", 0, 13)); // NOI18N
        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanelActes.setBackground(new java.awt.Color(173, 200, 213));
        jPanelActes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des examens", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 12)))); // NOI18N

        jTableListeActes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Code", "Signification", "Tarification", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListeActes);

        jButtonRechercheActe.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRechercheActe.setFont(new java.awt.Font("Galvji", 0, 13)); // NOI18N
        jButtonRechercheActe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/loupe.png"))); // NOI18N
        jButtonRechercheActe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercheActeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelActesLayout = new javax.swing.GroupLayout(jPanelActes);
        jPanelActes.setLayout(jPanelActesLayout);
        jPanelActesLayout.setHorizontalGroup(
            jPanelActesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelActesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRechercheActe, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelActesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelActesLayout.setVerticalGroup(
            jPanelActesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelActesLayout.createSequentialGroup()
                .addGroup(jPanelActesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelActesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonRechercheActe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelActes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanelActes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton1))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AcceuilSecretaire nouveauJFrame = new AcceuilSecretaire();
        nouveauJFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonRechercheActeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercheActeActionPerformed

        String recherche = jTextFieldRecherche.getText();
        String rech = capitalizeFirstLetter(recherche);

        System.out.println(rech);

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTableListeActes.setRowSorter(sorter);
        if (rech.length() == 0) {
            sorter.setRowFilter(null);
            System.out.println("ça ne correspond à aucun acte");
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
            System.out.println("acte trouvé.");
        }

    }//GEN-LAST:event_jButtonRechercheActeActionPerformed

    private String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Si l'entrée est vide ou nulle, retourne la même chaîne
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1); // Met la première lettre en majuscule et concatène le reste de la chaîne
    }

    /**
     * @param args the command line arguments
     */

    private void recuperation_donnees() {

        System.out.println("get = " + getIdPatient());
        try {

            Statement stmt = conn.createStatement();
            //exécutation de la requête
            ResultSet rs = stmt.executeQuery("SELECT IDACTE, CODEACTE, TARIFICATION, DATEACTE, PRATICIEN FROM ACTERADIO WHERE IDPATIENT = " + getIdPatient());
            //on ajoute à la ligne les informations de la tableau
            while (rs.next()) {
                Object[] row = new Object[]{rs.getInt("IDACTE"), rs.getString("CODEACTE"), rs.getDouble("TARIFICATION"), rs.getDate("DATEACTE"), rs.getString("PRATICIEN")};
                model.addRow(row);
            }
            // on applique le model du defaulttable au jTable de l'interface
            jTableListeActes.setModel(model);

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(SecretaireDMR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecretaireDMR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecretaireDMR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecretaireDMR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SecretaireDMR().setVisible(true);
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
    private javax.swing.JButton jButtonRechercheActe;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelNumIDD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelActes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListeActes;
    private javax.swing.JTextField jTextFieldRecherche;
    // End of variables declaration//GEN-END:variables

    public int getIdPatient() {
        return this.idPatient;
    }
}
