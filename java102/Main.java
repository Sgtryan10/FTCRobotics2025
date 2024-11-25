import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4, 3);
        System.out.println("x: " + point.x + " y: " + point.y);

        Point xTranslation = point.translateX(3); // should be (7, 3)
        Point yTranslation = point.translateY(-7); // should be (4, -4)
        Point xyTranslation = point.translateX(-4).translateY(-3); // should be (0, 0)

        System.out.println("x transl: (" + xTranslation.x + ", " + xTranslation.y + ")");
        System.out.println("y transl: (" + yTranslation.x + ", " + yTranslation.y + ")");
        System.out.println("xy transl: (" + xyTranslation.x + ", " + xyTranslation.y + ")");

        System.out.println("x transl: " + xTranslation);
        System.out.println("y transl: " + yTranslation);
        System.out.println("xy transl: " + xyTranslation);

        Point a = new Point(0, 3);
        Point b = new Point(3, 3);
        System.out.println("\nx: " + a.x + " y: " + a.y);
        System.out.println("x: " + b.x + " y: " + b.y);
        System.out.println("Distance between the two points: " + Point.distance(a, b) + "\n");

        Point[] points = {new Point(1, 5), new Point(2, 4), new Point(3, 3)};
        for(int i = 0; i < points.length; i++) {
            System.out.println("x: " + points[i].x + " y: " + points[i].y);
        }
        Point centerOfMass = Point.centerOfMass(points);
        System.out.println("Center of Mass for the set of points: " + centerOfMass);

        Point pointAngle = new Point(1, 1);
        System.out.println("\nx: " + pointAngle.x + " y: " + pointAngle.y);
        System.out.println("Angle between the point and the positive x axis: " + pointAngle.angle() + "\u00B0");

        Point pointRotate = new Point(2, 2);
        System.out.println("\nx: " + pointRotate.x + " y: " + pointRotate.y);
        Point pointRotate90 = pointRotate.rotate90();
        System.out.println("Point rotated by 90 degrees: " + pointRotate90);

        double theta = 180.0;
        Point pointRotateTheta = pointRotate.rotate(theta);
        System.out.println("Point rotated by " + theta + " degrees: " + pointRotateTheta);

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("World");
        System.out.println("\n" + arr);
        arr.set(0, "Goodbye");
        System.out.println(arr);

        ArrayList<Boolean> conditions = new ArrayList<>();
        conditions.add(true);
        conditions.add(arr.get(0) == "Hello");
        conditions.add(conditions.get(0) || conditions.get(1));
        System.out.println("\n" + conditions);

        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            intArr.add(0);
        }
        System.out.println(intArr.size());
        System.out.println(intArr.get(32));

        Grid<Integer> grid = new Grid<>(5, 0);
        grid.set(2, 2, 4);
        System.out.println("\n" + grid);

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println(arrayToString(intArray));

        Grid<Integer> grid2 = new Grid<>(5, 0);
        grid2.set(0, 0, 2);
        grid2.set(2, 2, 4);
        grid2.set(4, 4, 6);
        System.out.println("\n" + grid2);
        ArrayList<Integer> gridDiag = grid2.diagonal();
        System.out.println("Diagonal: " + gridDiag);

        System.out.println("\nBiggest side length of any grid made so far: " + Grid.maxSideLength());
    }

    static <T> String arrayToString(T[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        return str + arr[arr.length - 1] + "]";
    }
}
