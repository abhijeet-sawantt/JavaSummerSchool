package pack121;
import pack12.*;
public class Cylinder extends ThreeDimShape {
    public Cylinder(double h, double radius){
        breadth=radius;
        height=h;
    }
    public double Volume(){
        return (4*3.14*breadth*breadth);
    }
    public double SurfaceArea(){
        return (2*3.14*breadth*height);
    }
}