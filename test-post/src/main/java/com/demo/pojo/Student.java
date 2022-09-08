package com.demo.pojo;

public class Student {
    private String username;
    private String age;
    private String school;

    public Student(String username, String age, String school) {
        this.username = username;
        this.age = age;
        this.school = school;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
