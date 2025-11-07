package main.com.myApp.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private String password;
    private String country;
    private String programmingLanguage;
    private List<String> os;

    public User() {
        os = new ArrayList<String>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public List<String> getOs() {
        return os;
    }

    public void setOs(List<String> os) {
        this.os = os;
    }
}
