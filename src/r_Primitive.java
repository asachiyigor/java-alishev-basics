public class r_Primitive {
    public static void main(String[] args) {
        float f = (float) 123.2;
        long lon = 12121L;

        int a = 123;

        long l = a; // неявное приведение - мы его не видим
        int x = (int) l; // явное видим

        double d = 123.5;
        int y = (int) x;

        System.out.println(y);

        int z =1;
        Integer x2 = new Integer(123); // boxing
        int g = x2; // unboxing
        Integer.parseInt("1234");
        System.out.println(x2);


    }
}
