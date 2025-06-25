package pack111;
import pack11.*;
public class Square extends TwoDimShape{
    public Square(double edge){
        length=edge;
    }
    public double Area(){  //print volume of the object
        return (length*length);
    }
    public double Perimeter(){
        return (4*length);
    }
}