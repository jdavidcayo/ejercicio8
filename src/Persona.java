public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    //Constructor vacio
    public Persona(){};

    //Getters
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }

    //Setters
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}