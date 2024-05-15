import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormat padraoFormat = new DecimalFormat("0.00");

        System.out.println("Escolha um número para a sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe o número da agência: ");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o valor do primeiro depósito: ");
        double deposito = scanner.nextDouble();
        String depositoFormatado = padraoFormat.format(deposito);

        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", o número da sua conta é " + numeroConta + " e o seu saldo no valor de " + depositoFormatado + " já está disponível para saque.");
        
    }
}
