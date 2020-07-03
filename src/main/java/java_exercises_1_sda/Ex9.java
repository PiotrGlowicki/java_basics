package java_exercises_1_sda;

//    Załóżmy, że nie wiesz, że istnieje operator %, a potrzebujesz wylicz resztę z dzielenia
//        dwóch liczb. Napisz własną wersję funkcji modulo.

public class Ex9 {
    public static void main(String[] args) {
        System.out.println("Reszta z dzielenia to: " + modulo(13, 4));
    }

    public static int modulo(int x, int y) {
        int result = x / y;
        result *= y;
        int resultModulo = x - result;
        return resultModulo;
    }
}
