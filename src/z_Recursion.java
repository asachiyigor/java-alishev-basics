public class z_Recursion {
    public static void main(String[] args) {
        System.out.println(fact(3));


//        counter(1);
//    }
//    // somemethod() -> somemethod() -> somemethod() ПЕРЕПОЛНИЛСЯ СТЕК
//    public static void counter(int n) {
//        if (n == 0)
//            return;
//        System.out.println(n);
//        counter(n - 1);

    }

    public static int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }
}
