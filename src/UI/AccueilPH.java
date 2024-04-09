package UI;

import CommunicationSQL.GestionnaireCommunicationSQL;
import Interopérabilité.HL7ListeningThread;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * Classe représentant l'interface d'accueil principal pour les professionnels
 * de la santé.
 */
public class AccueilPH extends javax.swing.JFrame {

    Connection conn;

    private final DefaultTableModel model;

    /**
     * Constructeur par défaut de la classe AccueilPH. Initialise les composants
     * graphiques de l'interface et démarre l'écoute HL7.
     */
    public AccueilPH() {
        initComponents();

        // Initialisation du modèle de tableau avec les colonnes nécessaires
        model = new DefaultTableModel(new Object[]{"IDPatient", "Name", "Prénom", "Date de Naissance", "Adresse Postale"}, 0);
        DMRjTable.setModel(model); // Appliquer le modèle au jTableDMR
        DMRjTable.setDefaultEditor(Object.class, null); // Rendre toutes les cellules non éditables
        conn = GestionnaireCommunicationSQL.obtenirConnexion(); // Obtenir la connexion à la base de données

        recuperation_donnees(); // Récupérer les données de la base de données

        startHL7Listening(); // Permettre la réception de message HL7
    }

    /**
     * Méthode privée pour démarrer l'écoute des messages HL7 sur le port 50000.
     * Vérifie d'abord si l'écoute est déjà en cours avant de démarrer un
     * nouveau thread.
     */
    private void startHL7Listening() {
        int port = 50000; // Port d'écoute des messages HL7
        HL7ListeningThread listeningThread = new HL7ListeningThread(port);
        listeningThread.start(); // Démarrer le thread d'écoute des messages HL7
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelBienvenue = new javax.swing.JLabel();
        radioTech = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        RecherchejTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DMRjTable = new javax.swing.JTable();
        jButtonDeconnexion = new javax.swing.JButton();
        RecherchejButton = new javax.swing.JButton();
        AjoutPatientButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelBienvenue.setFont(new java.awt.Font("Galvji", 3, 18)); // NOI18N
        jLabelBienvenue.setText("Bienvenue dans votre espace");

        radioTech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/RadioTech Petite.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBienvenue)
                    .addComponent(radioTech))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(radioTech)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBienvenue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(173, 200, 213));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        RecherchejTextField.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N
        RecherchejTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        DMRjTable.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N
        DMRjTable.setModel(new javax.swing.table.DefaultTableModel(
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
        DMRjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DMRjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DMRjTable);

        jButtonDeconnexion.setBackground(new java.awt.Color(255, 153, 153));
        jButtonDeconnexion.setFont(new java.awt.Font("Galvji", 0, 14)); // NOI18N
        jButtonDeconnexion.setText("Deconnexion");
        jButtonDeconnexion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDeconnexion.setBorderPainted(false);
        jButtonDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeconnexionActionPerformed(evt);
            }
        });

        RecherchejButton.setBackground(new java.awt.Color(255, 255, 255));
        RecherchejButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/loupe.png"))); // NOI18N
        RecherchejButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RecherchejButton.setBorderPainted(false);
        RecherchejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecherchejButtonActionPerformed(evt);
            }
        });

        AjoutPatientButton.setBackground(new java.awt.Color(255, 255, 255));
        AjoutPatientButton.setFont(new java.awt.Font("Galvji", 0, 13)); // NOI18N
        AjoutPatientButton.setText("Ajouter");
        AjoutPatientButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AjoutPatientButton.setBorderPainted(false);
        AjoutPatientButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjoutPatientButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(RecherchejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RecherchejButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AjoutPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RecherchejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AjoutPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RecherchejButton))))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeconnexionActionPerformed
        // Afficher une boîte de dialogue pour confirmer la déconnexion
        Object[] options = {"Valider", "Annuler"};

        int choix = JOptionPane.showOptionDialog(
                null, //Composant Parent
                "Vous allez être déconnecté. Êtes-vous sûr ?", // Message
                "Confirmation", // Titre
                JOptionPane.YES_NO_CANCEL_OPTION, // Type de boîte de dialogue
                JOptionPane.QUESTION_MESSAGE, // Type d'icône
                null, // Icône personnalisée (null pour utiliser l'icône par défaut)
                options, // Boutons personnalisés
                options[0]); // Bouton par défaut

        // Gérer la réponse de l'utilisateur
        if (choix == JOptionPane.YES_OPTION) {
            Connexion nouveauJFrame = new Connexion();
            nouveauJFrame.setVisible(true);
            dispose();
        } else if (choix == JOptionPane.CANCEL_OPTION || choix == JOptionPane.CLOSED_OPTION) {
            // Action si l'utilisateur clique sur "Annuler" ou ferme la boîte de dialogue
            JOptionPane.getRootFrame().dispose();
        }

    }//GEN-LAST:event_jButtonDeconnexionActionPerformed

    private void DMRjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMRjTableMouseClicked
        if (evt.getClickCount() == 2) { // Double clic sur une ligne

            int ligneSelectionnee = DMRjTable.getSelectedRow();// Récupération de l'index de la ligne sélectionnée
            // Récupération des informations de la ligne sélectionnée
            int idpatient = Integer.parseInt(DMRjTable.getValueAt(ligneSelectionnee, 0).toString());
            String nom = DMRjTable.getValueAt(ligneSelectionnee, 1).toString();
            String prenom = DMRjTable.getValueAt(ligneSelectionnee, 2).toString();
            Date dateNaissance = Date.valueOf(DMRjTable.getValueAt(ligneSelectionnee, 3).toString());
            String adresse = DMRjTable.getValueAt(ligneSelectionnee, 4).toString();

            // Ouvrir la fiche patient avec les informations sélectionnées
            DossierMedicalRadiologie nouveauJFrame = new DossierMedicalRadiologie(idpatient, nom, prenom, dateNaissance, adresse);
            this.setVisible(false);
            nouveauJFrame.setVisible(true);
            nouveauJFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

            dispose();
        }

    }//GEN-LAST:event_DMRjTableMouseClicked

    private void RecherchejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecherchejButtonActionPerformed
        // Récupérer le texte de recherche
        String recherche = RecherchejTextField.getText();
        String rech = capitalizeFirstLetter(recherche);

        // Créer un filtre pour le tableau
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        DMRjTable.setRowSorter(sorter);
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
                // Crée un filtre pour trouver une correspondance avec le numéro exact de l'identifiant
                sorter.setRowFilter(RowFilter.numberFilter(RowFilter.ComparisonType.EQUAL, num));
            } else {
                // Applique un filtre regex pour la recherche de texte
                sorter.setRowFilter(RowFilter.regexFilter(rech));
            }
        }

        // Vérifie si aucun Patient ne correspond à la recherche
        if (DMRjTable.getRowCount() == 0) {
            // Afficher un message d'erreur
            JOptionPane.showMessageDialog(this, "Aucun Patient ne correspond à votre recherche.", "Erreur de Recherche", JOptionPane.ERROR_MESSAGE);
        } else {
        }

    }//GEN-LAST:event_RecherchejButtonActionPerformed

    private void AjoutPatientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjoutPatientButtonMouseClicked
        // Ouvrir la fenêtre d'ajout de patient
        AjoutPatient nouveauJFrame = new AjoutPatient();
        nouveauJFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_AjoutPatientButtonMouseClicked
    /**
     * Méthode pour récupérer les données des patients depuis la base de données
     * et les afficher dans le tableau jTableDMR.
     */
    private void recuperation_donnees() {

        try {

            Statement stmt = conn.createStatement();
            //exécutation de la requête
            ResultSet rs = stmt.executeQuery("SELECT * FROM PATIENT");
            //on ajoute à la ligne les informations de la tableau
            while (rs.next()) {
                Object[] row = new Object[]{rs.getInt("IDPATIENT"), rs.getString("NOM"), rs.getString("PRENOM"), rs.getDate("DATENAISSANCE"), rs.getString("ADRESSE")};
                model.addRow(row);
            }
            // on applique le model du defaulttable au jTable de l'interface
            DMRjTable.setModel(model);

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Retourne la chaîne inchangée si elle est vide ou nulle
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);  // Met la première lettre en majuscule et concatène le reste
    }

    /**
     * Méthode principale pour lancer l'application. Crée une instance de
     * AccueilPH et l'affiche à l'écran.
     *
     * @param args les arguments de la ligne de commande (non utilisés dans
     * cette application)
     */
    public static void main(String args[]) {

        // Paramétrage du look and feel de l'interface
        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccueilPH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // Création et affichage de l'interface principale
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AccueilPH().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjoutPatientButton;
    private javax.swing.JTable DMRjTable;
    private javax.swing.JButton RecherchejButton;
    private javax.swing.JTextField RecherchejTextField;
    private javax.swing.JButton jButtonDeconnexion;
    private javax.swing.JLabel jLabelBienvenue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel radioTech;
    // End of variables declaration//GEN-END:variables
}
