package korayakyurek.Model;

import javax.persistence.*;

@Entity
@Table(name = "Directeur")
public class Directeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private int ID;
    @Column(name = "NOM", nullable = true, unique = false)
    private String NOM;
    @Column(name = "PRENOM", nullable = true, unique = false)
    private String PRENOM;

    public int getId() {
        return ID;
    }

    public void setId(int ID) {
        this.ID = ID;
    }

    public String getNom() {
        return NOM;
    }

    public void setNom(String NOM) {
        this.NOM = NOM;
    }

    public String getPrenom() {
        return PRENOM;
    }

    public void setPrenom(String PRENOM) {
        this.PRENOM = PRENOM;
    }
}
