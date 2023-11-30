public class lomuto {
  public static void main(String[] args) {
    int[] L = { 26, 14, 52, 7, 15, 37, 91, 2, 28, 73 };
    Quicksort(L, 0, 9);
    for (int i : L) {
      System.out.println(i);
    }
  }

  public static int LomutoPartition(int A[], int l, int r) {
    int p = A[l], s = l;
    System.out.println("p: " + p + " , s: " + s + " , r: " + r);
    for (int i = l + 1; i <= r; i++) {
      System.out.println("Entering loop");
      if (A[i] < p) {
        s++;
        System.out.println("s: " + s);
        swap(A, s, i);
      }
    }
    swap(A, l, s);
    return s;
  }

  public static void Quicksort(int[] A, int l, int r) {
    System.out.println("entering quicksort");
    System.out.println("starting index: " + l + " ending index: " + r);
    if (l < r) {
      int s = LomutoPartition(A, l, r);
      Quicksort(A, l, s - 1);
      Quicksort(A, s + 1, r);
    }
  }

  public static void swap(int[] A, int x, int y) {
    System.out.println("swaping (" + A[x] + ", " + A[y] + ")");
    int temp = A[x];
    A[x] = A[y];
    A[y] = temp;
  }
}
