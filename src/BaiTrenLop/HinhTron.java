package BaiTrenLop;

import java.util.Scanner;

public class HinhTron
{
    private double radius;
    private String color;

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public HinhTron(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }

    public HinhTron()
    {
    }
    public double calcPerimeter()
    {
        return this.radius * Math.PI * 2;
    }
    public double calcArea()
    {
        return this.radius* this.radius * Math.PI;
    }
    public void inputData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn");
        this.radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập màu sắc hình tròn");
        this.color = scanner.nextLine();
    }
    public void displayData()
    {
        System.out.println("Bán kính hình tròn: " + radius);
        System.out.println("Màu sắc: " + color);
        System.out.println("Chu vi hình tròn: " + calcPerimeter());
        System.out.println("Diện tích hình tròn: " + calcArea());
    }
}
class MainCircle
{
    public static void main(String[] args)
    {
        HinhTron hinhTron1 = new HinhTron(3.5, "red");
        HinhTron hinhTron2 = new HinhTron();
        hinhTron2.inputData();
        hinhTron1.displayData();
        hinhTron2.displayData();
    }
}
