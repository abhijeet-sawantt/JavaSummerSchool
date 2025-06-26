package pack0;
//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
class Ex0{
    public static void BadMethod() throws Exception{
        /*int a;
        return a=5/0;*/  //infinite recursion
        throw new Exception();  //Error();
    }
    public static void main(String[] args) {
        try {
            //int d=0;
            //int a=42/d;  //Arithmetic Exception
            Class<?> cl1= Class.forName("pack0.Ex0");
            System.out.println(cl1.getName());
            Class<?> cl2= Class.forName("Hello");  //Exception Occurs!
            System.out.println(cl2.getName());
            //File myFile=new File("text.txt");
            FileInputStream myFile = new FileInputStream("text.txt");
            BadMethod();  //StackOverflowError
        } catch (FileNotFoundException|ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
        catch(ClassNotFoundException ce){
            System.out.println(ce.toString());
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            System.out.println("In finally!");
        }
        System.out.println("After finally");
    }
}