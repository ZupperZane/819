package com.example.ood_class_1;

public class test {
    public static void main(String args[]){
        MenuItem Tea=new MenuItem("Tea",3.00,"Drinks");
        MenuItem Biscuit=new MenuItem("Biscuit",5.00,"Food");
        MenuItem Donut=new MenuItem("Donut",3.00,"Dessert");

        Order Order1= new Order();
        Order1.addItem1(Tea);
        Order1.addItem2(Biscuit);
        Order1.addItem3(Donut);
        Double x=Order1.CalculateTotal();
        System.out.println(x);
        Order1.displayOrderDetails();

        Cafe Dorans= new Cafe();
        Dorans.addMenuItem1(Tea);
        Dorans.addMenuItem2(Biscuit);
        Dorans.addMenuItem2(Donut);
        Double y= Dorans.placeOrder(Order1);
        Dorans.displayMenu();
    }
}

