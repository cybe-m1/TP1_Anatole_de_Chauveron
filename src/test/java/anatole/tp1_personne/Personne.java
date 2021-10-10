package anatole.tp1_personne;

public class Personne {
    private int id;
    private String prenom, nom;

    public Personne(int id, String prenom, String nom) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return this.prenom + " " + this.nom + " (id:" + this.id + ")";
    }
}
