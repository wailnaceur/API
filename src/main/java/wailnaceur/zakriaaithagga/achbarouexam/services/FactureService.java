package wailnaceur.zakriaaithagga.achbarouexam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wailnaceur.zakriaaithagga.achbarouexam.Dao.FactureDao;
import wailnaceur.zakriaaithagga.achbarouexam.Interface.interfaceGeneric;
import wailnaceur.zakriaaithagga.achbarouexam.bean.facture;
import java.util.List;
import java.util.Optional;

@Service
public class FactureService implements interfaceGeneric<facture> {

    @Autowired
    private FactureDao factureDao;

    @Override
    public boolean save(facture o){
        if(o == null)
            return false;
        else
        {
            factureDao.save(o);
            return true;
        }
    }

    @Override
    public facture create(facture o) {
        try {
            return factureDao.save(o);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return null;
        }
    }

    @Override
    public facture update(facture o) {
        try {
            return factureDao.save(o);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String delete(long id) {
        try {
            factureDao.deleteById(id);
            return "deleted";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "error in delete";
        }
    }

    @Override
    public facture findById(long id) {
        Optional<facture> facture=factureDao.findById(id);
        if(facture.isPresent()) {
            return facture.get();
        }
        return null;
    }

    @Override
    public List<facture> findAll() {
        return factureDao.findAll();
    }
}
