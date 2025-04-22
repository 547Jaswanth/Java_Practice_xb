package oops;

import java.awt.geom.Area;

class Father
{
    private String familyName;
    private String land;

    public String getFamilyName()
    {
        return familyName;
    }
    public void setFamilyName(String name)
    {
        this.familyName=name;
    }
    public String getLand()
    {
        return land;
    }
    public void setLand(String land)
    {
        this.land=land;
    }

}
class Son extends Father
{

}

public class InheritenceExample1 {
    public static void main(String[] args) {
        Son son=new Son();
        son.setFamilyName("Keeramanda");
        son.setLand("10 acars");

        Father f1=new Father();
        System.out.println(son.getLand());
    }
}
