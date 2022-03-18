public class l_Class {
    public static void main(String[] args) {
        Persons person1 = new Persons();
        Persons person2 = new Persons();

        person1.name = "Igor";
        person1.age = 34;

        person2.name = "Vasya";
        person2.age = 36;

        System.out.println(person1.name + " " + person1.age);
        System.out.println(person2.name + " " + person2.age);
    }
}

class Persons {
    String name;
    int age;

    // У класса могут быть:
    // 1. Данные (поля)
    // 2. Действия, которые он может совершать (методы)

}