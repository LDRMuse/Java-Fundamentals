package labs_examples.objects_classes_methods.labs.oop.D_my_oop.models;

import java.util.Date;

public class ChartEntry {
    private Date date;
    private String typeOfService;
    private Products productsUsed;
    private String notes;
    private Person client;


    public ChartEntry(Person client) {
        this.date = new Date();
        this.typeOfService = "Type of service is empty";
        this.productsUsed = getProductsUsed();
        this.notes = "No notes";
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public Products getProductsUsed() {
        return productsUsed;
    }

    public void setProductsUsed(Products productsUsed) {
        this.productsUsed = productsUsed;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


    @Override
    public String toString() {
        return "Chart entry for " + client.getFirstName() + " " + client.getLastName() + ": " +
                "Date: " + date +
                ", Type of Service: " + typeOfService +
                ", Products Used: " + productsUsed +
                ", Notes: " + notes;
    }

}