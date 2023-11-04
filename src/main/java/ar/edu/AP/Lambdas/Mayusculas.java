package ar.edu.AP.Lambdas;

import java.util.*;

public class Mayusculas {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("como");
        lista.add("estas?");
        ArrayList<String> nuevaLista = new ArrayList<>();

        Convertir aMayusculas = (list) ->{
            for(String elemento : list){
                elemento = elemento.toUpperCase();
                nuevaLista.add(elemento);
            }
            return nuevaLista;
        };
        System.out.println(lista);
        System.out.println(aMayusculas.convertir(lista));
    }
}