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
public class Triangulo implements Poligono{

    
    double base;
    double altura;
    @Override
    public double area() {
        return 0.5*base*altura;
    }

    @Override
    public double perimetro() {
        return 0;
    }
    
    public Triangulo()
    {
        
    }
   
}
