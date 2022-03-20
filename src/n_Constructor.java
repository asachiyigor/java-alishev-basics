public class n_Constructor {
    public static void main(String[] args) {
        Humans human1 = new Humans("Bob", 14);
        human1.setName("Igor");
        human1.setAge(34);
    }
}

class Humans {

    private String name;
    private int age;

    public Humans() {
        System.out.println("Привет из первого конструктора");
    }

    public Humans(String name) {
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Humans(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}