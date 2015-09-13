package edu.moranrvcu.ramhack;

/**
 * Created by rigo on 9/12/15.
 */
public class RiskCalc {

    double riskScore;
    boolean isRisk;
    int pointLimit;
    int necval;


    public double calcRisk(Customer c,Item i)
    {
       /* int recents = 0;
        pointLimit = (int)(c.getBalance()*.25);   // The balance of the account times .25 to get the limit of the point
        necval = i.getNecValue();                 // the necval is the priority of the item (education item or entertainment or living)
        recents = (int) (c.totalRecentPurchaes()*.25);  // The sum of all the transactions in the recentPurchases array
        */
        return 0;
    }

    public boolean isRisk(double riskScore)
    {
        return false;
    }


}
