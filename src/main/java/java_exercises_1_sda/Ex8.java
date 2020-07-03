package java_exercises_1_sda;

//    Sprawdź, czy podany ciąg liczb jest ciągiem arytmetycznym

public class Ex8 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 8};
        displayAritmeticalString(array);
        if (isAritmeticString(array)) {
            System.out.println("Jest ciągiem arytmetycznym.");
        } else {
            System.out.println("Nie jest ciągiem arytmetycznym.");
        }
    }

    public static boolean isAritmeticString(int[] array) {
        if (array.length < 2) {
            return false;
        }
        int diff = array[1] - array[0];
        for (int i = 1; i < array.length-1; i++) {
            if (array[i + 1] - array[i] != diff)
                return false;
        }
        return true;
    }

    public static void displayAritmeticalString(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
