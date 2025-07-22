package Encapsulation;

class dog {
    private String name;
    private String color;
    private String breed;
    int cost;
    int age;
    //generic setter
    void SetData() {
        name="jimmy";
        color="black";
        breed="lab";
        age=6;
        cost=4000;
    }
    //generic setter with parameter
    void SetData1(String a,String b,String c,int d,int e) {
        name=a;
        color=b;
        breed=c;
        cost=d;
        age=e;
    }
    //generic getter
    void getData() {
        System.out.println(name);
        System.out.println(color);
        System.out.println(breed);
        System.out.println(cost);
        System.out.println(age);
    }

}
public class EncapsulationGeneric {

    public static void main(String[] args) {
        dog d1 = new dog();
        System.out.println("generic setter without parameter is getting executed..");
        d1.SetData();
        System.out.println("generic setter without parameter is  executed");
        System.out.println("--------");
        d1.getData();
        System.out.println("------");
        System.out.println("generic setter without parameter is  executed");
        d1.SetData1("rocky", "white", "gr", 4, 6000);
        System.out.println("generic setter with parameter is  executed");
        System.out.println("-------");
        d1.getData();
    }



    }

