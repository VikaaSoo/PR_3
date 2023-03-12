/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaltask2;


public class Car {
    private String mark;
    private String model;
    private String color;
    private String bodyType;
    private int price;
    private int year;

    public Car(String mark, String model, String color, String bodyType, int price, int year) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.price = price;
        this.year = year;
    }
    
    
    
    public void startEngine(){
        System.out.println("Engine is running");
    }
    
    public void ride(int kilometers){
        System.out.println("Car drove " + kilometers + " kilometers");
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
    @Override
    public String toString() {
        return "Car{" + "mark = " + mark + ", model = " + model + ", color = " + color + ", bodyType = " + bodyType + ", price = " + price + ", year = " + year + '}';
    }
    
    
}
