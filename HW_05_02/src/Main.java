import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день недели. " +
                "Например: monday, tuesday, wednesday, thursday, friday, saturday, sunday");
        String dayOfWeek = scanner.nextLine();

        // switch ... case
        switch (dayOfWeek) {
            case ("monday"):
                System.out.println("Today is monday!");
                break;
        }

        switch (dayOfWeek) {
            case ("tuesday"):
                System.out.println("Today is tuesday!");
                break;
        }

        switch (dayOfWeek) {
            case ("wednesday"):
                System.out.println("Today is wednesday!");
                break;
        }

        switch (dayOfWeek) {
            case ("thursday"):
                System.out.println("Today is thursday!");
                break;
        }

        switch (dayOfWeek) {
            case ("friday"):
                System.out.println("Today is friday!");
                break;
        }

        switch (dayOfWeek) {
            case ("saturday"):
                System.out.println("Today is saturday!");
                break;
        }

        switch (dayOfWeek) {
            case ("sunday"):
                System.out.println("Today is sunday!");
                break;
        }

        // if ... else
        System.out.println("Давайте попробуем еще раз! " +
                "Введите другой день недели. " +
                "Например: monday, tuesday, wednesday, thursday, friday, saturday, sunday");
        String dayOfWeek2 = scanner.nextLine();


        if (dayOfWeek2.equals("monday")) {
            System.out.println("Today is monday!");
        }

        else if (dayOfWeek2.equals("tuesday")) {
            System.out.println("Today is tuesday!");
        }

        else if (dayOfWeek2.equals("wednesday")) {
            System.out.println("Today is wednesday!");
        }

        else if (dayOfWeek2.equals("thursday")) {
            System.out.println("Today is thursday!");
        }

        else if (dayOfWeek2.equals("friday")) {
            System.out.println("Today is friday!");
        }

        else if (dayOfWeek2.equals("saturday")) {
            System.out.println("Today is saturday!");
        }

        else {
            System.out.println("Today is sunday!");
        }

    }
}
