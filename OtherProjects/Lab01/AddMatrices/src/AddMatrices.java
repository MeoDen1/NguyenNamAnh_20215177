public class AddMatrices {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{3,2,1}};
        int[][] matrix2 = {{3,5,6},{3,2,1},{3,5,4}};

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print((matrix1[i][j] + matrix2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
