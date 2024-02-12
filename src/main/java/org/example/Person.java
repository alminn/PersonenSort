package org.example;

public class Person {
    private String firstname;
    private String lastName;
    private double LocalDate;
    private int sizeInCm;

    public Person(String firstname, String lastName, double localDate, int sizeInCm) {
        this.firstname = firstname;
        this.lastName = lastName;
        LocalDate = localDate;
        this.sizeInCm = sizeInCm;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getLocalDate() {
        return LocalDate;
    }

    public void setLocalDate(double localDate) {
        LocalDate = localDate;
    }

    public int getSizeInCm() {
        return sizeInCm;
    }

    public void setSizeInCm(int sizeInCm) {
        this.sizeInCm = sizeInCm;
    }
}
