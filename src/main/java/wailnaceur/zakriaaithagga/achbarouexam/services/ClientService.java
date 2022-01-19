package wailnaceur.zakriaaithagga.achbarouexam.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wailnaceur.zakriaaithagga.achbarouexam.Dao.ClientDao;
import wailnaceur.zakriaaithagga.achbarouexam.Dao.RoleDao;
import wailnaceur.zakriaaithagga.achbarouexam.Interface.interfaceGeneric;
import wailnaceur.zakriaaithagga.achbarouexam.bean.client;
import wailnaceur.zakriaaithagga.achbarouexam.bean.role;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements interfaceGeneric<client> {

    @Autowired
    private ClientDao clientDao;

    @Override
    public boolean save(client o){
        if(o == null)
            return false;
        else
        {
            clientDao.save(o);
            return true;
        }
    }

    @Override
    public client create(client o) {
        try {
            return clientDao.save(o);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return null;
        }
    }

    @Override
    public client update(client o) {
        try {
            return  clientDao.save(o);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String delete(long id) {
        try {
            clientDao.deleteById(id);
            return "deleted";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "error in delete";
        }
    }

    @Override
    public client findById(long id) {
        Optional<client> client=clientDao.findById(id);
        if(client.isPresent()) {
            return client.get();
        }
        return null;
    }

    @Override
    public List<client> findAll() {
        return clientDao.findAll();
    }
}
