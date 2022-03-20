package Interfaces;

public class Test {
    public static void main(String[] args) {

        Info info1 = new Animal(1);
        Info info2 = new Person("Tom");

        outputInfo(info1);
        outputInfo(info2);


//        info1.showInfo();
//        info2.showInfo();


//        Animal animal1 = new Animal(22);
//        Person person1 = new Person("Igor");
//        animal1.sleep();
//        person1.sayHello();

//        animal1.showInfo();
//        person1.showInfo();
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
