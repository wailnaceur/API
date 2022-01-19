package wailnaceur.zakriaaithagga.achbarouexam.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import wailnaceur.zakriaaithagga.achbarouexam.bean.devis;

@EnableJpaRepositories
public interface DevisDao extends JpaRepository<devis,Long> {
}
