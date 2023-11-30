class heapsort {
  public static void main(String[] args) {
    int[] L = { 2, 9, 7, 6, 5, 8 };
    HeapSort(L);
    for (int i : L) {
      System.out.println(i);
    }
  }

  public static void HeapBottomUp(int[] H, int l) {
    for (int i = (int) Math.floor(l / 2); i >= 0; i--) {
      int k = i, v = H[k];
      boolean heap = false;
      while (!heap && ((2 * k) <= l)) {
        int j = 2 * k;
        if (j < l) {
          if (H[j] < H[j + 1])
            j++;
        }
        if (v >= H[j]) {
          heap = true;
        } else {
          H[k] = H[j];
          k = j;
        }
      }
      H[k] = v;
    }
  }

  public static void HeapSort(int[] A) {
    HeapBottomUp(A, A.length - 1);
    for (int i = A.length - 1; i >= 0; i--) {
      int temp = A[0];
      A[0] = A[i];
      A[i] = temp;
      HeapBottomUp(A, i - 1);
    }
  }
}