Operators


//arithmetic operators 

public class ArithmeticOperators {
    static void calculate(int a, int b) {
        System.out.println("Add: " + (a + b));
        System.out.println("Subtract: " + (a - b));
        System.out.println("Multiply: " + (a * b));
        System.out.println("Divide: " + (a / b));
    }

    public static void main(String[] args) {
        calculate(10, 5);
    }
}


//Method for increment and decrement 

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Original: " + a);
        a++;
        System.out.println("Incremented: " + a);
        a--;
        System.out.println("Decremented: " + a);
    }
}


// Equal and not equal operators


public class EqualityCheck {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println(a == b); // false
        System.out.println(a != b); // true
    }
}


// Find if two numbers are equal or not


public class NumberCompare {
    public static void main(String[] args) {
        int x = 20, y = 20;

        if (x == y)
            System.out.println("Both numbers are equal.");
        else
            System.out.println("Numbers are not equal.");
    }
}


// Logical AND, OR, NOT operators

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true, b = false;

        System.out.println("AND: " + (a && b));
        System.out.println("OR: " + (a || b));
        System.out.println("NOT a: " + (!a));
    }
}


// Relational operators 


public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a > b);
        System.out.println(a >= b);
    }
}


//Print smaller and larger number


public class MinMax {
    public static void main(String[] args) {
        int a = 8, b = 15;

        if (a > b)
            System.out.println("Larger: " + a + ", Smaller: " + b);
        else
            System.out.println("Larger: " + b + ", Smaller: " + a);
    }
}