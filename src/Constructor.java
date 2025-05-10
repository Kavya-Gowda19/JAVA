package Constructor;

class Dog{
    private String name;
    private String color;
    private String breed;
    private int age;
    private int cost;

    public Dog() {
        this("Jimmy");
        System.out.println("inside zero paramterized constructor");
        this.name="Tommy";
        this.color="red";
        this.breed="pug";
        this.age=2;
        this.cost=4000;
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);

    }

    public Dog (String name){
        this("Jimmy","Brown");
        System.out.println("inside one paramterized constructor");
        this.name=name;
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);

    }
    public Dog (String name,String color ){
        this("Jipey","white","GR");
        System.out.println("inside two paramterized constructor");
        this.name=name;
        this.color=color;
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);

    }
    public Dog (String name,String color ,String breed ){
        this("chintu","purple","Shitzu",3);
        System.out.println("inside three paramterized constructor");
        this.name=name;
        this.color=color;
        this.breed=breed;
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);

    }
    public Dog (String name,String color ,String breed,int age ){

        this("rocky","brown-black","german shephard",7,9000);
        System.out.println("inside four paramterized constructor");
        this.name=name;
        this.color=color;
        this.breed=breed;
        this.age=age;
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);

    }
    public Dog (String name,String color ,String breed,int age ,int cost){

        System.out.println("inside five paramterized constructor");
        this.name=name;
        this.color=color;
        this.breed=breed;
        this.age=age;
        this.cost=cost;
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);

    }
}
public class ConstructorEx {

    public static void main(String[] args) {

        Dog d=new Dog();

    }

}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------
package Constructor;


class Car{
    String model;
    int year;

    // constructor is used - constructor initializes the car object
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println(model + " " + year);
    }
}
public class BasicExample  {
    public static void main(String args[]) {
        Car mycar = new Car("Tayato", 2025);
        mycar.display();
        Car mycar1 = new Car("bmw", 2024);
        mycar1.display();
    }
}

// or


// Main class to demonstrate object creation - direct without using display method
/*public class Geeks {
    public static void main(String[] args) {

        Car myCar = new Car("Honda", 2021);
        System.out.println("Car Model: " + myCar.model);
        System.out.println("Car Year: " + myCar.year);
    }
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------

//zero parameterized

package Constructor;

class Car1{
    String name;
    int year;

    // Zero parameterized constructor
    Car1(){
        name="Range Rover";
        year=2003;
    }

    void display(){
        System.out.println(name + " "+ year);
    }
}

public class ZeroParameterized {
    public static void main (String args[]){
        Car1 car=new Car1();
        car.display();

    }
}









