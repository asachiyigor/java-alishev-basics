import java.util.ArrayList;
import java.util.List;

public class t_Generics {
    public static void main(String[] args) {
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = (String) animals.get(1); // БЫЛО
        System.out.println(animal);

        //..................................... СТАЛО С GENERICOM
        List<String> animals2 = new ArrayList<>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = (String) animals2.get(2); // СТАЛО
        System.out.println(animal2);

//////////////////////    JAVA 7 /////////////////////////////

        List<String> animals3 = new ArrayList<>();

    }
}
