package ChuanBi;

import java.util.Scanner;

public class ChuanBi
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(width, height);
        rectangle.Display();
        System.out.println(rectangle.GetArea());
        System.out.println(rectangle.GetPerimeter());
    }
}

class Rectangle
{
    double width, height;

    public Rectangle()
    {

    }

    public Rectangle(double _width, double _height)
    {
        this.width = _width;
        this.height = _height;
    }

    public double GetPerimeter()
    {

        return (this.width + this.height) * 2;
    }

    public double GetArea()
    {
        return this.width * this.height;
    }

    public void Display()
    {
        System.out.println("Width: " + this.width + " Height: " + this.height);
    }
}
class Student
{
    int studentID;
    String studentName;
    boolean sex;
    String className;
    int age;
    String address;
    public Student(int _ID, String _studentName, boolean _sex, String _className, int _age, String _address)
    {
        this.studentID = _ID;
        this.studentName = _studentName;
        this.sex = _sex;
        this.className = _className;
        this.age = _age;
        this.address = _address;
    }
    public void Display()
    {
        System.out.println("ChuanBi.Student ID: " + this.studentID);
        System.out.println("ChuanBi.Student name: " + this.studentName);
        System.out.println("ChuanBi.Student sex: " + (this.sex? "Male": "Female"));
        System.out.println("ChuanBi.Student class: " + this.className);
        System.out.println("ChuanBi.Student age: " + this.age);
        System.out.println("ChuanBi.Student address: " + this.address);
    }
}


