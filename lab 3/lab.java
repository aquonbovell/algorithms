class lab {
  public static void main(String[] args) {
    boolean[] lockers = new boolean[400 + 1];

    for (int i = 1; i < lockers.length; i++) {
      lockers[i] = true;
    }

    for (int i = 1; i < lockers.length; i++) {
      lockers[i] = !lockers[i];
    }

    for (int i = 2; i < 11; i++) {
      for (int j = 1; (j * i) < lockers.length; j++) {
        lockers[j * i] = !lockers[j * i];
      }
    }

    for (int k = 1; k < lockers.length; k++) {
      System.out.println(lockers[k]);
    }

  }
}