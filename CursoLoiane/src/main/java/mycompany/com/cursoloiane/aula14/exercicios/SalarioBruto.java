package mycompany.com.cursoloiane.aula14.exercicios;

import java.util.Scanner;

public class SalarioBruto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alicIr = "";
        double salario, salarioLiquido, ir, sind, vHora, qHora, inss;
        System.out.print("Informe o valor da hora trabalhada R$: ");
        vHora = input.nextDouble();
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        qHora = input.nextDouble();
        salario = qHora * vHora;
        ir = sind = 0;
        inss = salario * 0.1;
        if (salario <= 900) {
            alicIr = "(Isento)";

        }else if ((salario > 900) && (salario <= 1500)) {
            alicIr = "(5%)";
            ir = salario * 0.05;

        }else if ((salario > 1500) && (salario <= 2500)) {
            alicIr = "(10%)";
            ir = salario * 0.1;

        }else if (salario > 2500) {
            alicIr = "(20%)";
            ir = salario * 0.2;

        }
        salarioLiquido = (salario-(inss+ir));
        System.out.println("=================================");
        System.out.println("Salario Bruto       : R$"+salario);
        System.out.println("(-) IR"+alicIr+"          : R$"+ir);
        System.out.println("(-) INSS (10%)      : R$"+inss);
        System.out.println("(-) FGTS (11%       : R$"+(salario*0.11));
        System.out.println("Total de descontos  : R$"+(ir+inss));
        System.out.println("Salario Líquido     : R$"+(salarioLiquido));

    }
}

