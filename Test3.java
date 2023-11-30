// Name: Aquon Bovell , ID: 417002714

public class Test3 {
  public static void main(String[] args) {
    System.out.println(ConsecutiveIntergerChecking(120, 75));

  }

  public static int ConsecutiveIntergerChecking(int m, int n) {
    // Name: Aquon Bovell , ID: 417002714
    int t = Math.min(m, n);
    int numIterations = 0;
    do {
      while (m % t != 0) {
        t--;
        numIterations++;
        System.out.println("Iteration number = " + numIterations + ", t = " + t);
      }
      if (n % t == 0) {
        return t;
      }
      t--;
      numIterations++;
      System.out.println("Iteration number = " + numIterations + ", t = " + t);
    } while (true);
  }
}
