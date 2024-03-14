/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;//cill
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;//cgvubh

/**
 *
 * @author alexiaidrac
 */
public class DossierMedicalRadiologie extends javax.swing.JFrame {

    Connection conn;
    private int idPatient;
    private String nom;
    private String prenom;
    private Date datenaissance;
    private String adresse;

    private BufferedImage originalImage;
    private BufferedImage modifiedImage;
    
    private int rotationAngle = 0; // Variable pour suivre l'angle de rotation
    /**
     * Creates new form Acceuil
     */
    private DefaultTableModel model;

    public DossierMedicalRadiologie(int idpatient, String nom, String prenom, Date datenaissance, String adresse) {
        initComponents();
        model = new DefaultTableModel(new Object[]{"IDACTE", "CODE ACTE", "TARIFICATION", "Date Acte", "PRATICIEN", "Signification du Code"}, 0);
        jTableDMR.setModel(model); // Appliquer le modèle au jTableDMR
        jTableDMR.setDefaultEditor(Object.class, null); // Rendre toutes les cellules non éditables
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99");
        } catch (SQLException ex) {
            Logger.getLogger(AjoutPatient.class.getName()).log(Level.SEVERE, null, ex);
        }

        // jPanel2.setVisible(false);
//        if (conn != null) {
//            System.out.println("Connexion établie");
//            
//        } else {
//            System.out.println("connexion impossible");
//
//        }
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableDMR = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanelTest = new javax.swing.JPanel();
        ImageBrain = new javax.swing.JLabel();
        jButtonRotate90 = new javax.swing.JButton();
        jButtonContraste = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dossier médical de radiologie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 18)))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(236, 234, 234));
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

        jButtonRetour.setFont(new java.awt.Font("Galvji", 0, 13)); // NOI18N
        jButtonRetour.setText("Retour");
        jButtonRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetourActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Galvji", 1, 14)); // NOI18N
        jLabel6.setText("Liste des Examens ");

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

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRetour)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jButtonRetour)
                .addContainerGap())
        );

        ImageBrain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/brain1_0000.jpg"))); // NOI18N

        jButtonRotate90.setText("Rotate");
        jButtonRotate90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRotate90ActionPerformed(evt);
            }
        });

        jButtonContraste.setText("Contraste");

        javax.swing.GroupLayout jPanelTestLayout = new javax.swing.GroupLayout(jPanelTest);
        jPanelTest.setLayout(jPanelTestLayout);
        jPanelTestLayout.setHorizontalGroup(
            jPanelTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTestLayout.createSequentialGroup()
                .addGroup(jPanelTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTestLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(ImageBrain))
                    .addGroup(jPanelTestLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButtonRotate90)
                        .addGap(51, 51, 51)
                        .addComponent(jButtonContraste)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanelTestLayout.setVerticalGroup(
            jPanelTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTestLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(ImageBrain)
                .addGap(55, 55, 55)
                .addGroup(jPanelTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRotate90)
                    .addComponent(jButtonContraste))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetourActionPerformed
        Acceuil nouveauJFrame = new Acceuil();
        nouveauJFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRetourActionPerformed

    private void jTableDMRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDMRMouseClicked
//        int ligne = jTableDMR.getSelectedRow(); //récuperation information ligne
//        int colonne = jTableDMR.getSelectedColumn(); // récuperation information colonne
        if (evt.getClickCount() == 2) { // Double clic sur une ligne

            int ligneSelectionnee = jTableDMR.getSelectedRow();// récuperation information de la ligne sélectionnée

            //information de la ligne sélectionnée
            int idActe = Integer.parseInt(jTableDMR.getValueAt(ligneSelectionnee, 0).toString());
            String codeActe = jTableDMR.getValueAt(ligneSelectionnee, 1).toString();
            String nomPracticien = jTableDMR.getValueAt(ligneSelectionnee, 4).toString();
            Date dateActe = Date.valueOf(jTableDMR.getValueAt(ligneSelectionnee, 3).toString());
            double tarification = (double) jTableDMR.getValueAt(ligneSelectionnee, 2);
            String acte = jTableDMR.getValueAt(ligneSelectionnee, 5).toString();
//            Object data = jTableDMR.getValueAt(ligne, colonne);
            //                //ouvrir la fiche patient avec les informations sélectionnées
            Acte nouveauJFrame = new Acte(this, idActe, codeActe, nomPracticien, dateActe, tarification, acte);
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

    private void jButtonRotate90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRotate90ActionPerformed
        originalImage = loadImage("images/brain1_0000.jpg");
    if (originalImage != null) {
        try {
            // Rotation de l'image
            modifiedImage = rotateImage(originalImage, 90 * (++rotationAngle));
            // Mise à jour de l'icône avec l'image pivotée
            ImageBrain.setIcon(new ImageIcon(modifiedImage));
        } catch (IOException ex) {
            Logger.getLogger(DossierMedicalRadiologie.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Impossible de charger l'image.", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButtonRotate90ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void recuperation_donnees() {

        //ajouter les colonnes à notre nouveau tableau
//        model.addColumn("ID");
//        model.addColumn("Name");
//        model.addColumn("Prenom");
//        model.addColumn("Date Naissance");
//        model.addColumn("Adresse");
        System.out.println("get = " + getIdPatient());
        try {

            Statement stmt = conn.createStatement();
            //exécutation de la requête
            ResultSet rs = stmt.executeQuery("SELECT * FROM ACTERADIO WHERE IDPATIENT = " + getIdPatient());
            //on ajoute à la ligne les informations de la tableau
            while (rs.next()) {
                Object[] row = new Object[]{rs.getInt("IDACTE"), rs.getString("CODEACTE"), rs.getDouble("TARIFICATION"), rs.getDate("DATEACTE"), rs.getString("PRATICIEN"), rs.getString("SIGNIFICATIONCODE")};
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

    private BufferedImage rotateImage(Image image, int angle) throws IOException {
    if (ImageBrain.getIcon() == null) {
        JOptionPane.showMessageDialog(this, "Aucune image chargée dans le JLabel.", "Erreur", JOptionPane.ERROR_MESSAGE);
        return null;
    }

    // Créer une BufferedImage à partir de l'image
    BufferedImage originalImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);

    // Dessiner l'image sur la BufferedImage
    Graphics2D g2d = originalImage.createGraphics();
    g2d.drawImage(image, 0, 0, null);
    g2d.dispose();

    // Créer une nouvelle image pour contenir l'image pivotée
    BufferedImage rotatedImage = new BufferedImage(originalImage.getHeight(), originalImage.getWidth(), BufferedImage.TYPE_INT_ARGB);

    // Rotation de l'image
    g2d = rotatedImage.createGraphics();
    g2d.rotate(Math.toRadians(angle), rotatedImage.getWidth() / 2, rotatedImage.getHeight() / 2);
    g2d.drawImage(originalImage, 0, 0, null);
    g2d.dispose();

    return rotatedImage;
}


    private BufferedImage loadImage(String path) {
        try {
            // Charger l'image depuis les ressources du package
            InputStream inputStream = getClass().getResourceAsStream(path);
            if (inputStream == null) {
                JOptionPane.showMessageDialog(this, "Impossible de charger l'image.", "Erreur", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            BufferedImage image = ImageIO.read(inputStream);
            inputStream.close(); // Fermer le flux après utilisation
            return image;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
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
            java.util.logging.Logger.getLogger(DossierMedicalRadiologie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DossierMedicalRadiologie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DossierMedicalRadiologie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DossierMedicalRadiologie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel ImageBrain;
    private javax.swing.JLabel infoAdresse;
    private javax.swing.JLabel infoDate;
    private javax.swing.JLabel infoID;
    private javax.swing.JLabel infoNom;
    private javax.swing.JLabel infoPrenom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonContraste;
    private javax.swing.JButton jButtonRetour;
    private javax.swing.JButton jButtonRotate90;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelTest;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableDMR;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the idPatient
     */
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
