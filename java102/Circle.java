public class Circle implements Shape {
    public final Point center;
    public final double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    /**
    * @return Whether point p is inside of the circle.
    */
    public boolean isInside(Point p) {
        return Point.distance(center, p) < radius;
    }

    /**
    * @return Whether point p part of/on the border of the circle.
    */
    public boolean isOn(Point p) {
        return Point.distance(center, p) == radius;
    }

    /**
    * @param x How much to translate the circle by in the + x direction.
    * @param y How much to translate the circle by in the + y direction.
    * @return The circle that results from the translation.
    */
    public Circle translate(double x, double y) {
        return new Circle(center.translateX(x).translateY(y), radius);
    }

    /**
    * @return The circle that results from scaling by k.
    */
    public Shape scale(double k) {
        return new Circle(center, radius * k);
    }

    @Override
    public String toString() {
        return "(center: " + center + "; radius: " + radius + ")";
    }

    public static Circle fromPoints(Point p1, Point p2, Point p3) {
        Point midpointp1p2 = new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
        Point midpointp2p3 = new Point((p2.x + p3.x) / 2, (p2.y + p3.y) / 2);

        double pBisectorp1p2 = -1 / ((p2.y - p1.y) / (p2.x - p1.x));
        double pBisectorp2p3 = -1 / ((p3.y - p2.y) / (p3.x - p2.x));

        double centerX = (pBisectorp1p2 * midpointp1p2.x - pBisectorp2p3 * midpointp2p3.x + midpointp2p3.y - midpointp1p2.y) / (pBisectorp1p2 - pBisectorp2p3);
        double centerY = pBisectorp1p2 * (centerX - midpointp1p2.x) + midpointp1p2.y;

        Point center = new Point(centerX, centerY);

        double radius = Point.distance(p1, center);

        return new Circle(center, radius);
    }
}
