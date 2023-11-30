class stringss {
  public static void main(String[] args) {
    String[] strs = { "flower", "flower", "flower", "flower" };
    System.out.println(longestCommonPrefix(strs));
  }

  public static String longestCommonPrefix(String[] strs) {
    if (strs.length == 1)
      return strs[0];
    String prefix = "";
    for (int j = 0; j < strs[0].length(); j++) {
      prefix = strs[0].substring(0, j + 1);
      for (int i = 1; i < strs.length; i++) {
        if (!strs[i].contains(prefix)) {
          return prefix.substring(0, prefix.length() - 1);
        }
      }
    }
    return prefix;
  }
}