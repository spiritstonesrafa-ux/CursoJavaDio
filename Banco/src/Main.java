import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Rafa Bank!");
        System.out.print("Digite o valor do depósito inicial: ");
        double depositoInicial = scanner.nextDouble();

        Conta conta = new Conta(depositoInicial);

        // Loop principal do programa
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Pagar boleto");
            System.out.println("5. Consultar cheque especial");
            System.out.println("6. Verificar se está usando cheque especial");
            System.out.println("7. Sair");

            // Ler a opção do usuário
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            // Executar a ação correspondente à opção escolhida
            switch (opcao) {
                case 1:
                    conta.saldo();
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 4:
                    System.out.print("Digite o valor do boleto a ser pago: ");
                    double valorBoleto = scanner.nextDouble();
                    conta.pagarBoleto(valorBoleto);
                    break;
                case 5:
                    conta.consultarChequeEspecial();
                    break;
                case 6:
                    conta.verificarSeUsaChequeEspecial();
                    break;
                case 7:
                    System.out.println("Obrigado por usar o sistema do Rafa Bank!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
