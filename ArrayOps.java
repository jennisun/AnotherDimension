public class ArrayOps {

  public static int sum(int[] arr) {
    int sum = 0;

    if (arr.length != 0) {
      for (int i = 0; i < arr.length; i ++) {
        sum += arr[i];
      }
      return sum;
    }

    else return 0;
  }


  public static int largest(int[]arr) {
    int max = 0;
    for (int i = 0; i < arr.length; i ++) {
      if (arr[i] > max) max = arr[i];
    }
    return max;
  }


  public static int[] sumRows(int[][] matrix) {
    int [] sum = new int [matrix.length];

    for (int i = 0; i < matrix.length; i ++) {
      for (int h = 0; h < matrix[i].length; h ++) {
        sum[i] += matrix[i][h];
      }
    }
    return sum;
  }


  public static  int[] largestInRows(int[][] matrix) {
    int [] max = new int [matrix.length];

    for (int i = 0; i < matrix.length; i ++) {
      for (int h = 0; h < matrix[i].length; h ++) {
        if (max[i] < matrix[i][h]) max[i] = matrix[i][h];
      }
    }
    return max;
   }


   public static  int sum(int[][] arr) {
     int[] sum = sumRows(arr);
     int ans = 0;

     for (int i = 0; i < sum.length; i ++) {
       ans += sum[i];
     }
     return ans;
   }


   public static int[] sumCols(int[][] matrix) {
     int[] sum = new int [matrix[0].length];

     for (int i  = 0; i < matrix[0].length; i ++) {
       for (int h = 0; h < matrix.length; h ++) {
         sum [i] += matrix[h][i];
       }
     }
     return sum;
   }


   public static boolean isRowMagic(int[][] matrix) {
     int[] s = sumRows(matrix);
     boolean ans = true;

     for (int i = 0; i < s.length - 1; i ++) {
       ans = ans && (s[i] == s[i + 1]);
     }
     return ans;
   }


   public static boolean isColMagic(int[][] matrix) {
     int [] sum = sumCols(matrix);
     boolean ans = true;

     for (int i = 0; i < sum.length - 1; i ++) {
       ans = ans && (sum[i] == sum[i + 1]);
     }
     return ans;
   }


   public static boolean isLocationMagic(int[][] matrix, int row, int col) {
     int rowSum = 0;

     for (int i = 0; i < matrix[0].length; i ++) {
       rowSum += matrix[row][i];
     }

     int colSum = 0;

     for (int h = 0; h < matrix.length; h ++) {
       colSum += matrix[h][col];
     }

     return (rowSum == colSum);
   }


}
