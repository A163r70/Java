
package Vehiculos;

/**
 *
 * @author sc03m15
 */
public class Principal {
    
    //main
    public static void main(String[] args){
        
        //instancia de un objeto
        Coche coche1 = new Coche();//estamos llamando un constructor de 
        
        Coche coche2 = new Coche("sss", "www", 2021);
        
        coche1.setAnio(1999);
        coche1.setMarca("Toyota");
        coche1.setModelo("Ae86");
        coche1.setTipoCombustible("Diesel");
        coche1.setNumPuerta(4);
        
        System.out.println();
        
    }
    
}
