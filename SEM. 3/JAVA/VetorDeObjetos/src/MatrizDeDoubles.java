public class MatrizDeDoubles {
    public static void main(String[] args) {
        double[][] valores = {
                {20, 3, 4.5, 8, 7, 8, 40, 80},
                {10},
                {11, 2, 3.1},
                {5, 12, 24, 6.9, 7.1, 8}
        };

        System.out.println("Média: " + media(valores));
        System.out.println("Soma: " + soma(valores));
        System.out.println("Maior: " + maior(valores));
    }

    public static double media(double[][] matriz) {
        double soma = 0;
        int elementos = 0;

        for (double[] linha : matriz) {
            for (double valor : linha) {
                soma += valor;
                elementos++;
            }
        }

        return soma / elementos;
    }

    public static double soma(double[][] matriz) {
        double soma = 0;

        for (double[] linha : matriz) {
            for (double valor : linha) {
                soma += valor;
            }
        }

        return soma;
    }

    public static double maior(double[][] matriz) {
        double maior = matriz[0][0];

        for (double[] linha : matriz) {
            for (double valor : linha) {
                if (valor > maior) {
                    maior = valor;
                }
            }
        }

        return maior;
    }
}
