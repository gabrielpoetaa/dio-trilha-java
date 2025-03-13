import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametroUM = scanner.nextInt();

        System.out.println("Digite o primeiro parametro: ");
        int parametroDois = scanner.nextInt();

        contador(parametroUM, parametroDois);
    }

    static void contador(int x, int y) throws ParametrosInvalidosException{
        if (x > y) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else{
            int repeticoes = y - x;

            for (int i=0; i < repeticoes; i++){
                System.out.println("Imprimindo numero: " + (i + 1));
            }
        }
    }
}
