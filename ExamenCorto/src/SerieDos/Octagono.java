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
public class Octagono implements Poligono{

    public double longitud;
    public double apotema;
    
    @Override
    public double area() {
        return 4*longitud*apotema;
    }

    @Override
    public double perimetro() {
        return 8 * longitud;
    }
    public Octagono(double Apotema, double Longitud)
    {
        apotema = Apotema;
        longitud = Longitud;
    }
    
}
