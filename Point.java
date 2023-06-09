public class Point {
    int weight;
    double x;
    double y;

    public Point(int weight, double x, double y) {
        this.x = x;
        this.y = y;
        this.weight = weight;
    }

    public static Point centerOfGravity(Point[] points) {
        double upx = 0;
        double upy = 0;
        double downx = 0;
        double downy = 0;
        for(Point p : points) {
            upx = upx + (p.weight * p.x);
            upy = upy + (p.weight * p.y);
            downx = downx + p.weight;
            downy = downy + p.weight;
        }
        double x = upx / downx;
        double y = upy / downy;
        return new Point(0, x, y);
    }

    public static Point iteration(Point[] points, Point center) {
        double numeratorx = 0;
        double numeratory = 0;
        double denominatorx = 0;
        double denominatory = 0;
        for(Point p : points) {
            numeratorx = numeratorx + (p.weight * p.x / Math.sqrt(Math.pow(center.x-p.x, 2) + Math.pow(center.y - p.y, 2)));

            numeratory = numeratory + (p.weight * p.y / Math.sqrt(Math.pow(center.x-p.x, 2) + Math.pow(center.y - p.y, 2)));

            denominatorx = denominatorx + p.weight / Math.sqrt(Math.pow(center.x-p.x, 2) + Math.pow(center.y - p.y, 2));

            denominatory = denominatory + p.weight / Math.sqrt(Math.pow(center.x-p.x, 2) + Math.pow(center.y - p.y, 2));


        }
        double x = numeratorx / denominatorx;
        double y = numeratory / denominatory;
        return new Point(0, x, y);
    }




    public String toString() {
        return String.valueOf(this.x + "," + this.y);
    }

}
