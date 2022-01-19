package wailnaceur.zakriaaithagga.achbarouexam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wailnaceur.zakriaaithagga.achbarouexam.Dao.ProductDao;
import wailnaceur.zakriaaithagga.achbarouexam.Interface.interfaceGeneric;
import wailnaceur.zakriaaithagga.achbarouexam.bean.product;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements interfaceGeneric<product>{


    @Autowired
    private ProductDao productDao;


    @Override
    public boolean save(product o){
        if(o == null)
            return false;
        else
        {
            productDao.save(o);
            return true;
        }
    }
    @Override
    public product create(product o) {
        try {
            return productDao.save(o);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return null;
        }
    }

    @Override
    public product update(product o) {
        try {
            return  productDao.save(o);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String delete(long id) {
        try {
            productDao.deleteById(id);
            return "deleted";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "error in delete";
        }
    }

    @Override
    public product findById(long id) {
        Optional<product> product=productDao.findById(id);
        if(product.isPresent()) {
            return product.get();
        }
        return null;
    }

    @Override
    public List<product> findAll() {
        return productDao.findAll();
    }
   
}
