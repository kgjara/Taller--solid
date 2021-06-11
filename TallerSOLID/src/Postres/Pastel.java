/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;
import Procesos.AderezoPastel;

/**
 *
 * @author Pedro Mendoza
 */
public class Pastel extends Postre implements AderezoPastel{

    public Pastel(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
        this.precioParcial = 15.55;
    }
    
    
    @Override
    public void anadirAderezoPastel(Aderezo aderezo){
        this.getAderezos().add(aderezo);
    }
    
    
    @Override
    public void quitarAderezoPastel(Aderezo aderezo){
        this.getAderezos().remove(aderezo);
    }
    

    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    


    
}
