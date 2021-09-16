package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> comunicacao = new ArrayList<>();

        comunicacao.add("Alpha");
        comunicacao.add("Bravo");
        comunicacao.add("Charlie");
        comunicacao.add("Delta");
        comunicacao.add("Eco");
        comunicacao.add("Foxtrot");
        comunicacao.add("Golf");
        comunicacao.add("Hotel");
        comunicacao.add("India");
        comunicacao.add("Juliet");
        comunicacao.add("Kilo");
        comunicacao.add("Lima");
        comunicacao.add("Mike");
        comunicacao.add("Oscar");
        comunicacao.add("Papa");
        comunicacao.add("Quebec");

        comunicacao.forEach(System.out::println);




        comunicacao.remove(0);
        comunicacao.remove(1);
        comunicacao.remove(2);
        comunicacao.remove(3);
        comunicacao.remove(4);



    }
}
// Exercício 02 (Exercise 02) - Agora é com vocês, Mestres.

// Para comunicação dos soldados na base naval, alguns comandos ainda estão faltando.
// Crie uma lista de comunicação do tipo arrayList e adicione mais 15 itens a esta lista para completar a fase 01 de comunicação.
// Sugestões de itens a serem adicionados:
//A – ALPHA        J – JULIET     S – SIERRA
//B – BRAVO        K – KILO       T – TANGO
//C – CHARLIE  L – LIMA       U – UNIFORM
//D – DELTA        M – MIKE       V – VICTOR
//E – ECO      N – NOVEMBER   W – WHISKEY
//F – FOXTROT  O – OSCAR      X – X-RAY
//G – GOLF     P – PAPA       Y – YANKEE
//H – HOTEL        Q – QUEBEC     Z – ZULU
//I – INDIA        R – ROMEU

// Observação: Não podemos adicionar comandos repetidos.
// Para completar o nível 02 de comunicação, crie uma forma de apresentar
// todos os itens enviados ao vetor de comunicação (ArrayList).

// Por final, para chegarmos a conclusão da comunicação,
// remova 05 comandos do vetor de comunicação e reapresente o vetor
// com estes itens removidos.

// Se tudo ocorrer como planejado, a missão estará cumprida em 100%.