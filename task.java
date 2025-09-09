import java.util.ArrayList;
import java.util.Scanner;

class AdicionarItem {
    private Scanner scanner;

    public AdicionarItem(Scanner scanner) {
        this.scanner = scanner;
    }

    public void adicionar(ArrayList<String> tarefas) {
        System.out.print("Digite a nova tarefa: ");
        String tarefa = scanner.nextLine();
        if (tarefa.isBlank()) {
            System.out.println("A tarefa não pode ser vazia!");
        } else {
            tarefas.add(tarefa);
            System.out.println("Tarefa adicionada com sucesso!");
        }
    }
}


class GerenciadorTarefas {
    private ArrayList<String> tarefas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private AdicionarItem adicionarItem = new AdicionarItem(scanner);

    public void executar() {
        String entrada = "";

        System.out.println("Bem-vindo ao sistema de gerenciamento de tarefas!");
        while (true) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Listar Tarefas");
            System.out.println("2. Adicionar Tarefa");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            entrada = scanner.nextLine();

            switch (entrada) {
                case "1":
                    listarTarefas();
                    break;
                case "2":
                    adicionarItem.adicionar(tarefas);
                    break;
                case "3":
                    System.out.println("Saindo do programa. Até mais!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void listarTarefas() {
        System.out.println("\n--- Lista de Tarefas ---");
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        gerenciador.executar();
    }
}