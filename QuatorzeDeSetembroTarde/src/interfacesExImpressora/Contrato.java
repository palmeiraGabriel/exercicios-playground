package interfacesExImpressora;

public class Contrato extends Impressora implements Imprimivel{

        private String nome;
        private String tipo;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

    @Override
    public void imprimir(){
        System.out.println("Eu sou um contrato muito legal de nome " + getNome() + " e tipo " + getTipo());
    }


}
