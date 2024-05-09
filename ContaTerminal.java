import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        // criando o scanner:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu número de conta: ");
        int conta = scanner.nextInt();
        System.out.print("Digite seu saldo bancário: ");
        double saldo = scanner.nextDouble();
        System.out.print("Digite o número da agência: ");
        String numeroAgencia = scanner.next();
        scanner.close();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$%.1f já está disponível para saque.", nome, numeroAgencia, conta, saldo);

        scanner.close();
    }
}
