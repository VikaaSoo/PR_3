/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaltask2;

/**
 *
 * @author griha
 */
public class CasualCar extends Car{
    private int fuelCons;
    private int seats;

    public CasualCar(String mark, String model, int fuelCons, int seats, String color, String bodyType, int price, int year) {
        super(mark, model, color, bodyType, price, year);
        this.fuelCons = fuelCons;
        this.seats = seats;
    }

    public void belongsTo(String family){
        System.out.println("This " + getMark() + getModel() + " belongs to " + family + " family");
    }
    
    public void mountainRide(String family, int distance){
        System.out.println(family + "family traveled" + distance + "kilometers to the mountains");
    }

    @Override
    public String toString() {
        return "CasualCar{" + "mark = " + getMark() + ", model = " + getModel() + ", fuel consumption = " + fuelCons + ", seats = " + seats + '}';
    }
    
}
