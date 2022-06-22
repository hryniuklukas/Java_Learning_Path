import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String msg;

        Koło circle1 = new Koło();
        if(circle1.containsPoint(5.0,5.0))
        {
            msg = "Zawiera punkt 5.0 5.0";
        }else
        {
            msg = "Nie zawiera punktu 5.0 5.0";
        }
        System.out.println("Kolo o srodku: " + circle1.x + " " + circle1.y + " Oraz promieniu: " + circle1.r + " " + msg);
    }
}

class Punkt {
    double x;
    double y;

    double max = 10.0;
    double min = 0.0;

    public Punkt(){
        this.x= Math.floor(Math.random()*(max-min+1)+min);
        this.y= Math.floor(Math.random()*(max-min+1)+min);

    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;

    }



}
class Koło extends Punkt
{
    double r;
    double maxR=2.0;
    double minR=1.0;

    public Koło()
    {
        this.x= Math.floor(Math.random()*(max-min+1)+min);
        this.y= Math.floor(Math.random()*(max-min+1)+min);
        this.r= Math.floor(Math.random()*(maxR-minR+1)+min);
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