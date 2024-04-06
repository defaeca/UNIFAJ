import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EntraNomes {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        List<String> nomes = new LinkedList<>();

        while(true){
            System.out.println("Entre com um nome");
            String nome = sc.nextLine();
            if (nome == null || nome.trim().isEmpty()){
                break;
            }
            nomes.add(nome);
        }
        //Exibir nomes;
        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
}
