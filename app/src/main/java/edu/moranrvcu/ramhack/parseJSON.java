package edu.moranrvcu.ramhack;

import com.reimaginebanking.api.java.NessieClient;
/**
 * This class will get JSON data and parse it to a java object
 * Created by rigo on 9/13/15.
 */
public class parseJSON {

    public static void main(String[] args) {
        String customerID = "55e94a6cf8d8770528e616de";
        String apiKey = "ad0641a1b2d5df46729a934857de7498";
        String url = "http://api.reimaginebanking.com/accounts/" + customerID + "?key=" +
                apiKey + "";
        System.out.println(url);
    };
};

