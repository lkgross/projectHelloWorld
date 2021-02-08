package com.company;

/**
 * HelloWorld -
 * A class that contains an introductory program in Java
 *
 * Starter code Laura K. Gross, laura.gross@bridgew.edu, 2/2021
 *
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
    /** main -
     * A method that is required for every Java application
     * @param args
     */
    public static void main(String[] args) // method header
    {
        /*
         * A "static method" can be thought of as a "function".
         * We can and will write other static methods.
         * We use void to mean that the method does not return a value.
         * The main method MUST "return void".
         * Here args is the name of a parameter. Its data type is String[]---
         * an array, whose elements are strings.
         *
         * Public *methods* allow external code to manipulate an object.
         * Private *methods* are used for the inner workings of an "object".
         * Keywords public and private are called access modifiers.
         */

        System.out.println("Java is a \"strongly typed\" language.");
        // We have to declare variables (by type) before using them.
        double x;
        double y;
        int a, b;
        x = 3.1;
        y = 2.7;
        a = 4;
        b = a + 3;
        // We can also do inline initialization:
        int c = 17;
        System.out.println(c);

        System.out.println();

        System.out.println("The print method does not attach a newline character " +
                "to the end of the string.");
	    System.out.print("Hello, World!");
	    // We can include a newline character (\n) explicitly:
        System.out.print("Hello, World!\n");
        // The newline character advances the cursor to the next line for subsequent printing.
        // The println method (read as "print line") attaches a newline character to the end of the string.
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.print("I just arrived from \'Tatooine\'!\n");

        System.out.println();

        System.out.println("I can calculate in Java.");
        System.out.println(7 * 2);
        // Beware of integer divides in Java!!
        System.out.println(7/2);
        System.out.println(7./2);
        System.out.println(7/2.);
        System.out.println(7./2.);
        /* For Math, we are looking within the standard Java library,
         * commonly referred to as the Java API (Application Programming Interface).
         * We don’t have to import anything into the .java file.
         */
        System.out.println(Math.sqrt(16));
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(!true);
    }
}
