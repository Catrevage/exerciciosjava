
package mycompany.com.cursoloiane.aula13.exercicios;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        double c;
        System.out.print("Informe o valor Inteiro de A: ");
        a = scan.nextInt();
        System.out.print("Informe o valor Inteiro de B: ");
        b = scan.nextInt();
        System.out.print("Informe o valor Real de c: ");
        c = scan.nextDouble();
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("O produto do dobro do primeiro "
                + "com metade do segundo: "
                +String.format("%.2f",(double) (2*a)/(b/2)));
        System.out.println("A soma do triplo do primeiro com o "
                + "terceiro:"+((3*a)+c));
        System.out.println("O terceiro elevado ao cubo: "+Math.pow(c,3));
        
    }
}
