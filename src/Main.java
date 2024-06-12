import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        while (true) {
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]");
            System.out.println();
            System.out.println("1) Dólar americano => Euro");
            System.out.println("2) Euro => Dólar americano");
            System.out.println("3) Dólar americano => Real brasileiro");
            System.out.println("4) Real brasileiro => Dólar americano");
            System.out.println("5) Dólar americano => Rublo russo");
            System.out.println("6) Rublo russo => Dólar americano");
            System.out.println("7) Sair");
            System.out.println();
            System.out.print("Escolha uma opção válida: ");
            System.out.println("-----------------------------");

            int opcao = scanner.nextInt();
            if (opcao == 7) break;

            System.out.print("Digite um valor para converter ");
            switch (opcao) {
                case 1:
                    System.out.print("Dólar em Euro: ");
                    break;
                case 2:
                    System.out.print("Euro em Dólar: ");
                    break;
                case 3:
                    System.out.print("Dólar em Real brasileiro: ");
                    break;
                case 4:
                    System.out.print("Real em Dólar: ");
                    break;
                case 5:
                    System.out.print("Dólar em Rublo russo: ");
                    break;
                case 6:
                    System.out.print("Rublo russo em Dólar: ");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            double valor = scanner.nextDouble();

            double resultado = converter.converterMoeda(opcao, valor);
            if (resultado != -1) {
                String moedaOrigem = converter.getMoedaOrigem(opcao);
                String moedaDestino = converter.getMoedaDestino(opcao);
                System.out.printf("%.2f %s é igual a %.2f %s%n", valor, moedaOrigem, resultado, moedaDestino);
            } else {
                System.out.println("Erro na conversão. Tente novamente.");
            }
        }

        scanner.close();
    }
}
