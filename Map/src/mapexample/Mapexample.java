/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapexample;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cartagena
 */
public class Mapexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, String> colores = new HashMap<>();
        
        // Asignación de valores al Map
        colores.put(1, "Azul");
        colores.put(2, "Rosado");
        colores.put(3, "Celeste");
        
        System.out.println("Contenido del Map: " + colores);
        
        // Eliminar un elemento por su clave
    
        colores.remove(1);
        System.out.println("Contenido del Map después de eliminar la clave 1: " + colores);
    }
    
}
