package main.types.lamda.entidades;

public class MethodsUser {

    private String nombre;

    public MethodsUser(String nombre) {
        this.nombre = nombre;
    }

    public static void referenciaAMetodoEstatico(){
        System.out.println("Probando referencia a metodo estatico");
    }

    public void referenciaAMetodoParticular(){
        System.out.println("Probando referencia a metodo particular");
    }

    public void mostrarNombre(){
        System.out.println("nombre");
    }
}
