class lab {
  static int counter = 0;

  public static void main(String[] args) {
    // int[] L = { 59, 63, 35, 27, 7, 90, 19 };
    // System.out.println(Riddle(L, L.length));
    // System.out.println("The number of times the recursive call was made is " +
    // counter);
    int[] L = { 90, 89, 68, 67, 45, 34, 29, 23, 17 };
    // for (int i : L) {
    // System.out.print(i + ", ");
    // }
    // System.out.println("");
    // System.out.println(Secret(L));
    // int[] L = { 89, 45, 68, 23, 67, 90, 29, 34, 17 };
    for (int i : L) {
      System.out.print(i + ", ");
    }
    System.out.println("");
    System.out.println(SortAnalysis(L));

  }

  public static int Riddle(int[] A, int length) {

    System.out.println("Starting Algorithm Riddle with n = " + length);

    for (int i = 0; i < length; i++) {
      System.out.println(A[i]);
    }

    if (length == 1) {
      System.out.println("returning A[0] = " + A[0]);
      return A[0];
    } else {

      System.out.println("Entering else statement");
      int temp = Riddle(A, length - 1);
      counter++;
      System.out.println("Now comparing temp");

      if (temp <= A[length - 1]) {
        System.out.println("returning temp " + temp);
        return temp;
      } else {
        System.out.println("returning A[ n - 1 ] = " + A[length - 1]);
        return A[length - 1];
      }
    }
  }

  public static int Secret(int[] A) {
    int maxval = A[0], minval = A[0], countmax = 0, countmin = 0;
    for (int number : A) {
      if (number < minval) {
        countmin++;
        minval = number;
      }
      if (number > maxval) {
        countmax++;
        maxval = number;
      }
    }
    System.out.println("# of minif: " + countmin);
    System.out.println("# of maxif: " + countmax);
    return maxval - minval;
  }

  public static int SortAnalysis(int[] A) {
    int count = 0;
    for (int i = 1; i < A.length; i++) {
      int v = A[i];
      int j = i - 1;
      while (j >= 0 && A[j] > v) {
        count = count + 1;
        A[j + 1] = A[j];
        j = j - 1;
      }
      A[j + 1] = v;
    }
    for (int i : A) {
      System.out.println(i);
    }
    return count;
  }
}