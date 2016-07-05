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
public class MyStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        
        
        Store store = new Store(); 
        
        while (true) {
            System.out.println("Options: Quit (q), Add Item (a), Change Item (c), Remove Item (r), View Items (v)");
            System.out.print("Which would you like to do:  ");
            char option = s.next().toLowerCase().charAt(0);
            if (option == 'q') {
                System.out.println("Quitting...");
                break;
            } else if (option == 'a') {
                store.addItem(new Item());
                System.out.println("Added item.");
            } else if (option == 'c') {
                System.out.print("Enter the item number:  ");
                int itemNum = s.nextInt();
                store.setItemAtIndex(itemNum, new Item());
                System.out.println("Item changed.");
            } else if (option == 'r') {
                System.out.print("Enter the item number:  ");
                int itemNum = s.nextInt();
                store.removeItemAtIndex(itemNum);
                System.out.println("Item removed.");
            } else if (option == 'v') {
                for (int i = 0; i < store.getItems().size(); i++) {
                   System.out.println(store.getItemAtIndex(i).getDescription());
                }
            } else {
                System.out.println("Bad input. Retry!!! ");
            }
        }
    }
    
    
    
}
