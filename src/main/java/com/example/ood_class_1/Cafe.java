package com.example.ood_class_1;

public class Cafe {
    //assign class properties
    MenuItem menuItem1;
    MenuItem menuItem2;
    MenuItem menuItem3;
    Order currentOrder;
    // methods to assign/reassign menuitems 1-3
    void addMenuItem1(MenuItem item){
        this.menuItem1=item;
    }
    void addMenuItem2(MenuItem item){
        this.menuItem2=item;
    }
    void addMenuItem3(MenuItem item){
        this.menuItem3=item;
    }
    // Places an order, sets (order) as current Order and return Total of Order
    Double placeOrder(Order order){
        this.currentOrder=order;
        return currentOrder.CalculateTotal();
    }
    // Display individual item Info of every order item.
    public void displayMenu(){
        String x=menuItem1.displayItemInfo();
        String y=menuItem2.displayItemInfo();
        String z=menuItem3.displayItemInfo();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
