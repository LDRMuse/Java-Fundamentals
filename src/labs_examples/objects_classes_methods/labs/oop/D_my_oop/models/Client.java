package labs_examples.objects_classes_methods.labs.oop.D_my_oop.models;

import java.util.Date;

public class Client {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Date date;

    public Client() {
        this.date = new Date();
        this.firstName = "First name not entered";
        this.lastName = "Last name not entered";
        this.email = "Email not entered";
        this.phone = "Phone not entered";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                ", Email: " + email +
                ", Phone: " + phone;
    }

}