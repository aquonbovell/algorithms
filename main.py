def sum(n):
  return 0 if n == 0 else n + sum(n - 1)

print(sum(15))