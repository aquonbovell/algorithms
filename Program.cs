namespace algorithms;

class Program
{
	static void Main(string[] args)
	{
		// Console.WriteLine("Calculating gcd...");
		// Console.WriteLine(Gcd(1235, 35));

		// Console.WriteLine(GcdCI(n: 100, m: 120));

		// int[] ar = Sieve(n: 121);
		// foreach (var item in ar)
		// {
		// 	Console.WriteLine(item);

		// }
		// int[] ar = factors(n: 36);
		// foreach (var item in ar)
		// {
		// 	Console.WriteLine(item);

		// }
		// int gcd = GcdFactors(120, 15);
		// Console.WriteLine(gcd);
		// int[] arr = { 1, 6, 85, 91 };
		// Console.WriteLine(MinDistance(arr));
		// int[] p = { 60, 35, 81, 98, 14, 47 };
		// int[] arr = ComparisonCountingSort(p);
		// foreach (var item in arr)
		// {
		// 	Console.WriteLine(item);
		// }

		// List<int> pf = PrimeFactorisation(756);
		// pf.ForEach(Console.WriteLine);
		Console.WriteLine(GcdPFs(120, 60));

	}
	static int Euclid(int m, int n)
	{
		if (n < 0)
		{
			return m;
		}

		while (n != 0)
		{
			int r = m % n;
			m = n;
			n = r;
		}
		return m;
	}

	static int GcdCI(int m, int n)
	{
		int t = Math.Min(n, m);
		do
		{
			while (m % t != 0)
			{
				t--;
			}
			if (n % t == 0)
			{
				return t;
			}

			t--;
		} while (true);
	}

	static int[] Sieve(int n)
	{
		int[] A = new int[n + 1];
		for (var p = 2; p < A.Length; p++)
		{
			A[p] = p;
		}
		for (var p = 2; p <= Math.Floor(Math.Sqrt(A.Length)); p++)
		{
			if (A[p] != 0)
			{
				int j = (int)Math.Pow(p, 2);
				while (j <= n)
				{
					A[j] = 0;
					j += p;
				}
			}
		}
		int sum = 0;
		foreach (var item in A)
		{
			if (item != 0)
				sum++;
		}
		int i = 0;
		int[] L = new int[sum];
		for (var index = 0; index < A.Length; index++)
		{
			if (A[index] != 0)
			{
				L[i] = A[index];
				i++;
			}
		}
		return L;
	}

	static int[] Factors(int n)
	{
		int[] A = new int[n + 1];
		int p = 0;
		for (var i = 2; i <= n; i++)
		{
			if (n % i == 0)
			{
				A[p] = i;
				p++;
			}
		}
		int sum = 0;
		foreach (var item in A)
		{
			if (item != 0)
				sum++;
		}
		int j = 0;
		int[] L = new int[sum];
		for (var index = 0; index < A.Length; index++)
		{
			if (A[index] != 0)
			{
				L[j] = A[index];
				j++;
			}
		}
		return L;
	}

	static int GcdFactors(int m, int n)
	{
		int[] A = Factors(Math.Min(m, n));
		int gcd = 1;
		foreach (var item in A.Reverse())
		{
			if (m % item == 0)
			{
				gcd = item;
				break;
			}
		}
		return gcd;
	}

	static int MinDistance(int[] Array)
	{
		int dmin = int.MaxValue;

		for (var i = 0; i < Array.Length - 1; i++)
		{
			for (var j = 0; j < Array.Length - 1; j++)
			{
				if (i != j && Math.Abs(Array[i] - Array[j]) < dmin)
					dmin = Math.Abs(Array[i] - Array[j]);
			}
		}
		return dmin;
	}

	static int[] ComparisonCountingSort(int[] A)
	{
		int[] Count = new int[A.Length];
		int[] S = new int[A.Length];
		for (var i = 0; i < Count.Length; i++)
		{
			Count[i] = 0;
		}
		for (var i = 0; i < A.Length - 1; i++)
		{
			for (var j = i + 1; j < A.Length; j++)
			{
				if (A[i] < A[j])
				{
					Count[j] = Count[j] + 1;
				}
				else
				{
					Count[i] = Count[i] + 1;
				}
			}
		}

		for (var i = 0; i < Count.Length; i++)
		{
			S[Count[i]] = A[i];
		}

		return S;
	}

	static List<int> PrimeFactorisation(int n)
	{
		int[] primes = Sieve(n);
		List<int> primeFactors = new();
		int i = 0;
		while (i < primes.Length)
		{
			if (n % primes[i] == 0)
			{
				primeFactors.Add(primes[i]);
				n /= primes[i];
				i = 0;
			}
			else
				i++;
		}
		return primeFactors;
	}

	static int GcdPFs(int m, int n)
	{
		List<int> list1 = PrimeFactorisation(m);
		List<int> list2 = PrimeFactorisation(n);
		int gcd = 1;

		foreach (var item in list1.Intersect(list2))
		{
			int list1Count = CountOccurrences(list1, item);
			int list2Count = CountOccurrences(list2, item);
			gcd *= item * Math.Min(list1Count, list2Count);
		}
		return gcd;
	}

	private static int CountOccurrences(List<int> list, int item)
	{
		return list.FindAll(number => number == item).Count;
	}
}
