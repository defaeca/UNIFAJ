import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class MainTesteTipoObjeto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um time");
        String time = sc.nextLine();
        try {
            valida(time);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        System.out.println("Entre com o número de estaduais");
        int numEstaduais = sc.nextInt();
        try {
            valida(numEstaduais);
        } catch (Exception e  ) {
            throw new RuntimeException(e);
        }

    }

    static String[] timesIvalidos = {"Maria", "José", "Curintias",
            "Porco", "Peixe", "Bambi"};

    public static Object valida(Object obj) throws Exception {
        if (obj instanceof String) {
            String time = (String) obj; //type Cast
            for (String timeInvalido : timesIvalidos)
                if (time.equalsIgnoreCase("Maria")) {
                    throw new Exception("Não existe um time chamado Maria" + time);
                }
            return time;
        }
        if (obj instanceof Number) {
            Number numeroTitulos = (Number) obj;
            if (numeroTitulos.longValue() < 10) {
                throw new Exception("poucos Titulos");
            }
            return numeroTitulos;
        }
        throw new Exception("Somente");
    }
}
