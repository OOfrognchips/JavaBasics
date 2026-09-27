public String missingChar(String str, int n) {
  // Spaces are characters too
  if (str.isEmpty()) {
    // System.out.println("Invalid input!");
    return "Invalid input!";
  } else if (!str.isEmpty()) {
    StringBuilder sb = new StringBuilder(str);
    sb.deleteCharAt(n);
    String resultString = sb.toString();
    return resultString;
  }
  return str;
}
