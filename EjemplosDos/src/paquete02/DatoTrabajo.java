/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {
    // método que permita preguntar al usuario el nombre de la empresa
    public static String obtenerTrabajo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la emrpesa");
        String trabajo = entrada.nextLine();
        
        return trabajo;
    }
    
    // método que permita preguntar al usuario la dirección de la empresa
    public static String obtenerDireccionTrabajo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la direccion de la emrpesa");
        String direccionempresa = entrada.nextLine();
        
        return direccionempresa;
    }
}
