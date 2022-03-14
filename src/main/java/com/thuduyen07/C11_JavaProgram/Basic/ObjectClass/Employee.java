package com.thuduyen07.C11_JavaProgram.Basic.ObjectClass;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Employee {
    private int id ;
    private String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    /**
     * Two employees equal if stored in same memory address or has same id
     */
    @Override
    public boolean equals(Object object){
        if(object==null){
            return false;
        }
        if(object==this){ // same memory adress
            return true;
        }
        return this.getId()==((Employee) object).getId(); // same id
    }
}
/**
 * Note: lombok's equals() != java object's equals()
 * java object's equals if have the same hashcode?
 */

//https://projectlombok.org/
//https://github.com/peichhorn/lombok-pg/wiki
//https://objectcomputing.com/resources/publications/sett/january-2010-reducing-boilerplate-code-with-project-lombok