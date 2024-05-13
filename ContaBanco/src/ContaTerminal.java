
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta: ");
        int numConta = scanner.nextInt();

        System.out.println("Digite o numero da agencia: ");
        String agenciaConta = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o sobrenome do cliente: ");
        String sobrenomeCliente = scanner.next();

        String nomeCompletoCliente = nomeCliente.concat(sobrenomeCliente);

        System.out.println("Digite o saldo atual da conta: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá | " + nomeCompletoCliente + " |, obrigado por criar uma conta em nosso banco, sua agência é | " + agenciaConta +" |, conta | " + numConta + " | e seu saldo | R$" + saldoConta + " | já está disponível para saque.");
        scanner.close();
    }
}
