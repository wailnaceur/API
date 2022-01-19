package wailnaceur.zakriaaithagga.achbarouexam.bean;

import javax.persistence.*;

@Entity(name="devises")
public class devis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String date_devise;
    private String Montant_devise;
    private Long id_facture;

    @ManyToOne
    @JoinColumn(name = "devis_id")
    private facture facture;

    @Override
    public String toString() {
        return "devis{" +
                "id=" + id +
                ", date_devise='" + date_devise + '\'' +
                ", Montant_devise='" + Montant_devise + '\'' +
                ", id_facture=" + id_facture +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate_devise(String date_devise) {
        this.date_devise = date_devise;
    }

    public void setMontant_devise(String montant_devise) {
        Montant_devise = montant_devise;
    }

    public void setId_facture(Long id_facture) {
        this.id_facture = id_facture;
    }

    public Long getId() {
        return id;
    }

    public String getDate_devise() {
        return date_devise;
    }

    public String getMontant_devise() {
        return Montant_devise;
    }

    public Long getId_facture() {
        return id_facture;
    }
}
