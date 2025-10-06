package Class;
import java.util.*;

public class Booking {
    private String mobile;
    private Movie movie;
    private Showtime showtime;
    private List<String> seats;
    private SetItem setItem;

    public Booking(String mobile, Movie movie, Showtime showtime, List<String> seats, SetItem setItem) {
        this.mobile = mobile;
        this.movie = movie;
        this.showtime = showtime;
        this.seats = new ArrayList<>(seats);
        this.setItem = setItem;
    }

    public String getMobile() { return mobile; }
    public Movie getMovie() { return movie; }
    public Showtime getShowtime() { return showtime; }
    public List<String> getSeats() { return new ArrayList<>(seats); }
    public SetItem getSetItem() { return setItem; }

    // บันทึกเป็น CSV
    public String toCSV() {
        StringBuilder sb = new StringBuilder();
        sb.append(mobile).append(",");
        sb.append(movie.getName()).append(",");
        sb.append(showtime.getDateString()).append(",");
        sb.append(showtime.getTimeString()).append(",");
        sb.append(String.join(";", seats)).append(",");
        sb.append(setItem != null ? setItem.getName() : "");
        return sb.toString();
    }

    // โหลดจาก CSV
    public static Booking fromCSV(String line, List<Movie> allMovies, List<SetItem> allSets) {
        String[] parts = line.split(",", -1);
        if (parts.length < 6) return null;

        String mobile = parts[0];
        String movieName = parts[1];
        String date = parts[2];
        String time = parts[3];
        String seatsStr = parts[4];
        String setName = parts[5];

        Movie movie = allMovies.stream()
                .filter(m -> m.getName().equalsIgnoreCase(movieName))
                .findFirst()
                .orElse(new Movie(movieName));

        SetItem set = allSets.stream()
                .filter(s -> s.getName().equalsIgnoreCase(setName))
                .findFirst()
                .orElse(null);

        List<String> seatList = seatsStr.isEmpty() ? new ArrayList<>() : Arrays.asList(seatsStr.split(";"));

        Showtime showtime = Showtime.fromStrings(date, time);
        return new Booking(mobile, movie, showtime, seatList, set);
    }
}
