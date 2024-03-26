//1. Define a class Point with two fields x and y each of type double. Also , define a method distance(Point p1, Point  
//p2) to calculate the distance between points p1 and p2 and return the value in double. Use Math.sqrt( ) to  
//calculate the square root.  

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2) {
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        
        double distance = Point.distance(p1, p2);
        System.out.println("Distance between p1 and p2: " + distance);
    }
}
