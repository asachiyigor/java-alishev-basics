import java.io.IOException;
import java.util.Scanner;

public class v_Exception2 {
    public static void main(String[] args) throws ScannerExeption {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(sc.nextLine());
            if (x != 0) {
                throw new ScannerExeption("Пользователь ввел что то кроме 0");
            }
        }
    }

    public static class ScannerExeption extends Exception {
        public ScannerExeption(String desсription) {
            super(desсription);

        }
    }
}
