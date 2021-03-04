package com.company;

public class Bookshop extends  Shop
{
    protected String p1;
    protected String p2;
    protected String p3;

    public String getp1()
    {
        return p1;
    }
    public void setp1(String p1)
    {
        this.p1 = p1;
    }

    public String getp2()
    {
        return p2;
    }

    public void setp2(String p2)
    {
        this.p2 = p2;
    }

    public String getp3()
    {
        return p3;
    }

    public void setp3(String p3)
    {
        this.p3 = p3;
    }

    @Override
    public String info()
    {
        System.out.println("Product list: " + getp1() + " " + getp2() + " " + getp3());
        return super.info();
    }
}