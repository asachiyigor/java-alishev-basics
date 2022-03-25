public class w_equalsStringPool {
    public static void main(String[] args) {

        //  animal1 ->      {1} // разные указатели
        //  animal2 ->      {1} // разные указатели

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        System.out.println(animal1.equals(animal2));

//        Object object = new Object();
//        object.equals(animal1);
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;

        return this.id == otherAnimal.id;
    }
}
