package java_exercises_1_sda;

//    Właśnie się dowiedziałeś, że istnieje operator %. Napisz funkcję, która będzie sprawdzała,
//        czy napisana w poprzednim zadaniu funkcja zwraca dokładnie takie same wyniki jak ten
//        operator. Przetestuj dla różnych przypadków.

public class Ex10 {
    public static void main (String[] args) {
        int test1 = 13%3;
        int test2 = modulo(13,3);
        System.out.println(isCorrect(test1, test2));
    }

    public static int modulo(int x, int y) {
        int result = x / y;
        result *= y;
        int resultModulo = x - result;
        return resultModulo;
    }

    public static boolean isCorrect(int a, int b){
        return a == b;
    }
}
