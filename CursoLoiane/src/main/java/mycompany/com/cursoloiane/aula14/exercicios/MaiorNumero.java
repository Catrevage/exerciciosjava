
package mycompany.com.cursoloiane.aula14.exercicios;

import java.util.Scanner;


public class MaiorNumero {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Entre com o primeiro numero: ");
        num1 = input.nextInt();
        System.out.print("Entre com o segundo numero: ");
        num2 = input.nextInt();
        System.out.print("Entre com o terceiro numero: ");
        num3 = input.nextInt();
        if ((num1 > num2) && (num1>num3)){
            System.out.println("O maior número é "+num1);
        } else if((num2 > num1) && (num2>num3)){
            System.out.println("O maior numero é "+num2);
        } else if ((num3 > num2) && (num3>num2)){
            System.out.println("O maior nummero é "+num3);
        }
        
        
    }
}
