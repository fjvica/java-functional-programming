package main.types.lamda.metodos;

import main.types.lamda.Service.IUser;
import main.types.lamda.Service.MethodUserInterface;
import main.types.lamda.Service.MethodUserStringInterface;
import main.types.lamda.entidades.MethodsUser;

import java.util.Locale;

public class User {

    // Referencia a metodo estatico
    public void referenciaEstatico(){
        MethodUserInterface methodUserInterfaceL1= () -> MethodsUser.referenciaAMetodoEstatico();
        MethodUserInterface methodUserInterfaceMR = MethodsUser::referenciaAMetodoEstatico;
        methodUserInterfaceMR.accion();
    }

    // Referencia instancia
    public void referenciaInstancia(){
        MethodsUser methodsUser = new MethodsUser("Fran");

        MethodUserInterface methodUserL2= () -> methodsUser.referenciaAMetodoParticular();
        MethodUserInterface MethodUserInterfaceMR2 = methodsUser::referenciaAMetodoParticular;
        MethodUserInterfaceMR2.accion();
    }

    // Referencia metodo instancia
    public void referenciaMetodoInstancia(){
        MethodsUser methodsUser = new MethodsUser("Fran");

        MethodUserStringInterface methodUserL3= (palabra) -> palabra.toUpperCase();
        MethodUserStringInterface methodUserInterfaceMR3 = String::toUpperCase;
        System.out.println(methodUserInterfaceMR3.accion("fran"));
    }

    // Referencia constructor
    public void referenciaConstructor() {
        IUser user = (nombre) -> new MethodsUser(nombre);
        IUser user2 = MethodsUser::new;

    }
}
