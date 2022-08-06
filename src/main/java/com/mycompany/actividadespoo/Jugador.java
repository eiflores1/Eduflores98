/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadespoo;

/**
 *
 * @author Usuario
 */
public class Jugador { 
//Variables    
    private String Nombre;  
// Constructores
    public Jugador (){
    } 
// Metodos
    public void setPersona (String Nombre){
        this.Nombre = Nombre;
    }
    public String getNombre (){
        return this.Nombre;
    }
    public static void main(String[]arg){
        System.out.println("Nombre jugador");
    }
}
