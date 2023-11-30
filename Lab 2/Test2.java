// Name: Aquon Bovell , ID: 417002714

public class Test2 {

  public static void main(String[] args) {

    int numA = 0;
    int numB = 0;
    int n = 0;
    int m = 0;

    numA = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;
    numB = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;

    m = Math.max(numA, numB);
    n = Math.min(numA, numB);

    Euclid(m, n);
    numA = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;
    numB = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;

    m = Math.max(numA, numB);
    n = Math.min(numA, numB);

    Euclid(m, n);
    numA = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;
    numB = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;

    m = Math.max(numA, numB);
    n = Math.min(numA, numB);

    Euclid(m, n);
    numA = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;
    numB = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;

    m = Math.max(numA, numB);
    n = Math.min(numA, numB);

    Euclid(m, n);
    numA = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;
    numB = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;

    m = Math.max(numA, numB);
    n = Math.min(numA, numB);

    Euclid(m, n);
    numA = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;
    numB = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;

    m = Math.max(numA, numB);
    n = Math.min(numA, numB);

    Euclid(m, n);
    numA = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;
    numB = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;

    m = Math.max(numA, numB);
    n = Math.min(numA, numB);

    Euclid(m, n);
    numA = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;
    numB = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;

    m = Math.max(numA, numB);
    n = Math.min(numA, numB);

    Euclid(m, n);
    numA = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;
    numB = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;

    m = Math.max(numA, numB);
    n = Math.min(numA, numB);

    Euclid(m, n);
    numA = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;
    numB = (int) (Math.floor(Math.random() * (1000000 - 100 + 1))) + 100;

    m = Math.max(numA, numB);
    n = Math.min(numA, numB);

    Euclid(m, n);
  }

  public static int Euclid(int m, int n) {
    // Name: Aquon Bovell , ID: 417002714
    if (n == 0) {
      return m;
    }
    int iteration = 0;

    while (n != 0) {
      int r = m % n;
      iteration++;
      m = n;
      n = r;
    }
    System.out.println("# of iterations = " + (iteration) + ", m = " + m + " , n = " + n + " and the gcd = " + m);
    return m;
  }
}
