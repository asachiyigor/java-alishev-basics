
public class i_Continue { // FOR
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) {
                continue; // выполняется только когда i четное число до 15

            }
            System.out.println("Это не четное число " + i);
        }
    }
}