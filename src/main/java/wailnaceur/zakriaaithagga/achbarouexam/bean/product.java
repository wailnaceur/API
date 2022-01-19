package wailnaceur.zakriaaithagga.achbarouexam.bean;

import javax.persistence.*;

@Entity(name="products")
public class product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String qte;
    private String prix;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private client client;

    @ManyToOne
    @JoinColumn(name = "facture_id")
    private facture facture;

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", qte='" + qte + '\'' +
                ", prix='" + prix + '\'' +
                '}';
    }




    public Long getId() {
        return id;
    }

    public String getQte() {
        return qte;
    }

    public String getPrix() {
        return prix;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQte(String qte) {
        this.qte = qte;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }
}
