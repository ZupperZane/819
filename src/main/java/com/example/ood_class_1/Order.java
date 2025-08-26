package com.example.ood_class_1;

public class Order {
    //assign class properties
    MenuItem item1;
    MenuItem item2;
    MenuItem item3;
    Double TotalAmount;

    public void addItem1(MenuItem item){
        this.item1=item;
    }
    public void addItem2(MenuItem item){
        this.item2=item;
    }
    public void addItem3(MenuItem item){
        this.item3=item;
    }
    // Calculate Total of Order, return as Double x
    Double CalculateTotal(){
        Double x= item1.getprice()+item2.getprice()+item3.getprice();
        return x;
    }
    // Display Category and name of each item, then Display Total Cost
    void displayOrderDetails(){
        System.out.println(item1.getname()+" is of category "+item1.getcategory());
        System.out.println(item2.getname()+" is of category "+item2.getcategory());
        System.out.println(item3.getname()+" is of category "+item3.getcategory());
        System.out.println("The Total amount is "+CalculateTotal()+"$");
    }
}
