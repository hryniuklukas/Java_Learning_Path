package figures;

public class Square extends Figure{

    int d;

    public Square(int d)
    {
        this.d = d;
        this.area=d*d;
        this.circuit=4*d;
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
