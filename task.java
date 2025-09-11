

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
import Model.Tarefa;

public class task {


public class Main {
    public static void main(String[] args) {
        TarefaManager manager = new TarefaManager();

       
        manager.adicionarItem("Estudar Java", "Ler sobre MVC e JDBC", new Date());

        
        manager.getListaTarefas().forEach(t -> 
            System.out.println("Nome: " + t.getNome() + " | Prazo: " + t.getPrazo())
        );
=======
        System.out.println("Bem-vindo ao sistema de gerenciamento de tarefas LEGADO!");
        System.out.println("Este código não usa classes e métodos para simular um projeto antigo.");
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String entrada = "";
        int opt;

        while (true) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Listar Tarefas");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            entrada = scanner.nextLine();

            if (entrada.equals("1")) {
                System.out.println("\n--- Lista de Tarefas ---");
                if (tarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa cadastrada.");
                } else {
                    System.out.println("Selecione uma opcao: ");
                    listarTarefas(tarefas);

                    opt = scanner.nextInt();
                    if (opt == tarefas.size() || opt >= tarefas.size() || opt <= 0) {
                        System.out.println("Saindo...");
                        return;
                    } else {
                        detalhesDaTarefa(tarefas.get(opt));
                    }
                }
            } else if (entrada.equals("2")) {
                System.out.println("Saindo do programa. Até mais!");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
    static void listarTarefas (ArrayList<Tarefa> tarefas) {

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i).getNome());
        }
        System.out.println("Sair?");

    }

    static void detalhesDaTarefa (Tarefa tarefa){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tarefa: " + tarefa.getNome());
        System.out.println("Descricao: " + tarefa.getDescricao());
        System.out.println("Data de Inicio: " + tarefa.getDataInicio());
        System.out.println("Prazo: " + tarefa.getPrazo());
        System.out.println("Continuar?");
        scanner.nextLine();
    }

}
