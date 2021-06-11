/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;
import Procesos.AderezoHelado;

/**
 *
 * @author Pedro Mendoza
 */
public class Helado extends Postre implements AderezoHelado{
    
    public Helado(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
        this.precioParcial = 7.85;
    }
    
	@Override
    public void anadirAderezoHelado(Aderezo aderezo){
        this.getAderezos().add(aderezo);
    }
    
    
    @Override
    public void quitarAderezoHelado(Aderezo aderezo){
        this.getAderezos().remove(aderezo);
    }
    
    


    @Override
    public String toString() {
        return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }

    
    
    
}
