package wailnaceur.zakriaaithagga.achbarouexam.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wailnaceur.zakriaaithagga.achbarouexam.Dao.DevisDao;
import wailnaceur.zakriaaithagga.achbarouexam.Interface.interfaceGeneric;
import wailnaceur.zakriaaithagga.achbarouexam.bean.client;
import wailnaceur.zakriaaithagga.achbarouexam.bean.devis;

import java.util.List;
import java.util.Optional;

@Service
public class DevisService implements interfaceGeneric<devis> {

    @Autowired
    private DevisDao devisDao;

    public boolean save(devis o){
        if(o == null)
            return false;
        else
        {
            devisDao.save(o);
            return true;
        }
    }

    @Override
    public devis create(devis o) {
        try {
            return devisDao.save(o);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return null;
        }
    }

    @Override
    public devis update(devis o) {
        try {
            return  devisDao.save(o);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String delete(long id) {
        try {
            devisDao.deleteById(id);
            return "deleted";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "error in delete";
        }
    }

    @Override
    public devis findById(long id) {
        Optional<devis> devis=devisDao.findById(id);
        if(devis.isPresent()) {
            return devis.get();
        }
        return null;
    }

    @Override
    public List<devis> findAll() {
        return devisDao.findAll();
    }
}
