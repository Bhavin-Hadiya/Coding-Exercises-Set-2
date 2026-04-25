public class Rectangle1 {

    // Data fields
    double width;
    double height;

    // No-argument constructor
    Rectangle() {
        width  = 1;
        height = 1;
    }

    // Parameterized constructor
    Rectangle(double width, double height) {
        this.width  = width;
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

    // Method to display rectangle details
    void display(String label) {
        System.out.println("--- " + label + " ---");
        System.out.println("Width     : " + width);
        System.out.println("Height    : " + height);
        System.out.println("Area      : " + getArea());
        System.out.println("Perimeter : " + getPerimeter());
    }

    // Main method
    public static void main(String[] args) {

        // Create two Rectangle objects
        Rectangle r1 = new Rectangle(4.0, 40.0);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        // Display details of both rectangles
        r1.display("Rectangle 1 (4 x 40)");
        System.out.println();
        r2.display("Rectangle 2 (3.5 x 35.9)");

        // Compare areas and print which is larger
        System.out.println("\n--- Area Comparison ---");

        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has a larger area  : " + r1.getArea());

        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("Rectangle 2 has a larger area  : " + r2.getArea());

        } else {
            System.out.println("Both rectangles have equal area : " + r1.getArea());
        }
    }
}