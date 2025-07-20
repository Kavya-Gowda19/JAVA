class Calculator {

    int add(int a, int b) {
        return a + b;
    }

   
    int add(int a, int b, int c) {
        return a + b + c;
    }

  
    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePoly {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));         // Output: 15
        System.out.println(calc.add(5, 10, 20));     // Output: 35
        System.out.println(calc.add(5.5, 4.5));      // Output: 10.0
    }
}

//Binding Time - Method call is resolved at compile-time.
// it's Achieved	Using Method Overloading.
