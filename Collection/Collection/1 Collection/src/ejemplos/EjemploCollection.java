/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploCollection;

import java.util.ArrayList;
import java.util.List;
       


/**
 *
 * @author MINEDUCYT
 */
public class EjemploCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    List<String> personas =new ArrayList();
    
    personas.add("Marcelo");
    personas.add("David");
    personas.add("Jose");
    personas.add("Juan");
    
    System.out.println("Personas en la lista" + personas);
    
    personas.remove("David");
    
    System.out.println("Lista final" + personas);
    
    
    
    
    
    
    
}
}
        // TODO code application logic here
   
    
