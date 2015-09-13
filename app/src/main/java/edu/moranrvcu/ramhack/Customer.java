package edu.moranrvcu.ramhack;

/**
 * Created by Bao Pham on 9/12/15.
 * tests
 */
public class Customer {

    private String customerId;
    private String firstName;
    private String lastName;
    private double balance;
    private double[] recentPurchases;

    public Customer() {
        this.customerId = "";
        this.firstName = "";
        this.lastName = "";
        this.balance = 0;
    }
    public Customer(String customerId, String firstName, String lastName, double balance) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {

        this.customerId = customerId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }
}
