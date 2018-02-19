import java.util.Calendar;
import java.util.Date;

public class IsItLunchYet {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        /*
         * Could be used to set different lunch time.
         *
         * Calendar lunchTime = Calendar.getInstance();
         * lunchTime.set(Calendar.HOUR_OF_DAY, 13);
         * lunchTime.set(Calendar.MINUTE, 0);
         * lunchTime.set(Calendar.SECOND, 0);
         *
         */

        if (rightNow.get(Calendar.HOUR_OF_DAY) >= 14) {
            System.out.println("It is past lunch time :(");
        } else if (rightNow.get(Calendar.HOUR_OF_DAY) >= 13 && rightNow.get(Calendar.HOUR_OF_DAY) < 14) {
            System.out.println("It is currently lunch time");
        } else {
            System.out.println((12 - rightNow.get(Calendar.HOUR_OF_DAY)) + " hour(s) " + (59 - rightNow.get(Calendar.MINUTE)) + " minute(s) " + (59 - rightNow.get(Calendar.SECOND)) + " second(s) left until lunch.");
        }

    }
}
