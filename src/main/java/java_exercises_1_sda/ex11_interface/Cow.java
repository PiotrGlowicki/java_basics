package java_exercises_1_sda.ex11_interface;

public class Cow implements Animal{
    public Cow() {
    }

    @Override
    public String makeSound() {
        return "Mooooo";
    }
}
