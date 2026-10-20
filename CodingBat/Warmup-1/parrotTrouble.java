public boolean parrotTrouble(boolean talking, int hour) {
    if (hour > 0 | hour < 23) {
        if (talking & (hour < 7 | hour > 20)) {
            return true;
        } else if (!talking & (hour < 7 | hour > 20)) {
            return false;
        }
    } else { // if (hour < 0 | hour > 23) {
        return false;
    }

    return false;
}
