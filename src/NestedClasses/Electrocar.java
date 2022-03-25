package NestedClasses;

public class Electrocar {
    private int id;

    // вложенный нестатический класс - объект из объектов
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + "is starting...");
        }
    }

    // вложенный статический класс -
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }

    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        int x = 1;

        class SomClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);

            }
        }

        System.out.println("Electrocar " + id + " is starting...");
    }
}