import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, Casa> casas = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nRaphael Eça Rodrigues de Morais 12325680");
            System.out.println("Menu Cadastro de casa:");
            System.out.println("1. Cadastrar Casa");
            System.out.println("2. Listar Casas");
            System.out.println("3. Pesquisar Casa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarCasa(scanner);
                    break;
                case 2:
                    listarCasas();
                    break;
                case 3:
                    pesquisarCasa(scanner);
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void cadastrarCasa(Scanner scanner) {
        System.out.println("\nCadastro de Casa:");
        System.out.print("Informe o dono da casa: ");
        String dono = scanner.next();
        System.out.print("Informe o número de cômodos: ");
        int comodos = scanner.nextInt();
        System.out.print("Informe o valor da casa: ");
        float valor = scanner.nextFloat();
        System.out.print("Informe o tamanho da casa: ");
        int tamanho = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Adicione um comentário: ");
        String comentario = scanner.nextLine();

        Casa casa = new Casa(dono, comodos, valor, tamanho, comentario);
        casas.put(dono, casa);
        System.out.println("Casa cadastrada com sucesso!");
    }


    private static void listarCasas() {
        System.out.println("\nListagem de Casas:");
        if (casas.isEmpty()) {
            System.out.println("Não há casas cadastradas.");
        } else {
            for (Casa casa : casas.values()) {
                System.out.println(casa);
            }
        }
    }

    // Método para pesquisar uma casa pelo dono
    private static void pesquisarCasa(Scanner scanner) {
        System.out.print("\nInforme o nome do dono para pesquisar a casa: ");
        String dono = scanner.next();
        Casa casa = casas.get(dono);
        if (casa != null) {
            System.out.println("\nCasa encontrada:");
            System.out.println(casa);
        } else {
            System.out.println("Casa não encontrada para o dono informado.");
        }
    }
}

class Casa {
    private String dono;
    private int comodos;
    private float valor;
    private int tamanho;
    private String comentario;

    public Casa(String dono, int comodos, float valor, int tamanho, String comentario) {
        this.dono = dono;
        this.comodos = comodos;
        this.valor = valor;
        this.tamanho = tamanho;
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return  "Dono: " + dono +
                ", Cômodos: " + comodos +
                ", Valor: " + valor +
                ", Tamanho: " + tamanho +
                ", Comentário: " + comentario;
    }
}
