package customers;

public class Product {
private int productNumber;
    private String name;
    private double price;
    private int supplierNumber;

    public Product(int productNumber, String name, double price, int supplier) {
        this.productNumber = productNumber;
        this.name = name;
        this.price = price;
        this.supplierNumber = supplier;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", supplier=" + supplierNumber +
                '}';
    }

    public int getProductNumber() {
        return productNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int getSupplier() {
        return supplierNumber;
    }
    public void setSupplier(int supplier) {
        this.supplierNumber = supplier;
    }
}
