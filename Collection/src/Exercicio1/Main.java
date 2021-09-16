package Exercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,String> loteriaDosSonhos = new HashMap<Integer, String>();

        loteriaDosSonhos.put(0, "Ovos");
        loteriaDosSonhos.put(1, "Água");
        loteriaDosSonhos.put(2, "Escopeta");
        loteriaDosSonhos.put(3, "Cavalo");
        loteriaDosSonhos.put(4, "Dentista");
        loteriaDosSonhos.put(5, "Fogo");

        for (Integer chave: loteriaDosSonhos.keySet()) {
            System.out.println(chave + " : " + loteriaDosSonhos.get(chave));
        }



        List<String> joao = new ArrayList();
        List<String> miguel = new ArrayList();
        List<String> maria = new ArrayList();
        List<String> lucas = new ArrayList();

        joao.add("Juan");
        joao.add("Fissura");
        joao.add("Maromba");

        miguel.add("Night Watch");
        miguel.add("Bruce Wayne");
        miguel.add("Tampinha");

        maria.add("Wonder Woman");
        maria.add("Mary");
        maria.add("Marilene");

        lucas.add("Lukinha");
        lucas.add("Jorge");
        lucas.add("George");

        HashMap<String, List> apelidos = new HashMap<String,List>();
        apelidos.put("João", joao );
        apelidos.put("Miguel", miguel);
        apelidos.put("Maria", maria);
        apelidos.put("Lucas", lucas);

        for (String chave: apelidos.keySet()) {
            System.out.println(chave + " : " + apelidos.get(chave));
        }
	    }
}
