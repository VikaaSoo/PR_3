/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaltask2;

/**
 *
 * @author griha
 */
public class RaceCar extends Car {

    private int enginePower;
    private String engineType;
    private String driveUnit;

    public RaceCar(int enginePower, String engineType, String driveUnit, String mark, String model, String color, String bodyType, int price, int year) {
        super(mark, model, color, bodyType, price, year);
        this.enginePower = enginePower;
        this.engineType = engineType;
        this.driveUnit = driveUnit;
    }

    public void tookPartInRace(int place) {
        System.out.println("Your" + getMark() + getModel() + "took" + place + "place in the race");
    }

    @Override
    public String toString() {
        return "RaceCar{" + "mark = " + getMark() + ", model = " + getModel() + ", enginePower = " + enginePower + ", engineType = " + engineType + ", driveUnit = " + driveUnit + '}';
    } 
    
}
