import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência: ");
        String agency = scanner.next();

        System.out.println("Digite seu nome: ");
        String name = scanner.next();
        
        System.out.println("Digite seu saldo: ");
        double balance = scanner.nextDouble();

        Random random = new Random();
        int account = 100000 + random.nextInt(900000); // Generates a 6-digit number

        System.out.println("Ola" + name + "obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agencia é: " + agency);
        System.out.println("Conta: " + account);
        System.out.println("Seu saldo é: " + balance);


    }
}
