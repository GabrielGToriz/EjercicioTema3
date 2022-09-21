import java.util.Scanner;

public class numeros {
    int primero = 0;
    int segundo = 0;
    int tercero = 0;

    public static int suma(int primero, int segundo, int tercero) {

        int suma = 0;
        suma = primero + segundo + tercero;
        return suma;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer numero -> ");
        int primero = teclado.nextInt();
        System.out.print("Ingrese el segundo numero -> ");
        int segundo = teclado.nextInt();
        System.out.print("Ingrese el tercer numero -> ");
        int tercero = teclado.nextInt();

        System.out.println("La suma es = " + suma(primero, segundo, tercero));
    }
}
