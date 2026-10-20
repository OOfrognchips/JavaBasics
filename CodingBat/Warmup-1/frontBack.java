public String frontBack(String str) {
    char firstChar = str.charAt(0);
    char lastChar = str.charAt(str.length());
    // System.out.println(firstChar);
    // System.out.println(lastChar);
    return str.replace(firstChar, lastChar).replace(lastChar, firstChar);
}
