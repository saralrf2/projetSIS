package UI;

import CommunicationSQL.GestionnaireCommunicationSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Classe représentant l'interface de connexion à l'application.
 */
public class Connexion extends javax.swing.JFrame {

    private Connection conn = null;
    boolean idcorrect;
    boolean mdpcorrect;

    private JFrame currentPage;

    /**
     * Constructeur par défaut de la classe Connexion. Initialise les composants
     * graphiques de l'interface et établit une connexion à la base de données.
     */
    public Connexion() {
        initComponents(); // Initialiser les composants de l'interface
        idcorrect = false; // Initialiser la variable d'identification à false
        mdpcorrect = false; // Initialiser la variable de mot de passe à false
        currentPage = this; // Référence à cette fenêtre

        // Obtenir une connexion à la base de données
        conn = GestionnaireCommunicationSQL.obtenirConnexion();
    }

    /**
     * Méthode pour initialiser les composants graphiques de l'interface.
     * (Méthode générée automatiquement par NetBeans)
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextIdd = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jLabelIdd = new javax.swing.JLabel();
        jLabelMdp = new javax.swing.JLabel();
        jTextMdp = new javax.swing.JPasswordField();
        jButtonConnexion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/house-princeton-plainsboro-brand-a-transparent.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Galvji", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenue sur votre espace de connexion");

        jTextIdd.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Galvji", 1, 18)); // NOI18N
        jLabel4.setText("Bienvenue sur votre espace de connexion");

        jTextId.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N

        jLabelIdd.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N
        jLabelIdd.setText("Identifiant");

        jLabelMdp.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N
        jLabelMdp.setText("Mot de passe");

        jButtonConnexion.setBackground(new java.awt.Color(76, 133, 160));
        jButtonConnexion.setFont(new java.awt.Font("Galvji", 0, 13)); // NOI18N
        jButtonConnexion.setText("Connexion");
        jButtonConnexion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 153)));
        jButtonConnexion.setBorderPainted(false);
        jButtonConnexion.setMaximumSize(new java.awt.Dimension(57, 23));
        jButtonConnexion.setMinimumSize(new java.awt.Dimension(57, 23));
        jButtonConnexion.setPreferredSize(new java.awt.Dimension(57, 23));
        jButtonConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnexionActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/house-princeton-plainsboro-brand-a-transparent.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jButtonConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelIdd)
                                .addComponent(jLabelMdp))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextMdp, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(254, 254, 254)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabelIdd))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelMdp))
                    .addContainerGap(53, Short.MAX_VALUE)))
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
   /**
     * Méthode appelée lors du clic sur le bouton de connexion. Vérifie les
     * identifiants saisis par l'utilisateur et ouvre l'interface appropriée.
     *
     * @param evt Événement d'action associé au clic sur le bouton de connexion
     */
    private void jButtonConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnexionActionPerformed
        // Récupération des identifiants et mots de passe saisis par l'utilisateur
        String IDSaisi = jTextId.getText();
        String MDPSaisi = jTextMdp.getText();

        // Initialisation des variables pour vérifier l'identifiant et le mot de passe
        String ID = " ";
        String MDP = " ";
        boolean idcorrect = false;
        boolean mdpcorrect = false;
        boolean posteSecretaire = false;

        try {
            // Création des statements pour exécuter les requêtes SQL
            Statement stID;
            Statement stMDP;
            Statement stPOSTE;

            // Récupération de l'identifiant de la base de données
            stID = conn.createStatement();
            String query = "SELECT ID FROM PERSONNEL";
            ResultSet rs = stID.executeQuery(query);

            // Vérification de l'existence de l'identifiant saisi dans la base de données
            while (rs.next()) {
                ID = rs.getString("ID");
                if (IDSaisi.equals(ID)) {
                    idcorrect = true; //Identifiant correct
                }
            }

            // Récupération du mot de passe correspondant à l'identifiant saisi
            stMDP = conn.createStatement();
            String query1 = "SELECT MDP FROM PERSONNEL WHERE ID=?";
            try (PreparedStatement ps = conn.prepareStatement(query1)) {
                ps.setString(1, IDSaisi);
                ResultSet rs1 = ps.executeQuery();

                // Vérification de l'existence du mot de passe saisi dans la base de données
                while (rs1.next()) {
                    MDP = rs1.getString("MDP").trim(); // Suppression des espaces inutiles
                    if (MDP.equals(MDPSaisi)) {
                        mdpcorrect = true;// Mot de passe correct
                    }
                }
            } catch (SQLException ex) {
                // Gestion des erreurs liées à la requête SQL
                Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Récupération du poste de la personne qui se connecte
            stPOSTE = conn.createStatement();
            String query2 = "SELECT POSTE FROM PERSONNEL WHERE ID=?";
            try (PreparedStatement ps = conn.prepareStatement(query2)) {
                ps.setString(1, IDSaisi);
                ResultSet rs2 = ps.executeQuery();
                // Vérification du poste de l'identifiant saisi dans la base de données
                while (rs2.next()) {
                    String poste = rs2.getString("POSTE").trim();
                    if ("Secretaire".equals(poste)) {
                        posteSecretaire = true;
                    }
                }

            } catch (SQLException ex) {
                // Gestion des erreurs liées à la requête SQL
                Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Ouverture de l'interface correspondante en fonction du poste
            if (idcorrect && mdpcorrect && posteSecretaire) {
                AcceuilSecretaire nouveauJFrame = new AcceuilSecretaire();
                nouveauJFrame.setVisible(true);
                dispose();// Fermer la fenêtre de connexion
            } else if (idcorrect && mdpcorrect) {
                AccueilPH nouveauJFrame = new AccueilPH();
                nouveauJFrame.setVisible(true);
                dispose(); // Fermer la fenêtre de connexion

            } else {
                // Affichage d'un message d'erreur si l'identifiant ou le mot de passe est invalide
                JOptionPane.showMessageDialog(Connexion.this,
                        "Identifiant ou mot de passe invalide",
                        "Erreur de connexion", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            // Gestion des erreurs liées à la connexion à la base de données
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Fermeture de la connexion à la base de données
            try {
                Statement st = conn.createStatement();
                if (st != null) {
                    st.close();
                }
            } catch (SQLException ex) {
                // Gestion des erreurs liées à la fermeture de la connexion
                Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButtonConnexionActionPerformed
    /**
     * Méthode principale pour démarrer l'interface de connexion.
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
            java.util.logging.Logger.getLogger(Connexion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connexion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connexion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connexion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnexion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelIdd;
    private javax.swing.JLabel jLabelMdp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextIdd;
    private javax.swing.JPasswordField jTextMdp;
    // End of variables declaration//GEN-END:variables
}
