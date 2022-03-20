public class q_PublicPrivateProtectedDefault {

    public int id;

    public static void main(String[] args) { // https://www.programcreek.com/wp-content/uploads/2011/11/access-level.png

        Person person1 = new Person();

        person1.name = "Bob";

        // default - по умолчанию доступно в пределах пакета
        // protected - доступны всем подклассам, даже если они вне пакета (src)
    }

    private void technicalMethod() { // не должен быть виден за пределами класса  (для всех остальных классов не виден)
    }
}

class Test2{ // не может быть 2 публичных класса - только 1 с названием файла совпадает

}

