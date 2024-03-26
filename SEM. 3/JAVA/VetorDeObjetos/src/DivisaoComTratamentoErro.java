import java.util.Scanner;

public class DivisaoComTratamentoErro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Fornecer 2 números para a Divisão");
            int numerador = sc.nextInt();
            int denominador = sc.nextInt();
            double result = numerador / denominador;
            System.out.println("Resultado:" + result);
        } catch (Exception ex) {System.out.println("Erro ao executar a divisão':" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            sc.close();
        }
    }
}