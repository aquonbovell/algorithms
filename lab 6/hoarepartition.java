// StudentID: 417002714, Name: Aquon Bovell
public class hoarepartition {
  public static void main(String[] args) {
    int[] L = new int[10];
    for (int i = 0; i < L.length; i++) {
      L[i] = (int) Math.floor(Math.random() * 100);
    }
    for (int i : L) {
      System.out.print(i + ", ");
    }
    System.out.println();
    System.out.println("j: " + HoarePartition(L, 0, 9));
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

  public static void swap(int[] A, int x, int y) {
    int temp = A[x];
    A[x] = A[y];
    A[y] = temp;
  }
}