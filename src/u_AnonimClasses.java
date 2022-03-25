
interface AbleToEat{
    public void eat();
}

public class u_AnonimClasses {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating... ");
            }
        };
        ableToEat.eat(); // Объект класса на 1 раз
    }
}
