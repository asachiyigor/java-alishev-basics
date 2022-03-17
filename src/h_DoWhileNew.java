import java.util.Scanner; // Сначала  выполняем инструкцию, а потом
// выполняем условие

public class h_DoWhileNew {
    public static void main(String [] args ){
        Scanner scanner = new Scanner(System.in);
        int value; // декларируем за пределами цикла - в пределах main
        do{
            System.out.println("Введи 5 ");
            value = scanner.nextInt();
        } while(value!=5);
        System.out.println("Вы ввели 5!! ");
    }
}
