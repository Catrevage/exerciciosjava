
package mycompany.com.cursoloiane.aula13.exercicios;

import java.util.Scanner;

public class PesoIdealByGen {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double h, pesoIdeal, peso;
        char genero;
        pesoIdeal = 0;
        System.out.print("Informe a sua altura: ");
        h = scan.nextDouble();
        System.out.print("Informe o peso: ");
        peso = scan.nextDouble();
        System.out.print("Informe o genero M/F: ");
        genero = scan.next().charAt(0);
        switch(genero){
            case 'M': 
                pesoIdeal = (72.7*h) - 58;
                break;
            case 'F':
                pesoIdeal = (62.1*h) - 44.7;
                break;
            default:
                System.out.println("Genero indeterminado.");
        } 
        System.out.println("Seu peso ideal é: "
                +String.format("%.2f", pesoIdeal));           
        if(peso > pesoIdeal){
            System.out.println("Você está acima do peso ideal.");
        } else if(peso == pesoIdeal){
            System.out.println("Você está dentro do peso ideal.");
        }else {
            System.out.println("Você está abaixo do peso ideal.");
        }
        
        
    }
    
    
}
