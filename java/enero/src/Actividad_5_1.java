import java.util.Arrays;

public class Actividad_5_1 {

    public static double calcular(int[] numeros){
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }

        return (double) suma / numeros.length;
    }

    public static double calcular(double[] numeros){
        double moda = numeros[0];
        int maxFrecuencia = 0;

        for(int i = 0; i < numeros.length; i++){
            int frecuenciaActual = 0;
            for(int j = 0; j < numeros.length; j++){
                if(numeros[i] == numeros[j]){
                    frecuenciaActual++;
                }
            }
            if(frecuenciaActual > maxFrecuencia){
                maxFrecuencia = frecuenciaActual;
                moda = numeros[i];
            }
        }
        return moda;
    }

    public static String calcular(String[] cadenas) {
        Arrays.sort(cadenas);
        int n = cadenas.length;

        if (n % 2 != 0) {
            return cadenas[n / 2];
        } else {
            return cadenas[(n / 2) - 1] + ", " + cadenas[n / 2];
        }
    }

    public static void main(String[] args) throws Exception {
        int[] enteros = {1, 2, 4, 6, 8, 7, 12, 5};
        System.out.println("Media de enteros: " + calcular(enteros));

        double[] decimales = {2.5, 3.0, 2.5, 4.0, 2.5, 3.0, 7.0, 2.5, 3.5, 5.0};
        System.out.println("Moda de decimales: " + calcular(decimales));

        String[] cadenas = {"ventana", "luz", "montaña", "cielo", "calle", "música", "gato"};
        System.out.println("Mediana de cadenas: " + calcular(cadenas));
    }
}
