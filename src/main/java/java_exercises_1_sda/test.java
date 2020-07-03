package java_exercises_1_sda;

public class test {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i >= 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
