package BaiTrenLop;

public class Fan
{
    final private int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW()
    {
        return SLOW;
    }

    public int getMEDIUM()
    {
        return MEDIUM;
    }

    public int getFAST()
    {
        return FAST;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public boolean isOn()
    {
        return isOn;
    }

    public void setOn(boolean on)
    {
        isOn = on;
    }

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

    public Fan()
    {
    }
    public String toString()
    {
            return "Fan is " + (isOn?"on":"off") + " Color: " + color + " Radius: " + radius;
    }
}
class MainFan
{
    public static void main(String[] args)
    {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);
        System.out.println(fan1.toString());//Method override
        System.out.println(fan2);//println auto call toString
    }
}
