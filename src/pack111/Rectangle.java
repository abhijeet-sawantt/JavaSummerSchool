package pack111;
import pack11.*;
public class Rectangle extends TwoDimShape{
    public Rectangle(double l, double b) {
        length=l;
        breadth=b;
    }
    public double Area(){  //print volume of the object
        return (length*breadth);
    }
    public double Perimeter(){
        return (2*(length+breadth));
    }
}