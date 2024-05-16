public class Mamifero {
    private String nombre;

    public Mamifero (String nombre){
        this.nombre = nombre;
    }

    public Mamifero(){
        this.nombre = "Por definir";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
