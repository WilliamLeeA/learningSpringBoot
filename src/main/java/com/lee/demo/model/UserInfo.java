package com.lee.demo.model;

public class UserInfo {
    private String name;
    private String password;

    public UserInfo() {
    }

    public UserInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
