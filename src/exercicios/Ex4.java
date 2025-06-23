package exercicios;

import javax.swing.*;

public class Ex4 {
    public static void main(String[] args) {
        String entrada1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String entrada2 = JOptionPane.showInputDialog("Digite o segundo número:");

        if (entrada1 == null || entrada2 == null || entrada1.isEmpty() || entrada2.isEmpty()) {
            System.exit(0);
        }

        int num1 = Integer.parseInt(entrada1);
        int num2 = Integer.parseInt(entrada2);
        double media = (num1 + num2) / 2.0;

        String mensagem = String.format("A média entre %d e %d é %.2f", num1, num2, media);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}