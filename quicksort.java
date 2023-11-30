// StudentID: 417002714, Name: Aquon Bovell
public class quicksort {
  public static void main(String[] args) {
    int[] L = { 26, 14, 52, 7, 15, 37, 91, 2, 28, 73 };
    for (int i : L) {
      System.out.print(i + ", ");
    }
    System.out.println();
    Quicksort(L, 0, 9);
    for (int i : L) {
      System.out.print(i + ", ");
    }
    System.out.println();
  }

  public static int HoarePartition(int[] A, int l, int r) {
    int p = A[l], i = l, j = r + 1;
    while (i < j) {
      do {
        i++;
      } while (A[i] < p && i < r);
      do {
        j--;
      } while (A[j] > p);
      swap(A, i, j);
    }
    swap(A, i, j);
    swap(A, l, j);
    return j;
  }

  public static void Quicksort(int[] A, int l, int r) {
    System.out.println("entering quicksort");
    System.out.println("starting index: " + l + " ending index: " + r);
    if (l < r) {
      int s = HoarePartition(A, l, r);
      Quicksort(A, l, s - 1);
      Quicksort(A, s + 1, r);
    }
  }

  public static void swap(int[] A, int x, int y) {
    int temp = A[x];
    A[x] = A[y];
    A[y] = temp;
  }
}
