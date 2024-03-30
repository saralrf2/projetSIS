/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//bug sam 30 Mars
//test 2
package UI;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alexiaidrac
 */
public class Acte extends javax.swing.JFrame {

    private DossierMedicalRadiologie dmr;
    private BufferedImage originalImage;
    private BufferedImage modifiedImage;
    private BufferedImage invertedImage;

    private int rotationAngle = 0; // Variable pour suivre l'angle de rotation
    private double contraste = 0.25; //variable contraste de base


    /**
     * Creates new form DMR
     */
    public Acte(DossierMedicalRadiologie dmr, int idacte, String codeActe, String nomPracticien, Date dateActe, double tarification, String acte) {
        initComponents();
        jButtonIncreaseContraste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncreaseContrasteActionPerformed(evt);
                jButtonDecreaseContrastActionPerformed(evt);
                jButtonRestartContrastActionPerformed(evt);
            }
        });
        String idActe = String.valueOf(idacte);
        String datedeActe = dateActe.toString();
        infoID.setText(idActe);
        infoCode.setText(codeActe);
        infoPrenom.setText(nomPracticien);
        infoDate.setText(datedeActe);
        infoAdresse.setText(String.valueOf(tarification));
        this.acte.setText(acte);
        this.dmr = dmr;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ImageBrain = new javax.swing.JLabel();
        jButtonRotate90 = new javax.swing.JButton();
        jButtonIncreaseContraste = new javax.swing.JButton();
        jButtonDecreaseContrast = new javax.swing.JButton();
        jButtonRestartContrast = new javax.swing.JButton();
        jButtonInversionGris = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanelInfoActe = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        infoID = new javax.swing.JLabel();
        infoCode = new javax.swing.JLabel();
        infoPrenom = new javax.swing.JLabel();
        infoDate = new javax.swing.JLabel();
        infoAdresse = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        acte = new javax.swing.JLabel();
        jButtonRetour = new javax.swing.JButton();
        jPanelCR = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCR = new javax.swing.JTextArea();
        jButtonEnregistrerCR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(182, 210, 219));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compte rendu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 14)))); // NOI18N

        ImageBrain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/brain1_0000.jpg"))); // NOI18N

        jButtonRotate90.setText("Rotate");
        jButtonRotate90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRotate90ActionPerformed(evt);
            }
        });

        jButtonIncreaseContraste.setText("+");
        jButtonIncreaseContraste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncreaseContrasteActionPerformed(evt);
            }
        });

        jButtonDecreaseContrast.setText("-");
        jButtonDecreaseContrast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDecreaseContrastActionPerformed(evt);
            }
        });

        jButtonRestartContrast.setText("réinitialiser");
        jButtonRestartContrast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestartContrastActionPerformed(evt);
            }
        });

        jButtonInversionGris.setText("inversion gris");
        jButtonInversionGris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInversionGrisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonInversionGris)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRestartContrast)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonRotate90)
                        .addGap(51, 51, 51)
                        .addComponent(jButtonIncreaseContraste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDecreaseContrast)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImageBrain, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(ImageBrain, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRotate90)
                    .addComponent(jButtonIncreaseContraste)
                    .addComponent(jButtonDecreaseContrast))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRestartContrast))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButtonInversionGris)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Examen Radiologique", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 18)))); // NOI18N

        jPanelInfoActe.setBackground(new java.awt.Color(236, 234, 234));
        jPanelInfoActe.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informations acte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 14)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabel1.setText("Numéro d'identification Acte :");

        jLabel2.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabel2.setText("Code Acte :");

        jLabel3.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabel3.setText("Nom Practicien");

        jLabel4.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabel4.setText("Date de l'acte :");

        jLabel5.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabel5.setText("Tarification :");

        infoID.setText("infoID");

        infoCode.setText("infoCode");

        infoPrenom.setText("infoNom");

        infoDate.setText("infoDate");

        infoAdresse.setText("infoTarification");

        jLabel6.setFont(new java.awt.Font("Galvji", 2, 14)); // NOI18N
        jLabel6.setText("Acte :");

        acte.setText("acte");

        javax.swing.GroupLayout jPanelInfoActeLayout = new javax.swing.GroupLayout(jPanelInfoActe);
        jPanelInfoActe.setLayout(jPanelInfoActeLayout);
        jPanelInfoActeLayout.setHorizontalGroup(
            jPanelInfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoActeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoActeLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoID))
                    .addGroup(jPanelInfoActeLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoCode))
                    .addGroup(jPanelInfoActeLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoPrenom))
                    .addGroup(jPanelInfoActeLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoDate))
                    .addGroup(jPanelInfoActeLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoAdresse))
                    .addGroup(jPanelInfoActeLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acte)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanelInfoActeLayout.setVerticalGroup(
            jPanelInfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoActeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(infoID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(infoCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(acte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(infoPrenom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(infoDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

        jPanelCR.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compte rendu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 14)))); // NOI18N

        jTextAreaCR.setColumns(20);
        jTextAreaCR.setRows(5);
        jScrollPane1.setViewportView(jTextAreaCR);

        jButtonEnregistrerCR.setText("Enregistrer");
        jButtonEnregistrerCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnregistrerCRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCRLayout = new javax.swing.GroupLayout(jPanelCR);
        jPanelCR.setLayout(jPanelCRLayout);
        jPanelCRLayout.setHorizontalGroup(
            jPanelCRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addGap(3, 3, 3))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCRLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonEnregistrerCR))
        );
        jPanelCRLayout.setVerticalGroup(
            jPanelCRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jButtonEnregistrerCR))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInfoActe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRetour)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelCR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelInfoActe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRetour)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetourActionPerformed
        DossierMedicalRadiologie nouveauJFrame = dmr;
        nouveauJFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRetourActionPerformed

    private void jButtonEnregistrerCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnregistrerCRActionPerformed
        // Récupérer le texte du jTextAreaCR
        String CONTENU = jTextAreaCR.getText();
        String idCR = infoID.getText(); // Récupérer l'ID stocké dans infoID
        int ID = 1;
        int IDACTE = 1;
        
        
        // Créer des boutons personnalisés
        Object[] options = {"Valider", "Annuler"};
        System.out.println("texte CR: " + CONTENU + "-");
        System.out.println("idCR: " + idCR + "-");

        // Afficher la boîte de dialogue avec les boutons personnalisés
        int choix = JOptionPane.showOptionDialog(
                null, // Parent component
                "Êtes-vous sûr de vouloir enregistrer le compte rendu ?", // Message
                "Confirmation", // Titre
                JOptionPane.YES_NO_CANCEL_OPTION, // Type de boîte de dialogue
                JOptionPane.QUESTION_MESSAGE, // Type d'icône
                null, // Icône personnalisée (null pour utiliser l'icône par défaut)
                options, // Boutons personnalisés
                options[0]); // Bouton par défaut

        // Gérer la réponse de l'utilisateur
        if (choix == JOptionPane.YES_OPTION) {
//            Connexion nouveauJFrame = new Connexion();
//            nouveauJFrame.setVisible(true);
            try {
                // Établir la connexion à la base de données
                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99");

                
                
                // Préparer la requête SQL pour insérer le compte rendu avec IDCR
                String sql = "INSERT INTO CR (IDCR, ID, CONTENU, IDACTE) VALUES (?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, idCR); // Remplace le premier paramètre (?) par la valeur de idCR
                statement.setInt(2, ID); // Remplace le deuxième paramètre (?) par la valeur de l'ID
                statement.setString(3, CONTENU); // Remplace le troisième paramètre (?) par la valeur du contenu
                statement.setInt(4, IDACTE); // Remplace le quatrième paramètre (?) par la valeur de l'ID d'acte

                // Exécuter la requête SQL
                statement.executeUpdate();

                // Fermer la connexion
                connection.close();

                // Afficher un message de succès
                JOptionPane.showMessageDialog(null, "Compte rendu enregistré avec succès !");
            } catch (SQLException ex) {
                ex.printStackTrace();
                // Gérer les erreurs de connexion ou d'exécution de la requête
                JOptionPane.showMessageDialog(null, "Erreur lors de l'enregistrement du compte rendu : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            }
            // Fermer la fenêtre actuelle
            dispose();
        } else if (choix == JOptionPane.CANCEL_OPTION || choix == JOptionPane.CLOSED_OPTION) {
            // Action si l'utilisateur clique sur "Annuler" ou ferme la boîte de dialogue
            JOptionPane.getRootFrame().dispose();
        }

    }//GEN-LAST:event_jButtonEnregistrerCRActionPerformed

    private void jButtonRotate90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRotate90ActionPerformed
        originalImage = loadImage("images/brain1_0000.jpg");
        if (originalImage != null) {
            try {
                // Rotation de l'image
                modifiedImage = rotateImage(originalImage, 90 * (++rotationAngle));
                // Mise à jour de l'icône avec l'image pivotée
                ImageBrain.setIcon(new ImageIcon(modifiedImage));
            } catch (IOException ex) {
               // Logger.getLogger(DossierMedicalRadiologie.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Impossible de charger l'image.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRotate90ActionPerformed

    private void jButtonIncreaseContrasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncreaseContrasteActionPerformed
        originalImage = loadImage("images/brain1_0000.jpg");

        if (null != originalImage) {
            // Incrémentation du contraste
            contraste += 0.5; // Incrémente le contraste de 0.25 à chaque clic

            // Ajustement du contraste de l'image
            modifiedImage = adjustContrast(originalImage, contraste);

            // Mise à jour de l'icône avec l'image avec contraste ajusté
            ImageBrain.setIcon(new ImageIcon(modifiedImage));
        } else {
            JOptionPane.showMessageDialog(this, "Impossible de charger l'image.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonIncreaseContrasteActionPerformed

    private void jButtonDecreaseContrastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDecreaseContrastActionPerformed
        originalImage = loadImage("images/brain1_0000.jpg");

        if (null != originalImage) {
            // Incrémentation du contraste
            contraste -= 0.5; // Incrémente le contraste de 0.25 à chaque clic

            // Ajustement du contraste de l'image
            modifiedImage = adjustContrast(originalImage, contraste);

            // Mise à jour de l'icône avec l'image avec contraste ajusté
            ImageBrain.setIcon(new ImageIcon(modifiedImage));
        } else {
            JOptionPane.showMessageDialog(this, "Impossible de charger l'image.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDecreaseContrastActionPerformed

    private void jButtonRestartContrastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestartContrastActionPerformed

        ImageBrain.setIcon(new ImageIcon(originalImage)); // Restaurer l'image originale

    }//GEN-LAST:event_jButtonRestartContrastActionPerformed

    private void jButtonInversionGrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInversionGrisActionPerformed
        originalImage = loadImage("images/brain1_0000.jpg");

        if (null != originalImage) {
            // Appliquer l'inversion des niveaux de gris et récupérer l'image inversée
            BufferedImage invertedImage = inversionNiveauGris(originalImage);

            // Afficher l'image inversée
            ImageBrain.setIcon(new ImageIcon(invertedImage));

        } else {
            JOptionPane.showMessageDialog(this, "Impossible de charger l'image.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonInversionGrisActionPerformed
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

    private BufferedImage adjustContrast(BufferedImage image, double contrast) {
        // Créer une copie de l'image originale pour appliquer l'ajustement de contraste
        BufferedImage adjustedImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_GRAY);

        // Appliquer l'ajustement de contraste pixel par pixel
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                // Obtenir la valeur du niveau de gris du pixel
                int grayValue = image.getRaster().getSample(x, y, 0);

                // Appliquer l'ajustement de contraste à la valeur du niveau de gris
                int adjustedGrayValue = (int) (grayValue * contrast);

                // Vérifier les limites des valeurs de gris (0-255)
                adjustedGrayValue = Math.min(Math.max(adjustedGrayValue, 0), 255);

                // Définir la nouvelle valeur du niveau de gris dans l'image ajustée
                adjustedImage.getRaster().setSample(x, y, 0, adjustedGrayValue);
            }
        }
        return adjustedImage;
    }

    private void chargerImageOriginale() {
        originalImage = loadImage("images/brain1_0000.jpg");
    }

    private BufferedImage inversionNiveauGris(BufferedImage image) {
        // Créer une copie de l'image originale pour inverser le niveau de gris
        BufferedImage invertedImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_GRAY);

        // Inverser le niveau de gris pixel par pixel (soustraction de la valeur de gris des pixels à la valeur maximal de profondeur des pixels)
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                // Obtenir la valeur du niveau de gris du pixel
                int grayValue = image.getRaster().getSample(x, y, 0);

                // Inverser le niveau de gris en soustrayant de la valeur maximale possible
                int invertedGrayValue = 255 - grayValue;

                // Définir la nouvelle valeur du niveau de gris dans l'image inversée
                invertedImage.getRaster().setSample(x, y, 0, invertedGrayValue);
            }
        }
        return invertedImage;
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
            java.util.logging.Logger.getLogger(Acte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JLabel acte;
    private javax.swing.JLabel infoAdresse;
    private javax.swing.JLabel infoCode;
    private javax.swing.JLabel infoDate;
    private javax.swing.JLabel infoID;
    private javax.swing.JLabel infoPrenom;
    private javax.swing.JButton jButtonDecreaseContrast;
    private javax.swing.JButton jButtonEnregistrerCR;
    private javax.swing.JButton jButtonIncreaseContraste;
    private javax.swing.JButton jButtonInversionGris;
    private javax.swing.JButton jButtonRestartContrast;
    private javax.swing.JButton jButtonRetour;
    private javax.swing.JButton jButtonRotate90;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCR;
    private javax.swing.JPanel jPanelInfoActe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaCR;
    // End of variables declaration//GEN-END:variables
}
