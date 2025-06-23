package exercicios;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora?: ");
        float ganho = scanner.nextInt();
        System.out.print("Numero de horas trabalhadas no mês?: ");
        float numerohoras = scanner.nextInt();

        System.out.printf("Ganho por hora: %.2f \nNumero de horas trabalhadas no mês: %.2f \n", ganho, numerohoras);

        float calculosalario = ganho * numerohoras;
        System.out.printf("O seu salário total é: %.2f ", calculosalario);
    }
}
