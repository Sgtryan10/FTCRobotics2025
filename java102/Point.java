public class Point {
    public final double x;
    public final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point translateX(double t) {
        return new Point(x + t, y);
    }

    public Point translateY(double t) {
        return new Point(x, y + t);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    public static Point centerOfMass(Point[] points) {
        double sumX, sumY, avgX, avgY;
        sumX = sumY = avgX = avgY = 0;

        for (int i = 0; i < points.length; i++) {
            sumX += points[i].x;
            sumY += points[i].y;
        }

        avgX = avgX / points.length;
        avgY = avgY / points.length;

        return new Point(avgX, avgY);
    }

    public double angle() {
        double angleRad, angleDeg;
        angleRad = Math.atan2(y, x);
        angleDeg = Math.toDegrees(angleRad);

        return angleDeg;
    }

    public Point rotate90() {
        double x90 = -y, y90 = x;

        return new Point(x90, y90);
    }

    public Point rotate(double theta) {
        double xRotate = 0, yRotate = 0, thetaRad = Math.toRadians(theta);

        xRotate = (x * Math.cos(thetaRad) - y * Math.sin(thetaRad));
        yRotate = (x * Math.sin(thetaRad) + y * Math.cos(thetaRad));
        return new Point(xRotate, yRotate);
    }
}
