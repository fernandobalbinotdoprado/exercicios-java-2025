package exercicios;

import javax.swing.*;

public class Ex8 {
    public static void main(String[] args) {
        String anosStr = JOptionPane.showInputDialog("Quantos anos você fuma?");
        String cigarrosStr = JOptionPane.showInputDialog("Quantos cigarros você fuma por dia?");
        String precoStr = JOptionPane.showInputDialog("Qual o preço de uma carteira de cigarros?");

        if (anosStr == null || cigarrosStr == null || precoStr == null ||
            anosStr.isEmpty() || cigarrosStr.isEmpty() || precoStr.isEmpty()) {
            System.exit(0);
        }

        int anos = Integer.parseInt(anosStr);
        int cigarrosPorDia = Integer.parseInt(cigarrosStr);
        double precoCarteira = Double.parseDouble(precoStr);

        int totalCigarros = anos * 365 * cigarrosPorDia;
        double totalCarteiras = totalCigarros / 20.0;
        double gastoTotal = totalCarteiras * precoCarteira;

        String mensagem = String.format("Você já gastou aproximadamente R$ %.2f com cigarros.", gastoTotal);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}