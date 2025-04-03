public class LeapYear {
    public static void leapYear(int year) {

        if (year % 400 == 0) {
            System.out.println("Yes it is a leap year.");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Yes it is a leap year.");
        } else {
            System.out.println("It is not a leap year.");
        }
    }
}
