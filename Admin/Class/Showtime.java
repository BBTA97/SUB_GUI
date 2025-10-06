package Class;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Showtime {
    private LocalDate date;
    private LocalTime time;

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm");

    public Showtime(LocalDate date, LocalTime time) {
        this.date = date;
        this.time = time;
    }

    public LocalDate getDate() { return date; }
    public LocalTime getTime() { return time; }

    public String getDateString() { return date.format(DATE_FORMAT); }
    public String getTimeString() { return time.format(TIME_FORMAT); }

    @Override
    public String toString() {
        return getDateString() + " " + getTimeString();
    }

    public static Showtime fromStrings(String dateStr, String timeStr) {
        return new Showtime(
            LocalDate.parse(dateStr, DATE_FORMAT),
            LocalTime.parse(timeStr, TIME_FORMAT)
        );
    }
}