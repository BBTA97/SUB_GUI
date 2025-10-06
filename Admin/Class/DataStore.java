package Class;

import java.io.*;
import java.util.*;

public class DataStore {
    public static final String MOVIES_FILE = "./File/movies.csv";
    public static final String SETS_FILE = "./File/sets.csv";
    public static final String BOOKINGS_FILE = "./File/bookings.csv";

    // โหลดหนัง
    public static List<Movie> loadMovies() {
        List<Movie> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(MOVIES_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) list.add(new Movie(line));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }

    public static void saveMovies(List<Movie> movies) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(MOVIES_FILE))) {
            for (Movie m : movies) {
                pw.println(m.getName());
            }
        } catch (Exception e) { e.printStackTrace(); }
    }

    // โหลดชุดอาหาร
    public static List<SetItem> loadSets() {
        List<SetItem> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(SETS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.isEmpty()) continue;
                String[] p = line.split(",", 2);
                String name = p[0];
                int price = (p.length > 1) ? Integer.parseInt(p[1]) : 300;
                list.add(new SetItem(name, price));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }

    public static void saveSets(List<SetItem> sets) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(SETS_FILE))) {
            for (SetItem s : sets) {
                pw.println(s.getName() + "," + s.getPrice());
            }
        } catch (Exception e) { e.printStackTrace(); }
    }

    // โหลด Booking
    public static List<Booking> loadBookings(List<Movie> movies, List<SetItem> sets) {
        List<Booking> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(BOOKINGS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                Booking b = Booking.fromCSV(line, movies, sets);
                if (b != null) list.add(b);
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }

    public static void saveBookings(List<Booking> bookings) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(BOOKINGS_FILE))) {
            for (Booking b : bookings) pw.println(b.toCSV());
        } catch (Exception e) { e.printStackTrace(); }
    }
}