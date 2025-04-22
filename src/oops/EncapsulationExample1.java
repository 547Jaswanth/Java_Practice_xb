package oops;


class Car
{
    private String carNumber;
    private String name;
    private Double price;
    private String color;

    public String getCarNumber() {
        return carNumber;
    }
    public void setCarNumber(String carNumber)
    {
        this.carNumber=carNumber;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(Double price)
    {
        this.price=price;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
}

public class EncapsulationExample1 {
    public static void main(String[] args)
    {
        Car car1=new Car();
        car1.setCarNumber("AP1234D");
        car1.setColor("Green");
        car1.setName("BMW");
        car1.setPrice(4500000d);

        System.out.println(car1.getPrice());


    }
}
