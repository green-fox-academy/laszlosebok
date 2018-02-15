public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int totalHours = 23;
        int totalMinutes = 59;
        int totalSeconds = 59;

        int difference = (((totalHours * 60) + totalMinutes * 60) + totalSeconds) - (((currentHours * 60) + currentMinutes * 60) + currentSeconds);

        System.out.println(difference + " seconds remaining from the day.");
    }
}