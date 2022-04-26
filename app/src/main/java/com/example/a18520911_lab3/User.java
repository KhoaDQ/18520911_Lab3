package com.example.a18520911_lab3;

public class User {
    public String name;
    public String homeTown;

    public User(String name, String homeTown){
        this.name = name;
        this.homeTown = homeTown;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public String getName() {
        return name;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public void setName(String name) {
        this.name = name;
    }
}
