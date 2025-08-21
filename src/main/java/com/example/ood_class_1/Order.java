package com.example.ood_class_1;

public class Order {
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
    Double CalculateTotal(){
        Double x= item1.getprice()+item2.getprice()+item3.getprice();
        return x;
    }
    void displayOrderDetails(){
        System.out.println(item1.getname()+" is of category"+item1.getcategory());
        System.out.println(item2.getname()+" is of category"+item2.getcategory());
        System.out.println(item3.getname()+" is of category"+item3.getcategory());
        System.out.println("The Total amount is "+CalculateTotal()+"$");
    }
}
