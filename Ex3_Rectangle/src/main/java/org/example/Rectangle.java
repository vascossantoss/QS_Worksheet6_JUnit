package org.example;

public class Rectangle {

    public int perimeter(int width, int length){
        return 2 * width + 2 * length;
    }

    public int area(int width, int length){
        return width * length;
    }

    public boolean isTriangle(int a, int b, int c){
        return  a < b + c && b < a + c && c < a + b;
    }
}
