package br.edu.unifaj.poo.aula7;

import java.util.Scanner;

public class MainTesteTipoObjeto {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Entre com um Time");
            String time = sc.nextLine();
            valida(time);

            System.out.println("Entre com o número de estaduais");
            int numEstaduais = sc.nextInt();
            valida(numEstaduais);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static String [] timesInvalidos = { "Maria", "José", "Curintiasn",
             "Porco", "Peixe", "Bambi" };
    public static Object valida(Object obj) throws Exception {
        if (obj instanceof String) {
            String time = (String) obj; //Type Cast
            for (String timeInvalido : timesInvalidos) {
                if (time.equalsIgnoreCase(timeInvalido)) {
                    throw new Exception("Não existe um time chamado " + time);
                }
            }
            return time;
        }
        if (obj instanceof Number) {
            Number numeroTitulos = (Number) obj;
            if (numeroTitulos.longValue() < 10) {
                throw new Exception("Poucos títulos");
            }
            return numeroTitulos;
        }
        throw new Exception("Somente valida Numeros e String");
    }
}
