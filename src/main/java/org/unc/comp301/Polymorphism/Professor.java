package org.unc.comp301.Polymorphism;

public class Professor extends Person{

    public Professor(String name){
        super(name);
    }

    @Override
    public String getName(){
        return "Prof " + super.getName();
    }
}
