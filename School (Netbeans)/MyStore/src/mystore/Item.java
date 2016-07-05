/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystore;

import java.util.Scanner;

/**
 *
 * @author 19sanchezj
 */
public class Item {
    private String description;
    private double salesPrice, buyerPrice;
    
    public Item() {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Please provide a description of item  ");
        String desc = s.next();
        System.out.print("Please provide the buyer price of item  ");
        double bPrice = s.nextDouble();
        System.out.print("Please provide the sales price of item  ");
        double sPrice = s.nextDouble();
        
        setDescription(desc);
        setSPrice(sPrice);
        setBPrice(bPrice);
        
    }
    
    public Item(String desc, double s, double b) {
        description = desc;
        salesPrice = s;
        buyerPrice = b;
    }
    
    public void setDescription(String desc) {
        description = desc;
    }
    
    public void setSPrice(double s) {
        salesPrice = s;
    }
        
    public void setBPrice(double b) {
        buyerPrice = b;
    }
    
    public String getDescription() {
        return description;
    }
    
    public double getSPrice() {
        return salesPrice;
    }
        
    public double getBPrice() {
        return buyerPrice;
    }
}
