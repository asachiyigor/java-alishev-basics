import java.util.Scanner;

public class h_DoWhile { // ПОВТОРЯЕТСЯ КОД
    public static void main(String [] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи 5 "); // ПОВТОРЯЕТСЯ КОД
        int value = scanner.nextInt();// ПОВТОРЯЕТСЯ КОД
        while(value!=5){
            System.out.println("Введи 5 ");// ПОВТОРЯЕТСЯ КОД
            value = scanner.nextInt();// ПОВТОРЯЕТСЯ КОД
        }
        System.out.println("Вы ввели 5!! ");
    }
}
