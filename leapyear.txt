public class LeapYearChecker {
    public boolean isLeapYear(int year) {
        if (year == 0) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else if (year % 400 != 0) {
                    return false;
                }
            }
        }
        return false; // Add this line to handle the case where the year is not divisible by 4
    }
}
