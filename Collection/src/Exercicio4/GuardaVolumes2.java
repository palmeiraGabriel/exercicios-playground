package Exercicio4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes2 {

    private Map<Integer, List<Peca>> secoes1 = new HashMap<>();
    private Integer identificadorAtual1 = 0;

    public Map<Integer, List<Peca>> getSecoes1() {
        return secoes1;
    }

    public void setSecoes1(Map<Integer, List<Peca>> secoes1) {
        this.secoes1 = secoes1;
    }

    public Integer getIdentificadorAtual1() {
        return identificadorAtual1;
    }

    public void setIdentificadorAtual1(Integer identificadorAtual1) {
        this.identificadorAtual1 = identificadorAtual1;
    }



    public Integer guardarrPecas(List<Peca> listaDePeca){

        identificadorAtual1++;
        secoes1.put(identificadorAtual1,listaDePeca);
        return identificadorAtual1;
    }

    public void mostrarPecas(){
        for (Integer chave: secoes1.keySet()) {
            System.out.println("Identificador "+ chave + " : ");
            mostrarPecas(chave);
        }
    }

    public void mostrarPecas(Integer numero){
        for(Peca peca : secoes1.get(numero)){
            System.out.println("Marca " + peca.getMarca());
            System.out.println("Modelo " + peca.getModelo());
        }
    }

    public void devolverPecas(Integer numero){
            secoes1.remove(numero);
    }


}
