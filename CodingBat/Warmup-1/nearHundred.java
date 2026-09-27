public boolean nearHundred(int n) {
  // Within 10 of 100 or 200 means: no more than 10 away from 100 or 200
  if (n <= 110 & n >= 90) {
    return true;
  } else if (n <= 210 & n >= 190) {
    return true;
  } else {
    return false;
  }
}
