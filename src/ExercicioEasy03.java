import javax.swing.JOptionPane;

public class ExercicioEasy03 {
public static void main(String[] args) {
    String primeiroValor;
    String segundoValor;

    primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor: ");
    segundoValor = JOptionPane.showInputDialog("Digite o segundo valor: ");

    System.out.println("Primeiro valor digitado: " + segundoValor);
    System.out.println("Segundo valor digitado: " + primeiroValor);
}
}
