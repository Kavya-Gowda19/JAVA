package com.pack.backup;

//methodoverriding
/*class college {
    void marry() {
        System.out.println("I will get marry anusha");
    }
}

class Employee2 extends college {
    void marry() {
        System.out.println("I will get marry settled girl");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Employee2 e = new Employee2();
        e.marry();  // This calls the overridden method in Employee2
    }
}
*/
//changing the method name
class college {
    void marry() {
        System.out.println("I will get marry anusha");
    }
}

class Employee2 extends college {
    void marry1() {
        System.out.println("I will get marry settled girl");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Employee2 e = new Employee2();
        e.marry();
        e.marry1();
    }
}

/* Method overriding happens only when the subclass defines a method with the exact same name, 
 * return type, and parameters as the parent class.
In your code:
college has marry()
Employee2 has marry2() → this is a completely different method, not overriding.

*/



