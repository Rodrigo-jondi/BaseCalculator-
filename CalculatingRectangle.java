package calculatingRectangle;

public class CalculatingRectangle {
    public static void main(String[] args) {
        // Given values
        int length = 18; // meters
        int width = 7;   // meters

        // Calculations
        int area = length * width;
        int perimeter = 2 * (length + width);

        // Output
        System.out.println("Length: " + length + " meters");
        System.out.println("Width: " + width + " meters");
        System.out.println("Area: " + area + " square meters");
        System.out.println("Perimeter: " + perimeter + " meters");
    }
}