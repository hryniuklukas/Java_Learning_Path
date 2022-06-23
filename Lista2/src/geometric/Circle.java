package geometric;

public class Circle extends Point {
    public double r;
    double maxR = 2.0;
    double minR = 1.0;

    public Circle() {
        this.x = Math.floor(Math.random() * (max - min + 1) + min);
        this.y = Math.floor(Math.random() * (max - min + 1) + min);
        this.r = Math.floor(Math.random() * (maxR - minR + 1) + min);
    }

    public boolean containsPoint(double x, double y) {
        double a;
        double b;

        if (x > this.x) {
            a = x - this.x;
        } else {
            a = this.x - x;
        }
        if (y > this.y) {
            b = y - this.y;
        } else {
            b = this.y - y;
        }
        double dist = Math.sqrt((a * a) + (b * b));
        if (dist < r) {
            return true;
        } else {
            return false;
        }
    }

}
