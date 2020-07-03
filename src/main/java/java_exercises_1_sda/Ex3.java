package java_exercises_1_sda;

import java.util.Scanner;

//  Napisz funkcję, która dla zadanych dwóch parametrów X i Y obliczy sumę liczb od X do Y

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(addNumber(1,3));
    }

    public static int addNumber(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }
}
