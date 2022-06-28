package figures;
import java.lang.Math.*;

public class Circle extends Figure{
    int r;

    public Circle(int r)
    {
        this.r = r;
        this.circuit = 2*Math.PI*r;
        this.area = Math.PI*r*r;
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
