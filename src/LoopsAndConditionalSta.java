package LoopsANDConditional;
//LOOPS

/* When to Use which Loop
1.For Loop
2.While Loop
3.Do While Loop
4.For Each Loop
                    --When you want exact iterations, use for loop.
                    --When you need condition check first, use while loop.
                    --When you need to run at least once, use do-while loop.
                    --When you process all collection items, use for-each loop.
*/
public class LoopExample {
    public static void main(String args[]){
        // For Loop
        System.out.println("For Loop");
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }

        // While Loop
        System.out.println("\nWhile Loop");
        int j=1;
        while(j<=10){
            System.out.print(j+" ");
            j++;
        }

       // Do While Loop
        System.out.println("\nDo While Loop");
        int k=1;
        do{
            System.out.print(k+" ");
            k++;
        }while(k<=10);


        // For Each Loop
        System.out.println("\nFor Each Loop");
        int a[]={1,2,3,4,5,6,7,8,9,10};
        for(Integer p:a){
            System.out.print(p+ " ");
            p++;
        }


    }
}

//CONDITIONAL STATEMENTS

package LoopsANDConditional;
/*
1.if Statement
2.if else Statement
3.if else if Ladder Statement
4.Nested if Statement
5.Switch Statement
*/

//1.If Statement
package LoopsANDConditional;

public class ConditionalStatement {
    public static void main(String[] args) {
        int number = 5;

        // Simple if statement
        if (number < 10) {
            System.out.println("The number is less than 10.");
        }
    }
}
//2. If-Else Statement

package LoopsANDConditional;

public class ConditionalStatement {
    public static void main(String[] args) {
        int number = 15;

        // If-else statement
        if (number < 10) {
            System.out.println("The number is less than 10.");
        } else {
            System.out.println("The number is 10 or greater.");
        }
    }
}
//3. If-Else-If Ladder Statement

package LoopsANDConditional;

public class ConditionalStatement {
    public static void main(String[] args) {
        int number = 20;

        // If-else-if ladder
        if (number < 10) {
            System.out.println("The number is less than 10.");
        } else if (number < 20) {
            System.out.println("The number is between 10 and 19.");
        } else if (number < 30) {
            System.out.println("The number is between 20 and 29.");
        } else {
            System.out.println("The number is 30 or greater.");
        }
    }
}
//4. Nested If Statement
    
package LoopsANDConditional;

public class ConditionalStatement {
    public static void main(String[] args) {
        int number = 25;

        // Nested if statement
        if (number < 50) {
            if (number < 30) {
                System.out.println("The number is less than 30.");
            } else {
                System.out.println("The number is 30 or greater but less than 50.");
            }
        } else {
            System.out.println("The number is 50 or greater.");
        }
    }
}
//5. Switch Statement

package LoopsANDConditional;

public class ConditionalStatement {
    public static void main(String[] args) {
        int day = 3;

        // Switch statement
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number.");
        }
    }
}








