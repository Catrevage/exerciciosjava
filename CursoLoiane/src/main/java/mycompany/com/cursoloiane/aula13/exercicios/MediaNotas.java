
package mycompany.com.cursoloiane.aula13.exercicios;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] arr = new double[4];
        double soma = 0;
        
        for (int i = 0; i < 4; i++){
            System.out.print("Informe o valor de nota "+(i+1)+" : ");
            arr[i] = scan.nextDouble();
            soma += arr[i];
        }
        
        double media = soma/4;
        System.out.println("A média das notas é: "+media);
        
    }
}
