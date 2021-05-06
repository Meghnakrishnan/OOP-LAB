class Examples{
       public static void main(String args[]){
  
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        String txte = "Hello World";
        System.out.println(txte.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(txte.toLowerCase()); // Outputs "hello world"
        String txtee = "Please locate where 'locate' occurs!";
        System.out.println(txtee.indexOf("locate"));
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));
        String txta = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txta);
        String txtb = "It\'s alright.";
        System.out.println(txtb);
        String txtc = "The character \\ is called backslash.";
        System.out.println(txtc);
        
       }
}



/*output

The length of the txt string is: 26
HELLO WORLD
hello world
7
John Doe
JohnDoe
We are the so-called "Vikings" from the north.
It's alright.
The character \ is called backslash.


*/