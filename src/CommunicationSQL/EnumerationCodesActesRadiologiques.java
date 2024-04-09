/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationSQL;//mon

// Cette enumeration fait intervenir des valeurs qui possedent des
// attributs ('libelle' et 'cout') qui sont initialises par un appel du
// constructeur (arguments entre parentheses apres le nom de chaque valeur).
// Par exemple, la valeur EnumerationCodesActesRadiologiques.FP a un attribut 'libelle' contenant la chaine
// de caracteres "forfait pediatrique" et un attribut 'cout' ayant la valeur 5.0
enum EnumerationCodesActesRadiologiques {

    // valeurs de l'�num :

    C("Consultation au cabinet par le generaliste, chirurgien-dentiste omnipraticien ou sage femme avec majoration", 25.0),
    CS("consultation au cabinet par un medecin generaliste", 23.0),
    TC("consultation a distance realisee entre un medecin specialiste et un patient(teleconsultation)", 23.0),
    APC("Avis ponctuel de consultant pour une consultation au cabinet du medecin specialiste", 55.0),
    APV("Avis ponctuel de consultant pour une visite au domicile du malade", 55.0),
    APY("Avis ponctuel de consultant pour une consultation au cabinet d'un psychiatre, neuropsychiatre ou d'un neurologue", 62.50),
    APU("Avis ponctuel de consultant pour une consultation d un professeur des universites-praticien hospitalier", 69.0),
    CCP("Consultation de contraception et de prevention", 46.0),
    U03("Consultation correspondant au niveau CCMU3 du medecin urgentiste", 30.0),
    U45("Consultation correspondant au niveau CCMU4 ou au niveau CCMU5 du medecin urgentiste", 46.0),
    COE("Consultation obligatoire de l enfant", 46.0),
    CSC("- Consultation specifique au cabinet par un medecin specialiste en pathologie cardiovasculaire ou en cardiologie et\n"
            + "medecine des affections vasculaires", 47.73),
    SNP("Majoration pour soins non programmes", 15.0),
    IMT("Consultation initiale d inscription d un medecin en tant que medecin traitant pour un patient relevant d une ALD exonerante", 60.0),
    CNPSY("Consultation au cabinet par le medecin neuropsychiatre qualifie, psychiatre qualifie ou neurologue qualifie", 42.50),
    CDE("Consultation de depistage du melanome realisee au cabinet par un medecin specialiste en dermatologie", 46.0),
    TCG(" consultation a distance realisee entre un medecin specialiste psychiatre, neuropsychiatre ou neurologue et un patient (teleconsultation)", 42.50),
    FP("forfait pediatrique", 5.0),
    TE1("Acte de teleexpertise de niveau 1 d un medecin sollicite par un autre medecin", 20.0),
    TE2("Acte de teleexpertise de niveau 2 d un medecin sollicite par un autre medecin", 85.0),
    RNO("Realisation d un bilan visuel a distance dans le cadre d un protocole de delegation entre l ophtalmologue et l orthoptiste", 28.0),
    V("Visite au domicile du malade par le medecin generaliste, le chirurgien-dentiste omnipraticien ou la sage-femme.", 55.0),
    VL("Visite tres complexe realisee au domicile du patient", 60.0),
    VS("Visite au domicile du malade par le medecin specialiste qualifie, le medecin specialiste qualifie en medecine generale ou le chirurgien dentiste specialiste qualifie.", 23.0),
    VNPSY("Visite au domicile du malade par le medecin neuropsychiatre qualifie, psychiatre qualifie ou neurologue qualifie", 42.50),
    K("Actes de chirurgie et de specialite pratiques par le medecin", 1.92),
    KMB("Prelevement par ponction veineuse directe realisee par le medecin biologiste.", 2.52),
    Z("Actes utilisant les radiations ionisantes pratiques par le medecin ou le chirurgien-dentiste.", 1.33),
    ORT("Traitements d'orthopedie dento-faciale pratiques par le medecin.", 2.15),
    TO("Traitements d'orthopedie dento-faciale pratiques par le chirurgien-dentiste", 0.0),
    SP("seance de suivi ou deentretien postnatal realisee par la sage-femme.", 3.0),
    SF("Actes pratiques par la sage-femme.", 2.80),
    SFI("Soins infirmiers pratiques par la sage-femme", 2.18),
    AMS("Actes de reeducation des affections orthopediques et rhumatologiques effectue par le masseur-kinesiterapeute.", 2.15),
    AMK("Actes pratiques par le masseur-kinesitherapeute au cabinet ou au domicile du malade, a l'exception des actes effectues dans un cabinet installe au sein d'un etablissement d'hospitalisation prive au profit d'un malade hospitalise.", 2.15),
    AMC("Actes pratiques par le masseur-kinesitherapeute dans une structure de soins ou un etablissement, y compris lorsque le malade y a elu domicile, autre que ceux qui donnent lieu a application de la lettre cle AMK.", 2.15),
    AMI("Actes pratiques par leinfirmier ou l'infirmiere, a l'exception des actes infirmiers de soins qui donnent lieu a application de la lettre cle AIS.", 3.15),
    AIS("Actes infirmiers de soins. La lettre cle AIS est applicable aux seances de soins infirmiers et aux gardes au domicile des malades.", 2.65),
    DI("Bilan de soins infirmiers.", 10.0),
    AMP("Actes pratique par le pedicure.", 0.63),
    POD("Acte de prevention pratique par le pedicure-podologue", 27.0),
    AMO("Actes pratique par l orthophoniste.", 2.50),
    AMY("Acte pratique par l orthoptiste.", 2.60),
    BSA("Forfait journalier de prise en charge par l infirmier d un patient dependant ayant une charge en soins dite legere", 13.0),
    BSB(" Forfait journalier de prise en charge par l infirmier d un patient dependant ayant une charge en soins dite intermediaire", 18.20),
    BSC("Forfait journalier de prise en charge par l infirmier d un patient dependant ayant une charge en soins dite lourde", 28.70),
    PAI("Soins infirmiers en pratique avancee", 10.0),
    AMX("acte pratique par l infirmier ou l infirmiere, applicable aux soins realises a domicile pour les patients dependants en sus desseances ou des forfaits", 3.15),
    RQD("Acte de demande d une tele-expertise", 10.0),
    KC("actes de chirurgie et de specialite", 2.09),
    KE("actes d'echographie, de doppler", 1.89),
    KFA("forfait A", 30.49),
    KFB("forfait B", 60.98),
    PRO("prothese dentaire", 2.15);

    // attributs de l'�num :
    private String libelle;
    private double cout;

    // constructeur :
    private EnumerationCodesActesRadiologiques(String libelle, double cout) {
        this.libelle = libelle;
        this.cout = cout;
    }

    // m�thodes :
    public String toString() {
        return super.toString() + " : " + libelle + ", cout=" + getCout() + " euros";
    }

    public String getLibelle() {
        return this.libelle;
    }

    // calcule le prix pour un coefficient donne :
    public double getCout() {
        return cout;
    }
}
