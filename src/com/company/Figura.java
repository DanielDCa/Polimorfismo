package com.company;

public abstract class Figura implements Comparable<Figura>{
    //Esta clase no puede ser instanciada, pero puede ser referenciada (Extends)
    //Metodo "abstract", indica que toda las clases que hereden de esta clase tienen que definir ese metodo "area"
    public abstract double area();//Metodo polimorfico

    public int compareTo(Figura f){

        return (int)(f.area()-this.area());// Si retornara un valor cero sin son iguales, retornara un 1 en caso que sea mayor.
    }
}

