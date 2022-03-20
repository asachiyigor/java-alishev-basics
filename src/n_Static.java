import javax.sound.midi.Soundbank;

public class n_Static {
    public static void main(String[] args) {
        Hum h1 = new Hum("Bob", 35);
        Hum h2 = new Hum("Tom", 30);

        h1.printNumberOfPeople();
        h2.printNumberOfPeople();


//        h1.getAllFields(); // null description
//        h2.getAllFields(); // null description
//        Hum.description = "Nice";
//        h1.getAllFields();
//        h2.getAllFields();
//        Hum.description = "Bad";
//        h1.getAllFields();
//        h2.getAllFields();
    }
}

class Hum {

    private String name;
    private int age;
    public static String description;
    private static int countPeople;

    public Hum(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
        countPeople++;

    }

    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}

    public int getAge() {return age;}

//    public void getAllFields(){
//        System.out.println(name + ", " + age +  ", " + description);}

    public void printNumberOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }

}