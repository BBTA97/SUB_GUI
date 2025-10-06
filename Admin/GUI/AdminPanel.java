package GUI;

import Class.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import java.time.*;

public class AdminPanel extends JPanel {
    private DefaultListModel<Movie> movieListModel;
    private JList<Movie> movieList;
    private JTextArea detailArea;
    private JButton addMovieBtn, removeMovieBtn, addShowtimeBtn, removeShowtimeBtn, saveBtn;

    public AdminPanel() {
        setLayout(new BorderLayout(10, 10));
        setBackground(Color.BLACK);

        // โหลดข้อมูลหนังจากไฟล์
        movieListModel = new DefaultListModel<>();
        for (Movie m : DataStore.loadMovies()) {
            movieListModel.addElement(m);
        }

        // ===== ซ้าย: รายชื่อหนัง =====
        movieList = new JList<>(movieListModel);
        movieList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        movieList.setBackground(Color.DARK_GRAY);
        movieList.setForeground(Color.WHITE);
        JScrollPane scroll = new JScrollPane(movieList);
        scroll.setPreferredSize(new Dimension(250, 400));

        // ===== ขวา: รายละเอียดหนัง =====
        detailArea = new JTextArea();
        detailArea.setEditable(false);
        detailArea.setBackground(Color.BLACK);
        detailArea.setForeground(Color.WHITE);
        detailArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane detailScroll = new JScrollPane(detailArea);

        // ===== ปุ่มต่าง ๆ =====
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 5, 10, 10));
        addMovieBtn = new JButton("Add Movie");
        removeMovieBtn = new JButton("Remove Movie");
        addShowtimeBtn = new JButton("Add Showtime");
        removeShowtimeBtn = new JButton("Remove Showtime");
        saveBtn = new JButton("Save Changes");

        buttonPanel.add(addMovieBtn);
        buttonPanel.add(removeMovieBtn);
        buttonPanel.add(addShowtimeBtn);
        buttonPanel.add(removeShowtimeBtn);
        buttonPanel.add(saveBtn);

        add(scroll, BorderLayout.WEST);
        add(detailScroll, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // ===== เมื่อเลือกหนังใน list =====
        movieList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                Movie selected = movieList.getSelectedValue();
                if (selected != null) showMovieDetails(selected);
            }
        });

        // ===== ปุ่ม Add Movie =====
        addMovieBtn.addActionListener(e -> {
            String name = JOptionPane.showInputDialog(this, "Enter movie name:");
            if (name != null && !name.trim().isEmpty()) {
                Movie m = new Movie(name.trim());
                movieListModel.addElement(m);
            }
        });

        // ===== ปุ่ม Remove Movie =====
        removeMovieBtn.addActionListener(e -> {
            Movie selected = movieList.getSelectedValue();
            if (selected != null) {
                movieListModel.removeElement(selected);
                detailArea.setText("");
            }
        });

        // ===== ปุ่ม Add Showtime =====
        addShowtimeBtn.addActionListener(e -> {
            Movie selected = movieList.getSelectedValue();
            if (selected == null) {
                JOptionPane.showMessageDialog(this, "Please select a movie first.");
                return;
            }

            String dateStr = JOptionPane.showInputDialog(this, "Enter date (dd/MM/yyyy):");
            String timeStr = JOptionPane.showInputDialog(this, "Enter time (HH:mm):");

            try {
                Showtime s = Showtime.fromStrings(dateStr, timeStr);
                selected.addShowtime(s);
                showMovieDetails(selected);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid date/time format!");
            }
        });

        // ===== ปุ่ม Remove Showtime =====
        removeShowtimeBtn.addActionListener(e -> {
            Movie selected = movieList.getSelectedValue();
            if (selected == null) return;
            List<Showtime> shows = new ArrayList<>();
            shows = selected.getShowtimes();
            if (shows.isEmpty()) {
                JOptionPane.showMessageDialog(this, "This movie has no showtimes.");
                return;
            }

            String[] showStrings = shows.stream()
                    .map(s -> s.getDateString() + " " + s.getTimeString())
                    .toArray(String[]::new);

            String chosen = (String) JOptionPane.showInputDialog(
                    this, "Select showtime to remove:",
                    "Remove Showtime",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    showStrings,
                    showStrings[0]
            );

            if (chosen != null) {
                shows.removeIf(s -> (s.getDateString() + " " + s.getTimeString()).equals(chosen));
                selected.setShowtimes(shows);
                showMovieDetails(selected);
            }
        });

        // ===== ปุ่ม Save Changes =====
        saveBtn.addActionListener(e -> {
            List<Movie> allMovies = Collections.list(movieListModel.elements());
            DataStore.saveMovies(allMovies);
            JOptionPane.showMessageDialog(this, "Movies saved successfully!");
        });
    }

    // ===== แสดงรายละเอียดหนัง =====
    private void showMovieDetails(Movie m) {
        StringBuilder sb = new StringBuilder();
        sb.append("🎬 ").append(m.getName()).append("\n\n");
        if (m.getDescription() != null) sb.append(m.getDescription()).append("\n\n");
        sb.append("Showtimes:\n");
        for (Showtime s : m.getShowtimes()) {
            sb.append("  - ").append(s.getDateString())
              .append("  ").append(s.getTimeString()).append("\n");
        }
        detailArea.setText(sb.toString());
    }
}