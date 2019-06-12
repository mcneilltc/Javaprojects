package com.example.demo.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//lets springboot know that customer classes are an entity stored in db. also indicated that customer
// is jpa entity. assumed entity will be mapped to a table named customer

@Entity
public class CustomerInfo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// indicates that the id should be generated automatically
    private Long id;
       private String firstName;
       private String lastName;

    public CustomerInfo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

//typically you don't need to provide private constructor b/c Java provides by default. You can tell
// this is the way it is because that's how it is. uses this to create a new instance via persistance framework

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    private CustomerInfo(){
    // @Entity needs a no arg constructor
}
  public Long getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
