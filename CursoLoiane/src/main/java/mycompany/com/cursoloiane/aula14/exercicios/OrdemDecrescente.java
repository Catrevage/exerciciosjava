
package mycompany.com.cursoloiane.aula14.exercicios;

import java.util.Scanner;


public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menor, meio, maior;
        menor = meio = maior = 0;
        System.out.print("Informe primeiro número: ");
        int num1 = input.nextInt();
        System.out.print("Informe segundo número: ");
        int num2 = input.nextInt();
        System.out.print("Informe terceiro número: ");
        int num3 = input.nextInt();

        //verifica os numeros digitados iguais
        if (num1 == num2 && num1 == num3){
            menor = meio = maior = num1;

        }
        else if (num1 == num2){
            if (num3 > num2){
                menor = meio = num2;
                maior = num3;
            } else {
                menor = num3;
                meio = maior = num2;
            }

        }
        else if (num2 == num3) {
            if (num1 > num2){
                menor = meio = num2;
                maior = num1;
            } else {
                menor = num1;
                meio = maior = num2;
            }
        }
        else if (num1 == num3) {
            menor = num1;
            meio = num2;
            if (num2 > num3){
                menor = meio = num3;
                maior = num2;
            } else {
                menor = num2;
                meio = maior = num3;
            }
        }

        //verifica o menor
        if((num1 < num2) && (num1 < num3)){
            menor = num1;

        }
        else if ((num2 < num1) && (num2 < num3)) {
            menor = num2;

        }
        else if ((num3 < num2) && (num3 < num1)) {
            menor = num3;
        }

        //verifica o maior
        if ((num1 > num2) && (num1 > num3)) {
            maior = num1;

        }
        else if ((num2 > num1) && (num2 > num3)){
            maior = num2;

        }
        else if ((num3 > num1) && (num3 > num2)){
            maior = num3;
        }

        //verifica o meio
        if (((num1 > num2) && (num1 < num3)) || ((num1 > num3) && (num1 < num2)) ) {
            meio = num1;
        }
        else if (((num2 > num1) && (num2 < num3)) || ((num2 > num3) && (num2 < num1))) {
            meio = num2;

        }
        else if (((num3 > num1) && (num3 < num2)) || ((num3 > num2) && (num3 < num1))){
            meio = num3;

        }
        //imprime o resultado
        System.out.println("O resultado em ordem DECRESCENTE é: "+maior+" "+meio+" "+menor);

    }

}
