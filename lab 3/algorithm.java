public class algorithm {
  static int count = 0;

  public static void main(String[] args) {
    // int[] A = { 12, 41, 16, 21, 39 };
    // System.out.println(MinDistance(A));
    // int[] L = { 89, 45, 68, 90, 29, 34, 17 };
    int[] L = { 92, 41, 16, 121, 30, 65, 34 };
    int[] M = BubbleSort(L);
    for (int i : M) {
      System.out.println(i);
    }
    System.out.println("Count = " + count);
  }

  public static int MinDistance(int[] array) {
    int dMin = Integer.MAX_VALUE;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        System.out.println("i = " + i + " , j=" + j);
        System.out.println("dMin = " + dMin);
        if (i != j && Math.abs(array[i] - array[j]) < dMin) {
          System.out.println("True");
          dMin = Math.abs(array[i] - array[j]);
          System.out.println("|A[" + i + "] - A[" + j + "]| = " + dMin);
        } else {
          System.out.println("False");
        }
      }
    }
    return dMin;
  }

  public static int[] BubbleSort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j + 1] < array[j]) {
          count++;
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    return array;
  }
}
