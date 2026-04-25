public class Rectangle {

    // Data fields with default values
    double width = 1;
    double height = 1;

    // No-argument constructor
    Rectangle() {
        // uses default values width=1, height=1
    }

    // Constructor with parameters
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    double getPerimeter() {
        return 2 * (width + height);
    }

    // Main method to test the class
    public static void main(String[] args) {

        // Using no-argument constructor (default 1x1)
        Rectangle r1 = new Rectangle();
        System.out.println("--- Rectangle 1 (default) ---");
        System.out.println("Width     : " + r1.width);
        System.out.println("Height    : " + r1.height);
        System.out.println("Area      : " + r1.getArea());
        System.out.println("Perimeter : " + r1.getPerimeter());

        // Using parameterized constructor
        Rectangle r2 = new Rectangle(5.0, 3.0);
        System.out.println("\n--- Rectangle 2 (5 x 3) ---");
        System.out.println("Width     : " + r2.width);
        System.out.println("Height    : " + r2.height);
        System.out.println("Area      : " + r2.getArea());
        System.out.println("Perimeter : " + r2.getPerimeter());
    }
}