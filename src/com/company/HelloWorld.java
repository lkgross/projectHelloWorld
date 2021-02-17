package com.company;
import java.util.Random;

/**
 * HelloWorld -
 * A class that contains an introductory program in Java
 * <p>
 * Starter code Laura K. Gross, laura.gross@bridgew.edu, 2/2021
 * <p>
 * Completed by: [student name], [student email], [date of completion]
 */
// This is a single-line comment.

/*
 * This is a multi-line comment.
 * At the top is a documentation comment.
 * Documentation comments are good for describing classes and methods.
 */

/*
 * A Java program needs to have at least one class definition.
 * A .java file can have many classes but only one public class.
 */

/* The class name must match the file name (before the .java).
 * To rename the class (and accordingly the file), right click on the
 * .java file in the project files, and use refactor -> rename.
 */
public class HelloWorld // class header
{
    /* A static constant can be declared and assigned a value at
     * the top of the body of the class and be accessed by all
     * the static methods.
     * (Alternatively a static constant can be defined in a single static method
     * if it is only needed in a single static method.)
     * Using final will make the compiler complain if you try to change the value.
     * Constants are typically named with capital letters.
     */
    public static final double MI_IN_ONE_KM = 0.621371;

    /**
     * main -
     * A method that is required for every Java application
     *
     * @param args
     */
    public static void main(String[] args) // method header
    {
        /*
         * A "static method" can be thought of as a "function".
         * We use void to mean that the method does not return a value.
         * The main method MUST "return void".
         * Here args is the name of a parameter. Its data type is String[]---
         * an array, whose elements are strings.
         *
         * Public *methods* allow external code to manipulate an object.
         * Private *methods* are used for the inner workings of an object.
         * Keywords public and private are called access modifiers.
         */

        // Make calls to the static method printExperiments. Print the returned values.
        System.out.println(printExperiments("Hello", "Jupiter"));
        System.out.println(printExperiments("Greetings", "Venus"));
        System.out.println(printExperiments("Hola", "Mars"));
        System.out.println(printExperiments("Salutations", "Uranus"));
        System.out.println();
        computingWithTypes(); // Call the static method.
        System.out.println();
        calculation(); // Call the static method.
        System.out.println();
        System.out.println("5 km is " + kmToMiles(5) + " miles.");
        System.out.println("3 miles is " + milesToKm(3) + " km.");
    }

    /**
     * printExperiments -
     * A method to try out print, println, and escape characters like \n
     * @param greeting
     * @param planet
     * @return
     */
    public static String printExperiments(String greeting, String planet) {
        System.out.println("The print method does not attach a newline character " +
                "to the end of the string.");
        System.out.print(greeting + planet);
        // We can include a newline character (\n) explicitly:
        System.out.print("Hello, World!\n");
        // The newline character advances the cursor to the next line for subsequent printing.
        // The println method (read as "print line") attaches a newline character to the end of the string.
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println();
        // Another escape character is \'.
        System.out.print("I just arrived from \'Tatooine\'!\n");
        return "Tatooine";
    }

    /**
     * computingWithTypes -
     * A method for variable declaration and assignment
     */
    public static void computingWithTypes() {
        System.out.println("Java is a \"strongly typed\" language.");
        // We have to declare variables (by type) before using them.
        double x;
        double y;
        int a, b; // two variables of the same type declared at once
        x = 3.1;
        y = 2.7;
        a = 4;
        b = a + 3;
        // We can also do inline initialization:
        int c = 17;
        String numberString = "15";
        // Do type conversion
        System.out.println((double) c); // from int to double
        System.out.println("Convert \"15\" to a double:");
        System.out.println(Double.parseDouble("15")); // from String to double
        System.out.println("Check whether numberString as an integer is " +
                "greater than 2:");
        System.out.println(Integer.parseInt(numberString) > 2); // from String to int

        // Short form of the inline initialization of a String:
        String name = "Gross";
        // Long form of the inline initialization of a String:
        String name2 = new String("De la Fuente");
        String name3 = new String("Gross");
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        // Use the String method equals to compare Strings.
        System.out.println(!name.equals(name2));
        System.out.println(name.equals(name3)); // correctly evaluates to true
        // Using == instead CAN GIVE WRONG RESULTS!!
        System.out.println(name == name3); // erroneously gives false!!
        return; // optional statement when return type is void
    }

    /**
     * calculation -
     * A method for operations on ints, doubles, booleans, Strings, and chars
     */
    public static void calculation() {
        System.out.println("I can calculate in Java.");
        System.out.println(7 * 2);
        // Beware of integer divides in Java!! Information is generally lost.
        System.out.println(7 / 2);
        // These are floating point calculations:
        System.out.println(7. / 2);
        System.out.println(7 / 2.);
        System.out.println(7. / 2.);
        /* For Math, we are looking within the standard Java library,
         * commonly referred to as the Java API (Application Programming Interface).
         * We don’t have to import anything into the .java file.
         */
        System.out.println(Math.sqrt(16));
        System.out.println(true && false); // and
        System.out.println(true || false); // or
        System.out.println(!true); // not

        System.out.println("s");
        System.out.println("t");
        System.out.println("s" + "t"); // concatenates two Strings

        System.out.println('s');
        System.out.println('t');
        System.out.println('s' + 't'); // adds the values for the two characters in Unicode

        System.out.println(14 % 12); // the mod operator gives the remainder (here 2)
        // Remember how to use comparison operators.
        System.out.println(3 == 2);
        System.out.println(3 != 2);

        // Do inline initialization of a Random object.
        Random rand = new Random();
        // Simulate the roll of a six-sided die.
        System.out.println("Your die roll is:");
        // Call the nextInt method on the Random object rand.
        System.out.println(rand.nextInt(6) + 1);
    }

    public static double kmToMiles(double km){
        return km * MI_IN_ONE_KM;
    }

    public static double milesToKm(double miles){
        return miles / MI_IN_ONE_KM;
    }
}