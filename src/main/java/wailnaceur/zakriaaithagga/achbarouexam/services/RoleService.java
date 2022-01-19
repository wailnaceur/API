package wailnaceur.zakriaaithagga.achbarouexam.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wailnaceur.zakriaaithagga.achbarouexam.Dao.RoleDao;
import wailnaceur.zakriaaithagga.achbarouexam.Interface.interfaceGeneric;
import wailnaceur.zakriaaithagga.achbarouexam.bean.role;
import java.util.List;
import java.util.Optional;

@Service
public class RoleService implements interfaceGeneric<role>{

    @Autowired
    private RoleDao roleDao;

    public boolean save(role o){
        if(o == null)
            return false;
        else
        {
            roleDao.save(o);
            return true;
        }
    }

    @Override
    public role create(role o) {
        try {
            return roleDao.save(o);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return null;
        }
    }

    @Override
    public role update(role o) {
        try {
            return  roleDao.save(o);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String delete(long id) {
        try {
            roleDao.deleteById(id);
            return "deleted";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "error in delete";
        }
    }

    @Override
    public role findById(long id) {
        Optional<role> role=roleDao.findById(id);
        if(role.isPresent()) {
            return role.get();
        }
        return null;
    }

    @Override
    public List<role> findAll() {
        return roleDao.findAll();
    }
   
    
}
