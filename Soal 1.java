/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumtugas;

/**
 *
 * @author siska nur cahyani
 */
public class Person{
    //field
    private String fName, IName, stuStatus;
    private int stuId, age;
    
    //construktor
    public Person (String fName, String IName, String stuStatus, int stuId) {
        this.fName = fName;
        this.IName = IName;
        this.stuStatus = stuStatus;
        this.stuId = stuId;
    }
    
    public Person (String fName, int age) {
        this.fName = fName;
        this.age = age;
    }
    
    //deklarasi method
    public int getAge() {
        return age;
    }
    
    public String getName() {
        return fName;
    }

    public static void main(String[] args) {
        Person person = new Person("lisa", "Palombo", "Active", 123456789);
        
        System.out.println("Student Name   : " + person.fName + " " + person.IName);
        System.out.println("Student ID     : " + person.stuId);
        System.out.println("Student Status : " + person.stuStatus);
    }


}   