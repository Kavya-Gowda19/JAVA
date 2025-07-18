package ComparableAndComparator;
/*

 //Example 1 comparing based on last digit
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class demo {

    public static void main(String args[]){
        Comparator<Integer> com = new Comparator<Integer>() {
        public int  compare(Integer i,Integer j) {
            if(i%10 > j%10) //taking last digit
                return 1;//sort
            else
                return -1;//it wil not sort
        }
        };

        List<Integer> nums=new ArrayList<>();
        nums.add(39);
        nums.add(43);
        nums.add(56);
        nums.add(21);
        nums.add(75);
        Collections.sort(nums,com);

        System.out.println(nums);

    }
}*/

//Example comparing base on age

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;

    public Student(int age,String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Comparators{
    public static void main(String args[]){

        Comparator<Student> com=new Comparator<Student>(){
            public int compare(Student i,Student j){
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };
        List<Student> sud=new ArrayList<>();
        sud.add(new Student(21,"kavya"));
        sud.add(new Student(31,"navya"));
        sud.add(new Student(51,"bhavya"));
        sud.add(new Student(11,"janu"));
        sud.add(new Student(81,"ananya"));
        sud.add(new Student(01,"spoorti"));

        Collections.sort(sud, com);
        for(Student s:sud){
            System.out.println(s);
        }

    }
}
