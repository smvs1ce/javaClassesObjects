package oopsProject;
import java.util.*;

class Pet{
    String name, location, type;
    int age;
    Pet(){}
    Pet(String name, int age, String location, String type){
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    String getType(){
        return type;
    }
    void setName(String name){
        this.name = name;
    }
    void setLocation(String location){
        this.location = location;
    }
    void setAge(int age){
        this.age = age;
    }
}

class Car {

    String type;
    String model;
    String color;

    Car(){}
    Car(String color, String model){
        this.color = color;
        this.model = model;
    }
    Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }
    String getType(){
        return type;
    }
    String getModel(){
        return model;
    }
    String getColor(){
        return color;
    }
    void setModel(String model){
        this.model = model;
    }
    void setColor(String color){
        this.color = color;
    }
    void setType(String Type){
        this.type = type;
    }
    Boolean isCar(){
        return true;
    }
    String carSpecificatons(){
        return "A "+color+" coloured Car of "+model+" model having a type "+type;
    }
    
}

public class oopsProject {

	public static void main(String[] args) {
		Pet p = new Pet("Simba",12,"NY","Golden Retriever");
		System.out.println(p.getAge());
		p.setName("Louis");
		System.out.println(p.getName());
		Car c = new Car("Mercedes","S-class","White");
		System.out.println(c.carSpecificatons());
		System.out.println("Is Mercedes a car? "+ c.isCar());

	}

}
