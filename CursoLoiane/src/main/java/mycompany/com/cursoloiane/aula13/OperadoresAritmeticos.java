package mycompany.com.cursoloiane.aula13;
import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        System.out.print("Informe o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Informe o segundo número: ");
        int num2 = scan.nextInt();
        System.out.println("========================");
        System.out.println("A soma é: "+(num1+num2));
        System.out.println("A subtração é: "+(num1-num2));
        System.out.println("A multiplicação é: "+(num1*num2));
        System.out.println("A divisão é: "+(num1/num2));
        System.out.println("A mod é: "+(num1%num2));
        cont++;
        System.out.println("O valor do contador é: "+cont);
        
        
    }
}
