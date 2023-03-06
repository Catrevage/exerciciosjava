
package mycompany.com.cursoloiane.aula13.exercicios;

import java.util.Scanner;

public class HorasTrabalhadas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vHora, sal,horasT;
        System.out.print("Informe o valor da hora trabalhada: ");
        vHora = scan.nextDouble();
        System.out.print("Informe quantas horas você trabalhou: ");
        horasT = scan.nextDouble();
        sal = horasT*vHora;
        System.out.println("O seu salário mensal será R$"+sal);
        
        
    }
}
