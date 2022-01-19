package wailnaceur.zakriaaithagga.achbarouexam.Interface;

import java.util.List;

public interface interfaceGeneric<T> {

    boolean save(T o);
    T create(T o);
    T update(T o);
    String delete(long id);
    T findById(long id);
    List<T> findAll();

}
