public class Point {

    // Instance variables
    double x;
    double y;

    // Default constructor - initializes x and y to 5
    Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor - user supplied values
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor - copies an existing Point object
    Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Display method to show coordinates
    void display() {
        System.out.println("Point -> X : " + x + " | Y : " + y);
    }

    // Main method to test all constructors
    public static void main(String[] args) {

        // Test 1: Default constructor
        Point p1 = new Point();
        System.out.println("--- Default Constructor ---");
        p1.display();

        // Test 2: Parameterized constructor
        Point p2 = new Point(10.5, 20.3);
        System.out.println("\n--- Parameterized Constructor ---");
        p2.display();

        // Test 3: Copy constructor (copy of p2)
        Point p3 = new Point(p2);
        System.out.println("\n--- Copy Constructor (copy of p2) ---");
        p3.display();

        // Prove p3 is an independent copy (changing p3 won't affect p2)
        System.out.println("\n--- Modifying p3 to (99, 99) ---");
        p3.x = 99;
        p3.y = 99;
        System.out.print("p3 after change  : ");
        p3.display();
        System.out.print("p2 still intact  : ");
        p2.display();
    }
}