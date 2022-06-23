package geometric;

public class Point {
    public double x;  // why?
    public double y;

    double max = 10.0;
    double min = 0.0;

    public Point() {
        this.x = Math.floor(Math.random() * (max - min + 1) + min);
        this.y = Math.floor(Math.random() * (max - min + 1) + min);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }


}
