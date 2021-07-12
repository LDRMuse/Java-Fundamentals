package labs_examples.objects_classes_methods.labs.oop.D_my_oop.models;

import java.util.ArrayList;

public class Service {
    String service;
    ArrayList<String> services;

    public Service() {
        this.service= "";
        this.services = new ArrayList<>();
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public ArrayList<String> getServices() {
        return services;
    }

    public void setServices(ArrayList<String> services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Service{" +
                "service='" + service + '\'' +
                ", services=" + services +
                '}';
    }

    public void addServiceToServices(String service) {
        services.add(service);
    }
}
