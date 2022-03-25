package AbstractClasses;

public class Test {
    public static void main(String[] args) { // Интерфейс - контракт (то что объект класса умеет делать)
        Dog dog = new Dog();                 // абстракт класс - это то чем класс является
        Cat cat = new Cat();

        cat.makeSound();
        dog.makeSound();


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
