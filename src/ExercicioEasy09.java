import javax.swing.JOptionPane;

public class ExercicioEasy09 {
public static void main(String[] args) {
    int numero, resultado;
    int i = 0;
    String numeroStg = JOptionPane.showInputDialog("Digite um número: ");

    numero = Integer.parseInt(numeroStg);

    while (i < 10) {
        resultado = numero * i;
        System.out.println(numero + "X" + i + "=" + resultado);
        i++;
    }
}
}
