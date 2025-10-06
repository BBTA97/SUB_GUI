import javax.swing.*;
import GUI.*;

public class AdminApp {
    public static void main(String[] args) {
        JFrame f = new JFrame("Cinema Admin Panel");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 600);
        f.add(new AdminPanel());
        f.setVisible(true);
    }
}