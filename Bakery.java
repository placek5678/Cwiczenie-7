package com.company;

public class Bakery extends Shop
{
    protected String p1;
    protected String p2;
    protected String p3;

    public String getP1()
    {
        return p1;
    }
    public void setP1(String p1)
    {
        this.p1 = p1;
    }

    public String getP2()
    {
        return p2;
    }

    public void setP2(String p2)
    {
        this.p2 = p2;
    }

    public String getP3()
    {
        return p3;
    }

    public void setP3(String p3)
    {
        this.p3 = p3;
    }

    @Override
    public String info()
    {
        System.out.println("Product list: " + getP1() + " " + getP2() + " " + getP3());
        return super.info();
    }
}