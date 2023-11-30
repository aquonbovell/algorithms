public class test {
  static int counter = 0;

  public static void main(String[] args) {
    int[] L = { 59, 63, 35, 27, 7, 90, 19, 2 };
    System.out.println(Riddle(L));
    System.out.println("The number of times the recursive call was made is " + counter);
  }

  public static int Riddle(int[] A) {

    System.out.println("Starting Algorithm Riddle with n = " + A.length);

    for (int i = 0; i < A.length; i++) {
      System.out.println(A[i]);
    }

    if (A.length == 1) {
      System.out.println("returning A[0] = " + A[0]);
      return A[0];
    } else {
      int[] B = new int[A.length - 1];
      for (int i = 0; i < B.length; i++) {
        B[i] = A[i];
      }
      System.out.println("Entering else statement");
      int temp = Riddle(B);
      counter++;
      System.out.println("Now comparing temp");

      if (temp <= A[A.length - 1]) {
        System.out.println("returning temp " + temp);
        return temp;
      } else {
        System.out.println("returning A[ n - 1 ] = " + A[A.length - 1]);
        return A[A.length - 1];
      }
    }
  }
}
