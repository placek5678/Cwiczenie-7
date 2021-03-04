package com.company;

public class Main2
{
    public static void main(String[] args)
    {
        Shop shop = new Shop();
        shop.setSize("Huge");
        shop.setAddress("WoT'a 77/1 03-277");
        System.out.println(shop.info());

        Bookshop bookshop = new Bookshop();

        bookshop.setSize("Big");
        bookshop.setAddress("Javy 30/2 98-903");

        bookshop.setp1("book");
        bookshop.setp2("comics");
        bookshop.setp3("magazine");
        System.out.println(bookshop.info());

        Bakery bakery = new Bakery();

        bakery.setSize("Small");
        bakery.setAddress("Idei 20/21 40-532");

        bakery.setP1("roll");
        bakery.setP2("bread");
        bakery.setP3("donut");
        System.out.println(bakery.info());
    }
}