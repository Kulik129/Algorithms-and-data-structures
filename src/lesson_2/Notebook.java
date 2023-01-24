package lesson_2;

public class Notebook {
    public String brand;
    public double price;
    public int ram;

    public Notebook(String brand, double price, int ram) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "NOTEBOOK: " + brand + ", PRICE: " + price + ", RAM: " + ram +"."+"\n";
    }
}
