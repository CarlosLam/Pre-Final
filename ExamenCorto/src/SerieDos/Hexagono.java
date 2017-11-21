/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerieDos;

/**
 *
 * @author lam_m
 */
public class Hexagono implements Poligono{

    public double apotema;
    public double longitud;
    
    
    @Override
    public double area() {
        return 3*longitud*apotema;
    }

    @Override
    public double perimetro() {
        return 6*longitud;
    }
    public Hexagono(double ap, double l)
    {
        apotema = ap;
        longitud = l;
    }
}
