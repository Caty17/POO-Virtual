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
public class Vehiculo {
    public String marca;
    public String modelo;
    public String color;
    private String precio;
    
    public void SetPrecio(String precio){
    this.precio = precio;
    }
    
    public String GetPrecio(){
    return precio;
    }
    
   //vehiculo
    public void mostrar(){
    System.out.println("Datos vehiculo: "+"Marca "+ marca +" Modelo "+modelo+" Color "+color+" Precio "+precio);
    }
    
    public void imprimir(){
    System.out.println("Datos moto: "+"Marca "+ marca +" Modelo "+modelo+" Color "+color+" Precio "+precio);
    }
}
