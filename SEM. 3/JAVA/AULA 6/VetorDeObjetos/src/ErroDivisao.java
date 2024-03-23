public class ErroDivisao {
    public static void main(String[] args) {
        try {
            int val = 0;
            int num = 10;
            int result = num / val;
            System.out.println("Divisão:" + result);
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro" + ex);
        } finally {
            System.out.println("Programa encerrado");
        }
    }
}