import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class v_Exception {
    public static void main(String[] args) {
        File file = new File("sdsdsd");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("Блок сканера");
        } catch (FileNotFoundException e) {
            System.out.println("Нет файла");;
        }
        System.out.println("После все выполняется как обычно");
    }
}
