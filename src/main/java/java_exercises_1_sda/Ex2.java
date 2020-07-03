package java_exercises_1_sda;

//  Dla danej liczby sprawdź, czy jest ona liczbą pierwszą.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę większą od 2");
        int number = scanner.nextInt();
        isNumberPrime(number);
    }

    public static void isNumberPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            int result = number % i;
            if (result == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Podana liczba jest liczbą pierwszą");
        } else {
            System.out.println("Podana liczba NIE jest liczbą pierwszą");
        }
    }
}