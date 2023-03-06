
package mycompany.com.cursoloiane.aula13.exercicios;

import java.util.Scanner;

public class LojaDeTintas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area, result;
        System.out.print("Informe o valor da área: ");
        area = scan.nextDouble();
        result = (area/3)/18;
        System.out.println("Serão necessários "+Math.ceil(result)
            +" galões de tinta.");
        System.out.println("O valor gasto será de: R$"
                +(Math.ceil(result)*80));
    }
}
