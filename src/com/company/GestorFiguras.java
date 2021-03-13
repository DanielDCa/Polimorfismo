package com.company;

import java.util.Arrays;

public class GestorFiguras {

    public static void main(String[] args) {

	    System.out.println("Esto es la prueba de ejercicio Polimorfismo");

	    /*Figura tri = new TrianguloRec(5,6);

        System.out.println("El area del triangulo rectangulo es: " + tri.Area() );*/

        Figura cua = new Cuadrado(8,8);
        System.out.println("El area del cuadrado es: " + cua.area() );

        Figura[] fig = new Figura[4];
        fig[0] =new Cuadrado(8,8);
        fig[1] =new Circulo(9);
        fig[2] =new Rectangulo(8,10);
        fig[3] =new TrianguloRec(5,7);

        System.out.println("La suma de todas las areas de las figuras es: "+ GestorFiguras.suma(fig));

        System.out.println("--------------");


        System.out.println(Arrays.asList(fig));
        for(Figura v: fig){
            System.out.println("El"+ v.toString() + "tiene area: " +v.area());
        }
        GestorFiguras.sort(fig);
        System.out.println(Arrays.asList(fig));


    }
    public static void sort (Figura[] v){
        //Metodo estatico sort de la clase Arrays -->Se ordena por orden natural de sus elementos
        Arrays.sort(v);//Para definir el criterio de orden natural, todos los elementos del Array deben implementar la interfaz comparable

    }
    public static double suma (Figura[] v){
        double res = 0;

        int i;
        for(i=1; i <v.length; i++) {
            res += v[i].area();
        }

        return res;
    }
}
