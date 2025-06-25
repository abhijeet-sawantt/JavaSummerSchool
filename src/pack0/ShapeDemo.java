package pack0;
import pack111.*;
import pack121.*;
class ShapeDemo{
    static{
        System.out.println("Inside Main");
    }
    public static void main(String[] args){
        System.out.println("----------RECTANGLE----------");
        Rectangle r1=new Rectangle(8,8);
        System.out.println("Area= " + r1.Area());
        System.out.println("Perimeter= " + r1.Perimeter());

        System.out.println("----------SQUARE----------");
        Square s1=new Square(8);
        System.out.println("Area= " + s1.Area());
        System.out.println("Perimeter= " + s1.Perimeter());

        System.out.println("----------CIRCLE----------");
        Circle c1=new Circle(1/3.14);
        System.out.println("Area= " + c1.Area());
        System.out.println("Perimeter= " + c1.Perimeter());

        System.out.println("----------TRIANGLE----------");
        Triangle t1=new Triangle(1,2, 3);
        System.out.println("Area= " + t1.Area());
        System.out.println("Perimeter= " + t1.Perimeter());

        System.out.println("----------BOX----------");
        Box b1=new Box(8,8,8);
        System.out.println("Volume= " + b1.Volume());
        System.out.println("Surface Area= " + b1.SurfaceArea());
        System.out.println("Is it a cube?: " + b1.CheckCube());

        System.out.println("----------SPHERE----------");
        Sphere sp1=new Sphere(5);
        System.out.println("Volume= " + sp1.Volume());
        System.out.println("Surface Area= " + sp1.SurfaceArea());

        System.out.println("----------CYLINDER----------");
        Cylinder cy1=new Cylinder(1,1);
        System.out.println("Volume= " + cy1.Volume());
        System.out.println("Surface Area= " + cy1.SurfaceArea());

        System.out.println("----------CONE----------");
        Cone co1=new Cone(1,1,1);
        System.out.println("Volume= " + co1.Volume());
        System.out.println("Surface Area= " + co1.SurfaceArea());
    }
}