package mycompany.com.cursoloiane.aula16;

public class DoWile {
    public static void main(String[] args) {
        int i = 1;
        int max = 10;

        System.out.println("Contando até " + max);

        do {
            System.out.println("Valor de i: "+i);
            i++;
        } while (i == 10);

        System.out.println(i);

    }
}
