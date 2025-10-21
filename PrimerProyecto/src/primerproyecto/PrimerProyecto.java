/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerproyecto;
//libreria para capturar datos de entrada
import java.util.Scanner;

/**
 *
 * @author sc03m15
 */
public class PrimerProyecto {
    //atributos
    private String nombre;
    private int edad;
    
    //métodos
    
    //métodos de acceso
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void mostrarinformacion(){
        System.out.println("Hola Mundo");//imprimir en pantalla
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instancia de un objeto
        PrimerProyecto proyecto1 = new PrimerProyecto();
        //uso de los m
        proyecto1.mostrarinformacion(); 
        
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu nombre chavo: ");
        nombre = entrada.nextLine();//leer una entrada de texto hasta que se le de 
        proyecto1.setNombre(nombre);
        String nombre1 = proyecto1.getNombre();
        System.out.println("Tu nombre es: "+ nombre1);
        System.out.println("Tu nombre es: "+ proyecto1.getNombre());
    }
    
}
