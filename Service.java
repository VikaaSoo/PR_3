/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaltask2;

/**
 *
 * @author lizabasyul
 */
public class Service{
    public void changeMark(Car car){
        String a[];
        String i[];
        String mark = car.getMark();
        mark = mark.toLowerCase();
        a = new String[]{"a"};
        i = new String[]{"i"};
        for (int j = 0; j < a.length; j++){
            mark = mark.replace(a[j], "o");
        }
        for (int k = 0; k < i.length; k++){
            mark = mark.replace(i[k], "e");
        }
        car.setMark(mark);
    }
}
