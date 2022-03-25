public class v_Exception3 {
    // checked exceptions проверяемые (compile time exception) // исключения во время компиляции https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html кроме RUNTIME
    // unchecked exceptions (runtime exception) // исключения во время работы программы

    public static void main(String[] args) {

        // int i= 1 / 0; // unchecked exceptions (runtime exception) // исключения во время работы программы
        // ошибка работы программы

        String s = null; //NPE - NullPointerException
        s.length();

//        int[] arr = new int[2];
//        System.out.println(arr[2]); // ArrayIndexOutOfBoundsException


    }


}
