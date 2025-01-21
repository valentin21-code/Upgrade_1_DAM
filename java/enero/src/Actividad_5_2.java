import java.util.Scanner;

public class Actividad_5_2 {    
    public static int calcularCombinaciones(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        
        return calcularCombinaciones(n - 1, k - 1) + calcularCombinaciones(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el tamaño del conjunto (n): ");
        int n = scanner.nextInt();
        
        System.out.print("Introduce el tamaño del subconjunto (k): ");
        int k = scanner.nextInt();

        int combinaciones = calcularCombinaciones(n, k);
        
        System.out.println("El número total de combinaciones posibles es: " + combinaciones);

        scanner.close();
    }
}
