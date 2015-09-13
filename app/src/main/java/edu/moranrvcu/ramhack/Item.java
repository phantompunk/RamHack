package edu.moranrvcu.ramhack;

/**
 * Created by rigo on 9/12/15.
 */
public class Item {
    String itemName = "";
    String necType = "";
    int necValue = 0;
    double itemCost = 0;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getNecType() {
        return necType;
    }

    public void setNecType(String necType) {
        this.necType = necType;
    }

    public int getNecValue() {
        return necValue;
    }

    public void setNecValue(int necValue) {
        this.necValue = necValue;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public Item(String itemName, String necType, int necValue, double itemCost) {
        this.itemName = itemName;
        this.necType = necType;
        this.necValue = necValue;
        this.itemCost = itemCost;
    }
}
