import java.util.Scanner;

public class VetorDeNomes{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String[] nomes = criarVetorDeNomes(sc);
        entrarNomes(nomes, sc);

        ordenarVetor(nomes);

        exibirNomes(nomes);
    }
    //Ordenar os vetores
    private static void ordenarVetor(String[] nomes){

        for(int j = 0; j < nomes.length; j++){

            for(int i = 0; i < nomes.length - 1; i ++) {

                if (nomes[i].compareTo(nomes[i + 1]) > 0) {

                    String temp = nomes[i];
                    nomes[i] = nomes[i + 1];
                    nomes[i + 1] = temp;

                }
            }
        }
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