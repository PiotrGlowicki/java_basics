package java_exercises_1_mz;

//    Utwórz listę ArrayList przechowującą liczby zmiennoprzecinkowe. Dodaj ręcznie 10
//        liczb do listy.
//        a. Wyświetl sumę pierwszego i ostatniego elementu zapisanego w liście..
//        b. Wyświetl iloczyn pierwszego i ostatniego elementu zapisanego w liście.
//        c. Wyświetl iloraz drugiego i przedostatniego elementu zapisanego w liście.

import java.util.ArrayList;

public class Ex3 {

    public static ArrayList<Double> listOfDouble = new ArrayList<>();

    public static void main(String[] args) {
        addToList();
        actionsOnList();
    }

    public static void addToList(){
        for(int i = 0; i < 10; i++){
            listOfDouble.add(i + 0.5);
        }
        System.out.println(listOfDouble);
    }

    public static void actionsOnList() {
        if (listOfDouble.size() >= 2) {
            System.out.println("Suma pierwszego i ostatniego: " + (listOfDouble.get(0) + listOfDouble.get(listOfDouble.size() - 1)));
            System.out.println("Iloczyn pierwszego i ostatniego: " + (listOfDouble.get(0) * listOfDouble.get(listOfDouble.size() - 1)));
            System.out.println("Iloraz pierwszego i ostatniego: " + (listOfDouble.get(0) / listOfDouble.get(listOfDouble.size() - 2)));
        } else {
            System.out.println("Za mała lista");
        }
    }
}
