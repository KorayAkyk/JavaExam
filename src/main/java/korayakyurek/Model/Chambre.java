package korayakyurek.Model;

import javax.persistence.*;

@Entity
@Table(name = "Chambre")
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_chambre", nullable = false, unique = false)
    private int numeroChambre;
    @Column(name = "superficie", nullable = false, unique = false)
    private float superficie;
    @Column(name = "type", nullable = false, unique = false)
    private String type;
    @Column(name = "etage", nullable = false, unique = false)
    private int etage;
    @ManyToOne
    @JoinColumn(name="HotelID")
    private Hotel HotelID;

    public int getNumeroChambre() {
        return numero_chambre;
    }
    public void setNumeroChambre(int numChambre) {
        this.numero_chambre = numero_chambre;
    }
    public float getSuperficie() {
        return superficie;
    }
    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getEtage() {
        return etage;
    }
    public void setEtage(int etage) {
        this.etage = etage;
    }
    public Hotel getHotelID() {
        return HotelID;
    }
    public void setHotelID(Hotel HotelID) {
        this.HotelID = HotelID;
    }
}

