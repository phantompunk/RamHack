package edu.moranrvcu.ramhack;

/**
 * Item class describes what variables are required for a item.
 * Created by rigo on 9/12/15.
 */
public class Item
{

    String itemName;   // item name
    String necType;    // type of item(ex eduacation, entertainment,living)
    int necValue;      // value assigned to type of item
    double itemCost;

    public String getItemName()
    {
        return itemName;
    }

    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public String getNecType()
    {
        return necType;
    }

    public void setNecType(String necType)
    {
        this.necType = necType;
    }

    public int getNecValue()
    {
        if(necType.equals("entertain"))
        {
            return 1;
        }

        if(necType.equals("education"))
        {
            return 2;
        }

        else
        {
            return 3;
        }
    }

    public void setNecValue(int necValue)
    {
        this.necValue = necValue;
    }

    public double getItemCost()
    {
        return itemCost;
    }

    public void setItemCost(double itemCost)
    {
        this.itemCost = itemCost;
    }

    public Item()
    {
        this.itemName = "";
        this.necType = "";
        this.necValue = 0;
        this.itemCost = 0;
    }

    public Item(String itemName, String necType, int necValue, double itemCost)
    {
        this.itemName = itemName;
        this.necType = necType;
        this.necValue = necValue;
        this.itemCost = itemCost;
    }
}
