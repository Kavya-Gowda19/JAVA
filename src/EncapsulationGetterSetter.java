package Encapsulation;
class Dog1{
    private String name;
    private String color;
    private String breed;
    private  int cost;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class EncapsulationGetterSetter {

    public static void main(String[] args) {
        Dog1 d1 = new Dog1();
        d1.setName("tommy");
        d1.setColor("yellow");
        d1.setBreed("pug");
        d1.setAge(8);
        d1.setCost(9000);
        System.out.println(d1.getName());
        System.out.println(d1.getColor());
        System.out.println(d1.getBreed());
        System.out.println(d1.getAge());
        System.out.println(d1.getCost());


    }
}
