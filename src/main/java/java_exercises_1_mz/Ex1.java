package java_exercises_1_mz;

//    Utwórz 10 elementową tablicę przechowującą liczby całkowite (int)
//        a. Dodaj 10 kolejnych liczb do tablicy rozpoczynając od liczby 1
//        b. Wyświetl długość tablicy
//        c. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
//        d. Wykorzystując pętlę for pomnóż przez 2 kolejno każdy element w tablicy i zapisz go ponownie w tablicy.
//        e. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.

public class Ex1 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        for (int i = 1; i < 10; i++) {
            tab[i] = i + 1;
        }
        printTable(tab);
        for (int i = 0; i < tab.length; i++) {
            tab[i] = tab[i] * 2;
        }
        printTable(tab);
    }


    public static void printTable(int[] tab) {
        for (int element : tab) {
            System.out.print("[" + element + "] ");
        }
        System.out.println();
    }
}
