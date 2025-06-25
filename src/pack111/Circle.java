package pack111;
import pack11.*;
public class Circle extends TwoDimShape{
    public Circle(double radius){
        length=radius;
    }
    public double Area(){  //print volume of the object
        return (3.14*length*length);
    }
    public double Perimeter(){
        return (2*3.14*length);
    }
}