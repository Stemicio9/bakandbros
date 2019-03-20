package bak.qr.bak.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "qr_model")
public class QrModel implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Festa festa;

    @OneToOne
    private Utente utente;


    public Long getId() {
        return id;
    }


    public Festa getFesta() {
        return festa;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public void setFesta(Festa festa) {
        this.festa = festa;
    }
}
