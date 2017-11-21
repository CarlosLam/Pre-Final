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
public class Cuadrado extends Cuadrilatero{
    private final double lado;
    @Override
    public double area()
    {
        return lado*lado;
    }
    public double perimetro()
    {
        return 4 * lado;
    }
    public Cuadrado(double i)
    {
        lado = i;
    }
}
