package wailnaceur.zakriaaithagga.achbarouexam.ws;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wailnaceur.zakriaaithagga.achbarouexam.bean.client;
import wailnaceur.zakriaaithagga.achbarouexam.services.ClientService;

import java.util.List;

@RestController
@RequestMapping("/api/devis")
public class DevisProvider {
    @Autowired
    private ClientService clientService;


    @GetMapping(value = "/id/{id}")
    public client user(@PathVariable long id){
        return clientService.findById(id);
    }
    @DeleteMapping(value = "/id/{id}")
    public String delete(@PathVariable long id){
        return  clientService.delete(id);
    }
    @PutMapping(value = "/update")
    public client update(@RequestBody client cl){
        return  clientService.update(cl);
    }
    @PostMapping("/create")
    public ResponseEntity<client> create(@RequestBody client cl) {
        System.out.println("hello "+cl);
        if (clientService.create(cl).equals(null)) {
            return new ResponseEntity<client>(HttpStatus.INTERNAL_SERVER_ERROR);
        } else
            return new ResponseEntity<client>(clientService.create(cl), HttpStatus.CREATED);
        //		return null;
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<client>> findAll() {
        if (clientService.findAll().equals(null)) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<List<client>>(clientService.findAll(), HttpStatus.CREATED);
    }
}
