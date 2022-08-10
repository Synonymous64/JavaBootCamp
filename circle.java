// package com.codeWithHarry;
public class circle {
    public float pie = 3.14f;
    protected float radius;
    public void setRadius(float radius){
        this.radius = radius;
    }
    public float perimeterofCircle(){
        return (2 * this.pie * this.radius);
    }
    public float surfaceAreaofCircle(){
        return (this.pie * (this.radius * this.radius));
    }
    public static void main(String[] args) {
        
    }
}
