// package com.codeWithHarry;
public class Square extends Rectangle{
    private float side;
    public void setSide(float side){
        this.side = side;
    }
    public float areaOfSquare(){
        return (this.side * this.side);
    }
    public float PerimeterofSquare(){
        return (4 * this.side);
    }
    public static void main(String[] args) {
        
    }
}
