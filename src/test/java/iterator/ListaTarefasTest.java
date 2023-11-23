package iterator;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListaTarefasTest {

    @Test
    void deveContarTarefasPendentes() {
        Tarefa tarefa1 = new Tarefa("Comprar leite", false);
        Tarefa tarefa2 = new Tarefa("Fazer exercícios", true);
        Tarefa tarefa3 = new Tarefa("Estudar Java", false);

        ListaTarefas lista = new ListaTarefas(tarefa1, tarefa2, tarefa3);

        int contadorTarefasPendentes = 0;
        for (Tarefa tarefa : lista) {
            if (!tarefa.isConcluida()) {
                contadorTarefasPendentes++;
            }
        }

        assertEquals(2, contadorTarefasPendentes);
    }

    @Test
    void deveAdicionarTarefaEContarTotal() {
        Tarefa tarefa1 = new Tarefa("Comprar leite", false);
        Tarefa tarefa2 = new Tarefa("Fazer exercícios", true);

        ListaTarefas lista = new ListaTarefas(tarefa1, tarefa2);

        lista.adicionarTarefa(new Tarefa("Estudar Python", false));

        int contador = 0;
        for (Tarefa tarefa : lista) {
            contador++;
        }

        assertEquals(3, contador);
    }

}
