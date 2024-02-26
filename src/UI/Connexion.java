/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import UI.Acceuil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import testjdbc.TestConnexionEtRequetes;

/**
 *
 * @author Sara
 */
public class Connexion extends javax.swing.JFrame {

    private Connection conn = null;
    boolean idcorrect;
    boolean mdpcorrect;

    private JFrame currentPage;

    /**
     * Creates new form NewJFrame
     */
    public Connexion() {
        initComponents();
//        String ID = null;
//        String MDP = null;
        idcorrect = false;
        mdpcorrect = false;
        currentPage = this;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99");
        } catch (SQLException ex) {
            Logger.getLogger(AjoutPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (conn != null) {
            System.out.println("Connexion établie");

            currentPage.setVisible(true);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextIdd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jTextMdp = new javax.swing.JPasswordField();
        jLabelIdd = new javax.swing.JLabel();
        jLabelMdp = new javax.swing.JLabel();
        jButtonConnexion = new javax.swing.JButton();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/house-princeton-plainsboro-brand-a-transparent.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Galvji", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenue sur votre espace de connexion");

        jTextIdd.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/house-princeton-plainsboro-brand-a-transparent.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Galvji", 1, 18)); // NOI18N
        jLabel4.setText("Bienvenue sur votre espace de connexion");

        jTextId.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N

        jTextMdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMdpActionPerformed(evt);
            }
        });

        jLabelIdd.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N
        jLabelIdd.setText("Identifiant");

        jLabelMdp.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N
        jLabelMdp.setText("Mot de passe");

        jButtonConnexion.setText("Connexion");
        jButtonConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnexionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelIdd)
                            .addComponent(jLabelMdp))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextMdp, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(jTextId))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jButtonConnexion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelIdd))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMdp)))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jButtonConnexion)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextMdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMdpActionPerformed

    private void jButtonConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnexionActionPerformed
        // Récupération des identifiants et des mots de passe saisis par l'utilisateur
        String IDSaisi = jTextId.getText();
        String MDPSaisi = jTextMdp.getText();

// Affichage des valeurs saisies pour débogage
        System.out.println(jTextId.getText());
        System.out.println(IDSaisi);
        System.out.println(jTextMdp.getText());
        System.out.println(MDPSaisi);

// Initialisation des variables pour vérifier l'identifiant et le mot de passe
        String ID = "";
        String MDP = "";
        boolean idcorrect = false;
        boolean mdpcorrect = false;

        try {
            Statement stID;
            Statement stMDP;

            try {
                // Récupération des identifiants de la base de données
                stID = conn.createStatement();
                String query = "SELECT ID FROM PERSONNEL";
                ResultSet rs = stID.executeQuery(query);

                // Vérification de l'existence de l'identifiant saisi dans la base de données
                while (rs.next()) {
                    ID = rs.getString("ID");
                    if (IDSaisi.equals(ID)) {
                        idcorrect = true;
                    }
                }

                // Récupération du mot de passe correspondant à l'identifiant saisi
                stMDP = conn.createStatement();
                String query1 = "SELECT MDP FROM PERSONNEL WHERE ID=?";
                try ( PreparedStatement ps = conn.prepareStatement(query1)) {
                    ps.setString(1, IDSaisi);
                    ResultSet rs1 = ps.executeQuery();

                    // Vérification de l'existence du mot de passe saisi dans la base de données
                    while (rs1.next()) {
                        MDP = rs1.getString("MDP").trim(); // Suppression des espaces inutiles
                        if (MDP.equals(MDPSaisi)) {
                            mdpcorrect = true;
                        }
                    }
                } catch (SQLException ex) {
                    // Gestion des erreurs liées à la requête SQL
                    Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
                }

                // Si l'identifiant et le mot de passe sont corrects, ouvrir une nouvelle page d'accueil
                if (idcorrect && mdpcorrect) {
                    Acceuil nouveauJFrame = new Acceuil();
                    nouveauJFrame.setVisible(true);
                    dispose();
                } else {
                    // Sinon, afficher un message d'erreur
                    System.out.println("Connexion impossible");
                    JOptionPane.showMessageDialog(Connexion.this,
                            "Identifiant ou mot de passe invalide",
                            "Erreur de connexion", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException ex) {
                // Gestion des erreurs liées à la connexion à la base de données
                Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
            }

        } finally {
            // Fermeture de la connexion à la base de données dans le bloc finally
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
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextIdd;
    private javax.swing.JPasswordField jTextMdp;
    // End of variables declaration//GEN-END:variables
}
