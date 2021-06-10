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
public class Pastel implements AderezoPastel{
    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public Pastel(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
        this.precioParcial = 15.55;
    }
    
    @Override
    public void anadirAderezoPastel(Pastel pastel,Aderezo aderezo){
        pastel.getAderezos().add(aderezo);
    }
    
    @Override
    public void quitarAderezoPastel(Pastel pastel,Aderezo aderezo){
        pastel.getAderezos().remove(aderezo);
    }
    
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }


    
}
