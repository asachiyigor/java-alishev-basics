public class m_This {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Igor");
        human1.setAge(34);
        human1.getInfo();
    }
}

class Human {
    String name;
    int age;

    public void setName(String myName) {
        this.name = myName;
    }

    public void setAge(int myAge) {
        this.age = myAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name + " " + age);
    }
}