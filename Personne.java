public class Personne {
    /*
     * Auteur HELOU Komlan Mawulé
     * Date: 06/11/2023
     * BUt: Implémentation de la famille des personnes
     */

    protected String nom; // *nom de la personne */
    protected String prenom; // *prenom de la personne */

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * getters definitions
     */
    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    /**
     * setters definitions
     */
    public void setNom(String name) {
        this.nom = name;
    }

    public void setPrenom(String surname) {
        this.prenom = surname;
    }
}
