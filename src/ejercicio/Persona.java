/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author KATY
 */
public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    private String CI;
    
    public void SetCI(String CI){
    this.CI = CI;
    }
    
    public String GetCI(){
    return CI;
    }
}
