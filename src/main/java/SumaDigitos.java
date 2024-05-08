import java.util.Scanner;

public class SumaDigitos {

    public static int sumaDigitos(int num) {
        // Si el número es negativo, trabajamos con su valor absoluto
        num = Math.abs(num);

        // Caso base: cuando el número es 0, la suma de sus dígitos es 0
        if (num == 0) {
            return 0;
        } else {
            // Llamada recursiva: suma el último dígito al resultado de la suma de los dígitos del resto del número
            return num % 10 + sumaDigitos(num / 10);
        }
    }

    public static void main(String[] args) {
        // Ejemplo con el número 102
        int ejemplo = 102;
        int resultadoEjemplo = sumaDigitos(ejemplo);
        System.out.println("La suma de los dígitos de " + ejemplo + " es: " + resultadoEjemplo + " (1 + 0 + 3)");

        // Solicitar al usuario que introduzca un número
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número para calcular la suma de sus dígitos:");
        int numero = scanner.nextInt();
        int resultado = sumaDigitos(numero);
        System.out.println("La suma de los dígitos de " + numero + " es: " + resultado);
    }
}