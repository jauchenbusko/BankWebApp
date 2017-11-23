package com.github.jauchenbusko.bankwebapp.model;

import javax.persistence.*;

@Entity
@Table (name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "country")
    private String country;

    @Column(name = "region")
    private String region;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "building")
    private int building;

    @Column(name = "appartment")
    private int appartment;

    @Column(name = "post_code")
    private String postCode;

    public Address() {
    }

    public Address(String country, String region, String city, String street, int building, int appartment, String postCode) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.building = building;
        this.appartment = appartment;
        this.postCode = postCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public int getAppartment() {
        return appartment;
    }

    public void setAppartment(int appartment) {
        this.appartment = appartment;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (id != address.id) return false;
        if (building != address.building) return false;
        if (appartment != address.appartment) return false;
        if (!country.equals(address.country)) return false;
        if (!region.equals(address.region)) return false;
        if (!city.equals(address.city)) return false;
        if (!street.equals(address.street)) return false;
        return postCode.equals(address.postCode);
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
