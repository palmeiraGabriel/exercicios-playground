package Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    GuardaVolumes2 guardaVolumes = new GuardaVolumes2();

    Peca peca1 = new Peca("Apple", "IphoneXR");
    Peca peca3 = new Peca("Samsung", "Galaxy");

    Peca peca2 = new Peca("Apple", "Watch");
    Peca peca4 = new Peca("Xiaomi", "Top3000");

        List<Peca> lista1 = new ArrayList();
        List<Peca> lista2 = new ArrayList();

        lista1.add(peca1);
        lista1.add(peca3);

        lista2.add(peca2);
        lista2.add(peca4);


        guardaVolumes.guardarrPecas(lista1);
        guardaVolumes.guardarrPecas(lista2);

        guardaVolumes.mostrarPecas();


        guardaVolumes.devolverPecas(1);


        guardaVolumes.mostrarPecas();






    }
}
