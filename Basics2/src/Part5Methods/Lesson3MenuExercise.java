package Part5Methods;
/*
 *Options:
 *1. View database
 *2. Add new item
 *3. Delete item
 *4. Quit program

 *Store the menu options in an array
 *The array should be the instance variable of a class Menu
 *To output the menu, call a method called "display()".

 *Steps.

 *Create a class with a main method as usual
 *Create a class called menu
 *Give the menu class an instance variable, which is an array of strings containing the options: "View the database", "Add new item", etc
 *Give the menu class a method called display()
 *In your main method, create an object of the type menu, then call its display() method
 *Implement the code in display() using a loop, that prints the menu
 
 *EXTRAS: Not part of exercise
 *Added scanner and display message depending on user input
 *If user enters 4, loop will break and program will close.
 */



public class Lesson3MenuExercise {
	
	public static void main(String[] args) {
		
		Lesson3Point1Class menu = new Lesson3Point1Class();
		menu.display();
	}

}
