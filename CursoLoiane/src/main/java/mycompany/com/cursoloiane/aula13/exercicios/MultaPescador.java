
package mycompany.com.cursoloiane.aula13.exercicios;

import java.util.Scanner;

public class MultaPescador {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double peso, excesso,multa;
        System.out.print("Informe o peso: ");
        peso = scan.nextDouble();
        excesso = peso-50;
        if (excesso > 0) {
            multa = excesso * 4;
            System.out.println("Voce excedeu em "+excesso+"Kg o limite");
            System.out.println("Sua multa é R$"+multa);
        } else {
            System.out.println("Não houve excesso.");
        }
        
                
    }
}
