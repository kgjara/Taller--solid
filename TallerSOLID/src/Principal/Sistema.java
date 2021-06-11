/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.Aderezo;
import Postres.*;
import Procesos.*;
import Leche.*;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
        LecheEntera leche = new LecheDeslactosada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        
        
        helado_vainilla.anadirAderezoHelado( Aderezo.CREMA);
        helado_vainilla.anadirAderezoHelado( Aderezo.FRUTILLA);
        System.out.println(helado_vainilla);
        mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
        
        System.out.println(ManejadorDePrecio.showPrecioFinald(helado_vainilla.getPrecioParcial(),helado_vainilla.getAderezos()));
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        
        pastel_chocolate.anadirAderezoPastel(Aderezo.CREMA);
        pastel_chocolate.anadirAderezoPastel(Aderezo.FRUTILLA);
        

        System.out.println(pastel_chocolate);
//        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
        System.out.println(ManejadorDePrecio.showPrecioFinald(pastel_chocolate.getPrecioParcial(),pastel_chocolate.getAderezos()));
        
        
    }
}
