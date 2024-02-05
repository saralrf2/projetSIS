/*
 * To change this license header"), choose License Headers in Project Properties"),
 * To change this template file"), choose Tools | Templates
 * and open the template in the editor"),
 */
package testjdbc;

/**
 *
 * @author alana
 */
public enum EnumFonctionResultatsGetString {

   
    TABLE_CAT("Nom du catalogue dans lequel se trouve la table"),
    TABLE_SCHEM("Nom du schéma dans lequel se trouve la table"),
    TABLE_NAME("Nom de la table"),
    COLUMN_NAME(" Nom de la colonne"),
    DATA_TYPE(" Type de données SQL de la colonne, selon la convention JDBC"),
    TYPE_NAME(" Nom du type de données SQL de la colonne"),
    COLUMN_SIZE(" Taille maximale de la colonne"),
    BUFFER_LENGTH(" Longueur de la colonne pour les types de données binaires, ou null pour les autres types de données"),
    DECIMAL_DIGITS(" Nombre de chiffres à droite du point décimal pour les types de données numériques"),
    NUM_PREC_RADIX(" Base radix) pour les types de données numériques"),
    NULLABLE(" Indique si la colonne peut contenir des valeurs NULL 0 pour non 1 pour oui"),
    REMARKS("Description de la colonne"),
    COLUMN_DEF(" Valeur par défaut de la colonne"),
    SQL_DATA_TYPE(" Pour les types de données SQL cette colonne contient le type SQL défini par SQL-92"),
    SQL_DATETIME_SUB(" Pour les types de données datetime ou interval cette colonne contient le sous-type code défini par SQL-92"),
    CHAR_OCTET_LENGTH(" Pour les types de données de chaîne de caractères il s'agit de la longueur en octets de la colonne"),
    ORDINAL_POSITION(" Position de la colonne dans la table 1 pour la première colonne, 2 pour la deuxième, etc"),
    IS_NULLABLE("YES si la colonne peut contenir des valeurs NULL, NO sinon");

    
    private String string;
    
    private EnumFonctionResultatsGetString(String string) {
        this.string = string;
    }



}
