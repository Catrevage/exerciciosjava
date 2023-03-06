package mycompany.com.cursoloiane.aula14.exercicios;
import java.util.Scanner;
public class CalculaCalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = 0;
        double salario, newSalario;
        System.out.print("Informe o valor do salário R$: ");
        salario = input.nextDouble();
        newSalario = 0;

        if (salario <= 280) {
            newSalario = salario * 1.2;
            p = 20;
        }
        if ((salario > 280) && (salario <= 700)) {
            newSalario = salario * 1.15;
            p = 15;
        }
        if ((salario > 700) && (salario <= 1500)) {
            newSalario = salario * 1.1;
            p = 10;
        }
        if (salario > 1500) {
            newSalario = salario * 1.05;
            p = 5;
        }
        System.out.println("======================================");
        System.out.println("O salario antes do reajuste: R$"+salario);
        System.out.println("O percentual de aumento foi: "+p+"%");
        System.out.println("O valor do aumento foi: "+"R$"+(newSalario - salario));
        System.out.println("O sário depois do reajuste: R$"+newSalario);


    }

}
