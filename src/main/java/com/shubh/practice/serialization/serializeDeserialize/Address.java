package com.shubh.practice.serialization.serializeDeserialize;

import java.io.Serializable;

public class Address implements Serializable {

    private static final long serialVersionUID = 7690963390866166964L;
    private int id;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private long zipCode;

    public Address(int id, String addressLine1, String addressLine2, String city, long zipCode) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
