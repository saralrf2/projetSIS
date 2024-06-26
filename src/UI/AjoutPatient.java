package UI;

import CommunicationSQL.CreationPatient;
import CommunicationSQL.GestionnaireCommunicationSQL;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projetsis.DateSIS;

public class AjoutPatient extends javax.swing.JFrame {

    Connection conn;

    public AjoutPatient() {
        initComponents();

        jComboBoxAnnee.addItem("2024");
        jComboBoxAnnee.addItem("1990");
        jComboBoxAnnee.addItem("1991");
        jComboBoxAnnee.addItem("1992");
        jComboBoxAnnee.addItem("1993");
        jComboBoxAnnee.addItem("1994");
        jComboBoxAnnee.addItem("1995");
        jComboBoxAnnee.addItem("1996");
        jComboBoxAnnee.addItem("1997");
        jComboBoxAnnee.addItem("1998");
        jComboBoxAnnee.addItem("1999");
        conn = GestionnaireCommunicationSQL.obtenirConnexion();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNumIdd = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jLabelDateNaissance = new javax.swing.JLabel();
        jLabelGenre = new javax.swing.JLabel();
        jLabelAdresse = new javax.swing.JLabel();
        jTextFieldNumIdd = new javax.swing.JTextField();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jRadioButtonFeminin = new javax.swing.JRadioButton();
        jRadioButtonHomme = new javax.swing.JRadioButton();
        jComboBoxJour = new javax.swing.JComboBox<String>();
        jComboBoxMois = new javax.swing.JComboBox<String>();
        jComboBoxAnnee = new javax.swing.JComboBox<String>();
        jTextFieldAdresse = new javax.swing.JTextField();
        jButtonAjout = new javax.swing.JButton();
        jButtonRetour = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabel1.setText("Numéro d'identification :");

        jLabel2.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabel2.setText("Nom : ");

        jLabel3.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabel3.setText("Prénom : ");

        jLabel4.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabel4.setText("Date de naissance :");

        jLabel5.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabel5.setText("Adresse : ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ajout Patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 18)))); // NOI18N

        jLabelNumIdd.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabelNumIdd.setText("Numéro d'identification :");

        jLabelNom.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabelNom.setText("Nom :");

        jLabelPrenom.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabelPrenom.setText("Prénom :");

        jLabelDateNaissance.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabelDateNaissance.setText("Date de naissance :");

        jLabelGenre.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabelGenre.setText("Genre : ");

        jLabelAdresse.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabelAdresse.setText("Adresse :");

        jRadioButtonFeminin.setText("F");

        jRadioButtonHomme.setText("H");

        jComboBoxJour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "11 ", "12 ", "13 ", "14 ", "15 ", "16 ", "17 ", "18 ", "19 ", "20 ", "21 ", "22 ", "23 ", "24 ", "25 ", "26 ", "27 ", "28 ", "29 ", "30 ", "31" }));

        jComboBoxMois.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));

        jComboBoxAnnee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2002", "2001", " " }));

        jButtonAjout.setBackground(new java.awt.Color(76, 133, 160));
        jButtonAjout.setFont(new java.awt.Font("Galvji", 0, 13)); // NOI18N
        jButtonAjout.setText("Ajouter");
        jButtonAjout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAjout.setBorderPainted(false);
        jButtonAjout.setMaximumSize(new java.awt.Dimension(57, 23));
        jButtonAjout.setMinimumSize(new java.awt.Dimension(57, 23));
        jButtonAjout.setPreferredSize(new java.awt.Dimension(57, 23));
        jButtonAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjoutActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNumIdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumIdd, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPrenom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelDateNaissance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxJour, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelGenre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFeminin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonHomme))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelAdresse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumIdd)
                    .addComponent(jTextFieldNumIdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNom)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrenom)
                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDateNaissance)
                    .addComponent(jComboBoxJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGenre)
                    .addComponent(jRadioButtonFeminin)
                    .addComponent(jRadioButtonHomme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAdresse)
                    .addComponent(jTextFieldAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButtonAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutActionPerformed

        int id = parseInt(jTextFieldNumIdd.getText());
        String nom = jTextFieldNom.getText();
        String prenom = jTextFieldPrenom.getText();
        String adresse = jTextFieldAdresse.getText();

        String jourCombo = jComboBoxJour.getSelectedItem().toString().trim();
        String moisCombo = jComboBoxMois.getSelectedItem().toString().trim();;
        String anneeCombo = jComboBoxAnnee.getSelectedItem().toString().trim();
        String dateCombo = anneeCombo + "-" + moisCombo + "-" + jourCombo;

        //conversion de la date de naissance en type DateSIS
        String[] composantesDate = dateCombo.split("-");
        int annee = Integer.parseInt(composantesDate[0]);
        int mois = Integer.parseInt(composantesDate[1]);
        int jour = Integer.parseInt(composantesDate[2]);

        DateSIS dateNaissance = new DateSIS(jour, mois, annee);

        CreationPatient nouveauPatient = new CreationPatient(id, nom, prenom, dateNaissance, adresse);

        // Établir une connexion à la base de données et préparer une requête d'insertion
        try {
            String sql = "INSERT INTO PATIENT (IDPATIENT, NOM, PRENOM, DATENAISSANCE, ADRESSE) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            // Appeler la méthode CreerPatient() pour insérer les données dans la base de données
            nouveauPatient.CreerPatient(preparedStatement);

            // Fermer la connexion
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IllegalArgumentException e) {
            if (e.getMessage().equals("L'ID du patient dépasse la valeur maximale autorisée.")) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "L'ID du patient dépasse la valeur maximale autorisée.", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Date de naissance postérieure à la date du jour", JOptionPane.ERROR_MESSAGE);
            }
        }

        AccueilPH nouveauJFrame = new AccueilPH();
        nouveauJFrame.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButtonAjoutActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjout;
    private javax.swing.JButton jButtonRetour;
    private javax.swing.JComboBox<String> jComboBoxAnnee;
    private javax.swing.JComboBox<String> jComboBoxJour;
    private javax.swing.JComboBox<String> jComboBoxMois;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAdresse;
    private javax.swing.JLabel jLabelDateNaissance;
    private javax.swing.JLabel jLabelGenre;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelNumIdd;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFeminin;
    private javax.swing.JRadioButton jRadioButtonHomme;
    private javax.swing.JTextField jTextFieldAdresse;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldNumIdd;
    private javax.swing.JTextField jTextFieldPrenom;
    // End of variables declaration//GEN-END:variables
}
