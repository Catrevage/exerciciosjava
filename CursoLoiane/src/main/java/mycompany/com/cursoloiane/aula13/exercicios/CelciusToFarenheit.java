
package mycompany.com.cursoloiane.aula13.exercicios;

import java.util.Scanner;


public class CelciusToFarenheit {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempC, result;
        System.out.print("Informe a temperatura em Cº: ");
        tempC = scan.nextDouble();
        result = ((9*tempC)+160)/5;
        System.out.print("A temperarura em Fº é: "+
            String.format("%.2f", result));
   
    }
}
