package figures;
import java.util.List;
import java.util.ArrayList;

public class Order {
    List<Figure> figures;
    double totalCost;
    double cutCost;
    double materialCost;
    public Order(Figure firstFigure)
    {
        this.figures = new ArrayList<>();
        figures.add(firstFigure);
    }
    public Order(List<Figure> figures)
    {
        this.figures = figures;
    }
    public double calculateCost()
    {
        for (Figure figure:figures)
        {
            this.cutCost = this.cutCost + figure.circuit;
            this.materialCost = this.materialCost + figure.area;
        }
        totalCost = cutCost + materialCost;
        return totalCost;
    }
    public double getTotalCost()
    {
        return totalCost;
    }
    public double getCutCost()
    {
        return cutCost;
    }
    public double getMaterialCost()
    {
        return materialCost;
    }
}
