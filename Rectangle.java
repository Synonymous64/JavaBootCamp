// package com.codeWithHarry;
public class Rectangle {
    private float length;
    private float breadth;
    private float height;
    
    /** 
     * @param length
     */
    void setLength(float length){
        this.length = length;
    }
    
    /** 
     * @param breadth
     */
    void setbreadth(float breadth){
        this.breadth = breadth;
    }
    
    /** 
     * @param height
     */
    void setheight(float height){
        this.height = height;
    }
    
    /** 
     * @return float
     */
    public float volumeOfRectangle(){
        return this.length * this.breadth * this.height;
    }
    
    /** 
     * @return float
     */
    public float areaRectangle(){
        return this.breadth * this.height;
    }
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        
    }
}
