package listaalumnos;
import java.util.*;

/**
 *
 * @author Cartagena
 */
public class ListaAlumnos {
    
    // Declaramos variables globales
    static Scanner scanner = new Scanner(System.in); // Para hacer uso de la lectura de datos
    static Map<String, String> datosAlumno = new HashMap<>(); // Para almacenar los datos
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables de uso
        int opcion;
        boolean salir = true;
        
        System.out.print("Bienvenido \n");
        while(salir){
            System.out.print("Digite una opcion: \n");
            System.out.print("1. Ingresar nuevo alumno \n");
            System.out.print("2. Buscar alumno \n");
            System.out.print("3. Eliminar Alumno \n");
            System.out.print("4. Mostrar todos los alumnos \n");
            System.out.print("5. Salir \n");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion){
                case 1:
                    crearAlumno();
                    break;
                case 2:
                    buscarAlumno();
                    break;
                case 3:
                    eliminarAlumno();
                    break;
                case 4:
                    mostrarAlumno();
                    break;
                case 5:
                    salir = false;
                    break;
                default:
                    System.out.print("Opcion no valida, intente de nuevo \n");
                    break;
            }
        }
    }
    
    /**
     * Insertar
     */
    public static void crearAlumno(){
        System.out.print("Ingrese el carnet del alumno:");
        String carnet = scanner.nextLine();
        carnet = carnet.toUpperCase();
        System.out.print("Ingrese el nombre del alumno:");
        String nombre = scanner.nextLine();
        
        // Buscamos si el carnet ya ha sido ingresado anteriormente
        if (datosAlumno.containsKey(carnet)) {
            System.out.println("Alumno ingresado previamente.");
        }else{
            // Guardamos el carnet en caso de no existir
            datosAlumno.put(carnet, nombre);
            System.out.println("Alumno ingresado exitosamente.");
        }
    }
    
    /**
     * Buscar
     */
    public static void buscarAlumno(){
        System.out.print("Ingrese el carnet del alumno que desea buscar: ");
        String carnet = scanner.nextLine();
        carnet = carnet.toUpperCase();

        if (datosAlumno.containsKey(carnet)) {
            System.out.println("Alumno encontrado: \n " );
            System.out.println("Carnet:" + carnet);
            System.out.println("Nombre:" + datosAlumno.get(carnet));
        } else {
            System.out.println("Alumno no encontrado, no se puede Mostrar.");
        }
    }
    
    /**
     * Eliminar
     */
    public static void eliminarAlumno(){
        System.out.print("Ingrese el carnet del alumno que desee eliminar: ");
        String carnet = scanner.nextLine();
        carnet = carnet.toUpperCase();
        
        if (datosAlumno.containsKey(carnet)) {
            datosAlumno.remove(carnet);
            System.out.println("Alumno eliminado con exito");
        } else {
            System.out.println("Alumno no encontrado, no se puede Eliminar.");
        }
    }
    
    /**
     * Mostrar todos
     */
    public static void mostrarAlumno(){
        datosAlumno.forEach((k, v) -> System.out.println("Carnet:" + k + " Nombre:" + v ));
    }
    
}
