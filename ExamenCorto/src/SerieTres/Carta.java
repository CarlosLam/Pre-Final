/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerieTres;

/**
 *
 * @author lam_m
 */
public class Carta {
    public Valor valor;
    public Categoria categoria;
    
    public String mostrarValor(){
        return valor.toString() + " " + categoria.toString();
    }
}

