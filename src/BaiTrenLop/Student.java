package BaiTrenLop;

import java.util.Random;
import java.util.Scanner;

public class Student
{
    private String studentCode, studentName, address;
    private int studentAge, phone;
    private boolean sex;

    public Student(int studentCode, String studentName, String address, int studentAge, int phone, boolean sex)
    {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.address = address;
        this.studentAge = studentAge;
        this.phone = phone;
        this.sex = sex;
    }

    public Student()
    {
    }

    public String getStudentCode()
    {
        return studentCode;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public String getAddress()
    {
        return address;
    }

    public int getStudentAge()
    {
        return studentAge;
    }

    public int getPhone()
    {
        return phone;
    }

    public boolean isSex()
    {
        return sex;
    }

    public void inputData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học sinh");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập mã học sinh");
        this.studentCode = scanner.nextLine();
        System.out.println("Nhập tuổi học sinh");
        this.studentAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính học sinh (true = nam, false = nữ)");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập địa chỉ học sinh");
        this.address = scanner.nextLine();
        System.out.println("Nhập số điện thoại chỉ học sinh");
        this.phone = Integer.parseInt(scanner.nextLine());
    }

    public void displayData()
    {
        System.out.println("Tên học sinh: " + studentName);
        System.out.println("Mã học sinh: " + studentCode);
        System.out.println("Tuổi học sinh: " + studentAge);
        System.out.println("Giới tính học sinh: " + (sex ? "Nam" : "Nữ"));
        System.out.println("Địa chỉ học sinh: " + address);
    }
}

class MainStudent
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        Random random = new Random();
        for (int i = 0; i < 10; i++)
        {
            students[i] = new Student(i, "Học sinh " + i,
                    "Địa chỉ số " + i,
                    random.nextInt(18, 24),
                    i + i, random.nextInt(2) == 1);
        }
        int studentCount = 10;
        while(true)
        {
            System.out.println("===========Menu==============");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin dựa vào mã học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
                    for(int i = 0; i < students.length; i++)
                    {
                        if(students[i] == null)
                            return;
                        students[i].displayData();
                    }
                    break;
                case 2:
                    System.out.println("Mời nhập thông tin học sinh");
                    students[studentCount].inputData();
                    students[studentCount].displayData();
                    studentCount++;
                    break;
                case 3:
                    System.out.println("Nhập mã học sinh");
                    String id = scanner.nextLine();
                    for(int i = 0; i < students.length; i++)
                    {
                        if(id.equals(students[i].getStudentCode()))
                        {
                            System.out.println("Mời nhập thông tin mới");
                            students[i].inputData();
                            students[i].displayData();
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập mã học sinh");
                    String code = scanner.nextLine();
                    for(int i = 0; i < students.length; i++)
                    {
                        if(code.equals(students[i].getStudentCode()))
                        {
                            students[i] = null;
                            break;
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời nhập lại");
                    break;
            }
        }
    }
}
