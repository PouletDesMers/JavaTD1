public class Formateur extends Utilisateur {
    private Byte anneesExperience;

    public Formateur(Long id, String nom, String email) {
        super(id,nom, email);
    }

    @Override 
    public String getRole(){
        return "Formateur";
    }

    public final  void setAnneesExperience(Byte anneesExperience) {
        if (anneesExperience == null) {
            throw new IllegalArgumentException("L'email doit être non nul et contenir le caractère '@'.");
        }
        this.anneesExperience = anneesExperience;
    }

    public Byte getAnneesExperience() {
        return anneesExperience;
    }

    @Override
    public String afficherProfil() {
        return String.format("Formateur #%d - %s <%s>, %d années", getId(), getNom(), getEmail(),getAnneesExperience());
    }

}
