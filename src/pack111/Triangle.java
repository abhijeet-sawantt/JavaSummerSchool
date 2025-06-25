package pack111;
import pack11.*;
public class Triangle extends TwoDimShape{
    protected double side3rd;
    public Triangle(double side1st, double side2nd, double s3rd){
        length=side1st;
        breadth=side2nd;
        side3rd=s3rd;
    }
    public double Area(){
        return (((double) 1 /2)*length*breadth);
    }
    public double Perimeter(){
        return (length+breadth+side3rd);
    }
}