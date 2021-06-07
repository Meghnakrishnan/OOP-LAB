/*
4. Write a program to illustrate the following String manipulation
methods.
1. Create new strings using new.
2. Getting String length
3. String Concatenation
4. Character extraction
5. String Comparison
6. Searching substrings
7. Modifying a string
8. Data conversion using valueOf()
*/


public class StringManipulation{
	public static void main(String[] args){
            System.out.println("------creation of string-----");
	    char arr1[]={'a','p','p','l','e'};
            String strsample1=new String(arr1);
            System.out.println("Created from char[] using new String : "+ strsample1);
            byte ascii[]={65,66,67,68,69};
            String strsample2=new String(ascii);
            System.out.println("Created from byte[]  : "+ strsample2);

            System.out.println("\n-----Getting String length-----");
            System.out.print("Using length() : length of "+strsample1 +" is " + strsample1.length());

            System.out.println("\n-----String Concatenation-----");
            String strsample3=strsample1.concat(strsample2);
            System.out.println("Using concat() : "+strsample3);
            String strsample4=strsample1+strsample2;
            System.out.println("Using + operator : "+strsample4);

            System.out.println("\n-----Character extraction-----");
            System.out.println("Using charAt() : Character at 4th posintion in "+ strsample4 +" is "+ strsample4.charAt(4));
            System.out.println("Using getChars() ");
            char buf [] =new char[2];
            strsample4.getChars(1,3,buf,0);
            System.out.println("characters between 2nd and 4th position of "+strsample4+ " are "+ new String(buf));
    
            System.out.println("\n-----String Comparison-----");
            String s1="Hello";
            String s2="Hello";
            String s3="Good morning";
            String s4="HELLO";
            System.out.println("Using equals() : check for "+s1+" equals "+s2+" :"+ s1.equals(s2));
            System.out.println("Using equals() : check for "+s1+" equals "+s4+" :"+ s1.equals(s4));
            System.out.println("Using equalsIgnoreCase() : check for "+s1+" equals "+s4+" :"+ s1.equalsIgnoreCase(s4));
            System.out.println(s1 + " compareTo() " + s2 + " : " + s1.compareTo(s2));
	    System.out.println(s1 + " compareToIgnoreCase " + s2 + " : " + s1.compareToIgnoreCase(s2));
	    System.out.println(s3+" starts with Good : "+s3.startsWith("Good"));
	    System.out.println(s3+" ends with Good : "+s3.endsWith("Good"));

	    System.out.println("\n-----------Search substring---------");
	    System.out.println("Index of Good in "+s3+" is "+s3.indexOf("Good"));

            System.out.println("\n--------Modify String--------------");
	    System.out.println("substring of "+s3+" is "+s3.substring(10));
	    System.out.println("Result of replaced string : "+s3.replace("morning","evening"));

	    System.out.println("\n---------------Using valueOf()---------------");
	    float b=12.2f;
	    System.out.println(b+" is converted into "+String.valueOf(b));  //float value is converted into string 
            

}
} 

/* OUTPUT
------creation of string-----
Created from char[] using new String : apple
Created from byte[]  : ABCDE

-----Getting String length-----
Using length() : length of apple is 5
-----String Concatenation-----
Using concat() : appleABCDE
Using + operator : appleABCDE

-----Character extraction-----
Using charAt() : Character at 4th posintion in appleABCDE is e
Using getChars()
characters between 2nd and 4th position of appleABCDE are pp

-----String Comparison-----
Using equals() : check for Hello equals Hello :true
Using equals() : check for Hello equals HELLO :false
Using equalsIgnoreCase() : check for Hello equals HELLO :true
Hello compareTo() Hello : 0
Hello compareToIgnoreCase Hello : 0
Good morning starts with Good : true
Good morning ends with Good : false

-----------Search substring---------
Index of Good in Good morning is 0

--------Modify String--------------
substring of Good morning is ng
Result of replaced string : Good evening

---------------Using valueOf()---------------
12.2 is converted into 12.2

*/