public class Point {

    int x;
    int y;

    public Point() {
        x = 5;
        y = 5;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {

        Point p1 = new Point();
        System.out.print("Using default constructor: ");
        p1.display();

        Point p2 = new Point(10, 20);
        System.out.print("Using parameterized constructor: ");
        p2.display();

        Point p3 = new Point(p2);
        System.out.print("Using copy constructor: ");
        p3.display();
    }
}
