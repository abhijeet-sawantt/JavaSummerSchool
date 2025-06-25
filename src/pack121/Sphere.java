package pack121;
import pack12.*;
public class Sphere extends ThreeDimShape {
    public Sphere(double radius){
        length=radius;
    }
    public double Volume(){
        return (length*length*length);
    }
    public double SurfaceArea(){
        return (4*3.14*length*length);
    }
}