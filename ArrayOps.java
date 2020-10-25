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



}
