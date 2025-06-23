package exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A quantos anos você fuma? ");
        int anos = sc.nextInt();

        System.out.print("Quantos cigarros você fuma por dia? ");
        int cigarrosPorDia = sc.nextInt();

        System.out.print("Qual o preço de uma carteira de cigarros? ");
        double precoCarteira = sc.nextDouble();

        int totalCigarros = anos * 365 * cigarrosPorDia;
        double totalCarteiras = totalCigarros / 20.0;
        double gastoTotal = totalCarteiras * precoCarteira;

        System.out.printf("Você já gastou aproximadamente R$ %.2f com cigarros.%n", gastoTotal);
        sc.close();
    }
}