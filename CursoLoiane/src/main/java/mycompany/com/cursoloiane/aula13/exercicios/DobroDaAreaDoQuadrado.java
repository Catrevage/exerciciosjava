
package mycompany.com.cursoloiane.aula13.exercicios;

import java.util.Scanner;

public class DobroDaAreaDoQuadrado {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lado, area;
        System.out.print("informe o lado do quadrado: ");
        lado = scan.nextDouble();
        area = Math.pow(lado, 2);
        System.out.println("A área do quadrado é "+area+" e o dobro da "
                + "área é "+(area*2));
    }
}
