import javax.swing.JOptionPane;

public class ExercicioEasy07 {

    public static void main(String[] args) {
        double salario, valorInss, aliquota;
        String salarioUm = JOptionPane.showInputDialog("Digite o salário: ");
        String aliquotaUm = JOptionPane.showInputDialog("Digite o valor da aliquota: ");

        salario = Double.parseDouble(salarioUm);
        aliquota = Double.parseDouble(aliquotaUm);


        if (salario == 1045) {
            valorInss = (salario * aliquota)/100;
            System.out.println(valorInss);
        } 
        if (salario > 1045 && salario < 2089.6 ){
            valorInss = (salario * aliquota)/100;
            System.out.println(valorInss);
        }
        if (salario > 2089.61 && salario < 3134.4 ){
            valorInss = (salario * aliquota)/100;
            System.out.println(valorInss);
        }
        else {
            valorInss = (salario * aliquota)/100;
            System.out.println(valorInss);
        }
            
        }


    }
