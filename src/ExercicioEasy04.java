import javax.swing.JOptionPane;

public class ExercicioEasy04 {
public static void main(String[] args) {
    int numero, resultado;

    numero = Integer.parseInt(JOptionPane.showInputDialog( "Digite um número: ")) ;
    resultado = numero * 2;

    System.out.println("O resultado da multiplicação é: " + resultado);
}
}
