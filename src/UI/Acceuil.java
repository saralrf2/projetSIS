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
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author alexiaidrac
 */
public class Acceuil extends javax.swing.JFrame {

    /**
     * Creates new form Acceuil
     */
    public Acceuil() {
        initComponents();
        recuperation_donnees();
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
        jPanel2 = new javax.swing.JPanel();
        jTextFieldRecherche = new javax.swing.JTextField();
        jButtonAjout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDMR = new javax.swing.JTable();
        jButtonDeconnexion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabelBienvenue.setFont(new java.awt.Font("Galvji", 3, 18)); // NOI18N
        jLabelBienvenue.setText("Bienvenue dans votre espace");

        jLabelSession.setFont(new java.awt.Font("Galvji", 1, 14)); // NOI18N
        jLabelSession.setText("Session :");

        jLabel3.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBienvenue)
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSession)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSession)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabelBienvenue)
                .addGap(19, 19, 19))
        );

        jPanel2.setBackground(new java.awt.Color(182, 210, 219));

        jTextFieldRecherche.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N
        jTextFieldRecherche.setText("Recherche");
        jTextFieldRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRechercheActionPerformed(evt);
            }
        });

        jButtonAjout.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N
        jButtonAjout.setText("Ajouter");
        jButtonAjout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jButtonDeconnexion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeconnexionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldRecherche)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAjout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(jButtonDeconnexion)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutActionPerformed
        AjoutPatient nouveauJFrame = new AjoutPatient();
        nouveauJFrame.setVisible(true);     
        
    }//GEN-LAST:event_jButtonAjoutActionPerformed

    private void jTextFieldRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRechercheActionPerformed

    private void jButtonDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeconnexionActionPerformed
        Connexion nouveauJFrame = new Connexion();
        nouveauJFrame.setVisible(true);     
        dispose();
    }//GEN-LAST:event_jButtonDeconnexionActionPerformed

    private void jTableDMRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDMRMouseClicked
        int ligne = jTableDMR.getSelectedRow(); //récuperation information ligne
        int colonne = jTableDMR.getSelectedColumn(); // récuperation information colonne
        if (evt.getClickCount() == 2) { // Double clic sur une ligne
            
            int ligneSelectionnee = jTableDMR.getSelectedRow();// récuperation information de la ligne sélectionnée
            
                //information de la ligne sélectionnée
                int idpatient = Integer.parseInt(jTableDMR.getValueAt(ligneSelectionnee, 0).toString());
                String nom = jTableDMR.getValueAt(ligneSelectionnee, 1).toString();
                String prenom = jTableDMR.getValueAt(ligneSelectionnee, 2).toString();
                Date datenaissance = Date.valueOf(jTableDMR.getValueAt(ligneSelectionnee, 3).toString());
                String adresse = jTableDMR.getValueAt(ligneSelectionnee, 4).toString();
                
                
                Object data = jTableDMR.getValueAt(ligne, colonne);
                
//                //ouvrir la fiche patient avec les informations sélectionnées

                DMR nouveauJFrame = new DMR(idpatient, nom, prenom, datenaissance, adresse);
                nouveauJFrame.setVisible(true);
                nouveauJFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
               
        }

    }//GEN-LAST:event_jTableDMRMouseClicked

    private void recuperation_donnees() {
        DefaultTableModel model = new DefaultTableModel(){
            public boolean isCellEditable(int row, int column) {
            return false; // Rend toutes les cellules non éditables
        }
        };
        //ajouter les colonnes à notre nouveau tableau
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Prenom");
        model.addColumn("Date Naissance");
        model.addColumn("Adresse");

        try {
            //connexion à la base de donnée
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99");
            
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBienvenue;
    private javax.swing.JLabel jLabelSession;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDMR;
    private javax.swing.JTextField jTextFieldRecherche;
    // End of variables declaration//GEN-END:variables
}
