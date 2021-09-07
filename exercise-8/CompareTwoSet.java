//7.Write a Java program to compare two hash set

import java.util.*;

public class CompareTwoSet {

    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<String>();

        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("D");
        set1.add("E");


        Set<String> set2 = new HashSet<String>();

        set2.add("A");
        set2.add("B");
        set2.add("C");
        set2.add("D");
        set2.add("E");

        boolean isEquals = set1.equals(set2);

        System.out.println("Is set 1 and set 2 equal ? : "+isEquals);

    }
}
/*
Output :
Is set 1 and set 2 equal ? : true
*/
Verified
