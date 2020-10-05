package com.fudan.domain;

/**
 * @author zhuruisi
 */

public class User {

    private String studentId, name, department, major;

    public User(String studentId, String name, String department, String major){
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.major = major;
    }

    @Override
    public String toString(){
        return "User{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    public String getStudentId(){
        return studentId;
    }

    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(String major){
        this.major = major;
    }

}
