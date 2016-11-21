package com;

/**
 * Created by Oops on 11/19/2016.
 */
public class Address {
    private String addressLine;
    private String state;
    private String city;
    private int pincode;


    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        StringBuilder address = new StringBuilder();
        address.append("=================\n");
        address.append("Address Line :- " + this.addressLine + "\n");
        address.append("State :- " + this.state + "\n");
        address.append("City :- " + this.city + "\n");
        address.append("Pincode :- " + this.pincode + "\n");

        return address.toString();
    }

}
