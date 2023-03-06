package mycompany.com.cursoloiane.aula12;

import java.util.Scanner;

public class LerDados {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe seu primeiro nome: ");
        String firstName = scan.nextLine();
        System.out.print("Informe o seu sobrenome: ");
        String lastName = scan.nextLine();
        System.out.print("Informe sua idade: ");
        int idade = scan.nextInt();
        System.out.print("Informe seu peso: ");
        double peso = scan.nextDouble();
        System.out.println("=================================");
        System.out.println("Seu nome é: "+firstName+" "+lastName);
        System.out.println("Sua idade é: "+idade);
        System.out.println("Seu peso é: "+peso);      
        
    }
    
}
