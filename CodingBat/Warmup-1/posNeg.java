public boolean posNeg(int a, int b, boolean negative) {
    if (negative) {
        if ((a & b) < 0) {
            return true;
        } else if ((a & b) > 0) {
            return false;
        }
    } else if ((a < 0 & b > 0) | (a > 0 & b < 0)) {
        return true;
    }

    return false;
}
