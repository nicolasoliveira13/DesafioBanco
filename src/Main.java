import java.util.*;
public class Main {
    public static void main(String[] args) {
        int id = 13;
        String cliente = "Nicolas";
        int conta = 1234567;
        double saldo = 5000;
        double saldoAtual = 0;

        while(true) {
            System.out.println("""
                    
                    
                    Bem Vindo ao autoatendimento do NICOBANK 
                    Menu:
                    1 - Consultar Saldo
                    2 - Sacar Dinheiro
                    3 - Fazer Pix
                    4 - Sair
                    """);

            Scanner leitura = new Scanner(System.in);
            int opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println(saldo);

            } else if (opcao == 2) {
                System.out.println("Quanto você deseja sacar?");

                Scanner leituraSaque = new Scanner(System.in);
                double saque = leituraSaque.nextDouble();

                saldo = saldo - saque;

                System.out.println("Você optou por sacar R$" + saque);
                System.out.println("Seu saldo atual é de R$" + saldo);
            } else if (opcao == 3) {
                System.out.println("De quanto será o piX?");

                Scanner leituraPix = new Scanner(System.in);
                double pix = leituraPix.nextDouble();

                saldo = saldo - pix;

                System.out.println("Você está fazendo um pix de R$" + pix);
                System.out.println("Seu saldo atual é de R$" + saldo);
            } else if (opcao == 4) {
                System.out.println("Obrigado por trabalhar conosco!");
                break;
            } else {
                System.out.println("Opção Inválida");
            }
        }


    }
}