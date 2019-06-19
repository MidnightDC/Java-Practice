/* This is a simple program that prints

a string to the command line*/

//Variable declaration
public class MyClass {
  public static void main(String[] args) {

  String name = "\\\"David\"\\";
  String last = "Caron";
  String find = "This string is used to find the world 'find'";
  int total = last.length() + name.length();

  int age = 21;
  float seconds = 10.83f;
  char firstLTR = 'D';
  int a = 34, b = 26; //Can use the same line to declare variables of same type

//Variables for Widerning and Narrowing Casting
  int testint = 10;
  double varconv = testint;

  double testdub = 10.5423;
  int intconv = (int) testdub;

//Variables for Operators Practice
  double x = 11.54;
  double y = 100;
  double z = -123.23;

  double div0 = y % x;
  double div1 = div0 / 10;
  double smaller = Math.random(); // Practice for Java Math

  int narrow = (int) div0; // practicing narrowing again
  float smallest = (float) smaller;

//Practicing math functions and Variables

  System.out.println(Math.max(age,total)); // find the highest of the 2 variables
  System.out.println(Math.min(age,total)); // find the lowest of the 2 variables
  System.out.println(Math.sqrt(age + total)); //find the square root of a single int or addition or substration etc
  System.out.println(Math.abs(z)); //returning absolute value of a number
  System.out.println(Math.random()); //randomize a number between 0 and 1
  System.out.println("\r" + smallest);

//Terminal printing practice with Variables
    System.out.println("Hello World!, my name is " + name);
    System.out.println("\tI am " + age);
    System.out.println("\tTest param for float " + seconds);
    System.out.println("\tFirst letter of my name is " + firstLTR);
    System.out.println("\tLength of first name is: " + name.length());
    System.out.println("\tLength of last name is: " + last.length());
    System.out.println("\tTotal length of my name is: " + total);
    System.out.println(find.indexOf("find")); //find location of a string within a string
    System.out.println(name.concat("last")); //concatenate 2 strings together
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println(name + " " + last);
    System.out.println(a + b);
    System.out.println("\r");
    System.out.println("Swag");

//Terminal printing practice for Casting
    System.out.println("Before widening = " + testint);
    System.out.println("After widening = " + varconv);
    System.out.println("Before narrowing = " + testdub);
    System.out.println("After narrowing = " + intconv);
    System.out.println("\r");

//Terminal printing practive for Operators
    System.out.println(div0);
    System.out.println(div1);
    System.out.println(narrow);

//Terminal printing practice for Boolean
    double random1 = Math.random();
    double random2 = Math.random();

    System.out.println("random1 digit is: " + random1);
    System.out.println("random2 digit is: " + random2);
    System.out.println("\n\nrandom1 bigger than random2?" + " " + (random1 > random2));
    System.out.println("random1 smaller than random2?" + " " + (random1 < random2));
    System.out.println("random1 equal random2?" + " " + (random1 == random2));

	}

}
