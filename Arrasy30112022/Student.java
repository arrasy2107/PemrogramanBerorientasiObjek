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
public class Student extends Person {

    public Student() {
        super("Arrasy", "Padang");
        super.name = "Arrasy";
        super.address = "Padang";
        System.out.println("Inside Student:Constructor");
    }

    @Override
    public String getName() {
        System.out.println("Student: getName");
        return name;
    }

    public static void main(String[] args) {
        Student arrasy = new Student();
        arrasy.name = "Arrasy";
        System.out.println(arrasy.name);
    }
}
