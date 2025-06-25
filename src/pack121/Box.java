package pack121;
import pack12.*;
public class Box extends ThreeDimShape {
    public Box(double l, double b, double h){
        length=l;
        breadth=b;
        height=h;
    }
    public double Volume(){  //print volume of the object
        return (length*breadth*height);
    }
    public double SurfaceArea(){
        return (2*((length*breadth)+(length*height)+(height*breadth)));
    }
    public boolean CheckCube(){
        return length == height && height == breadth;
    }
    protected void finalize(){
        System.out.println("Destroying Object!");
    }
}