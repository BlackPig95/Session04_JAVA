package BaiTrenLop;

public class MainTest
{
    public static void main(String[] args)
    {
        SinhVien sinhvien1 = new SinhVien(1, "A", 20, true);
        SinhVien sinhvien2 = new SinhVien(2, "B", 25, false);
        sinhvien1.displayStudent();
        System.out.println();
        sinhvien2.displayStudent();
    }
}
