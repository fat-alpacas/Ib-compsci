public class rectangleprogram {
    public static void main(String[] args) {
        point origin_one = new point(23, 94);
        rectangle rect_one = new rectangle(origin_one, 100, 200);
        rectangle rect_two = new rectangle(50, 100);

        // Display rect_one's width, height, and area
        System.out.println("Width of rect_one: " + rect_one.getWidth());
        System.out.println("Height of rect_one: " + rect_one.getHeight());
        System.out.println("Area of rect_one: " + rect_one.area());

        // Set rect_two's position as rect_one's origin
        rect_two.setOrigin(origin_one);

        // Display rect_two's position
        System.out.println("X position of rect_two: " + rect_two.getOrigin().getX());
        System.out.println("Y position of rect_two: " + rect_two.getOrigin().getY());

        // Move rect_two and display its new position
        rect_two.move(50, 50);
        System.out.println("X position of rect_two: " + rect_two.getOrigin().getX());
        System.out.println("Y position of rect_two: " + rect_two.getOrigin().getY());
    }
}
