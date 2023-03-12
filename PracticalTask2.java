/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaltask2;

import java.util.Scanner;

public class PracticalTask2 {

    public static void main(String[] args) {
        System.out.println("Practical Task №2. Variant 1. Sogrina, RIBO-03-21");
        Scanner in = new Scanner(System.in);
        System.out.println("Type 1 to choose race car, 0 to choose casual car or 2 to change mark");
        int choice = in.nextInt();
        switch (choice) {
            case 1 ->                 {
                    System.out.println("Enter: mark, model, color, body type, price and year");
                    String mark = in.next();
                    String model = in.next();
                    String color = in.next();
                    String bodyType = in.next();
                    int price = in.nextInt();
                    int year = in.nextInt();
                    System.out.println("Enter: power, engine type and drive unit type");
                    int enginePower = in.nextInt();
                    String engineType = in.next();
                    String driveUnit = in.next();
                    Car raceCar = new RaceCar(enginePower, engineType, driveUnit, mark, model, color, bodyType, price, year);
                    System.out.println(raceCar.toString());
                }
            case 0 ->                 {
                    System.out.println("Enter: mark, model, color, body type, price and year");
                    String mark = in.next();
                    String model = in.next();
                    String color = in.next();
                    String bodyType = in.next();
                    int price = in.nextInt();
                    int year = in.nextInt();
                    System.out.println("Enter: fuel consuption and quantity of seats");
                    int fuelComp = in.nextInt();
                    int seats = in.nextInt();
                    CasualCar casualCar = new CasualCar(mark, model, fuelComp, seats, color, bodyType, price, year);
                    System.out.println(casualCar.toString());
                }
            case 2 ->                 {
                    System.out.println("Enter: mark, model, color, body type, price and year");
                    String mark = in.next();
                    String model = in.next();
                    String color = in.next();
                    String bodyType = in.next();
                    int price = in.nextInt();
                    int year = in.nextInt();
                    Car car = new Car(mark, model, color, bodyType, price, year);
                    Service service = new Service();
                    service.changeMark(car);
                    System.out.println(car.toString());
                }
            default -> {
            }
        }
    }
}
