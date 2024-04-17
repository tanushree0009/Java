import java.util.Scanner;

abstract class Figure{
    abstract double areaFigure(double a, double b);
}
class Rectangle extends Figure{
    double areaFigure(double length, double bredth){
        double area;
        area = length*bredth;
        return area;
    }
}

class Triangle extends Figure{
    double areaFigure(double base, double height){
        double area;
        area = (base*height)/2;
        return area;

    }
}

public class Assignment4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = s.nextDouble();
        System.out.print("Enter the bredth of the rectangle: ");
        double bredth = s.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = s.nextDouble();
        System.out.print("Enter the base of the Triangle: ");
        double base = s.nextDouble();
        Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();
        System.out.println("The area of the rectangle is: " + rect.areaFigure(length, bredth));
        System.out.println("The area of the triangle is: " + tri.areaFigure(base, height));
    }
}
