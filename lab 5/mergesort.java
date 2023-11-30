import java.util.Arrays;

public class mergesort {
  public static void main(String[] args) {
    int[] L = { 26, 14, 52, 7, 15, 37, 91, 34 };
    MergeSort(L);
    for (int i : L) {
      System.out.println(i);
    }
  }

  public static void MergeSort(int[] A) {
    if (A.length > 1) {
      int[] B = Arrays.copyOfRange(A, 0, (int) (Math.floor(A.length / 2)));
      int[] C = Arrays.copyOfRange(A, (int) (Math.floor(A.length / 2)), (int) A.length);
      MergeSort(B);
      MergeSort(C);
      Merge(B, C, A);
    }
  }

  public static void Merge(int[] B, int[] C, int[] A) {

    int i = 0, j = 0, k = 0;
    while (i < B.length && j < C.length) {
      if (B[i] <= C[j]) {
        A[k] = B[i];
        i = i + 1;
      } else {
        A[k] = C[j];
        j = j + 1;
      }
      k++;
    }
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
  }

}