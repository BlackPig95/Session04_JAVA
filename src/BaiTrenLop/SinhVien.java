package BaiTrenLop;

public class SinhVien
{
    private int studentCode;
    private String name;
    private int age;
    private boolean sex;

    public SinhVien(int studentCode, String name, int age, boolean sex)
    {
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public SinhVien()
    {
    }

    public int getStudentCode()
    {
        return studentCode;
    }

    public void setStudentCode(int studentCode)
    {
        this.studentCode = studentCode;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public boolean isSex()
    {
        return sex;
    }

    public void setSex(boolean sex)
    {
        this.sex = sex;
    }
    public void displayStudent()
    {
        System.out.println("Họ tên: " + this.name);
        System.out.println("Mã sinh viên: " + this.studentCode);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Giới tính: " + (this.sex?"Nam":"Nữ"));
    }
}
