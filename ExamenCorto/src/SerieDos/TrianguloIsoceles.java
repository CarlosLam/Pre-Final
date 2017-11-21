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
public class TrianguloIsoceles extends Triangulo{
    
    double ladoIgual;
    double otrolado;
    
    public TrianguloIsoceles(double ladoigual, double otroLado)
    {
        ladoIgual = ladoigual;
        otrolado = otroLado;
    }
    
    
    @Override
    public double area()
    {
        return otrolado/2 * Math.sqrt(ladoIgual*ladoIgual - otrolado*otrolado/2);
    }
    
    @Override
    public double perimetro(){
        return 2 * ladoIgual + otrolado;
    }
}
