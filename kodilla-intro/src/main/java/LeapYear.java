public class LeapYear {
    public static void main(String[] args) {
        int year = 1900;
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }
        if (isLeap) {
            System.out.println("Rok " + year + " jest przestepny.");
        } else {
            System.out.println("Rok " + year + " jest nie przestepny.");
        }
    }
}