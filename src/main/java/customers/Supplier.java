package customers;

public class Supplier {
    private int supplierNumber;
    private String name;
    private String phone;
    private int productNumber;
    public Supplier(int supplierNumber, String name, String phone, int productN) {
        this.supplierNumber = supplierNumber;
        this.name = name;
        this.phone = phone;
        this.productNumber = productN;
    }
    @Override
    public String toString() {
        return "Supplier{" +
                "supplierNumber=" + supplierNumber +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", product=" + productNumber +
                '}';
    }
    public int getSupplierNumber() {
        return supplierNumber;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public int getProductN() {
        return productNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setProductN(int productN) {
        this.productNumber = productN;
    }

}
