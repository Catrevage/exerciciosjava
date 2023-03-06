
package mycompany.com.cursoloiane.aula13.exercicios;

import java.util.Scanner;



public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double altura, pesoIdeal;
        System.out.print("Informe a sua altura: ");
        altura = scan.nextDouble();
        pesoIdeal  = (72.7*altura) - 58;
        System.out.println("Seu peso ideal é: "
                +String.format("%.2f", pesoIdeal));
    }
}
