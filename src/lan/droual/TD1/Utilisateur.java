package lan.droual.TD1;

import java.util.Objects;

public abstract class Utilisateur {
    private Long id;
    private String nom;
    private String email;


    public Utilisateur(Long id, String nom, String email) {
        setId(id);
        setNom(nom);
        setEmail(email);
    }

    public final  void setId(Long id) {
        if (id != null && id <= 0) {
            throw new IllegalArgumentException("L'identifiant doit être un entier strictement positif.");
        }
        this.id = id;
    }

    public final  void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom ne peut être ni nul ni vide.");
        }
        this.nom = nom.trim();
    }

    public final  void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("L'email doit être non nul et contenir le caractère '@'.");
        }
        this.email = email.trim();
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public abstract String getRole();
    public abstract String afficherProfil();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Utilisateur that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}