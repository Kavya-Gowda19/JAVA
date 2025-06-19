package com.pack.backup;

class Payment {
    // Compile-time polymorphism (Method Overloading)
    void makePayment() {
        System.out.println("I will make payment");
    }

    void makePayment(String pay) {
        System.out.println("I will make payment using " + pay);
    }
}

// Runtime polymorphism (Method Overriding)
class CreditCard extends Payment {
    @Override
    void makePayment() {
        System.out.println("I will make payment using Credit Card");
    }
}

class COD extends Payment {
    @Override
    void makePayment() {
        System.out.println("I will make payment using Cash on Delivery");
    }
}

public class bothPolymorphism {
    public static void main(String[] args) {
        // Compile-time polymorphism (Method Overloading)
        Payment p = new Payment();
        p.makePayment();
        p.makePayment("UPI");

        // Runtime polymorphism (Method Overriding)
        Payment pay1 = new CreditCard(); // Upcasting
        Payment pay2 = new COD();        // Upcasting

        pay1.makePayment(); // Calls CreditCard version
        pay2.makePayment(); // Calls COD version
    }
}

