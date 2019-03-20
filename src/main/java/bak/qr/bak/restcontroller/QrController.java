package bak.qr.bak.restcontroller;

import bak.qr.bak.model.Festa;
import bak.qr.bak.model.Utente;
import bak.qr.bak.qrcode.GeneratoreQr;
import bak.qr.bak.repositories.FestaRepository;
import bak.qr.bak.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
public class QrController {


    @Autowired
    UtenteRepository utenteRepository;

    @Autowired
    FestaRepository festaRepository;


    @GetMapping("/getQr")
    public String prendiQr(){

        try {
            byte[] base64 = GeneratoreQr.getQRCodeImage("Prenotazione Gilda De Marco festa Bak venerdì 5 luglio 2019", 100, 100);
            String string = new String(Base64.getEncoder().encode(base64));



            String html =    " <img style=\"margin:0 auto;\" src=\"data:image/png;base64, " + string + "\" />";

            return html;
        }catch(Exception e){

              return e.getMessage();
        }

    }


    @GetMapping("/iscriviutenteafesta/{idutente}/{idfesta}")
    public String iscriviutenteafesta(@PathVariable Long idutente, @PathVariable Long idfesta){
        try{
            Utente utente = utenteRepository.findById(idutente).get();
            Festa festa = festaRepository.findById(idfesta).get();


            byte[] base64 = GeneratoreQr.generaQrDaInformazioni(utente, festa);
            String string = new String(Base64.getEncoder().encode(base64));


            String html = " <img style=\"margin:0 auto;\" src=\"data:image/png;base64, " + string + "\" />";

            return html;
        }catch(Exception e){

           return e.getMessage();
        }


    }



}
