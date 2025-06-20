package ExceptionHandling.java;
import java.io.*;
public class CheckUnchecked {

	public static void main(String[] args) throws IOException {
		
	/*	  FileReader file = new FileReader("test.txt");  // File may not exist
		  BufferedReader fileInput = new BufferedReader(file);
		  System.out.println(fileInput.readLine());
		  fileInput.close(); */
		
		
		        try {
		            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
		            System.out.println(reader.readLine());
		            reader.close();
		        } catch (IOException e) {
		            System.out.println("Error: " + e.getMessage());
		        }
		  }
}

/* Unchecked Exceptions:
        Are not checked at compile time.
        Belong to RuntimeException and its subclasses.
        Examples: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.

Do you need to use throws or try-catch for unchecked exceptions?
No — it's optional!
Unlike checked exceptions like IOException, you are not required to:
Use throws in the method signature, or Use a try-catch block */


