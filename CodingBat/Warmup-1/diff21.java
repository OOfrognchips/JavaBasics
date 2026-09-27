public int diff21(int n) {
  int operation = Math.abs(n - 21);
  if (n > 21) {
    return 2 * operation;
  } else { // if (n < 21)
    return operation;
  }
}
