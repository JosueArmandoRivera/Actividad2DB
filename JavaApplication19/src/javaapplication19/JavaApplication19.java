/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author Dell
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conexion = new Connection();
        
        conexion.Mostrar();
        //conexion.insertar("Nadar");
        System.out.println("Otro");
        //conexion.Mostrar();
        System.out.println("Otro mas");
        //conexion.Actualizar("Nadar", "Brincar");
        conexion.Eliminar("Brincar");
        conexion.Mostrar();
    }
    
}
