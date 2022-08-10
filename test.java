/* Name - Gaurab Ghosh
College - Techno India University 
Year of passing - 2022 
Phone Number  - 8617007445
Email address - gaurabghoshjgm@gmail.com */

import java.util.*;

public class test {

    public static void main(String[] args) {
        Planet earth = new Planet(null, null, 1,"No");

        System.out.println(earth.countsMoon());
    }
}

class Planet{

    String name;
    String surGas;
    int noOfMoon;
    String ring;

    public Planet(String name,String surGas,int noOfMoon,String ring) {
        this.name = name;
        this.surGas = surGas;
        this.noOfMoon = noOfMoon;
        this.ring = ring;
    }

    public void countsMoon(int noOfMoon,String ring){
        int count = 0;
        if(ring == "Yes"){
            count = count + this.noOfMoon;
        }
        System.out.println(count);
    }

    public void maxGas(String surGas){
        
    }

}
