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
public class Polimorfism {
    public static void main(String[] args) {
        Person ref;
        Student student = new Student();
        Employee employee = new Employee();
        
        ref = student;
        String name = ref.getName();
        System.out.println(name);
        //
        ref = employee;
        String name1 = ref.getName();
        System.out.println(name1);
        printInformation(student);
        printInformation(employee);
    }
    
    public static void printInformation(Person person) {
        if(person instanceof Student) {
            System.out.println("Nama Student " +person.getName());
        } 
        else if(person instanceof Employee) {
            System.out.println("Nama Employee " +person.getName());
        }
    }
}
