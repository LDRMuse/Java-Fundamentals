package labs_examples.objects_classes_methods.labs.oop.D_my_oop.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class Appointment {
    private Date date;
    private ArrayList<Service> services;
    private ArrayList<Map> products;
    private String notes;
    private Client client;


    public Appointment(Client client) {
        this.date = new Date();
        this.notes = "Notes not entered";
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    public ArrayList<Map> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Map> products) {
        this.products = products;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "date=" + date +
                ", services=" + services +
                ", products=" + products +
                ", notes='" + notes + '\'' +
                ", client=" + client +
                '}';
    }
}