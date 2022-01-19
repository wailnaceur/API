package wailnaceur.zakriaaithagga.achbarouexam.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity(name="clients")
public class client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String adr;
    private String mail;
    private String tel;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private role role;

    @OneToMany(mappedBy = "client")
    private Set<product> products;

    @Override
    public String toString() {
        return "client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adr='" + adr + '\'' +
                ", mail='" + mail + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdr() {
        return adr;
    }

    public String getMail() {
        return mail;
    }

    public String getTel() {
        return tel;
    }
}
