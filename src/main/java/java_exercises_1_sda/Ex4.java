package java_exercises_1_sda;

//    Dla zadanej tablicy 3 intów zamień miejscami pierwszy i trzeci element.
//        Przykład:
//        zadana tablica [12, 7, 19]
//        wynik [19, 7, 12]

public class Ex4 {
    public static void main(String[] args) {
        int[] tab = {12, 7, 19};
        switchtable(tab);
    }
    public static void printTable(int[] table){
        for(int element:table){
            System.out.print("[" + element + "] ");
        }
        System.out.print("\n");
    }

    public static void switchtable(int[] args) {
        System.out.println("Tablica przed zmianą: ");
        printTable(args);
        int firstIndex = args[0];
        int lastIndex = args.length-1;
        args[0] = args[lastIndex];
        args[lastIndex] = firstIndex;
        System.out.println("Tablica po zmianie: ");
        printTable(args);
    }
}
