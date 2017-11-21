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
public class Rectangulo extends Cuadrilatero{
    double Base;
    double Altura;
    
    public double area()
    {
        return Base*Altura;
    }
    
    public double perimetro()
    {
        return (2 * Altura) + (2 * Base);
    }
    public Rectangulo(double base, double altura)
    {
        Base = base;
        Altura = altura;
    }
}
