
package mycompany.com.cursoloiane.aula13.exercicios;

import java.util.Scanner;

public class FarenheitToCelcius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempF, result;
        System.out.print("Informe a temperatura em Fº: ");
        tempF = scan.nextDouble();
        result = (5*(tempF-32)/9);
        System.out.print("A temperarura em Cº é: "+
            String.format("%.2f", result));
   
    }
    
}
