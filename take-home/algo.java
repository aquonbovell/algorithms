import java.util.ArrayList;
import java.util.Random;

class algo {
  public static void main(String[] args) {
    int[][] l = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 19 }, };
    for (Integer integer : Largest(l)) {
      System.out.println(integer);
    }
  }
    
  public static int[] Largest(int[][] A) {
    int col = 0, row = 0;
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[i].length; j++) {
        if (A[i][j] > A[row][col]) {
          row = i;
          col = j;
        }
      }
    }
    int[] tuple = { row,col };
    return tuple;
  }

  public static boolean SumSets(int[] A) {
    Random rand = new Random();
    // Generate a random number k < n
    int k = rand.nextInt(A.length), p = 0, j = 0;

    int[] S1 = new int[k];
    int[] S2 = new int[A.length - k];
    // Initialize sums for S1 and S2
    int sumS1 = 0;
    int sumS2 = 0;
    // Iterate through the array and distribute elements into S1 and S2
    for (int i = 0; i < A.length; i++) {
      if (i < k) {
        S1[p] = A[i];
        p++;
      } else {
        S2[j] = A[i];
        j++;
      }
    }
    for (int t = 0; t < p; t++) {
      sumS1 += S1[t];
    }
    for (int t = 0; t < j; j++) {
      sumS2 += S2[t];
    }
    // Check if the sums are equal
    return sumS1 == sumS2;
  }

  public static int findPattern(String M, String P) {
    int countF = 0;
    for (int i = 0; i < M.length() - P.length(); i++) {
      int j = 0;
      countF++;
      int count = 0;
      while (j < P.length() && P.charAt(j) == M.charAt(i + j)) {
        j++;
        count++;
      }
      System.out.println(count);
      System.out.println(j == P.length());
      if (j == P.length()) {
        return i; // Pattern found at index i in M
      }
      System.out.println(countF);
    }
    // System.out.println(count);
    return -1; // Pattern not found in M
  }
}