package domain;


 /**
 * The class Animal
 */ 
public class Animal {

    protected String name;

    protected int weight;

    protected int age;


/** 
 *
 * It is a constructor. 
 *
 */
    public Animal() { 

        name="generic animal";
        weight=15;
        age=4;
    }


/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Animal eating...");
    }


/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Animal speaking...");
    }


/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return "My animal:" + "\nName:\t" +
                name + "\nAge:\t" + age + "\nWeight:\t" + weight + " kg";
    }
}
