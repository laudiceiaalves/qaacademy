import javax.swing.JOptionPane;

public class ExercicioEasy06 {
public static void main(String[] args) {
    double nota1, nota2;
    double resultado;

    String primeiraNota = JOptionPane.showInputDialog("Digite a primeira nota: ");
    String segundaNota = JOptionPane.showInputDialog("Diite a segunda nota: ");

    nota1 = Integer.parseInt(primeiraNota);
    nota2 = Integer.parseInt(segundaNota);

    resultado = (nota1 + nota2)/2;

    if (resultado > 5) {
       System.out.println("Aprovado"); 
    }

    if (resultado <5) {
        System.out.println("Reprovado");
    } else {
        System.out.println("Exame");
    }


}
}
