//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            int numeroInvertido = invertirNumero(numero);
            System.out.println("Número invertido: " + numeroInvertido);
        } else {
            System.out.println("Debe ingresar un número entero.");
        }
        scanner.close();
    }

    public static int invertirNumero(int numero) {
        if (numero < 10) {
            return numero;
        }
        int digito = numero % 10;
        int longitud = (int) Math.log10(numero);
        return digito * (int) Math.pow(10, longitud) + invertirNumero(numero / 10);
    }
}

