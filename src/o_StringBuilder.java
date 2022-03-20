public class o_StringBuilder {
    public static void main(String[] args) {
//        String s = "Hello";
//        s = s.toUpperCase();
//        System.out.println(s);

//        String string1 = "Hello";
//        String string2 = " My";
//        String string3 = " Friend";
//        String stringAll = string1 + string2 + string3;
//        System.out.println(stringAll);

//        StringBuilder sb = new StringBuilder("Hello"); // не создает объекты класса String дополнительно
//        System.out.println(sb.toString());
//        sb.append("111") // https://medium.com/@DavidChuks/method-chaining-in-java-97fc56d112fc  о методе
//          .append("222") // https://stackoverflow.com/questions/38595138/wrapping-chained-method-calls-on-a-separate-line-in-intellij-for-java Вид
//          .append("333");
//        System.out.println(sb.toString());

        System.out.printf("This is a string, %4s\n", "nice");
        System.out.printf("This is a string, %10d\n", 1); // справа
        System.out.printf("This is a string, %-10d\n", 1); // слева
        System.out.printf("This is a string, %.2f\n", 45.9999); // 2 знака после запятой

    }
}
