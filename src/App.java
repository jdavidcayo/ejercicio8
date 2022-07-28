
public class App {
    public static void main(String[] args) throws Exception {
        Persona person = new Persona();

        person.setNombre("David");
        person.setEdad(35);
        person.setTelefono("2615749489");

        System.out.println("Nombre:" + person.getNombre() +
                            "\tEdad:" + person.getEdad() +
                            "\tTelefono:" + person.getTelefono()                    
        );
    }
}


