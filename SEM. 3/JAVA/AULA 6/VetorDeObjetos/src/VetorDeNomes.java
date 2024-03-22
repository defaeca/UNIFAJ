import java.util.Scanner;

public class VetorDeNomes{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String[] nomes = criarVetorDeNomes(sc);
        entrarNomes(nomes, sc);
        exibirNomes(nomes);
    }

    private static void exibirNomes(String[] nomes) {
        System.out.println("Os nomes entrandos são:");

        for (String nome : nomes){
            System.out.println(nome);
        }
    }

    private static void entrarNomes(String[] nomes, Scanner sc) {
        //Entrar com os nomes
        for(int i = 0; i< nomes.length; i++){
            System.out.println("Nome " + i + " de "+ nomes.length);
            nomes[i] = sc.nextLine();
        }
    }

    private static String[] criarVetorDeNomes(Scanner sc) {
        System.out.println("Informe o número de nomes:");

        int numNomes = sc.nextInt();
        sc.nextLine();

        //Alocar o Vetor
        String[]nomes = new String[numNomes];
        return nomes;
    }
}