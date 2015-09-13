package edu.moranrvcu.ramhack;


import com.reimaginebanking.api.java.NessieClient;

/**
 * Created by Bao Pham on 9/12/15.
 * tests
 */

public class Customer {

    NessieClient nessieClient = NessieClient.getInstance();

    private String customerId;
    private String firstName;
    private String lastName;
    private double balance;
    private double[] recentPurchases;
    public double total = 0;
    public Customer() {
        this.customerId = "";
        this.firstName = "";
        this.lastName = "";
        this.balance = 0;
    }
    public Customer(String customerId, String firstName, String lastName, double balance, double[] recentPurchases) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.recentPurchases = recentPurchases;
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
    public double totalRecentPurchaes()  //adds up all the prices of the recent purchases array
    {
     for(int i =0; i < recentPurchases.length; i++)
     {
         total = recentPurchases[i] + total;
     }
        return total;
    }
}
