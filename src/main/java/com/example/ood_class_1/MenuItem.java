package com.example.ood_class_1;

public class MenuItem {
    // Menu Item Properties
    String name;
    Double price;
    String category;
    // public constructor
    public MenuItem(String Name,Double Price,String Category){
        name = Name;
        price = Price;
        category = Category;
    }
    // Getters for object properties
    String getname(){
        return this.name;
    }
    void setname(String name){
        this.name= name;
    }

    double getprice(){
        return this.price;
    }
    void setprice(Double price){
        this.price= price;
    }

    String getcategory(){
        return this.category;
    }
    void setcategory(String category){
        this.category= category;
    }
    // Item info such as name,price, and category are returned as a string
    public String displayItemInfo(){
        String info= ("The Item " +this.name+" costs "+this.price+"$ and is of the category: "+this.category);
        return info;
    }

}
