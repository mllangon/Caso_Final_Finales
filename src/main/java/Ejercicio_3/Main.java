package Ejercicio_3;


public class Main {
    public static void main(String[] args) {
        int a = recursive(1, -2);
        System.out.println(a);
    }

    public static int recursive(int a, int b) {
        if (b < 0) {
            return 0;  // Agregado para manejar casos cuando b es negativo
        } else if (b == 0) {
            return 1;
        } else if (a == 0) {
            return 0;
        } else {
            return a * recursive(a, b-1);
        }
    }
}

