package mycompany.com.cursoloiane.aula14.exercicios;

import java.util.Scanner;

public class TurnoDeEstudo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char op, opu;
        System.out.print("Informe o turno que você estuda(M-matutino, V-vesertino, N-noturno): ");
        op = input.next().charAt(0);
        opu = Character.toUpperCase(op);
        switch (opu) {
            case 'M':
                System.out.println("BOM DIA!");
                break;

            case 'V':
                System.out.println("BOA TARDE!");
                break;

            case 'N':
                System.out.println("BOA NOITE!");
                break;

            default:
                System.out.println("Valor Inválido.");
        }
    }

}
