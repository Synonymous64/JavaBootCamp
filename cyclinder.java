// package com.codeWithHarry;

public class cyclinder extends circle {
    private float height;
    public void setHeight(float height){
        this.height = height;
    }
    public float volumeofCyclinder(){
        return (this.pie * (this.radius * this.radius) * this.height);
    }
    public float totalSurfaceAreaofCyclinder(){
        return (2 * this.pie * this.radius * (this.radius + this.height));
    }
    public static void main(String[] args) {
        
    }
}
