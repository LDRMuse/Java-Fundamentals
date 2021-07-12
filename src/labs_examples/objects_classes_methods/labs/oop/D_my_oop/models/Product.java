package labs_examples.objects_classes_methods.labs.oop.D_my_oop.models;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private String brand;
    private String typeOfProduct;
    private Map<String,String> listOfProducts;

    public Product() {
        this.listOfProducts = new HashMap<>();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public Map<String, String> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(Map<String, String> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public void addProductToProducts(String brand, String typeOfProduct) {
        listOfProducts.put(brand, typeOfProduct);
    }
}
