package sept23Lec;

import sept23Lec.Student;
public class LecNote {
    public static void main(String args[]) {
        int[][] matrix = new int[100][100];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
        }

        // procedural programming
        // pro:     centralized and accessible data
        // cons:    main procedure must maintain everything
        //          difficult to make data modular
        //          difficult to adapt to other applications

        // object-oriented programming
        // bundles data and methods to work with data into objects.
        // A class is a template for making objects of that type.
        // Used as abstract components in a program.

        // Abstraction
        // A class hides its implementation details.
        // Functionality is provided throught methods that the class provides.
        // implementation may be complicated, but don't need to show

        // Encapsulation
        // An object must mainain its own data.
        // Access to data is controlled/limited by the object to:
        //      protect from unexpexted changes
        //      allow the object to satisfy its contracts
        //      create an abstract interface for the data

        // inside class: (instance means each object only deal with its own data
        //  instance variables
        //  instance methods
        //  constructors

        Student s1 = new Student();
    }
}
