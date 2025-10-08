package Class;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private List<String> dates;
    private List<String> times;
    private String imagePath;

    public Movie(String csvLine) {
    String[] parts = csvLine.split(",", 4);
    this.name = parts.length > 0 ? parts[0] : "";

    // แปลงวันที่และเวลา (เก็บเป็นคอมม่าคั่นในไฟล์)
    this.dates = new ArrayList<>();
    if (parts.length > 1 && !parts[1].isEmpty()) {
        for (String d : parts[1].split("\\|")) {
            dates.add(d.trim());
        }
    }

    this.times = new ArrayList<>();
    if (parts.length > 2 && !parts[2].isEmpty()) {
        for (String t : parts[2].split("\\|")) {
            times.add(t.trim());
        }
    }

    this.imagePath = parts.length > 3 ? parts[3] : "";
    }

    public Movie(String name, List<String> dates, List<String> times, String imagePath) {
    this.name = name;
    this.dates = dates;
    this.times = times;
    this.imagePath = imagePath;
}

    public String getName() { return name; }
    public List<String> getDates() { return dates; }
    public List<String> getTimes() { return times; }
    public String getImagePath() { return imagePath; }

    public void setName(String name) { this.name = name; }
    public void setDates(List<String> dates) { this.dates = dates; }
    public void setTimes(List<String> times) { this.times = times; }
    public void setImagePath(String imagePath) { this.imagePath = imagePath; }

    public String toCSV() {
    String dateStr = String.join("|", dates);
    String timeStr = String.join("|", times);
    return name + "," + dateStr + "," + timeStr + "," + imagePath;
}

    public String toString() {
        return name;
    }
}