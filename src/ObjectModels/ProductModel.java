package ObjectModels;

public class ProductModel {

    private String productName;
    private String brand;
    private String category;
    private double price;
    private boolean currently_Discount;


    public ProductModel(String productName, String brand, String category, double price, boolean currently_Discount) {
        this.productName = productName;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.currently_Discount = currently_Discount;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getCategory() {
        return this.category;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isCurrently_Discount() {
        return this.currently_Discount;
    }
}
