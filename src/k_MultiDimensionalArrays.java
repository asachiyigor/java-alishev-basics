public class k_MultiDimensionalArrays {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
//        System.out.println(number[1]);
        int[][] matrix = {{1, 2, 3, 4, 5}, {4}, {7, 8, 9}};
//        System.out.println(matrix[2][2]);
//        System.out.println(matrix[1][0]);
//        System.out.println(matrix[0][4]);

        String[][] strings = new String[2][3]; // 2 строки и 3 столбца
        strings[0][1] = "Привет";
//        System.out.println(strings[0][1]);

        int[][] matrixNew = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < matrixNew.length; i++) { // возввращает число 3 (3 строки)
            for (int j = 0; j < matrixNew[i].length; j++) { // возвращает число 3 (3 столбца)
                System.out.print(matrixNew[i][j] + " ");
            }
            System.out.println();
        }
    }
}
