package GUI;
import javax.swing.*;
import java.awt.*;
import GUI.Page2Panel.*;

public class Page42Panel extends JPanel {
    public Page42Panel(CinemaApp app, int setIndex) {
        setLayout(new BorderLayout());
        setBackground(Color.BLACK); // พื้นหลังดำ

        String setName = "Set" + setIndex;
        ImageIcon icon = new ImageIcon("Picture/" + setName + ".png");
        Image img = icon.getImage().getScaledInstance(180,400, Image.SCALE_SMOOTH);

        JLabel pic = new JLabel(new ImageIcon(img), JLabel.CENTER);
        JLabel info = new JLabel("you choose " + setName + "  300 THB", JLabel.CENTER);
        info.setFont(new Font("SansSerif", Font.BOLD, 16));
        info.setForeground(Color.WHITE);// ตัวอักษรเป็นสีขาว

        JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
        bottomPanel.setBackground(Color.BLACK);

        JButton confirm = new JButton("Confirm");
        confirm.setBackground(new Color(30, 144, 255)); // Dodger Blue
        confirm.setForeground(Color.WHITE);
        confirm.setFocusPainted(false);
        confirm.setFont(new Font("SansSerif", Font.BOLD, 16));
        confirm.addActionListener(e -> app.showPage5());
        JButton back = new JButton("Back");
        back.setBackground(new Color(30, 144, 255)); // Dodger Blue
        back.setForeground(Color.WHITE);
        back.setFocusPainted(false);
        back.setFont(new Font("SansSerif", Font.BOLD, 16));
        back.addActionListener(e -> app.showPage4());

        bottomPanel.add(back, BorderLayout.WEST);
        bottomPanel.add(confirm, BorderLayout.EAST);

        setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));
        add(info, BorderLayout.NORTH);
        add(pic, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }
}