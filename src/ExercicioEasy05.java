import javax.swing.JOptionPane;

public class ExercicioEasy05 {
public static void main(String[] args) {
    int primeiroNumero, segundoNumero, terceiroNumero, soma, subtração, multiplicação, media;

    primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
    segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
    terceiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

    soma = primeiroNumero + segundoNumero + terceiroNumero;
    subtração = primeiroNumero - segundoNumero - terceiroNumero;
    multiplicação = primeiroNumero * segundoNumero * terceiroNumero;
    media = soma/3;

    System.out.println("A soma dos 3 números é: " + soma);
    System.out.println("A subatração dos 3 números é: " + subtração);
    System.out.println("A multiplaicação dos 3 núemros é: " + multiplicação);
    System.out.println("A média dos 3 números é: " + media);



}
}
