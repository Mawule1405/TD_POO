public class Encherisseur extends Personne {
    /*
     * Auteur HELOU Komlan Mawulé
     * Date: 06/11/2023
     * BUt: Implémentation de la famille des Enchérisseur
     */

    private float miseLimite; // *La mise maximale de l'enchérisseur */
    private String etat; // *Etat de l'enchérisseur: en course (IN) hors course (OUT) */
    ObjetEnVente objetAcheter; // *Objet acheter */

    public Encherisseur(float miseLimite, String nom, String prenom) {
        super(nom, prenom);
        this.miseLimite = miseLimite;
        this.etat = "IN";

    }

    /**
     * getters definitions
     */
    public float getMiseLimite() {
        return this.miseLimite;
    }

    public String getEtat() {
        return this.etat;
    }

    /**
     * setters definitions
     */
    public void setMiseLimite(float moneyLimit) {
        this.miseLimite = moneyLimit;
    }

    public void setEtat(String statut) {
        this.etat = statut;
    }

    public void ajouterMise(float somme) {
        // *:ethode d'ajout de la mise */
        if (this.miseLimite < objetAcheter.getValeur()) {
            System.out.println("Enchérisseur " + this.nom + " a abandonné la partie\n");
            this.setEtat("OUT");
        } else {
            this.objetAcheter.ajouterMise(somme);
        }

    }

    public void acheterLobjet(ObjetEnVente objet) {
        this.objetAcheter = objet;
        Encherisseur toto = this;
        this.objetAcheter.setListeDesEncherisseur(toto);
    }
}
