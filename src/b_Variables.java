public class b_Variables {
    public static void main(String[] args) {

        int myInt= 444; // -2147483648 +2147483647
        short myShort = 3266; // -32768 +32767
        long myLong = 2323223; // -9223372036854775808l +9223372036854775807l

        double myDouble = 234.4; // %.0f для целого числа
        float myfloat = 234.4f;

        char c = 'a';
        boolean b = true;

        byte myByte = 100; // -128 + 127

        System.out.println(myInt);
    }
}

//        int myInt = 557; // -32,768 to 32,767 or -2,147,483,648 to 2,147,483,647
//        System.out.println(myInt);
//        short myShort = 3266;   // -32,768 to 32,767
//        System.out.println(myShort);
//        long myLong = 223232;   // 64 bits -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808
//        System.out.println(myLong);
//
//        double myDouble = 235.35; // 64 bits       a double precision floating point number
//        System.out.println(myDouble);
//        float myFloat = 2362.6f; //32 bits  	1.2E-38 to 3.4E+38 till 6 decimal places   float nFactor = 22.442e2;
//        System.out.println(myFloat);
//
//        char c = 'a';   // символ
//        System.out.println(c);
//        boolean b = true;   // лож - правда     logical true or false
//        System.out.println(b);
//
//        byte myBite = -128  ;    // -128 to 127 or 0 to 255 1 bite
//        System.out.println(myBite);
