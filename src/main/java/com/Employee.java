package com;

/**
 * Created by Oops on 11/19/2016.
 */
public class Employee {
    private long employeeId;
    private String firstName;
    private String lastName;
    private Address address;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder employee = new StringBuilder();
        employee.append("Employee Id :- " + this.employeeId + "\n");
        employee.append("First Name :- " + this.firstName + "\n");
        employee.append("Last Name :- " + this.lastName + "\n");
        employee.append("Address :- " + this.address + "\n");

        return employee.toString();
    }

}
