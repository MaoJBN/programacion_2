package com.mycompany.project1;

import people.Person;

public class Project1 {

    public static void main(String[] args) {
        Character homero = new Character("Homero","Inspector",38,"Doooooh");
        System.out.println(homero.getOccupation());
        
        ////////////////////////////
        Accessclass other = new Accessclass();
        other.sayHello();
        Person person = new Person("pepito",15,"albert");
        System.out.println(person.getAge());
        System.out.println(person.getFullname());
    } 
}
