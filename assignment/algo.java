class algo {
  public static void main(String[] args) {
    int[][] A = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    int[] B = { 1, 4, 4 };
    System.out.println(ArrayFindLight(A, B));
  }

  public static boolean ArrayFindLight(int[][] A, int[] B) {
    for (int i = 0; i < A.length; i++) {
      boolean match = true;
      for (int j = 0; j < B.length; j++) {
        if (A[j][i] != B[j]) {
          match = false;
          break;
        }
      }
      if (match) {
        return true;
      }
    }
    return false;
  }
}