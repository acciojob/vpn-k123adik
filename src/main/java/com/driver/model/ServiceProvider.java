package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ServiceProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public ServiceProvider() {
    }

    public ServiceProvider(int id, String name) {
        this.id = id;
        this.name = name;
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

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Connection> getConnections() {
        return connections;
    }

    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }

    public List<Country> getCountry() {
        return country;
    }

    public void setCountry(List<Country> country) {
        this.country = country;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @ManyToOne
    @JoinColumn
    private Admin admin;

    @OneToMany(mappedBy = "serviceProviders", cascade = CascadeType.ALL)
    List<Connection> connections = new ArrayList<>();

    @OneToMany(mappedBy = "serviceProviders", cascade = CascadeType.ALL)
    List<Country> country = new ArrayList<>();

    @ManyToMany(mappedBy = "serviceProviders", cascade = CascadeType.ALL)
    List<User> users = new ArrayList<>();
}
