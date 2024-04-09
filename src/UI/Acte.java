package UI;

import CommunicationSQL.GestionnaireCommunicationSQL;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import java.awt.image.RescaleOp;

/**
 * Cette classe représente l'interface graphique pour consulter un examen
 * radiologique d'un patient.
 */
public class Acte extends javax.swing.JFrame {

    private DossierMedicalRadiologie dmr; // Référence vers le dossier médical radiologique
    private byte[] imageData; // Tableau de bytes contenant les données de l'image
    private BufferedImage imageFromDB; // Image récupérée à partir de la base de données

    private int rotationAngle = 0; // Angle de rotation de l'image (initialisé à 0)
    private double contraste = 0.5; // Niveau de contraste initial (0.5 par défaut)

    private DefaultTableModel model; // Modèle de tableau pour afficher des données
    private int idacte; // Identifiant de l'acte médical
    private int idPatient; // Identifiant du patient associé à l'acte
    Connection conn; // Connexion à la base de données

    /**
     * Constructeur de la classe Acte.
     *
     * @param dmr Référence vers le dossier médical radiologique
     * @param idacte Identifiant de l'acte médical
     * @param codeActe Code de l'acte médical
     * @param nomPracticien Nom du praticien ayant réalisé l'acte
     * @param dateActe Date de réalisation de l'acte
     * @param tarification Coût de l'acte médical
     * @param acte Description de l'acte médical
     * @param imageData Données de l'image radiologique
     */
    public Acte(DossierMedicalRadiologie dmr, int idacte, String codeActe, String nomPracticien, Date dateActe, double tarification, String acte, byte[] imageData) {
        initComponents(); // Initialise les composants de l'interface utilisateur

        // Initialisation des valeurs membres avec les paramètres fournis
        this.idPatient = dmr.getIdPatient();
        this.dmr = dmr;
        this.acte.setText(acte); // Affiche la description de l'acte sur un composant texte

        // Ajout des ActionListeners aux boutons pour gérer les actions utilisateur
        jButtonIncreaseContraste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncreaseContrasteActionPerformed(evt);
            }
        });

        // Initialisation des champs de l'interface avec les informations de l'acte
        infoID.setText(String.valueOf(idacte)); // Affiche l'identifiant de l'acte
        infoCode.setText(codeActe); // Affiche le code de l'acte
        infoPrenom.setText(nomPracticien); // Affiche le nom du praticien
        infoDate.setText(dateActe.toString()); // Affiche la date de l'acte
        infoAdresse.setText(String.valueOf(tarification)); // Affiche le coût de l'acte

       

        // Récupère l'ID d'acte à partir du champ infoID
        String IDACTE = infoID.getText();

        // Concatène l'ID du patient et l'ID d'acte pour former l'ID du compte rendu (idCR)
        String idCR = String.valueOf(idPatient) + String.valueOf(IDACTE);

        // Convertit l'ID du compte rendu en entier
        int idCRint = Integer.parseInt(idCR);

        // Appelle la méthode pour afficher le compte rendu correspondant à l'ID du compte rendu
        afficherCompteRendu(idCRint);

        // Initialise les valeurs membres avec les paramètres fournis
        this.acte.setText(acte); // Affiche la description de l'acte sur un composant texte
        this.dmr = dmr; // Initialise le dossier médical radiologique
        this.imageData = imageData; // Initialise les données de l'image

        // Charge l'image à partir des données binaires de l'image (imageData) en tant qu'objet BufferedImage
        imageFromDB = loadImageFromBytes(imageData);

        // Obtient une connexion à la base de données via le gestionnaire de communication SQL
        conn = GestionnaireCommunicationSQL.obtenirConnexion();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ImageBrain = new javax.swing.JLabel();
        jButtonRotate90 = new javax.swing.JButton();
        jButtonIncreaseContraste = new javax.swing.JButton();
        jButtonDecreaseContrast = new javax.swing.JButton();
        jButtonRestartContrast = new javax.swing.JButton();
        jButtonInversionGris = new javax.swing.JButton();
        jButtonFlipH = new javax.swing.JButton();
        jButtonFlipV = new javax.swing.JButton();
        jButtonAjout = new javax.swing.JButton();
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
        jButtonImprimer = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(173, 200, 213));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Radiographie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 14)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 13))); // NOI18N

        ImageBrain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageBrain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/brain1_0000.jpg"))); // NOI18N

        jButtonRotate90.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRotate90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/rafraichir.png"))); // NOI18N
        jButtonRotate90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRotate90ActionPerformed(evt);
            }
        });

        jButtonIncreaseContraste.setBackground(new java.awt.Color(255, 255, 255));
        jButtonIncreaseContraste.setText("+");
        jButtonIncreaseContraste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncreaseContrasteActionPerformed(evt);
            }
        });

        jButtonDecreaseContrast.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDecreaseContrast.setText("-");
        jButtonDecreaseContrast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDecreaseContrastActionPerformed(evt);
            }
        });

        jButtonRestartContrast.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRestartContrast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/reinitialiser.png"))); // NOI18N
        jButtonRestartContrast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestartContrastActionPerformed(evt);
            }
        });

        jButtonInversionGris.setBackground(new java.awt.Color(255, 255, 255));
        jButtonInversionGris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/echanger.png"))); // NOI18N
        jButtonInversionGris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInversionGrisActionPerformed(evt);
            }
        });

        jButtonFlipH.setBackground(new java.awt.Color(255, 255, 255));
        jButtonFlipH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/retournement-vertical.png"))); // NOI18N
        jButtonFlipH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFlipHActionPerformed(evt);
            }
        });

        jButtonFlipV.setBackground(new java.awt.Color(255, 255, 255));
        jButtonFlipV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/retournement-horizontal.png"))); // NOI18N
        jButtonFlipV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFlipVActionPerformed(evt);
            }
        });

        jButtonAjout.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAjout.setFont(new java.awt.Font("Galvji", 0, 13)); // NOI18N
        jButtonAjout.setText("Ajout image");
        jButtonAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRestartContrast, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonRotate90, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonInversionGris, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonFlipH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonFlipV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonIncreaseContraste, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDecreaseContrast, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(ImageBrain, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButtonAjout)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(ImageBrain, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonRotate90)
                        .addComponent(jButtonIncreaseContraste)
                        .addComponent(jButtonDecreaseContrast))
                    .addComponent(jButtonInversionGris)
                    .addComponent(jButtonFlipH)
                    .addComponent(jButtonFlipV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRestartContrast)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAjout)
                .addGap(32, 32, 32))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Examen Radiologique", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 18)))); // NOI18N

        jPanelInfoActe.setBackground(new java.awt.Color(173, 200, 213));
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
                .addContainerGap(141, Short.MAX_VALUE))
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

        jPanelCR.setBackground(new java.awt.Color(173, 200, 213));
        jPanelCR.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compte rendu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Galvji", 1, 14)))); // NOI18N
        jPanelCR.setMaximumSize(new java.awt.Dimension(32769, 32767));

        jTextAreaCR.setColumns(20);
        jTextAreaCR.setRows(5);
        jScrollPane1.setViewportView(jTextAreaCR);

        jButtonEnregistrerCR.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEnregistrerCR.setFont(new java.awt.Font("Galvji", 0, 13)); // NOI18N
        jButtonEnregistrerCR.setText("Enregistrer");
        jButtonEnregistrerCR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonEnregistrerCR.setBorderPainted(false);
        jButtonEnregistrerCR.setMaximumSize(new java.awt.Dimension(57, 23));
        jButtonEnregistrerCR.setMinimumSize(new java.awt.Dimension(57, 23));
        jButtonEnregistrerCR.setPreferredSize(new java.awt.Dimension(57, 23));
        jButtonEnregistrerCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnregistrerCRActionPerformed(evt);
            }
        });

        jButtonImprimer.setText("Imprimer");
        jButtonImprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCRLayout = new javax.swing.GroupLayout(jPanelCR);
        jPanelCR.setLayout(jPanelCRLayout);
        jPanelCRLayout.setHorizontalGroup(
            jPanelCRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCRLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelCRLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEnregistrerCR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelCRLayout.setVerticalGroup(
            jPanelCRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEnregistrerCR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInfoActe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelCR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelInfoActe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCR, javax.swing.GroupLayout.PREFERRED_SIZE, 271, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetourActionPerformed
        DossierMedicalRadiologie nouveauJFrame = dmr;
        nouveauJFrame.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButtonRetourActionPerformed

    private void jButtonEnregistrerCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnregistrerCRActionPerformed
        int ID = idPatient; //recup l'id patient  
        String CONTENU = jTextAreaCR.getText();// Récupérer le texte du jTextAreaCR
        String IDACTE = infoID.getText(); // Récupérer l'ID stocké dans infoID sara
        String idCR = String.valueOf(ID) + String.valueOf(IDACTE); // Concaténer l'ID et l'ID d'acte pour former idCR

        int idCRint = Integer.parseInt(idCR);//converti en int
        int IDACTEint = Integer.parseInt(IDACTE);
        // Créer des boutons personnalisés
        Object[] options = {"Valider", "Annuler"};

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
            try {

                // Préparer la requête SQL pour insérer le compte rendu avec IDCR
                String sql = "INSERT INTO CR (IDCR, ID, CONTENU, IDACTE) VALUES (?, ?, ?, ?)";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(1, idCRint); // Remplace le premier paramètre (?) par la valeur de idCR
                statement.setInt(2, ID); // Remplace le deuxième paramètre (?) par la valeur de l'ID
                statement.setString(3, CONTENU); // Remplace le troisième paramètre (?) par la valeur du contenu
                statement.setInt(4, IDACTEint); // Remplace le quatrième paramètre (?) par la valeur de l'ID d'acte

                // Exécuter la requête SQL
                statement.executeUpdate();

                // Fermer la connexion
                conn.close();

                // Afficher un message de succès
                JOptionPane.showMessageDialog(null, "Compte rendu enregistré avec succès !");
            } catch (SQLException ex) {
                ex.printStackTrace();
                // Gérer les erreurs de connexion ou d'exécution de la requête
                JOptionPane.showMessageDialog(null, "Erreur lors de l'enregistrement du compte rendu : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            }

        } else if (choix == JOptionPane.CANCEL_OPTION || choix == JOptionPane.CLOSED_OPTION) {
            // Action si l'utilisateur clique sur "Annuler" ou ferme la boîte de dialogue
            JOptionPane.getRootFrame().dispose();
        }

    }//GEN-LAST:event_jButtonEnregistrerCRActionPerformed

    private void jButtonRotate90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRotate90ActionPerformed
        if (imageData != null) {
            //BufferedImage imageFromDB = loadImageFromBytes(imageData);
            if (imageFromDB != null) {
                // Rotation de l'image
                BufferedImage rotatedImage = rotateImage(imageFromDB, 90 * (++rotationAngle));
                // Mise à jour de l'image actuelle dans le JLabel
                applyProcessing(rotatedImage);
                imageFromDB = rotatedImage;
            } else {
                System.out.println("Impossible de charger l'image depuis la base de données.");
            }
        } else {
            System.out.println("Aucune image chargée depuis la base de données.");
        }
    }//GEN-LAST:event_jButtonRotate90ActionPerformed

    private void jButtonIncreaseContrasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncreaseContrasteActionPerformed
        if (imageData != null) {
            BufferedImage imageFromDB = loadImageFromBytes(imageData);
            if (imageFromDB != null) {
                // Incrémentation du contraste
                contraste += 0.5; // Incrémente le contraste de 0.25 à chaque clic
                // Ajustement du contraste de l'image
                BufferedImage adjustedImage = adjustContrast(imageFromDB, contraste);
                // Mise à jour de l'image actuelle dans le JLabel
                applyProcessing(adjustedImage);
            } else {
                System.out.println("Impossible de charger l'image depuis la base de données.");
            }
        } else {
            System.out.println("Aucune image chargée depuis la base de données.");
        }
    }//GEN-LAST:event_jButtonIncreaseContrasteActionPerformed

    private void jButtonDecreaseContrastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDecreaseContrastActionPerformed
        if (imageData != null) {
            BufferedImage imageFromDB = loadImageFromBytes(imageData);
            if (imageFromDB != null) {
                // Incrémentation du contraste
                contraste -= 0.5; // Incrémente le contraste de 0.25 à chaque clic
                // Ajustement du contraste de l'image
                BufferedImage adjustedImage = adjustContrast(imageFromDB, contraste);
                // Mise à jour de l'image actuelle dans le JLabel
                applyProcessing(adjustedImage);

            } else {
                System.out.println("Impossible de charger l'image depuis la base de données.");
            }
        } else {
            System.out.println("Aucune image chargée depuis la base de données.");
        }
    }//GEN-LAST:event_jButtonDecreaseContrastActionPerformed

    private void jButtonRestartContrastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestartContrastActionPerformed

        ImageBrain.setIcon(new ImageIcon(loadImageFromBytes(imageData))); // Restaurer l'image originale

    }//GEN-LAST:event_jButtonRestartContrastActionPerformed

    private void jButtonInversionGrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInversionGrisActionPerformed
        if (imageData != null) {
            //BufferedImage imageFromDB = loadImageFromBytes(imageData);
            if (imageFromDB != null) {
                // Appliquer l'inversion des niveaux de gris
                BufferedImage invertedImage = inversionNiveauGris(imageFromDB);
                // Mise à jour de l'image actuelle dans le JLabel
                applyProcessing(invertedImage);
                imageFromDB = invertedImage;
            } else {
                System.out.println("Impossible de charger l'image depuis la base de données.");
            }
        } else {
            System.out.println("Aucune image chargée depuis la base de données.");
        }
    }//GEN-LAST:event_jButtonInversionGrisActionPerformed

    private void jButtonFlipHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFlipHActionPerformed
        flipHImage();
    }//GEN-LAST:event_jButtonFlipHActionPerformed

    private void jButtonFlipVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFlipVActionPerformed
        flipVImage();
    }//GEN-LAST:event_jButtonFlipVActionPerformed

    private void jButtonImprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimerActionPerformed

        PrinterJob imprimer = PrinterJob.getPrinterJob();
        if (imprimer.printDialog()) {
            try {
                imprimer.print();
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtonImprimerActionPerformed

    private void jButtonAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = fileChooser.getSelectedFile();

            try {

                // Générer un IDIMG aléatoire
                int idImg = (int) (Math.random() * 1000000);
                // Insérez l'image dans la table IMAGEES avec l'ID de l'acte correspondant
                if (selectedImageFile != null) {
                    byte[] imageBytes = Files.readAllBytes(selectedImageFile.toPath());
                    String sql = "INSERT INTO IMAGEES (IDIMG, IDACTE, IDPATIENT, IMAGE) VALUES (?, ?, ?, ?)";
                    PreparedStatement preparedStatement = conn.prepareStatement(sql);
                    // Remplacez les '?' par les valeurs appropriées
                    preparedStatement.setInt(1, idImg);
                    preparedStatement.setInt(2, Integer.parseInt(infoID.getText()));
                    preparedStatement.setInt(3, idPatient);
                    preparedStatement.setBytes(4, imageBytes);
                    preparedStatement.executeUpdate();

                    // Afficher un message de confirmation
                    JOptionPane.showMessageDialog(this, "Votre image a été téléchargée avec succès", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                    jButtonAjout.setVisible(false);
                } else {
                    System.out.println("Aucune image sélectionnée");
                }

                // Fermez la connexion
                conn.close();
            } catch (SQLException | IOException ex) {
                ex.printStackTrace();
                // Gérez les exceptions appropriées
            }
        }
    }//GEN-LAST:event_jButtonAjoutActionPerformed
    private BufferedImage rotateImage(BufferedImage image, int angle) {
        // Créer une nouvelle image pour contenir l'image pivotée
        BufferedImage rotatedImage = new BufferedImage(image.getHeight(), image.getWidth(), image.getType());

        // Rotation de l'image
        AffineTransform tx = new AffineTransform();
        tx.rotate(Math.toRadians(angle), image.getHeight() / 2, image.getHeight() / 2);
        Graphics2D g2d = rotatedImage.createGraphics();
        g2d.drawImage(image, tx, null);
        g2d.dispose();

        return rotatedImage;
    }

//    private BufferedImage loadImage(String path) {
//        try {
//            // Charger l'image depuis les ressources du package
//            InputStream inputStream = getClass().getResourceAsStream(path);
//            if (inputStream == null) {
//                JOptionPane.showMessageDialog(this, "Impossible de charger l'image.", "Erreur", JOptionPane.ERROR_MESSAGE);
//                return null;
//            }
//            BufferedImage image = ImageIO.read(inputStream);
//            inputStream.close(); // Fermer le flux après utilisation
//            return image;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
    private BufferedImage adjustContrast(BufferedImage image, double contrast) {
        // Créer une copie de l'image originale pour appliquer l'ajustement de contraste
        ColorModel cm = image.getColorModel();
        boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
        WritableRaster raster = image.copyData(null);
        BufferedImage adjustedImage = new BufferedImage(cm, raster, isAlphaPremultiplied, null);

        // Appliquer l'ajustement de contraste à chaque pixel de l'image
        RescaleOp op = new RescaleOp((float) contrast, 0, null);
        op.filter(adjustedImage, adjustedImage);

        return adjustedImage;
    }

    private BufferedImage inversionNiveauGris(BufferedImage image) {
        // Créer une copie de l'image originale pour inverser le niveau de gris
        BufferedImage invertedImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());

        // Inverser le niveau de gris pixel par pixel
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                int rgb = image.getRGB(x, y);
                int invertedRGB = 0xFFFFFF - rgb;
                invertedImage.setRGB(x, y, invertedRGB);
            }
        }

        return invertedImage;
    }

    // Méthode pour flipper horizontalement l'image de la base de données
    private void flipHImage() {
        if (imageData != null) {

            if (imageFromDB == null) {

            }
            if (imageFromDB != null) {
                AffineTransform tx = AffineTransform.getScaleInstance(1, -1);
                tx.translate(0, -imageFromDB.getHeight());
                AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
                BufferedImage flippedImage = op.filter(imageFromDB, null);
                // Mettre à jour l'image originale
                imageFromDB = flippedImage;
                // Afficher l'image retournée
                applyProcessing(flippedImage);

            } else {
                System.out.println("Impossible de charger l'image depuis les données de la base de données.");
            }
        } else {
            System.out.println("Aucune donnée d'image disponible depuis la base de données.");
        }
    }

// Méthode pour flipper verticalement l'image de la base de données
    private void flipVImage() {
        if (imageData != null) {
            //BufferedImage imageFromDB = loadImageFromBytes(imageData);
            if (imageFromDB == null) {

            }
            if (imageFromDB != null) {
                AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
                tx.translate(-imageFromDB.getWidth(), 0);
                AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
                BufferedImage flippedImage = op.filter(imageFromDB, null);
                // Mettre à jour l'image originale
                imageFromDB = flippedImage;
                // Afficher l'image retournée
                applyProcessing(flippedImage);
            } else {
                System.out.println("Impossible de charger l'image depuis les données de la base de données.");
            }
        } else {
            System.out.println("Aucune donnée d'image disponible depuis la base de données.");
        }
    }

    private BufferedImage loadImageFromBytes(byte[] imageData) {
        if (imageData != null) {
            try {
                // Créer un ByteArrayInputStream à partir des données d'image
                InputStream inputStream = new ByteArrayInputStream(imageData);
                BufferedImage image = ImageIO.read(inputStream);
                inputStream.close();
                return image;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            // Si les données d'image sont nulles, retourner null
            return null;
        }
    }

    private void applyProcessing(BufferedImage processedImage) {
        // Mettre à jour l'icône du JLabel avec l'image traitée
        ImageIcon imageIcon = new ImageIcon(processedImage);
        ImageBrain.setIcon(imageIcon);
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
            java.util.logging.Logger.getLogger(Acte.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acte.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acte.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acte.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAjout;
    private javax.swing.JButton jButtonDecreaseContrast;
    private javax.swing.JButton jButtonEnregistrerCR;
    private javax.swing.JButton jButtonFlipH;
    private javax.swing.JButton jButtonFlipV;
    private javax.swing.JButton jButtonImprimer;
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
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaCR;
    // End of variables declaration//GEN-END:variables

    private void afficherCompteRendu(int idCRint) {
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99");
            String sql = "SELECT CONTENU FROM CR WHERE IDCR = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, idCRint);
            ResultSet resultSet = statement.executeQuery();

            StringBuilder contentBuilder = new StringBuilder();
            while (resultSet.next()) {
                String contenu = resultSet.getString("CONTENU");
                contentBuilder.append(contenu).append("\n");
            }

            String contenuCR = contentBuilder.toString();
            //   if (jTextAreaCR.getClickCount() == 2) { // Double clic sur une ligne 
            if (contenuCR.isEmpty()) { // si il y a déja un contenu on n'a pas le droit de le modifier 
                jTextAreaCR.setEditable(true); // Autoriser la modification si le contenu est vide
            } else {
                jTextAreaCR.setText(contenuCR); // Mettre à jour le texte du jTextAreaCR avec le contenu du compte rendu
                jTextAreaCR.setEditable(false); // Bloquer la modification si le contenu est déjà présent
                this.jButtonEnregistrerCR.setVisible(false);// Masquer le bouton pour ajouter le CR
                JOptionPane.showMessageDialog(null, "Le compte rendu ne peut pas être modifié car il contient déjà du texte.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erreur lors de la récupération du compte rendu : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public JLabel getImageBrain() {
        return ImageBrain;
    }
}
