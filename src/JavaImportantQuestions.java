//1.----------------------------------------------------Leap Year-------------------------------------------------------------------------------------------------------
package com.pack;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub                // condition 1.divisible by 400
		Scanner s=new Scanner(System.in);                              2.divisible by 4 and not by 100
	        int x;
		System.out.println("Enter the year");
		x=s.nextInt();
		if(x%4==0 && x%100!=0) {
		System.out.println("leap year");
		}
		else if(x%400==0) {
			System.out.println("leap year");	
		}
		else {
			System.out.println("Not leap year");
		}
	}
}



//2.----------------------------------------Reverse  of  Intger array-------------------------------------------------------------------------------------------------------
//revers a given array
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of array");
        int n=s.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the  array elements");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int res[]=new int[a.length];
        int temp=0;
        for(int i=a.length-1;i>=0;i--) {
            res[temp]=a[i];	//1st position to resultant array res[0]=a[6]
            temp++;             //temp increment assigns next value in res array
        }
        System.out.println("The arry before reversing:");
        for(Integer i: a) {
            System.out.print(i+" " );
        }
        System.out.println();
        System.out.println("The arry After reversing:");
        for(Integer i: res) {
            System.out.print(i+" " );
        }

    }
}

3.--------------------------------------------------------Reverse of String-------------------------------------------------------------------------------------------------------
 import java.util.Scanner;
public class ReverseString{
    public static void main (String args []){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=s.nextLine();
        String str_temp="";
        for(int i=str.length()-1;i>=0;i--) {
            str_temp = str_temp + str.charAt(i);
        }
            System.out.println(" the Reverse String :"+ str_temp);

        }
    }

4..-----------------------------------------------------Bubble sort-------------------------------------------------------------------------------------------------------

import java.util.*;
public class BubbleSort {
    public static void main(String args[]){
       Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of array");
        int n=s.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the  array elements");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }

        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(Integer i :a){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-------------");
        System.out.println("The minimum element is: "+a[0]);
        System.out.println("The maximum element is: "+a[a.length-1]);
    }
}


 5.--------------------------------LinearSearch to find the specific elemnts-------------------------------------------------------------------------------------------------------
import java.util.Scanner;
public class LinearSearch {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a[]={2,3,56,78,43,789,33,100,67,78};
        System.out.println("Enter the element");
        int key =s.nextInt();
        for(int i=0;i<a.length;i++){
            if(key==a[i]){
                System.out.println("Key is found at position "+ i);
                System.exit(0);                                         //System.exit(0) terminates the program when it finds a missing letter,
            }
        }
        System.out.println("Key is not found at position ");

    }
}

6..----------------Keerti is the owner of the educational instition named as ajna group of Insstitute under Ajna group of institution---------------------------------
keerti has constructed three colleges each for medical and enginerring.one the acdedmic admission is completed in all this colleges 
keerti want to want is the revenue made by each college ad also  she wanted to check the what is the overall revenue made by ajna group of 
institution ,despite the same using revelent programing technique

package Arrays;
import java.util.Scanner;
public class Array2 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number of wings under ajna group of institutions :");
  int wing=s.nextInt();
  System.out.println("Enter the number of colleges constructed by keerti under each wing :");
  int col=s.nextInt();
  //create 2 d array
   int  arr[][]=new int[20][20];
   long overall_revenue=0;
   for(int i=0;i<wing;i++) {
	   System.out.println("Inside the wing number: "+(i+1));
	   for(int j=0;j<arr[i].length;j++) {
		   System.out.println("Enter Revenue made by college number: "+(j+1));  
		   arr[i][j]=s.nextInt();
		   overall_revenue+=arr[i][j];
	   }	   
   }
   System.out.println("------------------");
   //didsplay data
   for(int i=0;i<wing;i++) {
	   System.out.println("Inside the wing number: "+(i+1));
	   for(int j=0;j<arr[i].length;j++) {
		   System.out.println("The Revenue made by college number: "+(j+1)+"is"+arr[i][j]);     
		   overall_revenue+=arr[i][j];
	   }
	   System.out.println("------------------");
	   System.out.println("Overall revenue made by keerti's ajna group of institute: "+ overall_revenue);	   
	}
	}
}
 
7.------------------------------------------------Panagram Program-------------------------------------------------------------------------------------------------------
public class AlphabetParagram {
    public static void main(String arg[]) {
       
        char arr[] = {'a','b','c','d','e','f','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        int res[] = new int[26]; // By default, all values are 0

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i] - 'a'; // Find the index for the letter
            res[temp] = 1; // Mark letter as present
        }

        // Check if all letters are present
        for (int i = 0; i < res.length; i++) {
            if (res[i] != 1) {
                System.out.println("This array does not contain all the alphabets of English.");
                return; // Exit method instead of System.exit(0) for better practice
            }
        }

        System.out.println("This array contains all the alphabets of English.");
    }
}

8.--------------------------------------Palindrome String-------------------------------------------------------------------------------------------------------
 import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        String str_temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str_temp = str_temp + str.charAt(i);// each char of word
        }

        if (str.equals(str_temp) == true) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}


9.--------------------------------------Palindrome Number-------------------------------------------------------------------------------------------------------
 import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int reserve =0;;
        int n = sc.nextInt();
        int original = n;
        while (n > 0) {
            int digit = n % 10;
            reserve = reserve * 10 + digit;
            n = n / 10;
        }
            if (original == reserve) {
                System.out.println("It is palindrome");
            } else {
                System.out.println("It is not palindrome");
            }

    }
}

10--------------------------------------------------------------Prime Number---------------------------------------------------------------------------------------------
//prime number is which is divisible  by 1 and itself 
//0 and 1 are not prime
//leaving 2 all other even numner can be divide by 2

import java.util.Scanner;
public class PrimeNumber{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        boolean flag=false;  //use flase lower case
        if(n==0||n==1){
            flag =true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%2==0){
                flag=true;
                break;
            }
            }
        if(flag == true){
            System.out.println("Number is not prime");
        }else{
            System.out.println("Number is prime");
        }
    }
}


10.-----------------------------------------------Prime numbers within Range------------------------------------------------------------------------------------------
import java.util.Scanner;
public class PrimeNumberRange {
    public boolean isPrime(int n){
        if(n==0|| n==1){
            return false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%2==0){
                    return false;
                }
            }
        }
     return true;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter start range");
        int start=s.nextInt();
        System.out.println("Enter end range");
        int end=s.nextInt();
        PrimeNumberRange p=new PrimeNumberRange();
        System.out.println("The Prime number from "+start+" to "+end);
        for(int i=start;i<=end;i++){
            if (p.isPrime(i) == true){
                System.out.print(i+" ");
            }
        }
    }
}



11.-----------------------------------------------Fibonacii using recurssion---------------------------------------------------------------------------------------------

The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones.
The recursive function follows a depth-first approach—it keeps going down until it reaches the base case and then comes back up, summing values as it returns.
0, 1, 1, 2, 3, 5, 8, 13, 21, ... )


0+1=1,1+1=2
fib(4)=fib(3)+fib(2)=2+1=3
fib(3)=fib(2)+fib(1)=1+1=2
fib(2)=fib(1)+fib(0)=1
fib(1)=1
fib(0)=0

import java.util.Scanner;
public class Fibonaccis {
    public  static int Fibonaci(int n) {
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else{
            int res= Fibonaci(n-1)+Fibonaci(n-2);
            return res;
        }

    }

    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();

        int res= Fibonaci(n);
        System.out.println(res);

    }
}

12.------------------------------------------------MinMax using Library---------------------------------------------------------------------------------------------
   
   import java.util.*;
   public class MaxMin{
   public static void main (String args[]){
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the number of elements");
   int n=s.nextInt();
   int a[]=new int[n];
   System.out.println("Enter the  elements");
   for(int i=0;i<n;i++){
    System.out.println(a[i]);
     }
   Arrays.sort(a);
  System.out.println("Smallest Element " + a[i]);
  System.out.println("largest elements " + a[a.length-1]);
}
}

13.------------------------------------------------Matrix Addition---------------------------------------------------------------------------------------------
  
import java.util.*;
public class MatrixAddition {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int k = s.nextInt();
        int m[][] = new int[k][k];
        int n[][] = new int[k][k];
        int res[][] = new int[k][k];
        System.out.println("Enter elements of matrix m");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                m[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter elements of matrix n");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                n[i][j] = s.nextInt();
            }
        }
        //perform opertation
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                res[i][j] = m[i][j] + n[i][j];
            }
        }
        System.out.println("Resultant Matrix ");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}

14.------------------------------------------------Matrix Multiplication---------------------------------------------------------------------------------------------
package pack.com;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter rows and columns for first matrix:");
        int r1 = s.nextInt();
        int c1 = s.nextInt();

        System.out.println("Enter rows and columns for second matrix:");
        int r2 = s.nextInt();
        int c2 = s.nextInt();

        // Checking  if multiplication is possible
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible! Columns of first matrix must equal rows of second matrix.");
            return;
        }

        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r2][c2];
        int[][] res = new int[r1][c2]; // Resultant matrix will be of size r1 × c2

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = s.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < r1; i++) { 
            for (int j = 0; j < c2; j++) { 
                res[i][j] = 0; 
                for (int k = 0; k < c1; k++) { // Use c1 (or r2, both are equal)
                    res[i][j] += m1[i][k] * m2[k][j]; 
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}

15.------------------------------------------------Anagram------------------------------------------------------------------------------------------------------------
  Anagrams are words or phrases formed by rearranging the letters of another word or phrase. For example:
  eg:  Listen → Silent,Debit card → Bad credit
step1:Collet the string
step2:create 2 string which is having the size same as the 2 strings provoided the strings have same size else directly prints that the are
     string are not anagram 
step3:Traverse the string and store the characters into array
step4:sort the aray using bubble sort 
step5:compare the two string
//anagram built in funtion
package com.string;
import java.util.Arrays;
import java.util.Scanner;
public class anagrams {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//step-1
		System.out.println("enter the first string:  ");
		String str1= sc.next();
		System.out.println("enter the second string:  ");
		String str2= sc.next();
		System.out.println("----------");
		//step-2
		if(str1.length()==str2.length()) { 
			char c1[]=str1.toCharArray();
			char c2[]=str2.toCharArray();
		//step-4
		//sorting array c1
		Arrays.sort(c1);
		Arrays.sort(c2);
		//step-5
		if (Arrays.equals(c1,c2)==true) {
			System.out.println("the strings are anagrams");
		}
			else {
				System.out.println("the strings are not anagrams");
			}
		}
		else {
			System.out.println("the strings are not anagrams");
		}
	}	
	}
// Anagram
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input strings
        System.out.println("Enter the first string: ");
        String str1 = sc.next();
        System.out.println("Enter the second string: ");
        String str2 = sc.next();

        // Step 2: Check length first
        if (str1.length() == str2.length()) {
            // Step 3: Convert strings to char arrays
            char[] c1 = str1.toCharArray();
            char[] c2 = str2.toCharArray();

            // Step 4: Sort both arrays manually using bubble sort
            for (int i = 0; i < c1.length - 1; i++) {
                for (int j = i + 1; j < c1.length; j++) {
                    if (c1[i] > c1[j]) {
                        char temp = c1[i];
                        c1[i] = c1[j];
                        c1[j] = temp;
                    }
                }
            }

            for (int i = 0; i < c2.length - 1; i++) {
                for (int j = i + 1; j < c2.length; j++) {
                    if (c2[i] > c2[j]) {
                        char temp = c2[i];
                        c2[i] = c2[j];
                        c2[j] = temp;
                    }
                }
            }

            // Step 5: Compare both sorted arrays
            boolean isAnagram = true;
            for (int i = 0; i < c1.length; i++) {
                if (c1[i] != c2[i]) {
                    isAnagram = false;
                    break;
                }
            }

            // Step 6: Output result
            if (isAnagram)
                System.out.println("The strings are anagrams.");
            else
                System.out.println("The strings are not anagrams.");
        } else {
            System.out.println("The strings are not anagrams (different lengths).");
        }
    }
}

16.--------------------------------------------------------HCF-LCM---------------------------------------------------------------------------------------------
LCM (Least Common Multiple): The LCM of two numbers is the smallest positive integer which is divisible by both numbers.
HCF (Highest common Factor)/GCD: HCF is also known as Greatest common divisor, HCF of two numbers is the largest positive integer that divides both the numbers.
****LCM=num1*num2/HCF
-> Example :Find HCF of 12 and 18
Step 1: Find factors   Factors of 12 → 1, 2, 3, 4, 6, 12       or 28->2,7,2
                       Factors of 18 → 1, 2, 3, 6, 9, 18       or 12->3,2,2
Step 2: Identify common factors
                       Common factors = 1, 2, 3, 6             ommon Factor=2*2 =4
Step 3: Pick the highest
                       HCF = 6
-> Using Prime Factorization
    1.Find the prime factorization of both numbers.
    2.Take the highest power of each prime factor.
    3.Multiply them to get LCM.
  
Example: Find LCM of 8 and 12
             8 = 2³
             12 = 2² × 3
             Take highest powers: 2³ * 3 = 24  LCM(8,12) = 24
 imp:somehow 1 is common factor keeps on checking one is cf or 2 is cf ... keep upadting to highest cf ---------------------------------------------------------------------------
                                                                                                            0       1       2     3     ........ m(small no)      n(small no)

import java.util.Scanner;
public class HcfLcm {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number1 : ");
        int n1=s.nextInt();
        System.out.println("Enter the numbre2 : ");
        int n2=s.nextInt();
        int min;   //  int min=math.min(n1,n2); built in function
        if(n1>n2){
            min=n1;
        }
        else{
            min=n2;
        }
        int hcf=0;
        for(int i=1;i<=min;i++){
            if((n1%i==0) &&(n2%i==0)){
                 hcf=i;
            }
        }
        System.out.println("The hcf/gcd is"+ hcf);
        int lcm=(n1*n2)/hcf;
        System.out.println("The lcm is"+ lcm);
    }
}

17.-------------------------------------------------------Armstrong---------------------------------------------------------------------------------------------

An Armstrong number is a positive integer that is equal to the sum of its own digits each raised to the power of the number of digitoriginal
153 = (1*1*1)+(5*5*5)+(3*3*3) 
9474=(9*9*9*9)+(4*4*4*4)+(7*7*7*7)+(4*4*4*4)

import java.util.Scanner;
public class Armstrong {
    public static int power(int r,int count){
        int summ=1;
        for(int i=0;i<count;i++){
            summ=summ+r;
        }
        return summ;
    }
    public static void main(String args []){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int original=n;
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+power(r,count);
            n=n/10;

        }
        if(original==sum){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is  not armstrong");
        }
    }
}

18.------------------------------------------------VowelConsanant---------------------------------------------------------------------------------------------
 import java.util.*;
public class Vowel {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        String str;
        System.out.println("Enter the String:");
        str=s.nextLine().toLowerCase();
         int vowel_count=0;
        int consonant_count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=122) { ///ascii values are needed when needed to count specific character
                if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    vowel_count++;
                } else {
                    consonant_count++;
                }
            }

            }
        System.out.println("the String length :"+ str.length());
        System.out.println("the number of vowel:"+vowel_count);
        System.out.println("the number of consonant"+consonant_count);
        }

    }


  //VowelConsanant special replace
import java.util.*;
public class VoweSpecial {

    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        String str;
        System.out.println("Enter the String:");
        str=s.nextLine().toLowerCase();
        String str_temp= "";
        int vowel_count=0;
        int consonant_count=0;
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                   str_temp+='$';
                } else {
                    str_temp+='&';
                }
            }
            else{
                str_temp+=str.charAt(i);
            }

        }
        System.out.println("Repled String  :"+ str_temp);
    }}
19.------------------------------------------------greatest of two number or 3 number---------------------------------------------------------------------------------------------
     import java.util.Scanner;
    public class GreatestNo{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the First Number");
        int n1=s.nextInt();
        System.out.println("Enter the Second Number");
        int n2=s.nextInt();
        System.out.println("Enter the Third Number");
        int n3=s.nextInt();
        if(n1>=n2 && n1>=n3){
            System.out.println("Lagerest Number Is :" +n1);
        }
        else if(n2>=n1 && n2>=n3){
            System.out.println("Lagerest Number Is :" +n2);
        }
        else{
            System.out.println("Lagerest Number Is :" +n3);
        } } }

17.--------------------------------------------------Transpose Of Matrixs---------------------------------------------------------------------------------------------
  
The transpose of a matrix is obtained by swapping rows with columns.
   a=[2,3]       b=[2,4]
     [4,7]         [3,7]
   If an original matrix is of order m × n (rows × columns),
   the transposed matrix will be of order n × m (columns × rows).


  import java.util.Scanner;
  public class TransposeMatrix {
  public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=s.nextInt();
        System.out.println("Enter the number of columns");
        int c=s.nextInt();
        int m[][] = new int[r][c];
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=s.nextInt();
            }
        }
        System.out.println("The Transpose matrix is ");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(m[j][i]+ " "); // important just m[i][j]----> m[j][i]
            }
            System.out.println();
        }

    }
}
20.------------------------------------------------Count Digits---------------------------------------------------------------------------------------------
import java.util.Scanner;
public class CountNo {
int  digit(int n){
    int count=0;
    while(n>0) {
        n = n / 10;
        count+=1;
    }
    return count ;
}
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        CountNo d=new CountNo();
        System.out.println("the number of digits :"+d.digit(n));
    }
}
input:1234
output:4



21.------------------------------------------------Factorial---------------------------------------------------------------------------------------------
-factoril of 0 and 1 is 1
-formula n*fact(n-1)
//recurssion

import java.util.Scanner;
public class Factorial {
    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n * fact(n-1);


    }
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        System.out.println("Factorial is "+ Factorial.fact(n));

    }
}
// itterative method
   import java.util.Scanner;
public class Factorial {
    static int fact(int n){
        int res=1;
        for(int i=1;i<=n;i++ ){
            res=res*i;
        }
    return res;

    }
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        System.out.println("Factorial is "+ Factorial.fact(n));

    }
}
22.------WAP to ifnd the product of all the elements which is present in the even position and is not a vowel---------------------------------------------------------------------------------
import java.util.*;
public class vowel_pos {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        String str;
        System.out.println("Enter the String:");
        str=s.nextLine();
        long product=1;
        for(int i=0;i<str.length();i++){
            if(i%2==0) { //space is also considered  //not used|| or beacause in or condition if one condition statisfies then okay
                if (str.charAt(i) != 'a' && str.charAt(i) != 'i' && str.charAt(i) != 'e' && str.charAt(i) != 'o' && str.charAt(i) != 'u'&&
                        str.charAt(i) != 'A' && str.charAt(i) != 'I' && str.charAt(i) != 'E' && str.charAt(i) != 'O' && str.charAt(i) != 'U') {
                    System.out.println("Considered character Is:"+str.charAt(i));
                    product=product * str.charAt(i);
                }
            }

        }
        System.out.println("the String length :"+ str.length());
        System.out.println("the product is:"+product);

    }

}

23.------------------------------------------------Swapping Lowercase and uppercase---------------------------------------------------------------------------------------------
  Enter the String:
  KAVYAkavya YeS
  LowerCase : kavyakavya yes
  Uppercase : KAVYAKAVYA YES
  UpperLower : kavyaKAVYA yEs

import java.util.Scanner;
public class LowerUpperCase {
    public static String UpperCase(String str){
        char ch[]=str.toCharArray();                       or              String Upper=" ";           
        for (int i = 0; i < ch.length; i++){                               for(int i=0;i<str.length();i++){
            if(ch[i]>='A'&& ch[i]<='Z'){                                   char ch=str.charAt(i);
                ch[i]=(char)(ch[i]+32);                                      if(h >= 'A' && ch <= 'Z'){
            }                                                               ch=(char)(ch+32);
        }                                                                   }
        String str1=new String(ch);                                         Upper+= ch;
      return str1;
    }
    public static String LowerCase(String str){
        char ch[]=str.toCharArray();
        for (int i = 0; i < ch.length; i++){
            if(ch[i]>='a'&& ch[i]<='z'){
                ch[i]=(char)(ch[i]-32);
            }
        }
        String str1=new String(ch);
        return str1;

    }
    public static String UpperLowerCase(String str){
        char ch[]=str.toCharArray();
        for (int i = 0; i < ch.length; i++){
            if(ch[i]>='a'&& ch[i]<='z'){
                ch[i]=(char)(ch[i]-32);
            }
            else if(ch[i]>='A'&& ch[i]<='Z'){
                ch[i]=(char)(ch[i]+32);
            }
        }
        String str1=new String(ch);
        return str1;
    }

    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        String str;
        System.out.println("Enter the String:");
        str=s.nextLine();
        System.out.println("LowerCase : "+ LowerUpperCase.UpperCase(str));
        System.out.println("Uppercase : "+ LowerUpperCase.LowerCase(str));
        System.out.println("UpperLower : "+LowerUpperCase.UpperLowerCase(str));
    }}



24.------------------------------------------------Word count string---------------------------------------------------------------------------------------------
   import java.util.Scanner;
    public class countWord {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine().trim();
        if (str.isEmpty()) {
            System.out.println("Number of words: 0");
            return;
        }
        int count_word = 1;  // Start with 1 word 
        for (int i = 0; i < str.length() ; i++) {  
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count_word++;
            }
        }
        System.out.println("Number of words: " + count_word);
       }
       }
      input: kavya is good
      output:3


25.------------------------------------------------ word reverse ---------------------------------------------------------------------------------------------

import java.util.Scanner;
public class ReverseWord {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        String str;
        System.out.println("Enter the String:");
        str=s.nextLine().trim();
        int wcount=1;
        for(int i=0;i<str.length();i++){
            if( str.charAt(i)==' ' && str.charAt(i+1)!= ' ' ){
                wcount++;
            }
        }
         //System.out.println("Number of words :"+wcount);
        String arr[]=new String[wcount];
        String temp=" ";
        int count= arr.length-1;  //3 words -1 beacause array

        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) != ' '){
                temp=temp + str.charAt(i);
            }
            else if(str.charAt(i)== ' ' && str.charAt(i+1)!=' '){  //when space encoutered store the current word (temp) into the array at index 'count 
                arr[count] = temp;  //  arr[2]= avaj;        // arr[1]=dlrow(from above)
                temp=" ";  //reset temp to a single space to start building the next word // temp= ''     //
                count--; // 1
            }
        }
        arr[count]=temp;
        for(String str1: arr){
            System.out.print(str1+ " ");
        }

    }
}

 input: Hello World Java
 output: Java world hello 
26.------------------------------------------------ Missing number---------------------------------------------------------------------------------------------
sum of n number =  n*(n+1)/2

+import java.util.Scanner;
public class MissingElement {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elemnts (n-1)");
        int n=s.nextInt();
        int m=n+1;
        int a[]=new int[m];
        System.out.println("Enter the elements from 1 to "+ m +" :");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
         int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        int actual_sum= m*(m+1)/2;
        int missing=actual_sum -sum;
        System.out.println("Missing Number is :"+missing);
    }
}

27.-----------------------------------------------Diagonal of a Matrix--------------------------------------------------------------------------------------------

28.-----------------------------------------------Tower Of Hanoi--------------------------------------------------------------------------------------------
 Tower of Hanoi-moving a stack of disks from one rod to another.
 Rules - 1.Only one disk can be moved at a time.
         2.Only the top disk of any rod can be moved.
         3.No larger disk can be placed on top of a smaller disk.
      rodA      rodB         rodC
Algorithum:(Example for 3 disk)1.move 2 disk from A to B using C     (for n disk)1.move n-1 disk from A to B using C
           2.move n from A to B using C                                          2.move n  from A to C using B
           3.move 2disk from B to C using A                                     3.move n-1 disk from B to C using A


                                   Tower(3, A, B, C)
                                   ├── Tower(2, A, C, B)
                                   │   ├── Tower(1, A, B, C)         ← base case
                                   │   └── Tower(1, C, A, B)         ← base case
                                   └── Tower(2, B, A, C)
                                       ├── Tower(1, B, C, A)         ← base case
                                       └── Tower(1, A, B, C)         ← base case

 package ImpPrograms;
import java.util.Scanner;
public class TowerOfHanoi {
    public void Tower(int ndisk,char A,char B,char C ){
        if(ndisk==1){
            System.out.println("Move disk 1 from " + A + " to " + C);
            return;
        }
    Tower(ndisk-1,A,C,B);//here 3->2->1
    System.out.println("Move disk "+ ndisk + " from "+A +"to"+C);
    Tower(ndisk-1,B,A,C);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        TowerOfHanoi t=new TowerOfHanoi();
        System.out.println("Enter the number of disk");
        int ndisk=s.nextInt();
        t.Tower(ndisk,'A','B','C');
    }
}

29.-----------------------------------------------Segreate String ,Number,special Charaters------------------------------------------------------------------------------------------
 
import java.util.Scanner;

public class SegregateStringNumberOther {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the text:");
        String str = s.nextLine();  // Use nextLine() to read multiple words

        String temp = "";  // Stores letters
        String temp1 = ""; // Stores numbers
        String temp2 = ""; // Stores special characters
        int sumstring=0;
        int sumnum=0;
        int sumspec=0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.charAt(i) >= 65 && str.charAt(i) <= 122) {   // if(str.charAt(i)>='A'  && str.charAt(i) <= 'Z')
                temp += str.charAt(i);
                sumstring +=1;
            } else if (str.charAt(i) >= 48 && str.charAt(i) <= 57)  {  // else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') 
                temp1 +=str.charAt(i);
                sumnum +=1;

            } else if (!Character.isWhitespace(ch)) { // Ignore spaces
                temp2 += str.charAt(i);
                sumspec +=1;

            }   
        }
        System.out.println("Alphabets: " + temp);
        System.out.println("sum of Alphabets: " + sumstring);
        System.out.println("Numbers: " + temp1);
        System.out.println("sum of Numbers: " + sumnum);
        System.out.println("Special Characters: " + temp2);
        System.out.println("sum of special charaters: " + sumspec);
    }
}

30.-----------------------------------------------number is perfect square------------------------------------------------------------------------------------------
import java.util.Scanner;
public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        } else {
            int i = 1;
            while (i * i <= num) {
                if (i * i == num) {
                    return true;
                }
                i++;
            }
        return false;
        }
    }

        public static void main (String args[]){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the Number");
            int num = s.nextInt();
            PerfectSquare is = new PerfectSquare();
            if(is.isPerfectSquare(num)== true){
                System.out.println("The number is Perfect Square");
            }
            else{
                System.out.println("The number is not Perfect Square");
            }

        }
    }



31.-----------------------------------------------sum of n natural number------------------------------------------------------------------------------------------
 sum=n*(n+1)/2

import java.util.Scanner;
public class SumOfNnumber {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        /*int sum=n*(n+1)/2;
        System.out.println("The first Sum of "+"n "+"natural number is "+sum);*/
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
    }
}

32.------------------------------------------------------Trailing Zeros------------------------------------------------------------------------------------
Program to count number of zeros at the end of the number
-if denominator is more numberator the division result will be zero 5/222=0.
-finding the fatorial and counting the number of five
    1.5!=5*4*3*2*1=120                                     -one 5
    2.10!=10*9*8*7*6*5*4*3*2*1=3628800                     -two 5(10=5*2)
    3.15!=15*14*13...*1=1307674368000                      -three 5
    4.20!=10*19*18....*1=2432902008176640000               -four  5
    5.25!=25*24*23*...*1=15511..4000000                    -six  5(only 5 are there but ans is 6) here fails

    Factorial         Operation         Number Of Zeros  
      5                5/5+n/25             1
      10              10/5+n/25             2
      25              25/5+n/25             6
     
        n!=n/5+n/25+n/125+n/625.......[power of 5]
    5  =   5/5+5/25+5/125+125/625..=1+0+0+0  res=1
    200=   200/5+200/25+200/125+200/625...=40+8+1+0+0...res =49

import java.util.Scanner;
public class TrailingZero {
    public static int Trailing(int n){
      int res=0;
      int powerOf5=5;
      while(n>=powerOf5){
          res=res+(n/powerOf5);
          powerOf5= powerOf5*5;
      }
      return res;
    }
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        System.out.println("the number of zeros :"+ TrailingZero.Trailing(n));
    }
}

33.------------------------------------------------------Second Largest Number------------------------------------------------------------------------------------
import java.util.*;
public class SecondLargest {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
       System.out.println("Enter the number of elements");
       int n=s.nextInt();
       int a[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int max1=0;
        int max2=0;
        if(a[0]>a[1]){  // here max1 is highest no matter wt
            a[0]=max1;
            a[1]=max2;
        }
        else{
            a[0]=max2;
            a[1]=max1;
        }
        for(int i=2;i<a.length;i++){ //starts from 3rd element
            if(a[i]>max1){
               max2=max1;//done beacause before loosing the value is assigned to max2 as max2 is second highest
               max1=a[i];//now a[i] is more than max1 so replacing max1 with present a[i] element
            }
            else if (a[i] > max2 && a[i] != max1){
                max2=a[i];// as a[i] is moe than max2 so replaing max2 with a[i]
            }
        }
        System.out.println("The Second largest Number is :"+max2);
    }
}

34.------------------------------------------------------decimal binary-----------------------------------------------------------------------------------------------
The decimal system is the number system we use in everyday life
It is a base-10 system, meaning it has 10 digits:
0, 1, 2, 3, 4, 5, 6, 7, 8, 9
Each digit represents a power of 10 based on its position.
345 = 3×10² + 4×10¹ + 5×10⁰
    = 3×100 + 4×10 + 5×1
    = 300 + 40 + 5

The binary system is used by computers and digital devices.
It is a base-2 system, meaning it has only 2 digits:
0 and 1
Each binary digit (called a bit) represents a power of 2 based on its position.
1010 = 1×2³ + 0×2² + 1×2¹ + 0×2⁰
     = 1×8 + 0×4 + 1×2 + 0×1
     = 8 + 0 + 2 + 0 = 10 (in decimal)


Conversion	               Use	                 Why
Binary → Decimal	Math.pow(2, power)	    Each bit is a power of 2
Decimal → Binary	Use % 2 and / 2             Binary digits come from remainders


// Decimal to Binary

/*import java.util.Scanner;
public class DecimalToBinary {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int rem;
        String c="";
        while(n!=0) {
            rem=n%2;
            c=rem+c;
            n=n/2;
        }
            System.out.println(c);
    }
}*/

//Binary To Decimal

import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int n = s.nextInt();//101                                 or                     string binary=s.nextLine();//binary string beacause to handle large string
        int d = 0;                                                                       int dec=0;
        int rem=0;                                                                       int power=0;
        int i=0;
        int power = 0;                                                                   for(int i=binary.length-1;i<=0;i--){
        while(n!=0){                                                                     char bit=binary.charAt(i);
            rem=n%10;//1                                                                  if(bit=="1"){                                                     
            d=d+rem*(int) Math.pow(2,i++);//0+1*2 power(0)                                dec=dec+Math.pow(2,power);
            n=n/10;                                                                        }
        }                                                                                 power++;
        System.out.println("Decimal equivalent: " + d);                                  }
    }
}


35.------------------------------------------------------automorphic Number-----------------------------------------------------------------------------------------------
An automorphic number (also called a circular number) is a number whose square ends in the same digits as the number itself.
5² = 25 → ends with 5 →  Automorphic
6² = 36 → ends with 6 →  Automorphic
76² = 5776 → ends with 76 →  Automorphic
7² = 49 → ends with 9 → Not Automorphic

import java.util.Scanner;
public class automorphic {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int a=n*n;
        String num=String.valueOf(n);
        String square=String.valueOf(a);

        if(square.endsWith(num)){
            System.out.println("Its Automorphic");
        }
        else{
            System.out.println("Its not  Automorphic");
        }
    }
}

36..------------------------------------------------------age Calculator-----------------------------------------------------------------------------------------------


import java.time.LocalDate; //Allows you to work with dates without time (like birthdates).
import java.time.Period; //Used to calculate the difference between two dates (e.g., age).
import java.util.Scanner; //Allows the program to read user input from the console.
public class ageCalculator {
    public static void age(String age) {
        LocalDate now = LocalDate.now();
        LocalDate age_given = LocalDate.parse(age);
        //System.out.println(Period.between(age_given, now));output comes as P21Y6M18D(by default P is period)
        Period p = Period.between(age_given, now);
        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() + " months, and " + p.getDays() + " days old.");

    }
    public static void main (String args[]){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the date (YYYY-MM-DD)");
            String dob = s.nextLine();
            ageCalculator.age(dob);

        }
    }

37..------------------------------------------------------Area Circle----------------------------------------------------------------------------------------------

import java.util.*;

public class Circle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double r = s.nextDouble();

        double area = Math.PI * r * r;

        System.out.println("The area of the Circle is: " + area);

        s.close(); // Best practice to close the scanner
    }
}

38..------------------------------------------------------Quadratic Quation-----------------------------------------------------------------------------------------------

ipackage ImpPrograms;
import java.util.*;
public class SquareRoot {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        double num1=s.nextDouble();
        System.out.println("Enter the Number : ");
        double num2=s.nextDouble();
        System.out.println("Enter the Number : ");
        double num3=s.nextDouble();
        double d=0;
        d=num2*num2 - 4*num1*num3;
        double root1,root2;
        if(d>0){
            root1=(-num2+ Math.sqrt(d))/(2*num1);
            root2=(-num2-Math.sqrt(d))/(2*num1);
            System.out.println("Root1 : "+root1);
            System.out.println("Root2 : "+root2);
        }
        else if (d==0) {
            root1=root2=-num2/(2*num1);
            System.out.println("Root1 : "+root1);
            System.out.println("Root2 : "+root2);
        }
        else{
            double real =-num2/(2*num1);
            double imaginary=Math.sqrt(-d)/(2*num1);
            System.out.println("Real Root : "+real);
            System.out.println("Imaginary Root : "+imaginary);
        }
    }

} 

39.----------------Problem Statement: Find permutations in which n people can occupy r seats in a classroom.-----------------------------------------------------------
Examples:
Example 1:
Input: N = 5, r = 3
Output: 60
Explanation: To permute n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! Is 60.
Example 2:
Input: N=6,r = 4.
Output: 360
                        Permutation Formula  P(n,r)= n!/ (n-r)!
                        where r = number of items or people you want to choose and arrange
                              n = total number of items or people

​
 

  
​import java.util.Scanner;

public class Permutations {
    
    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static int permutations(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of people (n): ");
        int n = sc.nextInt();

        System.out.print("Enter number of seats (r): ");
        int r = sc.nextInt();

        if (r > n) {
            System.out.println("r cannot be greater than n.");
        } else {
            int result = permutations(n, r);
            System.out.println("Number of permutations: " + result);
        }
    }
}

40.--------------------------------------------------------------------------------------------------------------------------
  A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. 
  The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
  input :
  8  – Value of N
  [4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline
  Output:
  4 5 1 9 5 0 0 0
-->
  /*import java.util.Scanner;
public class Tcs1 {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of N :");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int temp[]=new int[n];

        int index=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                a[index++]=a[i]; // later index++; also okay
            }
        }
  while(index<n){
      a[index++]=0;
  }
        for(int i=0;i<n;i++){
            System.out.println(a[i]+ " ");
        }
    }
}*/
  //or
import java.util.Scanner;

public class Tcs1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the value of N :");
        int n = s.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements :");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int temp[] = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                temp[index] = a[i];
                index++;
            }
        }

        // Remaining elements are already zero by default, no need to explicitly set

        System.out.println("Output:");
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }

    }
}

41.--------------Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.
Note : Keep the first of the array unaltered.
Example 1:
5  —Value of N
{10, 20, 30, 40, 50}  —Element of Arr[ ]
2  —–Value of K
Output :
40 50 10 20 30
Example 2:
4  —Value of N
{10, 20, 30, 40}  —Element of Arr[]
1  —–Value of K
Output :
40 10 20 30



package TCS;
import java.util.*;
public class Tcs3 {
public static  int [] rotate(int arr[],int k) {

    int res[] = new int[arr.length];
    int n=arr.length;

    for (int i = 0; i < k; i++) {
        res[i] = arr[n- k +i];
    }
    for (int i = k; i < n; i++){
        res[i]=arr[i-k];
}

        return res;
}

    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the k");
        int k=s.nextInt();
        int result[]=Tcs3.rotate(arr,k);
       for(int i=0;i<n;i++){
           System.out.print(result[i]+" ");
       }
    }
}


when common ratio r==1:
               s_n=a*n;

When common ratio r ≠ 1:
               s_n=a*3(r^n-1)/(r-1);
Where:
      a = first term
      r = common ratio
      n = number of terms
      S_n = sum of the first n terms(n down s)











//------------Tap1 Module1

//---------Number is stronger or not

//------------find sum of GP series
//------------area of circle
//------------roots of the quadratic equation
//------------Permutations in which N people can occupy R seats

Problem Statement: Find permutations in which n people can occupy r seats in a classroom.
Examples:
Example 1:
Input: N = 5, r = 3
Output: 60
Explanation: To permute n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! Is 60.
Example 2:
Input: N=6,r = 4.
Output: 360
//--------------------Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

Examples:



//------------------------Problem statement: Given an array, we have found the number of occurrences of each element in the array.

Examples:

Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	 5  2
        15  1
Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array



-----------------------------------------------------------------------------------------------------------------------------------------------------------------
NOTE:
--->>Array:
     1.Array is an collection of homogenus element
     2.Can't directly store integers and strings in the same array .we use an Object array in Java
        Object arr[] = {10, "hello", 3.14}
        String names[] = {"Alice", "Bob", "Charlie"};
        Int a[]=new int[n];  or in a[]={2,4,5,7};
    3.  Loop through the array                    
        for (String name : names) {                  for(Interger i: a){
        System.out.println(name); }                  System.out.println(i)}
    4.To run java Program           javac array.java
                                java array
    5.a.length()

--->>String
     1.The method str.charAt(i) returns the character at index i in the string str.


     2.String.valueOf() is a static method in the String class that converts different types of values (primitives and objects) into their
     String representation.
     int i = 42;
     String s1 = String.valueOf(i); // "42"

     double d = 3.14;
     String s2 = String.valueOf(d); // "3.14"

    boolean b = true;
    String s3 = String.valueOf(b); // "true"

    char[] letters = {'J', 'a', 'v', 'a'};
    String s4 = String.valueOf(letters); // "Java"

    Object obj = new Integer(100);
    String s5 = String.valueOf(obj); // "100"


    3.parse(): parse() is used to convert a String into another data type, such as int, float, double, boolean, or even LocalDate.
      example String str = "100";
              int num = Integer.parseInt(str);
              System.out.println("Integer: " + num);  //edduparseeddu




--->>static and non static keyword in the method
     Don’t use static if the method needs to work with instance variables or objects.
     1. static in Methods
        When a method is declared as static, it means:
       -It belongs to the class and not to any specific object.
       -You can call it without creating an object.
       -It cannot directly access non-static (instance) variables or methods
             class Example {
             static void greet() {  // ✅ Static method
             System.out.println("Hello, world!");
             }
             public static void main(String[] args) {
             greet(); // ✅ Called without an object
             }
             }
     2.non static in methods
       Why Not Always Use static?
         -If a method needs to access instance variables or methods, it should NOT be static.
         -static methods cannot use this keyword because they don’t belong to an object
              class Example {
              int x = 10;  // Instance variable
              void show() {  // ❌ Cannot be static because it accesses x
              System.out.println("Value of x: " + x);
             }
             public static void main(String[] args) {
             Example obj = new Example(); // ✅ Create object
             obj.show(); // ✅ Call non-static method
             }
             }

--->>Factors of 12 : all numbers that divide 12 exactly 1,2,3,4,6
     example 2: 2,1     ✅ Yes
          4: 2,4,1   ❌ No

--->>Ignore Space Methods
     1. Character.isWhitespace(ch)
     This method checks if a character is a whitespace (including spaces, tabs, and newlines).
     2.replace(" ", "")
     String str = "Hello World";
     String noSpaces = str.replace(" ", "");  // Output: "HelloWorld"
     3.replaceAll("\\s", "")
     Removes all whitespace characters, including spaces, tabs, and newlines. 
     String str = "Hello  World \n Java";   or String str = "Hello\tWorld \nJava   Programming";
     String noSpaces = str.replaceAll("\\s", "");

--->>Why Convert a String to a char Array in Java?
    string are immutable ,when we need to modify individual characters (like changing case), we use a char[] (character array)
   -String str = "Hello";
    str.charAt(0) = 'h'; // ❌ Compilation Error (Strings are immutable)
    We need to convert the String into a char[] array to modify individual characters

  - toCharArray() converts the String into a mutable char[] array.
    We can modify characters in chars[] because arrays are mutable. 
    After modification, we convert it back to a String.
    Example:  String str = "Hello";
            char[] chars = str.toCharArray(); // ✅ Convert to char array
            chars[0] = 'h'; // ✅ Modify the first character

            String newStr = new String(chars); // ✅ Convert back to String
            System.out.println(newStr); // Output: hello

----->>LocalDate today = LocalDate.now(); //gets todays date
        LocalDate.of(2000, 1, 1);
        today.getYear();
        today.getMonth();
        today.getDayOfMonth();

------>>Math.pow
        Math.sqrt
------>> find the remainder rem=num%10; //to find last didgit
         sum,rev,count = 0
         mul,fact =1
         
         











--->>Difference Between if, while, and do-while in Java


Feature	            if Statement	                         while Loop	                               do-while Loop
Purpose	            Executes a block of code once if the     Repeats the block of code while        Executes the block of code at least once,
                    condition is true.	                     the condition is true.	            then repeats while the condition is true.
Condition Check     Checked once before execution.	     Checked before each iteration.	    Checked after each iteration.
Minimum Execution   0 or 1 time (if condition is false,      0 or more times (if the condition is   At least once (it executes once even if the
                    it doesn’t execute).	             false initially, it won’t execute)     condition is false).
Exit Control	    No looping (Executes once, then exits).  Pre-test loop (condition is checked    Post-test loop (condition is checked after
                                                             before execution).	                    execution).
Syntax	           if (condition) { ... }	             while (condition) { ... }	            do { ... } while (condition);
Use Case	   When you need to execute a block          When you need to execute a block only  When you need to execute a block at least once
                   based on a condition but not repeatedly   if the condition is true.	            before checking the condition.

---->> Differenc between parse() and String.valueOf()

Feature	                   parse()	                                                     String.valueOf()
Purpose	                   Converts String → data type	                                     Converts data type → String
Direction	           Input String → int, float, etc.	                             Input int, float, boolean → String
Type	                   Static method in wrapper classes (like Integer, Double, etc.)     Static method in String class
Exception Risk	           Throws NumberFormatException if input is invalid	             Never throws an exception
Example	                   int x = Integer.parseInt("123");	                             String s = String.valueOf(123);
