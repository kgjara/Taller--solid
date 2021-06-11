package Procesos;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class ManejadorDePrecio {
	
    public  static double calcularPrecioFinal(double precioParcial, ArrayList<Aderezo> aderezos){ 	
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;}
        
        
	public static String showPrecioFinald(double precioParcial2, ArrayList<Aderezo> aderezos2){
            return "Precio Final: $ " + calcularPrecioFinal(precioParcial2 , aderezos2); 
        
	}

}
