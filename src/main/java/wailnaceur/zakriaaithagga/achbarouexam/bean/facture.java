package wailnaceur.zakriaaithagga.achbarouexam.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity(name="factures")
public class facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String date;
    private String devise_facture;
    private String totalprix;
    private Long id_product;


    @OneToMany(mappedBy = "facture")
    private Set<devis> devises;

    @OneToMany(mappedBy = "facture")
    private Set<product> products;

    @Override
    public String toString() {
        return "facture{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", devise_facture='" + devise_facture + '\'' +
                ", totalprix='" + totalprix + '\'' +
                ", id_product=" + id_product +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDevise_facture(String devise_facture) {
        this.devise_facture = devise_facture;
    }

    public void setTotalprix(String totalprix) {
        this.totalprix = totalprix;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public Long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getDevise_facture() {
        return devise_facture;
    }

    public String getTotalprix() {
        return totalprix;
    }

    public Long getId_product() {
        return id_product;
    }
}
