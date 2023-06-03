package com.driver.model;

import org.springframework.boot.test.autoconfigure.data.cassandra.DataCassandraTest;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    public Admin(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public Admin() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<ServiceProvider> getServiceProviders() {
        return serviceProviders;
    }

    public void setServiceProviders(List<ServiceProvider> serviceProviders) {
        this.serviceProviders = serviceProviders;
    }

    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    private List<ServiceProvider> serviceProviders = new ArrayList<>();
}
