
package mycompany.com.cursoloiane.aula13.exercicios;

import java.util.Scanner;


public class LojaDeTintasPlus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area, resultL, resultG;
        System.out.print("Informe o valor da área: ");
        area = scan.nextDouble();
        resultL = Math.ceil((area/6)/18);
        resultG = Math.ceil((area/6)/3.6);
        System.out.println("=======APENAS LATAS DE 18L==============");
        System.out.println("Serão necessários "+resultL
            +" Latas de tinta.");
        System.out.println("Total: R$"+(resultL*80));
        System.out.println("=======APENAS GALÕES DE 3,6L==============");
        System.out.println("Serão necessários "+resultG
            +" Galões de tinta.");
        System.out.println("Total: R$"+(resultG*25));
        if (resultG >5){
            double latas = Math.floor(resultG/5);
            double gal = Math.floor(resultG%5);
            System.out.println("=======GALÕES E LATAS==============");
            System.out.println("Quantidade de Latas: "+latas);
            System.out.println("Quantidade de Galões: "+gal);
            System.out.println("Total: R$"+((latas*80)+(gal*25)));
            
            
        }
        
        
        
        
    }
    
}
