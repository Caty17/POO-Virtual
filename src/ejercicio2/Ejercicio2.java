/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author KATY
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo carro = new Vehiculo();
        Vehiculo moto = new Vehiculo();
        
        carro.marca = "Toyota";    
        carro.modelo = "Corrolla"; 
        carro.color = "Rojo";        
        carro.SetPrecio("23000");
        carro.mostrar();
        
        moto.marca = "Honda";
        moto.modelo = "CB1 Star";
        moto.color = "Negro";  
        moto.SetPrecio("2500");
        moto.imprimir();
    }
    
}
