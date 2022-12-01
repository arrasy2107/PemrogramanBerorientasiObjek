/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrasy30112022;

/**
 *
 * @author USER
 */
public class Employee extends Person {

    @Override
    public String getName() {
        super.name = "Rizqi";
        System.out.println("Employee Name: " + name);
        return name;
    }
}
