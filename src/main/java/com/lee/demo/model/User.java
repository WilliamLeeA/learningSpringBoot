package com.lee.demo.model;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private int age;
    private Date birthday;
    private String workTime;

    public User(int id, String name, int age, Date birthday, String workTime) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", workTime='" + workTime + '\'' +
                '}';
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

}
