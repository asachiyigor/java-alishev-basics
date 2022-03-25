import java.io.*;

public class x_Serialization implements Serializable {
    private int id;
    private String name;

    public x_Serialization(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " : " + name;
    }

}


class WriteObject {
    public static void main(String[] args) {
        x_Serialization x_Serialization1 = new x_Serialization(1, "Bob");
        x_Serialization x_Serialization2 = new x_Serialization(2, "Mike");

        try {
            FileOutputStream fos = new FileOutputStream("x_x_people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(x_Serialization1);
            oos.writeObject(x_Serialization2);
            oos.close();

        } catch (IOException e) {
            System.out.println("Нет файла ...");
        }
    }
}

class ReadObject {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("x_x_people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            x_Serialization x_Serialization1 = (x_Serialization) ois.readObject();
            x_Serialization x_Serialization2 = (x_Serialization) ois.readObject();

            ois.close();
            System.out.println(x_Serialization1);
            System.out.println(x_Serialization2);


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}