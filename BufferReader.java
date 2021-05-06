// Java program to demonstrate BufferedReader
import java.io.BufferedReader ;
import java.io.IOException ;
import java.io.InputStreamReader ;
public class BufferReader {
public static void main (String[ ] args) throws IOException
{

// Enter data using BufferReader
BufferedReader reader = new BufferedReader (new InputStreamReader(System . in)) ;
System.out.print( "Enter your name :") ;
// Reading data using readLine
String name = reader . readLine( ) ;
// Printing the read line
System.out.println( "You Entered :" +name ) ;

} }


/*output

Enter your name :Meghna
You Entered :Meghna

*/