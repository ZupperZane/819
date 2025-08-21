package com.example.ood_class_1;

public class Cafe {
    MenuItem menuItem1;
    MenuItem menuItem2;
    MenuItem menuItem3;

    Order currentOrder;

    void addMenuItem1(MenuItem item){
        this.menuItem1=item;
    }
    void addMenuItem2(MenuItem item){
        this.menuItem2=item;
    }
    void addMenuItem3(MenuItem item){
        this.menuItem3=item;
    }

    Double placeOrder(Order order){
        this.currentOrder=order;
        return currentOrder.CalculateTotal();
    }

    public void displayMenu(){
        String x=menuItem1.displayItemInfo();
        String y=menuItem2.displayItemInfo();
        String z=menuItem3.displayItemInfo();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
