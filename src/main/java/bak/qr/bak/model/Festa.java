package bak.qr.bak.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "feste")
public class Festa implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq_gen")
    @SequenceGenerator(name = "my_seq_gen", sequenceName = "GEN_SEQUENCE")
    private Long id;


    private String nomefesta;

    private Date datafesta;


    public Long getId() {
        return id;
    }


    public Date getDatafesta() {
        return datafesta;
    }

    public String getNomefesta() {
        return nomefesta;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDatafesta(Date datafesta) {
        this.datafesta = datafesta;
    }

    public void setNomefesta(String nomefesta) {
        this.nomefesta = nomefesta;
    }
}
