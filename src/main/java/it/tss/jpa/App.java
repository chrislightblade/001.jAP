/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tss
 */
public class App {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("pu");//per l'accesso al db
        EntityManager em = emf.createEntityManager();//per svolgere operazioni su db
        
        Messaggio msg = new Messaggio("Pranzo...");
        
        em.getTransaction().begin();//apro processo modifiche;
        //em.merge(msg);
        
        Messaggio finded = em.find(Messaggio.class, 1l);// 1 in long
        System.out.println(finded);
        finded.setTesto(finded.getTesto() + "adesso...");
        em.merge(finded);
        
        em.getTransaction().commit();
        
    }
    
}
