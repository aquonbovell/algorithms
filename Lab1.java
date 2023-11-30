public class Lab1 {

  public static int maxI = Integer.MIN_VALUE;
  public static int minI = Integer.MAX_VALUE;

  public static void main(String[] args) {
    int[] num = new int[10002];
    int i = 0;
    while (i < 10000000) {
      int numn = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
      num[numn] = numn;
      i++;
    }

    System.out.println(num[10000]);

    num1 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    num2 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    m = Math.max(num1, num2);
    n = Math.min(num1, num2);
    System.out.println(Euclid(m, n));

    num1 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    num2 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    m = Math.max(num1, num2);
    n = Math.min(num1, num2);
    System.out.println(Euclid(m, n));
    num1 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    num2 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    m = Math.max(num1, num2);
    n = Math.min(num1, num2);
    System.out.println(Euclid(m, n));
    num1 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    num2 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    m = Math.max(num1, num2);
    n = Math.min(num1, num2);
    System.out.println(Euclid(m, n));
    num1 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    num2 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    m = Math.max(num1, num2);
    n = Math.min(num1, num2);
    System.out.println(Euclid(m, n));
    num1 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    num2 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    m = Math.max(num1, num2);
    n = Math.min(num1, num2);
    System.out.println(Euclid(m, n));
    num1 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    num2 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    m = Math.max(num1, num2);
    n = Math.min(num1, num2);
    System.out.println(Euclid(m, n));
    num1 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    num2 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    m = Math.max(num1, num2);
    n = Math.min(num1, num2);
    System.out.println(Euclid(m, n));
    num1 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    num2 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    m = Math.max(num1, num2);
    n = Math.min(num1, num2);
    System.out.println(Euclid(m, n));
    num1 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    num2 = (int) (Math.floor(Math.random() * (10000 - 100 + 1))) + 100;
    m = Math.max(num1, num2);
    n = Math.min(num1, num2);
    System.out.println(Euclid(m, n));

    System.out.println("Max Iteration: " + maxI);
    System.out.println("Min Iteration: " + minI);

    if (iteration > maxI) {
      maxI = iteration;
    }
    if (minI > iteration) {
      minI = iteration;
    }
  }
}
