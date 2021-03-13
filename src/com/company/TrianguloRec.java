package com.company;

public class TrianguloRec extends  Figura{

    private double b;
    private double h;

    public TrianguloRec(double b, double h){
        this.b=b;
        this.h=h;
    }

    @Override
    public double area() {
        return (this.b*this.h)/2;
    }


}
