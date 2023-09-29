import java.util.Scanner;
public class billetes {
    public static void main(String[] args) {
        //comentario
        int b100, b20, b5, m1, total;
        System.out.print("Billetes de 100€: ");
        Scanner input = new Scanner(System.in);
        b100 = input.nextInt()* 100;
        System.out.print("Billetes de 20€: ");
        b20 = input.nextInt()* 20;
        System.out.print("Billetes de 5€: ");
        b5 = input.nextInt()* 5;
        System.out.print("Billetes monedas de 1€: ");
        m1 = input.nextInt();
        total = b100 + b20 + b5 +m1;
        System.out.println("\nLa cantidad total es: "+total+" €");
    }
}
