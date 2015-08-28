package com.raghu.examples.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




public class Author implements Serializable {

    private String name;

    private String age;

    private String gender;
    
    public Author() {
        
    }

    public Author(String name, String age, String gender) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public void setAge(String age) {
        this.age = age;
    }

    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
    

}
