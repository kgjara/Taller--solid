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
    public void anadirAderezoHelado(Helado helado,Aderezo aderezo){
		System.out.println(helado.getAderezos());
        helado.getAderezos().add(aderezo);
    }
    
    
    @Override
    public void quitarAderezoHelado(Helado helado,Aderezo aderezo){
        helado.getAderezos().remove(aderezo);
    }
    
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }


    @Override
    public String toString() {
        return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
    
    
    
}
