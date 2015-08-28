package com.raghu.examples.vo;

import java.io.Serializable;
import java.util.List;


public class Employee implements Serializable {
    
    private String name;
    
    private Integer age;

    private List<Employee> similarEmployee;


    private List<Author> authors;
    
    
    
    
    
    public List<Author> getAuthors() {
        return authors;
    }




    
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }




    public List<Employee> getSimilarEmployee() {
        return similarEmployee;
    }



    
    public void setSimilarEmployee(List<Employee> similarEmployee) {
        this.similarEmployee = similarEmployee;
    }



    public String getName() {
        return name;
    }


    
    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    
    public void setAge(Integer age) {
        this.age = age;
    }


    public Employee(String empName, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }
    
    public Employee() {
        
    }

}
