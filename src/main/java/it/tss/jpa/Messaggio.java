/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.jpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * trovo la PERSISTENCE in other source;
 * 
 * @author tss
 */

@Entity//questo produrrà una tabella su db
@Table(name = "messaggio")//cambia il nome di default
public class Messaggio implements Serializable{//interfaccai vuota
    
    @Id//produce la chiave id per la tabella
    @GeneratedValue//id lo sto annotando per essere persistente su db con autoincremento
    private long id;//la tabella avrà 2 campi
    
    private String testo;

    public Messaggio() {
    }
       
    public Messaggio (String testo){
    this.testo = testo;
}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }
    
    
    
}
