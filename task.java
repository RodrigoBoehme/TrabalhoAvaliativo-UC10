

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TarefaManager {
    private List<Tarefa> listaTarefas;

    public TarefaManager() {
        this.listaTarefas = new ArrayList<>();
    }

   
    public void adicionarItem(String nome, String descricao, Date prazo) {
        Tarefa novaTarefa = new Tarefa(nome, descricao, prazo);
        listaTarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada: " + novaTarefa.getNome());
    }

    public List<Tarefa> getListaTarefas() {
        return listaTarefas;
    }
}

public class Main {
    public static void main(String[] args) {
        TarefaManager manager = new TarefaManager();

       
        manager.adicionarItem("Estudar Java", "Ler sobre MVC e JDBC", new Date());

        
        manager.getListaTarefas().forEach(t -> 
            System.out.println("Nome: " + t.getNome() + " | Prazo: " + t.getPrazo())
        );
    }
}