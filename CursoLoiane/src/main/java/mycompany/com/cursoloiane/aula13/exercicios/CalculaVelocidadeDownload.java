
package mycompany.com.cursoloiane.aula13.exercicios;

import java.util.Scanner;

public class CalculaVelocidadeDownload {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double size, link, time;
        System.out.print("Informe o tamanho do arquivo em MB: ");
        size = input.nextDouble();
        System.out.print("Informe a velocidade do Link em MBPS: ");
        link = input.nextDouble();
        time = size/(link/10);
        System.out.println("O tempo estimado de download é: "
                +String.format("%.2f",(time/60))+"min");
    }
}
