//  to create a class, object, method, and its signature

class MyClass {
    void displayMessage() {
        System.out.println("Hello, this is a method.");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(); 
        obj.displayMessage();       
    }
}

// to print your name


public class PrintName {
    public static void main(String[] args) {
        System.out.println("Lalitha");
    }
}


//Single line, multi-line, and documentation comments


/**
 * This is a documentation comment
 * Author: Lalitha
 */
public class CommentsExample {
    public static void main(String[] args) {
        // This is a single-line comment
        System.out.println("Hello");

        /*
         * This is a multi-line comment
         * Printing Welcome
         */
        System.out.println("Welcome");
    }
}

 //Define variables for different Data Types and print the 


public class DataTypesExample {
    public static void main(String[] args) {
        int age = 20;
        boolean isStudent = true;
        char grade = 'A';
        float height = 5.4f;
        double weight = 60.5;

        System.out.println(age);
        System.out.println(isStudent);
        System.out.println(grade);
        System.out.println(height);
        System.out.println(weight);
    }
}


//Local and Global variables with same name


public class ScopeExample {
    int number = 100; // global

    void display() {
        int number = 50; // local
        System.out.println("Local: " + number);
        System.out.println("Global: " + this.number);
    }

    public static void main(String[] args) {
        ScopeExample obj = new ScopeExample();
        obj.display();
    }
}


//Function to print name and call from main method


public class FunctionExample {
    static void printName() {
        System.out.println("Lalitha");
    }

    public static void main(String[] args) {
        printName();
    }
}


