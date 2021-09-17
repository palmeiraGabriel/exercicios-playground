package Exercicio2e3;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList();

        listaNumeros.add(1);
        listaNumeros.add(5);
        listaNumeros.add(5);
        listaNumeros.add(6);
        listaNumeros.add(7);
        listaNumeros.add(8);
        listaNumeros.add(8);
        listaNumeros.add(8);

        System.out.println(listaNumeros);

        Set<Integer> conjuntoNumeros = new HashSet();

        conjuntoNumeros.add(1);
        conjuntoNumeros.add(5);
        conjuntoNumeros.add(5);
        conjuntoNumeros.add(6);
        conjuntoNumeros.add(7);
        conjuntoNumeros.add(8);
        conjuntoNumeros.add(8);
        conjuntoNumeros.add(8);

        System.out.println(conjuntoNumeros);


        // EXERCÍCIO 3

        Prova prova = new Prova();

        prova.somaTotal(conjuntoNumeros);


    }

    }

