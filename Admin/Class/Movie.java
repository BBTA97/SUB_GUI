package Class;
import java.util.*;

public class Movie {
    private String name;
    private String imagePath;     // ไฟล์รูปภาพของหนัง เช่น "avengers.jpg"
    private String description;   // รายละเอียดหรือคำโปรยของหนัง
    private List<Showtime> showtimes; // รอบฉายทั้งหมดของหนัง

    // Constructor หลัก
    public Movie(String name) {
        this(name, null, null, new ArrayList<>());
    }

    public Movie(String name, String imagePath, String description, List<Showtime> showtimes) {
        this.name = name;
        this.imagePath = imagePath;
        this.description = description;
        this.showtimes = showtimes != null ? new ArrayList<>(showtimes) : new ArrayList<>();
    }

    // Getter / Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getImagePath() { return imagePath; }
    public void setImagePath(String imagePath) { this.imagePath = imagePath; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public List<Showtime> getShowtimes() { return new ArrayList<>(showtimes); }
    public void setShowtimes(List<Showtime> showtimes) {
        this.showtimes = new ArrayList<>(showtimes);
    }

    public void addShowtime(Showtime showtime) {
        this.showtimes.add(showtime);
    }

    public void removeShowtime(Showtime showtime) {
        this.showtimes.remove(showtime);
    }

    @Override
    public String toString() {
        return name;
    }

    // แปลงเป็น CSV บันทึก
    // รูปแบบ: name,imagePath,description,date1|time1;date2|time2;...
    public String toCSV() {
        StringBuilder sb = new StringBuilder();
        sb.append(name.replace(",", " ")).append(",");
        sb.append(imagePath == null ? "" : imagePath.replace(",", " ")).append(",");
        sb.append(description == null ? "" : description.replace(",", " ")).append(",");
        for (int i = 0; i < showtimes.size(); i++) {
            Showtime s = showtimes.get(i);
            sb.append(s.getDateString()).append("|").append(s.getTimeString());
            if (i < showtimes.size() - 1) sb.append(";");
        }
        return sb.toString();
    }

    // โหลดจาก CSV
    public static Movie fromCSV(String line) {
        String[] parts = line.split(",", -1);
        if (parts.length < 4) return null;

        String name = parts[0];
        String image = parts[1].isEmpty() ? null : parts[1];
        String desc = parts[2].isEmpty() ? null : parts[2];
        String showtimePart = parts[3];

        List<Showtime> showtimes = new ArrayList<>();
        if (!showtimePart.isEmpty()) {
            String[] items = showtimePart.split(";");
            for (String i : items) {
                String[] dt = i.split("\\|");
                if (dt.length == 2) {
                    showtimes.add(Showtime.fromStrings(dt[0], dt[1]));
                }
            }
        }

        return new Movie(name, image, desc, showtimes);
    }
}