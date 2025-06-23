package exercicios;
import javax.swing.*;

public class Ex3 {
    public static void main(String[] args) {
       String entrada = JOptionPane.showInputDialog("Digite um número inteiro: ");

           if (entrada == null || entrada.isEmpty()) {
               System.exit(0);
           }

           int numero = Integer.parseInt(entrada);

           int antecessor = numero - 1;
           int sucessor = numero + 1;

           String m = String.format("Antecessor: %d Sucessor: %d ", antecessor, sucessor);
           JOptionPane.showMessageDialog(null, m);
           }

    }
