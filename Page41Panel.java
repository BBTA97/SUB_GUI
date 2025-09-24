package GUI;
import javax.swing.*;

import java.awt.*;

public class Page41Panel extends JPanel {
    public Page41Panel(CinemaApp app) {
        setLayout(new GridLayout(1, 4, 15, 15));
        setBackground(Color.BLACK); // พื้นหลังดำ

        for (int i = 1; i <= 4; i++) {
            String setName = "Set" + i;
            JPanel panel = new JPanel(new BorderLayout());
            panel.setBackground(Color.BLACK); // พื้นหลังดำ

            ImageIcon icon = new ImageIcon("Picture/" + setName + ".png");
            Image img = icon.getImage().getScaledInstance(175, 375, Image.SCALE_SMOOTH);
            JLabel pic = new JLabel(new ImageIcon(img), JLabel.CENTER);

            JLabel price = new JLabel(setName + " - 300 THB", JLabel.CENTER);
            price.setFont(new Font("SansSerif", Font.BOLD, 16));
            JButton choose = new JButton("Choose");
            choose.setBackground(new Color(30, 144, 255)); // Dodger Blue
            choose.setForeground(Color.WHITE);
            choose.setFocusPainted(false);
            choose.setFont(new Font("SansSerif", Font.BOLD, 16));

            price.setForeground(Color.WHITE);// ตัวอักษรเป็นสีขาว

            int setIndex = i;
            choose.addActionListener(e -> app.showPage42(setIndex));

            price.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));
            panel.add(price, BorderLayout.NORTH);
            panel.add(pic, BorderLayout.CENTER);
            panel.add(choose, BorderLayout.SOUTH);
            
            add(panel);
        }
    }
}