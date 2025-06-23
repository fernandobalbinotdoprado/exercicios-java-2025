package exercicios;

import javax.swing.*;

public class Ex7 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Quanto você ganha por hora?");

        if (entrada == null || entrada.isEmpty()) {
            System.exit(0);
        }

        float ganho = Integer.parseInt(entrada);

        String entrada2 = JOptionPane.showInputDialog("Numero de horas trabalhadas no mês?: ");

        if (entrada2 == null || entrada2.isEmpty()) {
            System.exit(0);
        }
        float horas = Integer.parseInt(entrada2);

        float salario = ganho * horas;

        String m = String.format("Ganho por hora: %.2f \nNumero de horas trabalhadas no mês: %.2f \n Salário: %.2f",ganho, horas,salario);
        JOptionPane.showMessageDialog(null, m);




    }
}
