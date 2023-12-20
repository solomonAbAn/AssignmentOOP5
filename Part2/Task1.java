package Part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) throws FileNotFoundException {
		// Read File:
		// - Create a Java program that reads a text file named "input.txt."
System.out.println("Task1: Read from File");
		Scanner sc = null;
		String s;
		int id;
		int linesRead = 0;

		
		
		try {
			System.out.println("Q1:");
			System.out.println("creating file called input...");
			sc = new Scanner(new FileInputStream("input.txt"));
			System.out.println("done");
		} catch (FileNotFoundException e) {
			System.out.println("The file doesn't exist.");
			System.exit(0);
		}

		System.out.println("The info that I read...");

		while (linesRead < 1 && sc.hasNext()) {
		    // Check if there is a next integer
		    if (sc.hasNextInt()) {
		        id = sc.nextInt();
		        System.out.println("id: " + id);
		        linesRead++;
		    }

		    // Check if there is a next line
		    if (sc.hasNextLine()) {
		        s = sc.nextLine();
		        System.out.println("name: " + s);
		        linesRead++;
		    }
		}
		System.out.println("end of Q1");
		sc.close();
		
		
		
		/*2. Character Count:
			   - Implement a method that takes a String as input and counts the total 
			   number of characters (excluding whitespaces).*/
			   
		System.out.println("\nQ2:");
		Scanner kb = new Scanner(System.in);
		System.out.println("give me a string: ");
		s = kb.nextLine();
		System.out.println("thanks!");
		System.out.println("claculating number of characters without spaces...");
		s = s.replaceAll("\\s", "");
		System.out.println("done..");
		System.out.println("number of letters: " + s.length());
		
		
		
		
		/*- Apply this method to each line read from the file and print the character 
		   count for each line.*/
		System.out.println("using this method to count the number of letter in each line");
		try {
			sc = new Scanner(new FileInputStream("input.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("The file doesn't exist.");
			System.exit(0);
		}

		System.out.println("The info that I read...");

		while (linesRead < 3 && (sc.hasNextLine() || sc.hasNextInt())) {
			// Check if there is a next line
			sc.hasNextLine();
			s = sc.nextLine();
			System.out.println(s);
			s = s.replaceAll("\\s", "");
			System.out.println("number of characters: " + s.length());
			System.out.println("done");
			
		}

		sc.close();
		
		System.out.println("end of Q2...");
		System.out.println("end of Task1...");
		
		
		//task2
		System.out.println("\nTask2: write to file");
		System.out.println("Q3:");
		
		/*Task 2: Write to File

		3. Write to File:
		   - Create a new text file named "output.txt."
		   - Write the following lines to the file:
		     - "Hello, this is line 1."
		     - "Java File I/O is interesting!"
		     - "End of the assignment."*/
		PrintWriter pw = null;
		System.out.println("creatin new file called output...");
		pw = new PrintWriter(new FileOutputStream("output.txt"));
		System.out.println("done");
		try {
			sc = new Scanner(new FileInputStream("output.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("The file doesn't exist.");
			System.exit(0);
		}
		System.out.println("printing output...");
		pw.println("Hello, this is line 1.");
		pw.println("Java File I/O is interesting!");
		pw.println("End of the assignment.");
		pw.close();
		System.out.println("done");
		System.out.println("reading output...");
		while(sc.hasNextLine()) {
		s = sc.nextLine();
		System.out.println(s);
		
		
		}
		System.out.println("done");
		sc.close();
		System.out.println("end of Q3...");
		System.out.println("end of Task2");
		
		//task3
		System.out.println("\nTask3: append to file");
		System.out.println("Q4:");
		/*Task 3: Append to File

4. Append to File:
   - Open the "output.txt" file created in Task 3 in append mode.
   - Add the following lines to the end of the file:
     - "Appending new line."
     - "File I/O without buffers."
*/
		 try (PrintWriter pw1 = new PrintWriter(new FileOutputStream("output.txt", true))) {
	            // Writing data in append mode
			 System.out.println("appending to output two lines...");
	            pw1.println("Appending new line.");
	            pw1.println("File I/O without buffers.");
	            pw1.close();
	            System.out.println("done");
	        } catch (IOException e) {
	            System.out.println("Error writing to the file.");
	            System.exit(0);
	        }
		 
		
		 try (Scanner sc1 = new Scanner(new FileInputStream("output.txt"))) {
	            System.out.println("Reading output...");
	            while (sc1.hasNextLine()) {
	                String s1 = sc1.nextLine();
	                System.out.println(s1);
	            }
	            sc1.close();
	            System.out.println("done");
	        } catch (IOException e) {
	            System.out.println("Error reading from the file.");
	        }
		 
		 
		 
		 System.out.println("end of Q4...");
		 System.out.println("end of Task3");
		 //task4
		 System.out.println("\nTask 4: challenge");
		 System.out.println("Q5:");
		 /*Task 4: Challenge

5. Challenge:
   
   - Test this method by writing a custom message to a new file named "custom.txt."

*/
		
		 String name, lastName;
		 
		 System.out.println("give me your name: ");
		 name = kb.nextLine();
		 System.out.println("give me your last name: ");
		 lastName = kb.nextLine();		 
		 
		 fileWriter(name, lastName);
		 System.out.println("end of Task4");
		 System.out.println("\nend of assignment... \nthank you for participating \nhave a good day!");
		 kb.close();
		
	}
	/*- Implement a method that takes a filename and a String as input and writes 
	   the String to the specified file without using buffers.*/
	   
	public static void  fileWriter(String name, String lastName) {
			try {
				System.out.println("writing the information on the file called 'custom'...");
				PrintWriter pw = new PrintWriter(new FileOutputStream("custom.txt"));
				pw.println(name);
				pw.println(lastName);
				System.out.println("done writing...");
				pw.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("error tring to write on the file");
			}
			
			
			try (Scanner sc2 = new Scanner(new FileInputStream("custom.txt"))) {
	            System.out.println("Reading output...");
	            while (sc2.hasNextLine()) {
	                name = sc2.nextLine();
	                System.out.println(name);
	                lastName = sc2.nextLine();
	                System.out.println(lastName);
	                System.out.println("end of reading..");
	            }
	            sc2.close();
	        } catch (IOException e) {
	            System.out.println("Error reading from the file.");
	            e.printStackTrace();
	        }
		
			
	}
	 
}
