package main;

import main.types.lamda.Service.MethodUserInterface;
import main.types.lamda.entidades.MethodsUser;
import main.types.lamda.metodos.Lamda;
import main.types.lamda.metodos.User;

public class Main {
    public static void main(String[] args) {
        //Clase main donde se hará el funcionamiento
        Lamda lamda = new Lamda();

        lamda.lamdaName();

        User user = new User();
        user.referenciaEstatico();
    }
}
