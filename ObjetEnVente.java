import java.util.ArrayList;

public class ObjetEnVente {
    /*
     * Auteur HELOU Komlan Mawulé
     * Date: 06/11/2023
     * BUt: Implémentation de la famille des objets en vente
     */

    private int numero; // *Numero de l'objet */
    private String type; // *Type d'objet */
    private float valeur; // *le prix de l'objet */
    private ArrayList<Encherisseur> listeDesEncherisseurs;

    public ObjetEnVente(int numero, String type, float valeur) {
        this.numero = numero;
        this.type = type;
        this.valeur = valeur;
        this.listeDesEncherisseurs = new ArrayList<Encherisseur>();

    }

    /**
     * Définition des getteurs
     */

    public int getNumero() {
        return this.numero;
    }

    public String getType() {
        return this.type;
    }

    public float getValeur() {
        return this.valeur;
    }

    public ArrayList<Encherisseur> getListeDesEncherisseurs() {
        return this.listeDesEncherisseurs;
    }

    /**
     * setters definition
     */

    public void setNumero(int number) {
        this.numero = number;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public void setValeur(float price) {
        this.valeur = price;
    }

    public void setListeDesEncherisseur(Encherisseur toto) {
        if (this.getListeDesEncherisseurs().size() <= 1) {
            this.listeDesEncherisseurs.add(toto);
        } else {
            System.out.println("Le nombre d'encherisseurs est suffissant!\n");
        }
    }

    /**
     * methode ajouterMise
     */

    public void ajouterMise(float price) {
        this.valeur = this.valeur + price;
    }

}
