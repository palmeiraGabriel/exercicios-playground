package com.company;


public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Sergio", 001);
        Pessoa pessoa2 = new Pessoa("Hendy", 001);

        System.out.println(pessoa1.equals(pessoa2));


    }
}
