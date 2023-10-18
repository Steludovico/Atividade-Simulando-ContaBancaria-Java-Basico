import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TO DO: Conhecer e importar a classe Scanner,
        // Exibir as mensagens, para os nossos usuários,
        // Obter pela scanner os valores digitados no terminal,
        // Exibir a mensagem da conta que foi criada.

        Scanner scanner = new Scanner(System.in);

        // Solicitação aos usuários que inserirem os dados da conta
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da sua Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpe a quebra de linha após a leitura do número da conta.

        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo: ");
        double saldo = scanner.nextDouble();

        // Exiba a mensagem com as informações da conta
        System.out.println(
                "Olá  " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                        ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}