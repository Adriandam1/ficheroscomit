import java.util.Scanner;
public class ejemploscanner {
    public static void main(String[] args) {
        //comentario
        //area de un rectangulo = base * altura
/*
       float base, altura, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("El base es : ");
        base = sc.nextFloat();
        System.out.print("La altura es : ");
        altura = sc.nextFloat();
        area = base*altura;
        System.out.println("El area del rectangulo es = "+area);
*/
        // calculo da lonxitude e area de un circulo lonxitude=2pi*radio(ra) s=n+r^2
        System.out.print("Teclea el radio del circulo: ");
        Scanner sc = new Scanner(System.in);
        float ra = sc.nextFloat();
        // para PI usamos el Math, como PI es double tenemos que hacer un cast a float
        float lonxitude = (float) (2*Math.PI*ra);
        System.out.println("La lonxitude do circulo e: "+lonxitude);

    }
}
