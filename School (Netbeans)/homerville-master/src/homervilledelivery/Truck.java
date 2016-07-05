/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homervilledelivery;

/**
 *
 * @author John
 */
public class Truck {
    private boolean rented;
    private int employees;
    private double hours;

    public Truck(boolean rented, int employees) {
        this.rented = rented;
        this.employees = employees;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    
    
    
    
}
