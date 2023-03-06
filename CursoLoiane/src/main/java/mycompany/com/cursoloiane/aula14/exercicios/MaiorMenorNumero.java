
package mycompany.com.cursoloiane.aula14.exercicios;

import java.util.Scanner;


public class MaiorMenorNumero {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior, menor, num1, num2, num3;
        System.out.print("Informe o numero 1: ");
        num1 = input.nextInt();
        maior = menor = num1;
        System.out.print("Informe o numero 2: ");
        num2 = input.nextInt();
        if (num2 > maior){
            maior = num2;
        }else if (num2 < menor){
            menor = num2;
        }            
        System.out.print("Informe o numero 3: ");
        num3 = input.nextInt();   
        if (num3 > maior){
            maior = num3;
        }else if (num3 < menor){
            menor = num3;
        }
        System.out.println("O maior número é: "+maior);
        System.out.println("O menor número é: "+menor);        
        
    }    
}
