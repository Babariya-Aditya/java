package assignment;

class Point {
    double x, y;


    public Point() {
    }


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public void Quadrant(Point point) {
        if (point.x == 0 && point.y == 0) {
            System.out.println("Point is on the origin");
        } else if (point.x == 0) {
            System.out.println("Point is on the Y-axis");
        } else if (point.y == 0) {
            System.out.println("Point is on the X-axis");
        } else if (point.x > 0 && point.y > 0) {
            System.out.println("Point is in the First quadrant");
        } else if (point.x < 0 && point.y > 0) {
            System.out.println("Point is in the Second quadrant");
        } else if (point.x < 0 && point.y < 0) {
            System.out.println("Point is in the Third quadrant");
        } else if (point.x > 0 && point.y < 0) {
            System.out.println("Point is in the Fourth quadrant");
        }
    }


    public Point Center(Point point1, Point point2) {
        Point center = new Point((point1.x + point2.x) / 2, (point1.y + point2.y) / 2);
        return center;
    }


    public double Distance(Point point1, Point point2) {
        double distance = Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
        return distance;
    }


    public int StraightLine(Point point1, Point point2, Point point3) {
        double slope1 = (point2.y - point1.y) / (point2.x - point1.x);
        double slope2 = (point3.y - point2.y) / (point3.x - point2.x);
        if (slope1 == slope2) {
            return 1;
        } else {
            return 0;
        }
    }

    // Override toString method
    @Override
    public String toString() {
        return "Point: (" + x + ", " + y + ")";
    }
}

public class L2 {
    public static void main(String[] args) {
        Point p1 = new Point(1, 7);
        Point p2 = new Point(3, 1);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(6, 1);

        p1.Quadrant(p1);
        p2.Quadrant(p2);
 }
}

