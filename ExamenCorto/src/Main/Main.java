
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import SerieUno.ImplCesar;
import SerieDos.FabricaFiguras;
import SerieTres.Carta;
import SerieTres.LinkedPositionalList;
import SerieTres.Position;
import SerieTres.Categoria;
import SerieTres.Valor;
/**
 *
 * @author lam_m
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ImplCesar cC = new ImplCesar();
        FabricaFiguras ff = new FabricaFiguras();
        LinkedPositionalList LPL = new LinkedPositionalList();
        Position<Categoria>p1;
        
        
        //Problema 1
        String cesar;
        cesar = cC.cifrarCesar("Pero que cosas dices", -10);
        System.out.println(cesar);
        System.out.println(cC.cifrarCesar("Esto es una prueba", 25));
        
        //Problema 2
        ff.CrearCuadrado(20);
        ff.CrearHexagono(7.5, 5);
        ff.CrearRectangulo(2, 7);
        ff.CrearTrianguloEquilatero(7);
        ff.crearTrianguloIsocees(7, 5);
        
        //Problema 3
        LPL.addFirst(Valor.A);
        LPL.addFirst(Categoria.CORAZON);
    }
    
}
