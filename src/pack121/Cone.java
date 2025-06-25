package pack121;
import pack12.*;
public class Cone extends ThreeDimShape {
    public Cone(double edge, double h, double radius){
        length=edge;
        breadth=radius;
        height=h;
    }
    public double Volume(){
        return (((double) 1 /3)*3.14*breadth*breadth*height);
    }
    public double SurfaceArea(){
        return (3.14*breadth*(breadth+length)) ;
    }
    public String to_string(){
        return "to_string of Cone";
    }
}