public class Main {
    public static void main(String[] args) {
    printYearsAndDays(3600000);
    }

    public static void printYearsAndDays(long minutes) {
        // print the amount of years and days based on the param minutes
        if (minutes < 0) {
            // if the param is less than 0, it is an invalid value
            System.out.println("Invalid Value");
            return;
        }
        long hours = minutes / 60;
        long days = hours / 24;
        long remainingDays = days % 365;
        long years = days / 365;
        System.out.println(minutes + " min" + " = " + years + " y and " + remainingDays + " d");
        return;
    }
}