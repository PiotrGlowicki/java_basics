package java_exercises_1_sda;

//  Wypisz poniższy kawałek tabliczki mnożenia:
//        5 x 1 = 5
//        5 x 2 = 10
//        5 x 3 = 15
//        5 x 4 = 20
//        Zmodyfikuj powyższe żeby wyświetlało ten kawałek tabliczki dla liczby zadanej w
//        parametrze.

public class Ex1 {
    public static void main(String[] args) {
        multiplication(5);
    }

    public static void multiplication(int x) {
                for (int i = 1; i < x; i++) {
            System.out.println(x + " x " + i + "" + " = " + x * i);
        }
    }
}
