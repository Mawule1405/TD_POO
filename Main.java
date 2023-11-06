class Main {
    public static void main(String[] args) {
        /** D2clqrqtion des objets */
        ObjetEnVente obj = new ObjetEnVente(123, "tableau", 10000);
        Encherisseur alain = new Encherisseur(20000, "KOMBILA", "Alain");
        Encherisseur raissa = new Encherisseur(25000, "KONE", "Raissa");

        // *Les deux Enrechisseur veulent acheter l'objet b */
        alain.acheterLobjet(obj);
        raissa.acheterLobjet(obj);

        Boolean objetEstAcheter = alain.getEtat() == "IN" & raissa.getEtat() == "IN";

        while (objetEstAcheter) {
            alain.ajouterMise(1000);
            raissa.ajouterMise(2000);
            objetEstAcheter = alain.getEtat() == "IN" & raissa.getEtat() == "IN";
        }

        if (alain.getEtat() == "IN") {
            System.out.println("L'objet " + obj.getType() + " est acheté par " + alain.getNom() +
                    " " + alain.getPrenom() + " à " + obj.getValeur() + " FCFA");
        } else {
            System.out.println("L'objet " + obj.getType() + " est acheté par " + raissa.getNom() +
                    " " + raissa.getPrenom() + " à " + obj.getValeur() + " FCFA");
        }
    }
}