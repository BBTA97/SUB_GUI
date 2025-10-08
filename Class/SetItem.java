package Class;
public class SetItem {
    private String name;
    private double price;
    private String imagePath;

    public SetItem(String csvLine) {
    String[] p = csvLine.split(",", 3);
    this.name = p.length > 0 ? p[0] : "";

    // แปลงราคาให้เป็นตัวเลขอย่างปลอดภัย
    if (p.length > 1) {
        try {
            this.price = Double.parseDouble(p[1]);
        } catch (NumberFormatException e) {
            this.price = 0.0; // ถ้าอ่านไม่ได้ให้เป็น 0
        }
    } else {
        this.price = 0.0;
    }

    this.imagePath = p.length > 2 ? p[2] : "";
    }

    public SetItem(String name, double price, String imagePath) {
        this.name = name;
        this.price = price;
        this.imagePath = imagePath;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getImagePath() { return imagePath; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setImagePath(String imagePath) { this.imagePath = imagePath; }

    public String toCSV() {
        return name + "," + imagePath + "," + price;
    }

    public static SetItem fromCSV(String line) {
        String[] parts = line.split(",", 3);
        String name = parts[0];
        double price = Double.parseDouble(parts[1]);
        String imagePath = parts.length > 2 ? parts[2] : "";
        return new SetItem(name, price, imagePath);
    }

    public String toString() {
        return name + " (" + price + " THB)";
    }
}