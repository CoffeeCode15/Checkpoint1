public class Product {
    private String name;
    private String manufacturer;
    private long id;
    private int quantity;
    
    public Product(String name, String manufacturer, long id, int quantity) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.id = id;
        this.quantity = quantity;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public int getQuantity() {
        return quantity;
    }
}
