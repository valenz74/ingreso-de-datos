import java.util.Scanner;

public class IngresoDeDatos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un primer numero :");
        int numero1 = leer.nextInt();

        System.out.println("Ingrese un segundo numero :");
        int numero2 = leer.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("El numero es : " +  resultado);
    }
}
