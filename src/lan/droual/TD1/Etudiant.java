package lan.droual.TD1;

public class Etudiant extends Utilisateur{
    private Niveau niveau;
    private String numeroEtudiant;

    public Etudiant(Long id, String nom, String email, String numeroEtudiant, Niveau niveau) {
        super(id, nom, email);
        setNumeroEtudiant(numeroEtudiant);
        setNiveau(niveau);
    }

    public String getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    @Override 
    public String getRole(){
        return "Etudiant";
    }

    public final void setNumeroEtudiant(String numeroEtudiant) {
        if (numeroEtudiant == null || numeroEtudiant.trim().isEmpty()) {
            throw new IllegalArgumentException("Le numéro étudiant est obligatoire (non nul et non vide).");
        }
        this.numeroEtudiant = numeroEtudiant.trim();
    }

    public final void setNiveau(Niveau niveau) {
        if (niveau == null) {
            throw new IllegalArgumentException("Le niveau de l'étudiant est obligatoire.");
        }
        this.niveau = niveau;
    }

    @Override
    public String afficherProfil() {
        return String.format("Etudiant #%d nº%s- %s %s  <%s>", getId(),getNumeroEtudiant(), getNom(),getNiveau(), getEmail());
    }
}
