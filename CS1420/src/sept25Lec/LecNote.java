package sept25Lec;

import jdk.jfr.Frequency;
import lab06.Fraction;

public class LecNote {
    public static void main(String args[]) {
        // object state -- the instance variable in the object

        // instance method -- the interface to intract with object data.

        // methods: create object, access state, changing state

        // getters & setters: get or set the object states

        // method to create new object
        Fraction workFinished = new Fraction(3, 4);
        Fraction theCopy = workFinished.copy();
        System.out.println(theCopy.toString());

        // stack -- store the reference of objects
        // & heap -- store the object state

        Fraction x = new Fraction(); // the value in x is a reference/address
        Fraction y = x; // copy the value of x, which is the address of
                        // object x, paste it to y, so they both point at
                        // the same object
        // both the reference of y and x point to one object

        Fraction a = new Fraction();
        Fraction b = a.copy();
        // a & b point to different object, but with the same object state

        // static & non-static/instance method
        // static -- some method that not tied to any object
        // usage: ClassName.methodName(arguments)

        // instance -- methods that must work with the object state
        // usage: objectName.methodName(arguments)

        // default methods of objects -- equals() & toString()
        // we need to override them with our own code


    }
}
