package BaiTrenLop;

import java.util.Scanner;

public class PhuongTrinhBac2
{
    private double a,b,c;

    public PhuongTrinhBac2(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public PhuongTrinhBac2()
    {
    }

    public double getA()
    {
        return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public double getB()
    {
        return b;
    }

    public void setB(double b)
    {
        this.b = b;
    }

    public double getC()
    {
        return c;
    }

    public void setC(double c)
    {
        this.c = c;
    }
    private double getDiscriminant()
    {
        double delta = b*b - 4*a*c;
        return delta;
    }
    private double getRoot1()
    {
        double r1 = (-b + Math.pow(getDiscriminant(), 0.5)) / (2*a);
        return r1;
    }
    private double getRoot2()
    {
        double r2 = (-b - Math.pow(getDiscriminant(), 0.5)) / (2*a);
        return r2;
    }
    public void getEquationRoot()
    {
        if(getDiscriminant() > 0)
        {
            System.out.println("Phương trình có 2 nghiệm: " + getRoot1() + " và " + getRoot2());
        }
        else if (getDiscriminant() == 0)
        {
            System.out.println("Phương trình có 1 nghiệm: " + getRoot1());
        }
        else System.out.println("Phương trình vô nghiệm");
    }
}
class MainEquation{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phương trình bậc 2 có dạng ax2 + bx + c = 0");
        System.out.println("Nhập vào số a của phương trình");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào số b của phương trình");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào số c của phương trình");
        double c = Double.parseDouble(scanner.nextLine());
        PhuongTrinhBac2 equation = new PhuongTrinhBac2(a, b, c);
        equation.getEquationRoot();
    }
}