package com.example.ood_class_1;

public class test {
    public static void main(String args[]){
        //initilization of MenuItems
        MenuItem Tea=new MenuItem("Tea",3.00,"Drinks");
        MenuItem Biscuit=new MenuItem("Biscuit",5.00,"Food");
        MenuItem Donut=new MenuItem("Donut",3.00,"Dessert");
        // Intilization of Order
        Order Order1= new Order();
        // Test of Order Methods
        Order1.addItem1(Tea);
        Order1.addItem2(Biscuit);
        Order1.addItem3(Donut);
        Double x=Order1.CalculateTotal();
        System.out.println(x);
        Order1.displayOrderDetails();
        //Intilization of Caffe
        Cafe Dorans= new Cafe();
        //Test of Cafe Methods
        Dorans.addMenuItem1(Tea);
        Dorans.addMenuItem2(Biscuit);
        Dorans.addMenuItem3(Donut);
        Double y= Dorans.placeOrder(Order1);
        Dorans.displayMenu();
    }
}

