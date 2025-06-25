package pack12;
import pack1.*;
public abstract class ThreeDimShape extends Shape{
    protected double breadth;
    protected double height;
    protected abstract double Volume();
    protected abstract double SurfaceArea();
}