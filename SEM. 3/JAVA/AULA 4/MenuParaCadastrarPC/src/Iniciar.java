import java.util.*;

class Computador {
    private final int id;
    private String cpu;
    private int memoria;
    private int armazenamento;
    private String tela;

    public Computador(int id, String cpu, int memoria, int armazenamento, String tela) {
        this.id = id;
        this.cpu = cpu;
        this.memoria = memoria;
        this.armazenamento = armazenamento;
        this.tela = tela;
    }

    public int getId() {
        return id;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", CPU: " + cpu
                + ", Memória: " + memoria +
                "GB, Armazenamento: " + armazenamento +
                "GB, Tela: " + tela;
    }
}

public class Iniciar {
    private static final List<Computador> computadores = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static final String alunoRA = "12325680";
    private static final String alunoNome = "Raphael Eça Rodrigues de Morais";

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nMENU DE COMPUTADORES\n");
            System.out.println("1. Listar computadores");
            System.out.println("2. Criar computador");
            System.out.println("3. Incluir computador");
            System.out.println("4. Atualizar computador");
            System.out.println("5. Excluir computador");
            System.out.println("6. Exibir RA e Nome do Aluno");
            System.out.println("7. Sair");
            System.out.print("\nEscolha uma opção:\n");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    listarComputadores();
                    break;
                case 2:
                    criarComputador();
                    break;
                case 3:
                    incluirComputador();
                    break;
                case 4:
                    atualizarComputador();
                    break;
                case 5:
                    excluirComputador();
                    break;
                case 6:
                    exibirAluno();
                    break;
                case 7:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 7);
    }

    private static void listarComputadores() {
        System.out.println("\nLista de Computadores:");
        if (computadores.isEmpty()) {
            System.out.println("Nenhum computador cadastrado.");
        } else {
            for (Computador comp : computadores) {
                System.out.println(comp);
            }
        }
    }

    private static void criarComputador() {
        System.out.println("Digite os seguintes paramentros\n ");

        System.out.print("ID do computador: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("CPU do computador: ");
        String cpu = scanner.nextLine();

        System.out.print("Quantidade de memória (em GB) do computador: ");
        int memoria = scanner.nextInt();

        System.out.print("Capacidade de armazenamento (em GB) do computador: ");
        int armazenamento = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o tipo de tela do computador: ");
        String tela = scanner.nextLine();

        Computador comp = new Computador(id, cpu, memoria, armazenamento, tela);
        computadores.add(comp);
        System.out.println("Computador criado com sucesso.");
    }

    private static void incluirComputador() {
        listarComputadores();
        System.out.print("Digite o ID do computador a ser incluído: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Computador comp = encontrarComputadorPorId(id);
        if (comp == null) {
            System.out.println("Computador não encontrado.");
        } else {
            computadores.add(comp);
            System.out.println("Computador incluído com sucesso.");
        }
    }

    private static void atualizarComputador() {
        listarComputadores();
        System.out.print("Digite o ID do computador a ser atualizado: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Computador comp = encontrarComputadorPorId(id);
        if (comp == null) {
            System.out.println("Computador não encontrado.");
        } else {
            System.out.print("Digite a nova CPU do computador: ");
            String cpu = scanner.nextLine();
            comp.setCpu(cpu);

            System.out.print("Digite a nova quantidade de memória (em GB) do computador: ");
            int memoria = scanner.nextInt();
            comp.setMemoria(memoria);

            System.out.print("Digite a nova capacidade de armazenamento (em GB) do computador: ");
            int armazenamento = scanner.nextInt();
            comp.setArmazenamento(armazenamento);
            scanner.nextLine();

            System.out.print("Digite o novo tipo de tela do computador: ");
            String tela = scanner.nextLine();
            comp.setTela(tela);

            System.out.println("Computador atualizado com sucesso.");
        }
    }

    private static void excluirComputador() {
        listarComputadores();
        System.out.print("Digite o ID do computador a ser excluído: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Computador comp = encontrarComputadorPorId(id);
        if (comp == null) {
            System.out.println("Computador não encontrado.");
        } else {
            computadores.remove(comp);
            System.out.println("Computador excluído com sucesso.");
        }
    }

    private static Computador encontrarComputadorPorId(int id) {
        for (Computador comp : computadores) {
            if (comp.getId() == id) {
                return comp;
            }
        }
        return null;
    }

    private static void exibirAluno() {
        System.out.println("\nRA do Aluno: " + alunoRA);
        System.out.println("Nome do Aluno: " + alunoNome);
    }
}
