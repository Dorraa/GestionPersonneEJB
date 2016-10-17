/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.presentation;

import Entities.Personne;
import boundary.PersonneFacade;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author dorra
 */
@ManagedBean (name="GestionPersonne")
@RequestScoped
public class GestionPersonne {

    @EJB
    private PersonneFacade msgF;
    private Personne personne;
    
    /**
     * Creates a new instance of GestionPersonne
     */
    public GestionPersonne() {
        this.personne=new Personne();
    }
    public String ajouterPersonne(){
        this.msgF.create(personne);
        return "success";
    }
    public Personne getPersonne(){
        return personne;
    }
    public String supprimerPersonne() {
    
      this.msgF.remove(personne);
      
    
    return "success";
  }
}
