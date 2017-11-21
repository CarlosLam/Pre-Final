/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerieDos;
import SerieDos.Cuadrado;
import SerieDos.Hexagono;
import SerieDos.Octagono;
import SerieDos.Pentagono;
import SerieDos.Rectangulo;
import SerieDos.TrianguloEquilatero;
import SerieDos.TrianguloIsoceles;
import SerieDos.Triangulo;
/**
 *
 * @author lam_m
 */
public class FabricaFiguras {
    
    public void CrearCuadrado(double i)
    {
        Cuadrado cuadrado = new Cuadrado(i);
        System.out.println("Area cuadrado: " + cuadrado.area());
        System.out.println("Perimetro cuadrado: " + cuadrado.perimetro());
    }
    
    public void CrearHexagono(double apotema, double longitud)
    {
        Hexagono hexagono = new Hexagono(apotema,longitud);
        System.out.println("Area Hexagono: " + hexagono.area());
        System.out.println("Perimetro Hexagono: " + hexagono.perimetro());
    }
    
    public void CrearOctagono(double apotema, double longitud)
    {
        Octagono octagono = new Octagono(apotema,longitud);
        System.out.println("Area Octagono: " + octagono.area());
        System.out.println("Perimetro Octagono: " +octagono.perimetro());
    }
    
    public void CrearPentagono(double apotema, double longitud)
    {
        Pentagono pentagono = new Pentagono(apotema,longitud);
        System.out.println("Area Pentagono: " + pentagono.area());
        System.out.println("Perimetro Pentagono: " + pentagono.perimetro());
    }
    
    public void CrearRectangulo(double base, double altura)
    {
        Rectangulo rectangulo = new Rectangulo(base,altura);
        System.out.println("Area Rectangulo: " + rectangulo.area());
        System.out.println("Perimetro Rectangulo: " + rectangulo.perimetro());
    }
    public void CrearTrianguloEquilatero(double lado)
    {
        TrianguloEquilatero tE = new TrianguloEquilatero(lado);
        System.out.println("Area triangulo equilatero: " + tE.area());
        System.out.println("Perimetro triangulo equilatero: " +tE.perimetro());
    }
    
    public void crearTrianguloIsocees(double ladoIgual, double otroLado)
    {
        TrianguloIsoceles ti = new TrianguloIsoceles(ladoIgual, otroLado);
        System.out.println("Area triangulo isoceles: " +ti.area());
        System.out.println("Perimetro triangulo isoceles: " + ti.perimetro());
    }
    
    
    
}
