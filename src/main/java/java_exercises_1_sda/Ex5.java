package java_exercises_1_sda;

//    Dla zadanej tablicy intów wyświetl najmniejszą oraz największą liczbę z tablicy

public class Ex5 {
    public static void main(String[] args) {
        int[] minTop = {-2, 11, -12, 5, 20, -32};
        minAndTop(minTop);
    }

    public static void minAndTop(int[] tab) {
        int min = tab[0];
        int max = tab[0];
            for (int element:tab){
            if (element < min) min = element;
            if (element > max) max = element;
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
