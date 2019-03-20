package bak.qr.bak.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "utenti")
public class Utente implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq_gen")
    @SequenceGenerator(name = "my_seq_gen", sequenceName = "GEN_SEQUENCE")
    private Long id;


    private String nomeutente;


    public Long getId() {
        return id;
    }

    public String getNomeutente() {
        return nomeutente;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeutente(String nomeutente) {
        this.nomeutente = nomeutente;
    }
}
