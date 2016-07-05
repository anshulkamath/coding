/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homervilledelivery;

import java.util.ArrayList;

/**
 *
 * @author 19sanchezj
 */
public class Location {
    private int street, avenue, packages;
    private char house; // Lowercase is single letter, uppercase = double
    private ArrayList<Location> neighbors = new ArrayList<Location>();
    
    public Location(int s, int a, char h) {
        street = s;
        avenue = a;
        house = h;
    }
    
    
    public int getStreet() {
        return street;
    }

    public int getAvenue() {
        return avenue;
    }

    public char getHouse() {
        return house;
    }

    public int getPackages() {
        return packages;
    }


    public void setStreet(int street) {
        this.street = street;
    }

    public void setAvenue(int avenue) {
        this.avenue = avenue;
    }

    public void setPackages(int packages) {
        this.packages = packages;
    }

    public void setHouse(char house) {
        this.house = house;
    }
    
    public void print() {
        System.out.println("House: " + house + ", Street: " + street + ", Avenue: " + avenue + ".");
    }
    
    public double getdistance(Location a) {
        double street = Math.abs(a.getStreet()-this.getStreet()) * 0.04;
        double avenue = Math.abs(a.getAvenue()-this.getAvenue()) * 0.2;
        char ah = a.getHouse();
        char bh = this.getHouse();
        int al = 0;
        int bl = 0;
        switch (ah) {
            case 'a':
            case 'A':
                al = 1;
                break;
            case 'b':
            case 'B':
                al = 2;
                break;
            case 'c':
            case 'C':
                al = 3;
                break;
            case 'd':
            case 'D':
                al = 4;
                break;
            case 'e':
            case 'E':
                al = 5;
                break;
            case 'f':
            case 'F':
                al = 6;
                break;
            case 'g':
            case 'G':
                al = 7;
                break;
            case 'h':
            case 'H':
                al = 8;
                break;
            case 'i':
            case 'I':
                al = 9;
                break;
            case 'j':
            case 'J':
                al = 10;
                break;
        } switch (bh) {
            case 'a':
            case 'A':
                bl = 1;
                break;
            case 'b':
            case 'B':
                bl = 2;
                break;
            case 'c':
            case 'C':
                bl = 3;
                break;
            case 'd':
            case 'D':
                bl = 4;
                break;
            case 'e':
            case 'E':
                bl = 5;
                break;
            case 'f':
            case 'F':
                bl = 6;
                break;
            case 'g':
            case 'G':
                bl = 7;
                break;
            case 'h':
            case 'H':
                bl = 8;
                break;
            case 'i':
            case 'I':
                bl = 9;
                break;
            case 'j':
            case 'J':
                bl = 10;
                break;
        }
        double h = 0;
        if (a.getAvenue() == this.getAvenue() || !(a.getStreet() == this.getStreet())) {
            h = Math.abs(al-bl);
        } else {
            if(al + bl<10) {
                h = al + bl;
            } else {
                h = (10-al)+(10-bl);
            }
        }
        h = h* 0.02;
        return Math.round((street + avenue + h)*100)/100.0;
    }
   
    
}
