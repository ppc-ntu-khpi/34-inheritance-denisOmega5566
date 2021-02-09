package test;

import domain.Dog;


 /**
 * The class Test animal
 */ 
public class TestAnimal {


/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        Dog dog = new Dog();
        System.out.println(dog);
        dog.hunt();
        dog.eat();
        dog.speak();
        dog.play();
    }
}
