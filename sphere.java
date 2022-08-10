// package com.codeWithHarry;
public class sphere extends circle{
    public float TotalSurfaceAreaofSphere(){
        return (4 * this.pie * (this.radius * this.radius)) ;
    }
    public float volumeofSphere(){
        return ((4/3) * this.pie * (this.radius * this.radius)) ;
    }
    public static void main(String[] args) {
        sphere s = new sphere();
        s.setRadius(3.1f);
        System.out.format("%.2f\n",s.TotalSurfaceAreaofSphere());
        System.out.format("%.2f\n",s.volumeofSphere());
    }
}
