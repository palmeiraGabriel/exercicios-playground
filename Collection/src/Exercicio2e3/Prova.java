package Exercicio2e3;

import java.util.Set;

public class Prova {


    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        Integer soma = 0;
        for (Integer numero: conjuntoDeInteiros
             ) {
            soma += numero;
        }
        System.out.println("A soma dos valores é " + soma);
    }
}
