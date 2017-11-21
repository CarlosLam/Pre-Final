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
public class TrianguloEquilatero extends Triangulo{
    
    private double lado;
    public TrianguloEquilatero(double Lado)
    {
        lado = Lado;
    }
    
    
    public double area()
    {
        return (Math.sqrt(3)/4)*lado;
    }
    public double perimetro()
    {
        return lado*3;
    }
}
