package interfacesExImpressora;

public class Main {

    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setNome("Contrato 1");
        contrato.setTipo("Tipo 1");

        Documento documento = new Documento();
        documento.setNome("Documento 1");
        documento.setTipo("Tipo 1");

        Foto foto = new Foto();
        foto.setNome("Foto 1");
        foto.setTipo("Tipo 1");

        Impressora.adicionarImprimivel(contrato);
        Impressora.adicionarImprimivel(documento);
        Impressora.adicionarImprimivel(foto);

        Impressora.imprimirTudo();
    }
}
