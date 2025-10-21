
package Vehiculos;

/**
 *
 * @author sc03m15
 */
//clase hija o subclase
public class Coche extends Vehiculo{
    //atibutos
    private int numPuerta;
    private String tipoCombustible;
    
    //constructoer para la super clase
    public Coche(String marca, String modelo, int anio){
        super(marca, modelo, anio);
    }
    
    //constructor vacio
    public Coche(){
        
    }
    
    //constructor con parametros
    public Coche(int numPuerta, String tipoCombustible){
        this.numPuerta = numPuerta;
        this.tipoCombustible = tipoCombustible;
    }
    
    //metodos de acceso
    public int getNumPuerta(){
        return numPuerta;
    }
    public void setNumPuerta(int numPuerta){
        this.numPuerta = numPuerta;
    }
    
    public String getTipoCombustible(){
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }
    
    //sobreeescritura se usa la palabra reservada @Override para lo siguiente que se va a sobreescribir
    @Override
    public void mostrarInformacion(){
        System.out.println("Clase Coche");
        System.out.println(numPuerta);
        System.out.println(tipoCombustible);
    }
    
}
