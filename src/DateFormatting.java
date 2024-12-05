import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate date = LocalDate.now();

        // Get the current date and time
        LocalDateTime dateTime = LocalDateTime.now();

        // Define a specific format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Format and print the date
        System.out.println("Formatted Date: " + date.format(formatter));

        // Define another format for date and time
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted Date and Time: " + dateTime.format(dateTimeFormatter));
    }
}
