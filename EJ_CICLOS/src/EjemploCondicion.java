/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teleinformatica III
 */
public class EjemploCondicion {
    public static void main(String [] args) {
        String nombre = null;
        //Proceso
        if (nombre==null || nombre.length()>5) {
            System.out.println("Hola");
        } else {
            System.out.println("Chao");
        }
        
    }
}
