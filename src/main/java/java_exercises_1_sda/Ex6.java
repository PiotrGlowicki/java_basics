package java_exercises_1_sda;

//    Dla zadanej tablicy intów policz ile jest w niej liczb ujemnych. Jeśli takie występują
//        utwórz nową tablicę, do której przepisze tylko te ujemne liczby

public class Ex6 {
    public static void main(String[] args) {
        int[] table = {-2, 1, 3, -1, -3, 4};
        int[] minusTab = displayMinusTab(table);
        printTable(minusTab);
    }

    public static int countMinus(int[] tab) {
        int count = 0;
        for (int number : tab) {
            if (number < 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] minusTab(int count, int[] tab){
        int[] minus = new int[count];
        int i = 0;
        for(int number:tab){
            if(number < 0){
                minus[i] = number;
                i++;
            }
        }
        return minus;
    }

    public static int[] displayMinusTab(int[] tab) {
        int result = countMinus(tab);
        return minusTab(result, tab);
    }

    public static void printTable(int[] tab){
        for(int element:tab){
            System.out.print("[" + element + "] ");
        }
        System.out.println("\n");
    }
}
