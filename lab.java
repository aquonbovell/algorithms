class lab {
  static int counter = 0;

  public static void main(String[] args) {
    int[] L = { 59, 63, 35, 27, 7, 90, 19 };
    System.out.println(Riddle(L, L.length));
    System.out.println("The number of times the recursive call was made is " + counter);
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
}