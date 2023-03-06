
package mycompany.com.cursoloiane.aula13.exercicios;
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio, area;
        System.out.print("Informe o valor do raio: ");
        raio = scan.nextDouble();
        area = 3.14*(Math.pow(raio, 2));
        System.out.println("A área do circulo é: "+area);
        
        
    }
}
