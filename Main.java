// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main{
    public static void main(String[] args) {



        Point one = new Point(5, 27, 81);
        Point two = new Point(3, 20, 89);
        Point three = new Point(1, 18, 72);
        Point four = new Point (1, 18, 77);
        Point five = new Point (2, 15, 86);


        Point[] points = new Point[5];
        points[0] = one;
        points[1] = two;
        points[2] = three;
        points[3] = four;
        points[4] = five;

        Point[] points1 = new Point[3];
        points1[0] = new Point(2, 1, 4);
        points1[1] = new Point(3, 0, 2);
        points1[2] = new Point(10, 4, 1);

        Point[] points2 = new Point[6];
        points2[0] = new Point(6, 43.8, 120.6);
        points2[1] = new Point(10, 47.8, 120.7);
        points2[2] = new Point(2,46.9, 110.4);
        points2[3] = new Point(2, 43.1, 107.3);
        points2[4] = new Point(8, 39.3, 111.1);
        points2[5] = new Point(6, 38.8, 116.4);

        Point center = Point.centerOfGravity(points);
        System.out.println(center);
        Point iteration1 = Point.iteration(points, center);
        System.out.println(iteration1);
        Point iteration2 = Point.iteration(points, iteration1);
        System.out.println(iteration2);
        Point iteration3 = Point.iteration(points, iteration2);
        System.out.println(iteration3);
        System.out.println((center.x - iteration1.x) + " " + (center.y - iteration1.y));
        System.out.println(iteration1.x - iteration2.x + " "+ (iteration1.y - iteration2.y));
        System.out.println(iteration2.x - iteration3.x + " "+ (iteration2.y - iteration3.y));

//        System.out.println(Point.centerOfGravity(points));
//        Point newPoint = Point.iteration(points, Point.centerOfGravity(points));
//        System.out.println(newPoint);
//        Point point2 = Point.iteration(points, newPoint);
//        System.out.println(point2);
//        Point point3 = Point.iteration(points, point2);
//        System.out.println(point3);
    }
}