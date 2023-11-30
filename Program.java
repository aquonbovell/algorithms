import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    // System.out.println("Calculating the gcd...");
    // System.out.println(Euclid(56, 0));
    System.out.println("Calculating the gcd...");
    System.out.println(ConsecutiveIntergerChecking(1, 2));
    // System.out.println("Calculating the seive...");
    // System.out.println(Seive(10));
    // System.out.println("Calculating the factors...");
    // System.out.println(Factors(225));
    // System.out.println("Calculating the GCD...");
    // System.out.println(GCD(225, 205));
    // System.out.println("Calculating the Min Distance...");
    // int[] a = { 11, 4, 8, 91 };
    // System.out.println(MinDistance(a));
    // System.out.println("Calculating the prime factors...");
    // System.out.println(PrimeFactorisation(225));
    // System.out.println("Calculating the gcd prime factorisation...");
    // System.out.println(GCDPrimeFactorisation(225, 205));
  }

  public static int Euclid(int m, int n) {
    if (n == 0) {
      return m;
    }
    while (n != 0) {
      int r = m % n;
      m = n;
      n = r;
    }
    return m;
  }

  public static int ConsecutiveIntergerChecking(int m, int n) {
    int t = Math.min(m, n);
    do {
      while (m % t != 0) {
        t--;
      }
      if (n % t == 0) {
        return t;
      }
      t--;
    } while (true);
  }

  public static List<Integer> Seive(int n) {
    int[] A = new int[n + 1];
    for (int p = 2; p < A.length; p++) {
      A[p] = p;
    }
    for (int p = 2; p <= Math.floor(Math.sqrt(A.length)); p++) {
      if (A[p] != 0) {
        int j = (int) Math.pow(p, 2);
        while (j <= n) {
          A[j] = 0;
          j += p;
        }
      }
    }
    List<Integer> L = new ArrayList<>();
    for (Integer number : A) {
      if (number != 0)
        L.add(number);
    }
    return L;
  }

  public static List<Integer> Factors(int n) {
    List<Integer> A = new ArrayList<>(Arrays.asList(1));
    for (int i = 2; i <= n; i++) {
      if (n % i == 0)
        A.add(i);
    }
    return A;
  }

  public static int GCD(int m, int n) {
    List<Integer> A = Factors(n);
    int gcd = 1;
    Collections.reverse(A);
    for (Integer item : A) {
      if (m % item == 0) {
        gcd = item;
        break;
      }
    }
    return gcd;
  }

  public static int MinDistance(int[] Array) {
    int dmin = Integer.MAX_VALUE;
    for (int i = 0; i < Array.length - 1; i++) {
      for (int j = 0; j < Array.length - 1; j++) {
        if (i != j && Math.abs(Array[i] - Array[j]) < dmin)
          dmin = Math.abs(Array[i] - Array[j]);
      }
    }
    return dmin;
  }

  public static int[] ComparisonCountingSort(int[] A) {
    int[] Count = new int[A.length];
    int[] S = new int[A.length];
    for (var i = 0; i < Count.length; i++) {
      Count[i] = 0;
    }
    for (var i = 0; i < A.length - 1; i++) {
      for (var j = i + 1; j < A.length; j++) {
        if (A[i] < A[j]) {
          Count[j] = Count[j] + 1;
        } else {
          Count[i] = Count[i] + 1;
        }
      }
    }
    for (var i = 0; i < Count.length; i++) {
      S[Count[i]] = A[i];
    }
    return S;
  }

  public static List<Integer> PrimeFactorisation(int n) {
    List<Integer> primes = Seive(n);
    List<Integer> primeFactors = new ArrayList<>();
    Iterator<Integer> it = primes.iterator();
    while (it.hasNext()) {
      Integer item = it.next();
      if (n % item == 0) {
        primeFactors.add(item);
        n /= item;
        it = primes.iterator();
      }
    }
    return primeFactors;
  }

  public static int GCDPrimeFactorisation(int m, int n) {
    List<Integer> list1 = PrimeFactorisation(m);
    List<Integer> list2 = PrimeFactorisation(n);
    List<Integer> intersection = new ArrayList<>();
    int gcd = 1;
    list1.forEach(item -> {
      if (list2.contains(item) && !intersection.contains(item)) {
        intersection.add(item);
      }
    });
    for (Integer item : intersection) {
      int list1Count = CountOccurrences(list1, item);
      int list2Count = CountOccurrences(list2, item);
      gcd *= item * Math.min(list1Count, list2Count);
    }
    return gcd;
  }

  private static int CountOccurrences(List<Integer> list, int item) {
    int count = 0;
    Iterator<Integer> it = list.iterator();
    while (it.hasNext()) {
      Integer number = it.next();
      if (number == item) {
        count++;
      }
    }
    return count;
  }
}