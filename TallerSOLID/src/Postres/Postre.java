package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class Postre {
	protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;

    
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    
    public double getPrecioParcial(){
    	return precioParcial;
    }
}
