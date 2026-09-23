import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Utilisateur> utilisateurs = new ArrayList<>();
    utilisateurs.add(new Etudiant((long) 1, "Jean", "Jean@gmail.com", "we231da", Niveau.L3));
    utilisateurs.add(new Formateur((long) 2, "Pierre", "Pierre@gmail.com", (byte) 5));
    for (Utilisateur u : utilisateurs) {
    System.out.println(u.afficherProfil());
}
    }
}
