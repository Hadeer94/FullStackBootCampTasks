package main.com.myApp.model;



import java.time.LocalDate;

public class User {
    private String fName;
    private String lName;
    private String email;
    private String city;
    private LocalDate date;

    public User(LocalDate date, String city, String email, String lName, String fName) {
        this.date = date;
        this.city = city;
        this.email = email;
        this.lName = lName;
        this.fName = fName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
