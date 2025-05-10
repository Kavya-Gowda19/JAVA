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






