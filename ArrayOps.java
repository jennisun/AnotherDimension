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


  public static  int largest(int[]arr) {
    int max = 0;
    for (int i = 0; i < arr.length; i ++) {
      if (arr[i] > max) max = arr[i];
    }
    return max;
  }


}
