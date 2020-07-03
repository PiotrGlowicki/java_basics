package java_exercises_1_sda.ex11_interface;

//    Zdefiniuj interface Animal z metodą makeSound. Zaimplementuj ten interejsw klasach Cat,
//        Dog and Cow. Utwórz tablicę obiektów zwierząt różnych klas, wypisz wydawane przez nich
//        odgłosy.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Cow krowa = new Cow();
        Cat kot = new Cat();
        Dog pies =new Dog();

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(krowa);
        listOfAnimals.add(kot);
        listOfAnimals.add(pies);
        for(Animal zwierze:listOfAnimals){
            System.out.println(zwierze.makeSound());
        }
    }
}
