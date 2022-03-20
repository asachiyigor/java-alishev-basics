
public class p_ObjectToString {
    public static void main(String[] args) {
        Humaan h1 = new Humaan("Bob", 35);
        Humaan h2 = new Humaan("Tom", 30);
        System.out.println(h1);
        System.out.println(h2);

    }
}

class Humaan {

    private String name;
    private int age;

    public Humaan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;

    }

}
