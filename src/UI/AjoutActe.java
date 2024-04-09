package UI;

import CommunicationSQL.CreationActe;
import CommunicationSQL.GestionnaireCommunicationSQL;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projetsis.DateSIS;

/**
 * Cette classe représente une fenêtre d'ajout d'acte radiologique dans
 * l'interface utilisateur.
 */
public class AjoutActe extends javax.swing.JFrame {

    /**
     * Connexion à la base de données.
     */
    Connection conn;
    /**
     * Objet représentant l'acte médical en cours d'ajout.
     */
    private DossierMedicalRadiologie acte;

    /**
     * Constructeur de la classe AjoutActe prenant un objet
     * DossierMedicalRadiologie en paramètre.
     *
     * @param acte Objet DossierMedicalRadiologie représentant l'acte en cours
     * d'ajout.
     */
    public AjoutActe(DossierMedicalRadiologie acte) { // Constructeur prenant en paramètre un objet acte de type DossierMedicalRadiologie
        initComponents(); // Initialisation des composants de l'interface graphique
        this.acte = acte; // Affectation de l'objet acte passé en paramètre à l'attribut acte de la classe
        IDActe1.setText(String.valueOf(acte.getIdPatient())); // Affichage de l'ID du patient dans le composant IDActe1
        conn = GestionnaireCommunicationSQL.obtenirConnexion(); // Récupération de la connexion à la base de données depuis le gestionnaire de communication SQL

        // Ajout des années dans la liste déroulante jComboBoxAnnee
        jComboBoxAnnee.addItem("2024");
        jComboBoxAnnee.addItem("2023");
        jComboBoxAnnee.addItem("2022");
        jComboBoxAnnee.addItem("2021");
        jComboBoxAnnee.addItem("2020");
    }
 /**
     * Constructeur par défaut de la classe AjoutActe.
     */
    public AjoutActe() {
        initComponents(); // Initialisation des composants de l'interface graphique
        conn = GestionnaireCommunicationSQL.obtenirConnexion(); // Récupération de la connexion à la base de données depuis le gestionnaire de communication SQL
    }

    /**
     * Méthode générée automatiquement pour initialiser les composants de l'interface graphique.
     * AVERTISSEMENT : Ne pas modifier le code généré par l'éditeur. Le contenu de cette méthode est toujours regénéré
     * par l'éditeur visuel.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        IDActe = new javax.swing.JLabel();
        NomduPracticien = new javax.swing.JLabel();
        Dateacte = new javax.swing.JLabel();
        jTextFieldidacte = new javax.swing.JTextField();
        jTextFieldNompracticien = new javax.swing.JTextField();
        jComboBoxJour = new javax.swing.JComboBox<String>();
        jComboBoxMois = new javax.swing.JComboBox<String>();
        jComboBoxAnnee = new javax.swing.JComboBox<String>();
        jButtonAjout = new javax.swing.JButton();
        jButtonRetour = new javax.swing.JButton();
        CodeACte = new javax.swing.JLabel();
        jTextFieldcodeacte = new javax.swing.JTextField();
        IDActe1 = new javax.swing.JLabel();

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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ajout Examen Radiologique", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 18)))); // NOI18N

        IDActe.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        IDActe.setText("ID Acte");

        NomduPracticien.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        NomduPracticien.setText("Nom du Practicien :");

        Dateacte.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        Dateacte.setText("Date de l'acte :");

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

        CodeACte.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        CodeACte.setText("Code Acte");

        IDActe1.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        IDActe1.setText("ID Patient");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(IDActe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldidacte, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CodeACte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldcodeacte, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NomduPracticien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNompracticien, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Dateacte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxJour, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(IDActe1))
                        .addGap(0, 198, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(IDActe1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDActe)
                    .addComponent(jTextFieldidacte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodeACte)
                    .addComponent(jTextFieldcodeacte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomduPracticien)
                    .addComponent(jTextFieldNompracticien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dateacte)
                    .addComponent(jComboBoxJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRetour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetourActionPerformed
        DossierMedicalRadiologie nouveauJFrame = acte;
        nouveauJFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRetourActionPerformed

    private void jButtonAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutActionPerformed
        int idacteradio = parseInt(jTextFieldidacte.getText());
        String codeacte = jTextFieldcodeacte.getText();
        String nom = jTextFieldNompracticien.getText();
        String significationcode = " ";
        int idpatient = acte.getIdPatient();

        String jourCombo = jComboBoxJour.getSelectedItem().toString().trim();
        String moisCombo = jComboBoxMois.getSelectedItem().toString().trim();;
        String anneeCombo = jComboBoxAnnee.getSelectedItem().toString().trim();
        String dateCombo = anneeCombo + "-" + moisCombo + "-" + jourCombo;

        //conversion de la date de naissance en type DateSIS
        String[] composantesDate = dateCombo.split("-");
        int annee = Integer.parseInt(composantesDate[0]);
        int mois = Integer.parseInt(composantesDate[1]);
        int jour = Integer.parseInt(composantesDate[2]);

        DateSIS date = new DateSIS(jour, mois, annee);

        CreationActe nouvelActe = new CreationActe(acte, idacteradio, codeacte, significationcode, nom, date, idpatient, 0.0);

        // Établir une connexion à la base de données et préparer une requête d'insertion
        try {
            String sql = "INSERT INTO ACTERADIO (IDACTE, CODEACTE, SIGNIFICATIONCODE, PRATICIEN, DATEACTE, IDPATIENT, TARIFICATION) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            // Appeler la méthode CreerPatient() pour insérer les données dans la base de données
            nouvelActe.CreerActe(preparedStatement);

            // Fermer la connexion
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IllegalArgumentException e) {
            if (e.getMessage().equals("L'ID de l'acte dépasse la valeur maximale autorisée.")) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "L'ID de l'acte dépasse la valeur maximale autorisée.", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Date de l'acte postérieure à la date du jour", JOptionPane.ERROR_MESSAGE);
            }
        }
        DossierMedicalRadiologie nouveauJFrame = new DossierMedicalRadiologie(acte.getIdPatient(), acte.getNom(), acte.getPrenom(), acte.getDatenaissance(), acte.getAdresse());
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
            java.util.logging.Logger.getLogger(AjoutActe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutActe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutActe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutActe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutActe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CodeACte;
    private javax.swing.JLabel Dateacte;
    private javax.swing.JLabel IDActe;
    private javax.swing.JLabel IDActe1;
    private javax.swing.JLabel NomduPracticien;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNompracticien;
    private javax.swing.JTextField jTextFieldcodeacte;
    private javax.swing.JTextField jTextFieldidacte;
    // End of variables declaration//GEN-END:variables
}
