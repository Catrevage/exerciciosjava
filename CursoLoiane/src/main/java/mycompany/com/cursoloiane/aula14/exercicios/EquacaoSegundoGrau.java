package mycompany.com.cursoloiane.aula14.exercicios;
import java.util.Scanner;
public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b , c, delta, baskara1, baskara2;
        delta = baskara2 = baskara1 =0;
        System.out.println("Informe o valor de A: ");
        a = input.nextDouble();
        if (a == 0) {
            System.out.println("A equação não é do 2º grau.");
        } else {
            System.out.println("Informe o valor de B: ");
            b = input.nextDouble();
            System.out.println("Informe o valor de C: ");
            c = input.nextDouble();
            //(b²-4ac)
            delta = ((Math.pow(b, 2))-(4*a*c));
            if (delta < 0){
                System.out.println("A equação não tem raizes reais.");
            }else if (delta == 0) {
                //baskara = (-b + raiz(delta))/2a
                baskara1 =((-1*b)+ Math.sqrt(delta))/(2*a);
                System.out.println("Como delta é igual a zero  a equação \n possui aenas uma raiz que é: "
                        +baskara1);
            }else {
                baskara1 =((-1*b)+ Math.sqrt(delta))/(2*a);
                baskara2 =((-1*b)- Math.sqrt(delta))/(2*a);
                System.out.println("As raízes da Equação são:  ");
                System.out.println("'X = "+baskara1);
                System.out.println("''X = "+baskara2);
            }
        }


    }
}
