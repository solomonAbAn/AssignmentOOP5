package ArrayList;

import java.util.ArrayList;

public class Pair<T,P> {//generic class

	//stores a pair of elements.
	private T x;
	private P y;
	
	
	
public Pair(T m, P n) {
		x = m;
		y = n;
}

public T getX() {
	return x;
}

public void setX(T x) {
	this.x = x;
}


public P getY() {
	return y;
}

public void setY(P y) {
	this.y = y;
}
@Override
public String toString() {
return "Pair [x=" + x + ", y=" + y + "]";
}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
//			Task 1: ArrayList Basics
			System.out.println("Task1");
	//
//			1. ArrayList Operations:
//			   - Declare an ArrayList of strings named `wordList`.
			System.out.println("Declare an ArrayList of strings named `wordList`");
			ArrayList<String> wordList = new ArrayList<String>();
//			   - Add the words "apple," "banana," "orange," "grape," and "kiwi" to `wordList`.
			System.out.println("Add the words \"apple,\" \"banana,\" \"orange,\" \"grape,\" and \"kiwi\" to `wordList`.");
			wordList.add("apple");
			wordList.add("banana");
			wordList.add("orange");
			wordList.add("grape");
			wordList.add("kiwi");
			wordList.add("wordList");
			
//			   - Print the elements of `wordList`.
			System.out.println("the array: " + wordList);
			
//			2. ArrayList Manipulation:
//			   - Add "pear" at the beginning of `wordList`.
			wordList.add("pear");
//			   - Remove the third element from `wordList`.
			wordList.remove(3);
//			   - Check if the list contains the word "orange."
			System.out.print("does it contain orange? ");
			System.out.println(wordList.contains("orange"));
//			   - Print the updated `wordList`.
			System.out.println("array added pear and removed index 3: " + wordList);
			System.out.println("end of task1");
			
			
			
			//task2
			System.out.println("\nTask2");
//			   - Instantiate a `Pair` with an Integer and a String.
			System.out.println("Instantiate a `Pair` with an Integer and a String");
			Integer i = 10;
			Double d = 14.3;
//			   - Print the elements of the `Pair`.
			System.out.println("Print the elements of the `Pair`.");
			Pair<Integer, Double> obj1 = new Pair<Integer, Double>(i,d);
			
			System.out.println(obj1);
			//
//			4. Using Generic Class:
//			   - Create another `Pair` with two Double values.
			System.out.println("Create another `Pair` with two Double values.");
			Pair<Integer, Double> obj2 = new Pair<Integer, Double>(i,d);
			obj2.setX(-160);
			obj2.setY(-0.00145);
//			   - Print the elements of this new `Pair`.
			System.out.println("Print the elements of this new `Pair`.");
			System.out.println(obj2);
			System.out.println("end of task2");
			
			
			//task3
			System.out.println("\nTask3");
//			5. ArrayList with Generics:
//			   - Create an ArrayList of `Pair` instances.
			System.out.println("Create an ArrayList of `Pair` instances.");
			Double m = 45.78;
			Double n = 1.12;
			Pair<Double, Double> obj11 = new Pair<>(m, n);
			obj11.setX(45.65);
			Pair<Double, Double> obj21 = new Pair<>(m, n);
			obj21.setY(-0.00544);
			Pair<Double, Double> obj3 = new Pair<>(m, n);
			obj3.setX(78.984);
//			   - Add the Integer-String `Pair` and Double-Double `Pair` created in Task 4 to this ArrayList.
			ArrayList<String> array = new ArrayList<>();
			array.add(obj11.toString());
			array.add(obj21.toString());
			array.add(obj3.toString());

		
//			   - Print the elements of each `Pair` in the ArrayList.
			System.out.println(array);
			System.out.println("end of task3");
			
			
			//task4
			System.out.println("\nTask4");
//			6. Challenge:
	
			 
	        // Testing the printArrayList method with wordList and Pair
			System.out.println("wordlist elements");
			printAnyArrayList(wordList);
	      
			
			System.out.println("\nPair elements");
			 ArrayList<Pair<Double, Double>> pairList = new ArrayList<>();
		        pairList.add(new Pair<>(1.1, 2.2));
		        pairList.add(new Pair<>(3.3, 4.4));
		        pairList.add(new Pair<>(5.5, 6.6));
		        printAnyArrayList(pairList);
		        System.out.println("end of task4\n");
		        System.out.println("end of assignment...");
		        System.out.println("i hope you enjoyed \nhae a good day!");
			
		}
//		   - Write a method that takes an ArrayList of any type and prints its elements.
		 public static <E> void printAnyArrayList(ArrayList<E> list) {
		        System.out.println("Printing ArrayList elements:");
		        for (E element : list) {
		            System.out.println(element);
		        }
		    }

}
