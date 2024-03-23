import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class selecao {

    private String nome;
    private final int titulos;

    public selecao(int titulos, String nome) {
        this.nome = nome;
        this.titulos = titulos;
    }
    public int getTitulos() {
        return titulos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "Titulos: " + titulos;
    }
    public static class Iniciar {
        private static final List<selecao> selectness = new ArrayList<>();
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int opcao;
            do {
                System.out.println("\n TIMES DA SELECAO \n");
                System.out.println("1. Listar times");
                System.out.println("2. Criar times");
                System.out.print("\nEscolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        listarTimes();
                        break;
                    case 2:
                        criarTimes();
                        break;
                    case 3:
                        System.out.println("Encerrar programa.");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } while (opcao != 3);
        }
    }

    private static void listarTimes() {
        System.out.println("\nLista de times:");
        if (Iniciar.selectness.isEmpty()) {
            System.out.println("Nenhum time cadastrado.");
        } else {
            for (selecao comp : Iniciar.selectness) {
                System.out.println(comp);
            }
        }
    }

    private static void criarTimes() {
        System.out.println("Digite os seguintes paramentros\n ");

        System.out.print("Nome do time: ");
        String nome = Iniciar.scanner.nextLine();

        System.out.print("Titulos quantidade: ");
        int titulos = Iniciar.scanner.nextInt();
        Iniciar.scanner.nextLine();

        Iniciar.selectness.add(new selecao(titulos, nome));

    }
}
