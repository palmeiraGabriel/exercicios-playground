package exercicioHash;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Passo C - Hora da revisão - Nível 02
        // Item 02 - Hash Set

        // Para criarmos o conjunto
        Set<String> conjuntoDoMinerador = new HashSet<>();

        // Para adicionarmos valores ao "set" (Conjunto)
        conjuntoDoMinerador.add("Corda");
        conjuntoDoMinerador.add("Lanterna");
        conjuntoDoMinerador.add("Picareta");
        conjuntoDoMinerador.add("Garrafa de água");

        // Para remover um item por valor
        conjuntoDoMinerador.remove("Corda");

        // Para checarmos e apresentarmos todos os valores do "HashSet" (Conjunto Hash)
        for(String valorAnalisado: conjuntoDoMinerador){
            System.out.println(valorAnalisado);
        }

        // Passo D - Acompanhamento do exercício 01 de HashSet

        // Exercício 01 (Exercise 01)
        // A nossa nova missão é para automatizarmos uma fila de doações que está recebendo
        // uma alta quantidade de pessoas.
        // Para garantir que todos recebam pelo menos 01 doação, temos algumas regras:
        Set<String> listaDeDoacao = new HashSet<>();

        // Adicionando itens de doação a lista
        // Itens do tipo "Comida"
        listaDeDoacao.add("Pacote de biscoito");
        listaDeDoacao.add("Macarrão");
        listaDeDoacao.add("Banana");
        listaDeDoacao.add("Arroz");
        listaDeDoacao.add("Carne");

        // Itens do tipo "Abrigo"
        listaDeDoacao.add("Roupa moletom");
        listaDeDoacao.add("Cachecol");
        listaDeDoacao.add("Gorro");
        listaDeDoacao.add("Jaqueta");
        listaDeDoacao.add("Calças grossas");

        // 01 - Precisamos cadastrar 05 produtos do tipo "Comida" sem foco obrigatório em ordem.
        // 02 - Agora, vamos cadastrar 05 produtos do tipo "Abrigo" seguindo a não-obrigação de ordenação.

        // 03 - Tendo em vista que 01 item de cada tipo não foi doado, vamos remover 01 item
        // de cada tipo antes de mostrarmos o relatório de doações arrecadadas.

        // Removendo 01 item do tipo "Comida"
        listaDeDoacao.remove("Macarrão");

        // Removendo 01 item do tipo "Abrigo"
        listaDeDoacao.remove("Jaqueta");

        // 04 - Fase final: Vamos criar uma forma de mostrar todos os itens que recebemos
        // e que foram doados conforme o plano da iniciativa de doação.
        for(String valorRemovido:listaDeDoacao){
            System.out.println(valorRemovido);
        }

        Set<String> listaDeMaterial = new HashSet<>();

        listaDeMaterial.add("Cimento");
        listaDeMaterial.add("Argamassa");
        listaDeMaterial.add("Caibros");
        listaDeMaterial.add("Cal");
        listaDeMaterial.add("Pedras");
        listaDeMaterial.add("Caminhão de água");
        listaDeMaterial.add("Betoneira");
        listaDeMaterial.add("Serviço de obras A - Arquiteto");
        listaDeMaterial.add("Serviço de obras B = Chefe de Obras");
        listaDeMaterial.add("Serviço de Obras C - Pedreiro");

        listaDeMaterial.remove("Serviço de obras A - Arquiteto");
        listaDeMaterial.remove("Caminhão de água");
        listaDeMaterial.remove("Argamassa");

        for(String o : listaDeMaterial){
            System.out.println(o);
        }

        // Observação: Não é necessário apresentar os itens que foram removidos.

        // Exercício 02 (Exercise 02) - Novamente, deixo com vocês!

        // Ainda dentro deste projeto de doação, precisamos arrecadar materiais de construção
        // para construirmos um C.A.C. (Conjunto Habitacional Coletivo), onde teremos várias casas
        // construídas com o material arrecadado.
        // Para isto ser um sucesso, temos uma lista de doações necessárias a ser feita:
        // Lista HashSet de doações para construção do C.A.C.
        // A - Criar uma lista HashSet para comportar os itens doados que serão cadastrados
        // Agora, vamos cadastrar os seguintes itens nesta lista:
        // 01 - Cimento
        // 02 - Argamassa
        // 03 - Caibros
        // 04 - Cal
        // 05 - Pedras
        // 06 - Caminhão de água
        // 07 - Betoneira
        // 08 - Serviço de obras A - Arquiteto
        // 09 - Serviço de obras B - Chefe de obras
        // 10 - Serviço de obras C - Pedreiro

        // Infelizmente, alguns itens não puderam ser doados (Serão replanejados):
        // Portanto, por enquanto, precisamos removê-los da lista:
        // 01 - Serviço de obras A - Arquiteto
        // 02 - Argamassa
        // 03 - Caminhão de água

        // E para concretização do planejamento, vamos desenvolver uma parte do sistema
        // que apresenta os itens que puderam ser arrecadados na doação.
        // Dica: Use laços de repetição para esta etapa.
        // Planejamento de ação de apoio social realizado com sucesso!!!
    }
}
