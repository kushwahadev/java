package arrays;

public class Arrays {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[5];
        arr2[0]= 12;

        int[][] mn = new int[2][3];
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };


        for(int i= 1 ;i < 5; i++){
            arr2[i]= i;
          //  System.out.println(arr2[i-1]);
        }

        for(int i= 0 ;i < matrix.length; i++){
            for(int j =0 ;j<matrix[i].length ;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
