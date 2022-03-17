public class i_Break { //WHILE
    public static void main(String[] args){
        int i = 0;
        while(true){
            if(i==15){
                break; // прибавляем 0 + 1 + 1 до 14
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла.");
    }
}
