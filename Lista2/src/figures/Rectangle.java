package figures;

public class Rectangle extends Figure{

    int a;
    int b;

    public Rectangle(int a, int b)
    {
        this.a = a;
        this.b = b;
        this.circuit = 2*a+2*b;
        this.area = a*b;
    }

    public double getCircuit()
    {
        return circuit;
    }
    public double getArea()
    {
        return area;
    }
}
