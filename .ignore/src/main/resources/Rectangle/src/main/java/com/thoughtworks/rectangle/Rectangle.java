package com.thoughtworks.rectangle;

public class Rectangle {
    
    private final int length;
    private final int breadth;
    
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int area(){
        return this.length * this.breadth;
    }
}