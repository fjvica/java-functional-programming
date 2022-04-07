package main.types.lamda.metodos;

import main.types.lamda.Service.LamdaInterface;
import main.types.lamda.Service.Sumar;

public class Lamda {

    public void lamdaName() {
        LamdaInterface funcion = (name) -> name.toUpperCase();

        System.out.println(funcion.publicaNombre("Fran"));

    }

    public void lamdaSuma() {

        Sumar funcion = (a, b) -> a + b;

        System.out.println(funcion.suma(1, 1));

    }

}
