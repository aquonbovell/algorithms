import java.util.Arrays;

class lab {

  public static void main(String[] args) {

    int x = (int) Math.floor(Math.random() * 11) + 5, y = (int) Math.floor(Math.random() * 11) + 5;

    int[] B = {1, 3, 5, 7};
    int[] C = {2, 4, 6, 8, 9, 10, 11};    

    // for (int i = 0; i < B.length; i++) {
    // B[i] = (int) Math.floor(Math.random() * 86) + 5;
    // }
    // for (int i = 0; i < C.length; i++) {
    // C[i] = (int) Math.floor(Math.random() * 86) + 5;
    // }
    System.out.println("Array B:");
    for (int number : B) {
      System.out.println(number);
    }
    System.out.println("Array C:");
    for (int number : C) {
      System.out.println(number);
    }

    Arrays.sort(B);
    Arrays.sort(C);

    System.out.println("Array A:");
    int[] A = Merge(B, C);
    for (int i : A) {
      System.out.println(i);
    }
  }

  public static int[] Merge(int[] B, int[] C) {

    int[] A = new int[B.length + C.length];
    int i = 0, j = 0, k = 0, count = 0;
    while (i < B.length && j < C.length) {
      if (B[i] <= C[j]) {
        count++;
        A[k] = B[i];
        i = i + 1;
      } else {
        count++;
        A[k] = C[j];
        j = j + 1;
      }
      k++;
    }
    System.out.println("The # times if B[i] ≤ C[j] is executed is " + count);
    if (i == B.length) {
      for (int k2 = j; k2 < C.length; k2++) {
        A[k] = C[k2];
        k = k + 1;
      }
    } else {
      for (int k2 = i; k2 < B.length; k2++) {
        A[k] = B[k2];
        k = k + 1;
      }
    }
    return A;
  }
}