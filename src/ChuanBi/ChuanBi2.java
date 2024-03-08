package ChuanBi;

public class ChuanBi2
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator(3,5);
        calculator.Multiply();
        calculator.Divide();
        calculator.GetA();
        calculator.SetB(6);
        calculator.Subtract();
    }
}
class Category{
    int categoryID;
    String categoryName;
    public Category(int _id, String _name)
    {
        this.categoryID = _id;
        this.categoryName = _name;
    }
}
class Product
{
    int productId;
    String productName;
    float productPrice;
    Category category;
    public Product(int _productId, String _productName, float _price, Category _category)
    {
        this.productId = _productId;
        this.productName = _productName;
        this.productPrice = _price;
        this.category = _category;
    }
    public void Display()
    {
        System.out.println("Product ID: " + this.productId);
        System.out.println("Product name: " + this.productName);
        System.out.println("Product price: " + this.productPrice);
        System.out.println("Product category: " + this.category.categoryName);
    }
}
class Calculator
{
    double a, b;
    public Calculator(){}
    public Calculator(double _a, double _b){
        this.a = _a;
        this.b = _b;
    }
    public double GetA()
    {
        return this.a;
    }
    public double GetB()
    {
        return this.b;
    }
    public void SetA(double value)
    {
        this.a = value;
    }
    public void SetB(double value)
    {
        this.b = value;
    }
    public double Sum()
    {
        return this.a + this.b;
    }
    public double Subtract()
    {
        return this.a - this.b;
    }
    public double Multiply()
    {
        return this.a* this.b;
    }
    public double Divide()
    {
        return this.a/this.b;
    }
}