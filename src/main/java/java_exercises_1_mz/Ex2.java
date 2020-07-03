package java_exercises_1_mz;

//    Utwórz listę ArrayList przechowującą liczby całkowite.
//        a. Dodaj 3 dowolne liczby, a następnie wyświetl długość tablicy.
//        b. Wyświetl pierwszy element zapisany w liście.
//        c. Wyświetl ostatni element zapisany w liście

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(21);
        numbers.add(46);
        numbers.add(35);
        System.out.println("Długość listy: " + numbers.size());
        System.out.println("Pierwszy element listy: " + numbers.get(0));
        System.out.println("Ostatni element listy: " + numbers.get(numbers.size()-1));
    }
}
