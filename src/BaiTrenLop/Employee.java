package BaiTrenLop;

import java.util.Scanner;

public class Employee
{
    private int id;
    private int age;
    private int salary = 1300000;
    private boolean sex;
    private double  rate;
    private String name;
    public Employee()
    {
    }

    public Employee(int id, int age, boolean sex, double rate, String name)
    {
        this.id = id;
        this.age = age;
        this.sex = sex;
        this.rate = rate;
        this.name = name;
    }
    public void inputData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên");
        this.name = scanner.nextLine();
        System.out.println("Nhập mã nhân viên");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tuổi nhân viên");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính nhân viên (true = nam, false = nữ)");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập hệ số lương");
        this.rate = Double.parseDouble(scanner.nextLine());
    }
    public void displayData()
    {
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Mã nhân viên: " + id);
        System.out.println("Tuổi nhân viên: " + age);
        System.out.println("Giới tính nhân viên: " + (sex ? "Nam" : "Nữ"));
        System.out.println("Hệ số lương nhân viên: " + rate);
    }
    public void calcSalary()
    {
        System.out.println("Lương nhân viên này là: " + rate*salary);
    }
}
class MainEmployee{
    public static void main(String[] args)
    {
        for(int i = 0; i < 5; i++)
        {
            Employee employee = new Employee(i, 20, true, 0.2*i, "Nhân viên thứ " +i);
            employee.displayData();
            employee.calcSalary();
        }
    }
}
