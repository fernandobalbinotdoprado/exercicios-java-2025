package exercicios;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        double media = (num1 + num2) / 2.0;

        System.out.printf("A média entre %d e %d é %.2f%n", num1, num2, media);
        sc.close();
    }
}