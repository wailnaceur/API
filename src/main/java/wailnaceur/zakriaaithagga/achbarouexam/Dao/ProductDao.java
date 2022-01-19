package wailnaceur.zakriaaithagga.achbarouexam.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import wailnaceur.zakriaaithagga.achbarouexam.bean.product;

@EnableJpaRepositories
public interface ProductDao extends JpaRepository<product,Long> {

}
