//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Persona juan = new Persona('m');
        juan.setNombre("Juan");
        juan.setFechaNacimiento(4, 3, 2024);
        System.out.println("Nombre de usuario: " + juan.getNombre());
        System.out.println("Sexo de usuario: " + juan.getSexoBiologico());
        System.out.println("Fecha de Nacimiento: " + juan.getFechaNacimeinto());
    }
}