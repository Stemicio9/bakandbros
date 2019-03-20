package bak.qr.bak.restcontroller;


import bak.qr.bak.model.Festa;
import bak.qr.bak.repositories.FestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class FestaController {

    @Autowired
    FestaRepository festaRepository;

    @GetMapping("/creafesta/{nomefesta}")
    public String creafesta(@PathVariable String nomefesta){
        Festa f = new Festa();
        f.setNomefesta(nomefesta);
        f.setDatafesta(new Date());

        try{
            festaRepository.save(f);
            return "SALVATO";
        }catch(Exception e){
            e.printStackTrace();
            return "NON SALVATO";
        }
    }

    @GetMapping("getallfeste")
    public List<Festa> getallfeste(){
        return festaRepository.findAll();
    }

}
