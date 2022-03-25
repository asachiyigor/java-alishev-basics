import Polymorphism.Animal;
import Polymorphism.Dog;

public class s_UpcastingDowncasting {

    // upcasting восходящее преобрзование - Dog наследуется от Animal ..НЕЯВНОЕ..
    Animal animal = new Dog();

    // downcasting низходящее преобразование - Dog ...ЯВНОЕ... получили собаку из животного
    Dog dog2 = (Dog) animal;

}
