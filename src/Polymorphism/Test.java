package Polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);

//        Animal animal = new Animal();
//        Dog dog = new Dog();

//        animal.eat(); // будет вызвана реализация в потомке, если она есть ... если нет - будет вызвана реализация родителя
//        dog.eat();
//        dog.bark();
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
