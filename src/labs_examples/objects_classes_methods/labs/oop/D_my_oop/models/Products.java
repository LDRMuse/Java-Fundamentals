package labs_examples.objects_classes_methods.labs.oop.D_my_oop.models;

import java.util.ArrayList;

public class Products {
    private ArrayList<String> products;
    private String brand;
    private String productType;

    public Products() {
        this.products = new ArrayList<>();
        this.brand = "Brand not entered";
        this.productType = "Product type not entered";
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setTypeOfProduct(String productType) {
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public void setProducts(String brand, String productType) {
        this.products.add(brand);
        this.products.add(productType);
    }

    @Override
    public String toString() {
        return products.toString();
    }


}
