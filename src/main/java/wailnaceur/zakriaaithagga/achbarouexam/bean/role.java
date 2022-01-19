package wailnaceur.zakriaaithagga.achbarouexam.bean;


import javax.persistence.*;
import java.util.Set;

@Entity(name="roles")
public class role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String role_name;

    @OneToMany(mappedBy = "role")
    private Set<client> clients;
}
