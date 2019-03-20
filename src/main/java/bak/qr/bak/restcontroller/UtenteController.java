package bak.qr.bak.restcontroller;

import bak.qr.bak.model.Utente;
import bak.qr.bak.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UtenteController {


    @Autowired
    UtenteRepository utenteRepository;

    @GetMapping("/creautente/{nomeutente}")
    public String creautente(@PathVariable String nomeutente){
        Utente u = new Utente();
        u.setNomeutente(nomeutente);

        try {
            utenteRepository.save(u);
            return "SALVATO";
        }catch(Exception e){
            e.printStackTrace();
            return "NON SALVATO";
        }
    }

    @GetMapping("/getallutenti")
    public List<Utente> getallutenti(){
        return utenteRepository.findAll();
    }


}
