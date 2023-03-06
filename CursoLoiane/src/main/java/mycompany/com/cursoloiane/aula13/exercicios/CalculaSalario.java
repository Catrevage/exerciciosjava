
package mycompany.com.cursoloiane.aula13.exercicios;

import java.util.Scanner;

public class CalculaSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double vHora, sal,horasT, ir, inss, sind, desc;
        
        System.out.print("Informe o valor da hora trabalhada: ");
        vHora = scan.nextDouble();
        System.out.print("Informe quantas horas você trabalhou: ");
        horasT = scan.nextDouble();
        sal = horasT*vHora;
        System.out.println("O seu salário bruto mensal será R$"+sal);
        ir = sal*0.11;
        inss = sal*0.08;
        sind = sal*0.05;
        desc = ir+inss+sind;
        System.out.println("Quanto pagou de IR: R$"+ir);
        System.out.println("Quanto pagou ao INSS: R$"+inss);
        System.out.println("Quanto pagou ao sindicato: R$"+sind);
        System.out.println("O salário líquido é: R$"+(sal-desc));
        
    }
}
