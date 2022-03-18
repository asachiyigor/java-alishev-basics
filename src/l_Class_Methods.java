public class l_Class_Methods {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("");
        person2.setName("Igor");

        person1.setAge(20);
        person2.setAge(-5);

//        System.out.println("Выводим значение в main методе" + person1.getName());
//        System.out.println("Выводим значение в main методе" + person1.getAge());

//        person1.sayHello();
//        person1.speak();
//        person2.speak();
//        System.out.println("Первому до пенсии: " + person1.calculateYearsToRetirement());
//        System.out.println("Второму до пенсии: " + person2.calculateYearsToRetirement());

    }
}

class Person {
    private String name;
    private int age;

    public void setName(String userName) { // SETTER
        if (userName.isEmpty()) {
            System.out.println("Ты ввел пустое имя ");
        } else {
        name = userName;}
    }

    public String getName() { // GETTER
        return name;
    }

    public void setAge(int userAge) { // SETTER
        if(userAge<0){
            System.out.println("Возраст должен быть положительным ");
        } else {
        age = userAge;}
    }

    public int getAge() { // GETTER
        return age;
    }

    int calculateYearsToRetirement() { // возвращаем int из метода
        int years = 65 - age;
        return years;
    }

    void speak() {
        System.out.println("Меня зовут " + name + " Мне " + age);
    }

    void sayHello() {
        System.out.println("Привет");
    }
    // У класса могут быть:
    // 1. Данные (поля)
    // 2. Действия, которые он может совершать (методы)
}