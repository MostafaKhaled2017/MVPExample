package com.mk.mvp.model;

public class User {
    String fullName = "", email = "";

    public User(){

    }

    public User(String fullName, String email){
        this.fullName = fullName;
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String toString(){
     return "name is : " + fullName + ", Email is : " + email + "\n";
    }
}
