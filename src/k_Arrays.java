public class k_Arrays {
    public static void main(String [] args){
        int[] array = new int[5]; // array -> [массив] ссылаемся на массив
        for ( int i=0; i < array.length; i++ )
        {
            array[i] = i*10;
            System.out.println(array[i]);
        }
    }
}
