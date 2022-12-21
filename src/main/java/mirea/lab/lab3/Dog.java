package mirea.lab.lab3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

abstract class Dog {
    public int weight;
    public int mass;
    public String color;
    public String name;

    public Dog (){
        this.weight = 0;
        this.mass = 0;
        this.color = "color";
        this.name = "name";
    }
    public Dog (int weight, int mass, String color, String name) {
        this.weight = weight;
        this.mass = mass;
        this.color = color;
        this.name = name;

    }


    abstract void Info();
}
class Bigl extends Dog{

    public Bigl(int weight, int mass, String color, String name) {
        super(weight, mass, color, name);
    }



    @Override
    void Info() {
        System.out.println("Poroda: Bigl");
        System.out.println("Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Mass: "+mass);
        System.out.println("Weight "+weight);
    }
}
class Akita extends Dog{
    public Akita(int weight, int mass, String color, String name) {
        super(weight, mass, color, name);
    }

    @Override
    public String toString() {
        return "Akita";
    }

    @Override
    void Info() {
        System.out.println("Poroda: Akita");
        System.out.println("Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Mass: "+mass);
        System.out.println("Weight "+weight);

    }
}