package java_exercises_1_sda;

//    Napisz funkcję tworzącą ciąg arytmetyczny o podanych: długości, pierwszym elemencie,
//        różnicy ciągu

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość ciągu: ");
        int aLong = scanner.nextInt();
        System.out.println("Podaj pierwszy element ciągu: ");
        int aFirst = scanner.nextInt();
        System.out.println("Podaj różnicę ciągu: ");
        int aDiff = scanner.nextInt();

        aritmeticString(aLong, aFirst, aDiff);

    }
    public static void aritmeticString(int aLong, int aFirst, int aDiff){
        int[] tab = new int[aLong];
        tab[0] = aFirst;

        for (int i = 1; i < tab.length; i++){
            tab[i] = tab[i-1] + aDiff;
        }
        for (int value:tab){
            System.out.print(value + " ");
        }
    }
}
