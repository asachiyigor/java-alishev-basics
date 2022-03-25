import java.io.*;
import java.util.Arrays;

public class x_Serialization2Arrays implements Serializable {
    private transient int id; // УБИРАЕТ ПОЛЯ ИЗ СОХРАНЕНИЯ И ЧТЕНИЯ
    private String name;

    public x_Serialization2Arrays(int id, String name) {
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


class WriteObject2 {
    public static void main(String[] args) {
        x_Serialization2Arrays[] people = {new x_Serialization2Arrays(1, "Bob"), new x_Serialization2Arrays(2, "Mike"), new x_Serialization2Arrays(3, "Tom")};


        try (ObjectOutputStream oos = new  ObjectOutputStream(new FileOutputStream("x_x2_people.bin"))) {

//            FileOutputStream fos = new FileOutputStream("x_x2_people.bin");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);

//            oos.writeInt(people.length);
//
//            for (x_Serialization2Arrays x_Serialization2Arrays : people)
//                oos.writeObject(x_Serialization2Arrays);

//            oos.close();

        } catch (IOException e) {
            System.out.println("Нет файла ...");
        }
    }
}

class ReadObject2 {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("x_x2_people.bin"))) {//  TRY WITH RESSORSES


            x_Serialization2Arrays[] people = (x_Serialization2Arrays[]) ois.readObject();

//            int personCount = ois.readInt();
//            x_Serialization2Arrays[] people = new x_Serialization2Arrays[personCount];
//
//
//            for (int i = 0; i < personCount; i++) {
//                people[i] = (x_Serialization2Arrays) ois.readObject();
//            }

            System.out.println(Arrays.toString(people));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}