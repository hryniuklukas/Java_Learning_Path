package model;

import figures.*;
import graduate.*;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*LocalDate date1 = LocalDate.of(2019,4,12); // LocalDate vs Date?
        LocalDate date2 = LocalDate.of(2017,10,10);
        LocalDate date3 = LocalDate.of(2020,12,8);
        LocalDate date4 = LocalDate.of(2014,3,25);
        LocalDate date5 = LocalDate.of(2019,5,30);

        DiplomaRegistry dipReg = new DiplomaRegistry();
        Graduate graduate1 = new Graduate("Jan Kowalski");
        Graduate graduate2 = new Graduate("Adam Kownacki");
        Graduate graduate3 = new Graduate("Artur Zieba");
        Graduate graduate4 = new Graduate("Artur Kownacki");
        Graduate graduate5 = new Graduate("Piotr Zychowicz");

        dipReg.addDiploma(new DiplomaOfRecognition(graduate1, 1,date1,"Master"));
        dipReg.addDiploma(new EngineeringDiploma(graduate2, 2,date2,"Civil Engineering"));
        dipReg.addDiploma(new DiplomaOfRecognition(graduate3, 3,date3,"Master"));
        dipReg.addDiploma(new EngineeringDiploma(graduate4, 4,date4,"Automatics"));
        dipReg.addDiploma(new EngineeringDiploma(graduate5, 5,date5,"IT"));

        List<Diploma> list = dipReg.getDiplomasByOwner("Jan Kowalski");
        for (Diploma diploma:list)
        {
            System.out.println(diploma);
        }

        System.out.println("\n");

        for (Diploma diploma:dipReg.getDiplomas())
        {
            System.out.println(diploma);
        }
        System.out.println("\n");
        dipReg.getDiplomas(Diploma.ENGINEERING).forEach(System.out::println);
        System.out.println("\n");
        System.out.println(dipReg.getOwnerOfDiploma(8));*/

        Circle circle1 = new Circle(5);
        Rectangle rectangle1 = new Rectangle(3,2);
        Square square1 = new Square(2);

        List<Figure> figures = new ArrayList<>();
        figures.add(circle1);
        figures.add(rectangle1);
        figures.add(square1);

        Order firstOrder = new Order(figures);
        firstOrder.calculateCost();
        System.out.println(firstOrder.getTotalCost());
        System.out.println(firstOrder.getCutCost());
        System.out.println(firstOrder.getMaterialCost());


        Square square2 = new Square(5);
        Order secondOrder = new Order(square2);
        secondOrder.calculateCost();
        System.out.println(secondOrder.getTotalCost());



    }
}

