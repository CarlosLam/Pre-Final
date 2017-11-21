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
public class Pentagono implements Poligono{

    public double longitud;
    public double apotema;
    
    @Override
    public double area() {
        return 5*longitud*apotema/2;
    }

    @Override
    public double perimetro() {
        return 5 * longitud;
    }
    
    public Pentagono(double Apotema, double Longitud)
    {
        apotema = Apotema;
        longitud = Longitud;
    }
}
