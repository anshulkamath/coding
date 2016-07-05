/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystore;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 19sanchezj
 */
public class Store {

   
    private String location, owner, phoneNumber, brand;

    
    
    private ArrayList<Item> items;
    
    public Store() {
        
        items = new ArrayList<Item>();
        
        Scanner s = new Scanner(System.in);
        
        String[] things = {
            "Where is your store?",
            "Who is the owner?",
            "What is the phone number?",
            "What is the brand?",
            "How many items would you like in your store?"
        };
        
        String[] answers = new String[things.length]; 
        
        for (int i = 0; i < answers.length; i++) {
            System.out.print(things[i] + "  ");
            answers[i] = s.next();
        }
        setLocation(answers[0]);
        setOwner(answers[1]);
        setPhoneNumber(answers[2]);
        setBrand(answers[3]);
        
        System.out.println("Num items: " + answers[4]);
        
        addItemsWithNumber(Integer.parseInt(answers[4]));
        
        
        
    }
    
    public Store(String loc, String own, String phone, String b, int itemNum) {
        items = new ArrayList<Item>();
        location = loc;
        owner = own;
        phoneNumber = phone;
        brand = b;
        addItemsWithNumber(itemNum);
        
    }
    
    public void addItemsWithNumber(int itemNum) {
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i < itemNum; i++) {
     
            addItem(new Item());
        }
    }
    
    public void addItem(Item i) {
        items.add(i);
    }
    
    
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getLocation() {
        return location;
    }

    public String getOwner() {
        return owner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    
    public Item getItemAtIndex(int idx) {
        return items.get(idx);
    }
    
    public int getNumberOfItems() {
        return items.size();
    } 
    
    public void setLocation(String location) {
        this.location = location;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setItemAtIndex(int idx, Item i) {
        items.set(idx, i);
    }
    
    public void removeItemAtIndex(int idx) {
        items.remove(idx);
    }
}
