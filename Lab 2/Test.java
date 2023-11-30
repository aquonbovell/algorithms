// Name: Aquon Bovell , ID: 417002714

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {

    Scanner myInput = new Scanner(System.in);

    int numA = 0;
    int numB = 0;

    do {
      System.out.println("Enter numA: ");
      numA = myInput.nextInt();
    } while (numA <= 1000);

    do {
      System.out.println("Enter numB: ");
      numB = myInput.nextInt();
    } while (numB <= 1000);

    myInput.close();

    int m = Math.max(numA, numB);
    int n = Math.min(numA, numB);

    System.out.println("The GCD of " + m + " and " + n + " is " + Euclid(m, n));

    numA = (int) (Math.floor(Math.random() * (100000 - 1000 + 1))) + 1000;
    numB = (int) (Math.floor(Math.random() * (100000 - 1000 + 1))) + 1000;

    m = Math.max(numA, numB);
    n = Math.min(numA, numB);

    System.out.println("The GCD of " + m + " and " + n + " is " + Euclid(m, n));
  }

  public static int Euclid(int m, int n) {
    // Name: Aquon Bovell , ID: 417002714
    if (n == 0) {
      return m;
    }
    int iteration = 0;

    System.out.println("Value of m: " + m);
    System.out.println("Value of n: " + n);

    while (n != 0) {
      int r = m % n;
      System.out.println("iteration number = " + (iteration + 1) + ", r = " + r + ", m = " + m + " and n = " + n);
      iteration++;
      m = n;
      n = r;
    }

    return m;
  }
}
