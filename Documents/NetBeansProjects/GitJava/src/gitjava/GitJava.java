package gitjava;

/**
 *
 * @author Gaston
 */
public class GitJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre");
        Persona persona = new Persona("Gaston");
        System.out.println(persona.toString());
                
    }

}
