package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaTarefas implements Iterable<Tarefa> {

    private List<Tarefa> tarefas = new ArrayList<>();

    public ListaTarefas(Tarefa... tarefas) {
        for (Tarefa tarefa : tarefas) {
            this.tarefas.add(tarefa);
        }
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    public Iterator<Tarefa> iterator() {
        return tarefas.iterator();
    }
}
