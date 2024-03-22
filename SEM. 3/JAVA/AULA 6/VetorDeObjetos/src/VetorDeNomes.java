import java.util.Scanner;

public class VetorDeNomes{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de nomes:");

        int numNomes = sc.nextInt();
        sc.nextLine();

        //Alocar o Vetor
        String[]nomes = new String[numNomes];

        //Entrar com os nomes
        for(int i = 0; i< nomes.length; i++){
            System.out.println("Nome " + i + " de "+ nomes.length);
            nomes[i] = sc.nextLine();
        }

        System.out.println("Os nomes entrandos são:");

        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}