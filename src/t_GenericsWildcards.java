import Polymorphism.Animal;
import Polymorphism.Dog;

import java.util.ArrayList;
import java.util.List;

public class t_GenericsWildcards {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal());
        listOfAnimals.add(new Animal());

        List<Dog> listOfDogs= new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test (listOfAnimals);
        test (listOfDogs);
    }

    private static void test(List<? extends Animal>  list){
        for (Animal animal : list){
            System.out.println(animal);
        }
    }
}
