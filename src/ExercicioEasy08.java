import javax.swing.JOptionPane;

public class ExercicioEasy08 {
public static void main(String[] args) {
    double salario, salarioLiquido, salarioBruto, impostoDeRenda;
    String salarioUm = JOptionPane.showInputDialog("Digite o salario: ");
    
    salario = Double.parseDouble(salarioUm);

    if (salario <= 1903.98) {
        impostoDeRenda = 0.00;


        System.out.println("Salário Líquido: " + salario);
        System.out.println("Salário Bruto: " + salario);
        System.out.println("Imposto de renda: " + impostoDeRenda);
        
    }

    if (salario >= 1093.99 && salario <= 2826.65) {

        impostoDeRenda = (salario * 0.075) - 142.8;
        salarioBruto = salario;
        salarioLiquido = salario - impostoDeRenda;

        System.out.println("Salário Líquido: " + salarioLiquido );
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Imposto de renda: " + impostoDeRenda);
        
    }

    
    if (salario >= 2826.66 && salario <= 3751.05) {

        impostoDeRenda = (salario * 0.15) - 354.8;
        salarioBruto = salario;
        salarioLiquido = salario - impostoDeRenda;

        System.out.println("Salário Líquido: " + salarioLiquido );
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Imposto de renda: " + impostoDeRenda);
        
    }


}
}
